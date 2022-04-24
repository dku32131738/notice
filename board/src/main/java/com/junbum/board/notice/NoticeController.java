package com.junbum.board.notice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/notice")
public class NoticeController {

    @GetMapping
    public String noticeList(Model model){
        return "notice/list";
    }

    @GetMapping("/edit")
    public String editNoticePage(Model model){
        return "notice/edit";
    }

    @PostMapping("/edit")
    public String editNotice(@RequestParam(value = "files",required = false) List<MultipartFile> files,
                             @RequestParam Map<String,Object> param, Model model){
        return "redirect:/notice";
    }

}
