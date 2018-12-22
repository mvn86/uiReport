package com.ace.admin.report.controller;


import com.ace.admin.report.exception.StorageFileNotFoundException;
import com.ace.admin.report.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author chris
 * @date 2017/7/27
 */
@Controller
public class FileUploadController {

    private Logger logger = LoggerFactory.getLogger(FileUploadController.class);
    private final StorageService storageService;

    @Autowired
    public FileUploadController(StorageService storageService) {
        this.storageService = storageService;
    }

    /**
     * 加载upload-dir目录下的所有文件
     *
     * @param model
     * @return
     * @throws IOException
     */
    @GetMapping("/upload")
    @ResponseBody
    public List<String> listUploadedFiles(Model model) throws IOException {

        return storageService.loadAll()
                .map(path ->
                        MvcUriComponentsBuilder
                                .fromMethodName(FileUploadController.class, "serveFile", path.getFileName().toString())
                                .build()
                                .toString()
                )
                .collect(Collectors.toList());
    }

    /**
     * 生产下载链接
     *
     * @param filename
     * @return
     */
    @GetMapping("/files/{filename:.+}")
    @ResponseBody
    public ResponseEntity<Resource> serveFile(@PathVariable String filename) {
        Resource file = storageService.loadAsResource(filename);
        logger.info("get resource file name {}", file.getFilename());

        // 映射成下载链接反馈给客户端
        //return ResponseEntity
        //        .ok()
        //        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
        //        .body(resource);

        // 映射成文件流反馈给客户端
        return ResponseEntity.ok(file);
    }

    /**
     * 存储文件
     *
     * @param file
     * @param redirectAttributes
     * @return
     */
    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
        String originalFileName = file.getOriginalFilename();
        // 存储文件
        storageService.store(file);
        // 传递参数会存放在session里
        redirectAttributes.addFlashAttribute("message", "You successfully uploaded " + originalFileName + "!");
        return "redirect:/upload";
    }

    @ExceptionHandler(StorageFileNotFoundException.class)
    public ResponseEntity handleStorageFileNotFound(StorageFileNotFoundException exc) {
        return ResponseEntity.notFound().build();
    }

}
