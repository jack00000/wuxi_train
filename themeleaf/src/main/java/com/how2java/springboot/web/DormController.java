package com.how2java.springboot.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.springboot.mapper.DormMapper;
import com.how2java.springboot.pojo.Dorm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DormController {
    @Autowired
    DormMapper dormMapper;

    @RequestMapping("/listDorm")
    public String listDorm(Model m, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        PageHelper.startPage(start,size,"id desc");
        List<Dorm> dm=dormMapper.findAll();
        PageInfo<Dorm> page1=new PageInfo<>(dm);
        //字符串与对象建立关联 再返回字符串  可通过字符串得到page对象
        m.addAttribute("page1",page1);
        //然后再返回 listDorm页面，这时候page1对象也传入啦此页面。
        return "listDorm";

    }

    @RequestMapping("/editDorm")
    public String editDorm(String id,Model m){
        Dorm d=dormMapper.get(id);
        m.addAttribute("d",d);
        return "editDorm";
    }


    @RequestMapping("/deleteDorm")
    public String deleteDorm(Dorm d){
        dormMapper.delete(d.getId());
        return "redirect:listDorm";
    }
    @RequestMapping("/addDorm")
    public String addDorm(Dorm d){
        dormMapper.save(d);
        return "redirect:listDorm";
    }

    @RequestMapping("/updataDorm")
    public String updataDorm(Dorm d){
        dormMapper.update(d);
        return "redirect:listDorm";
    }




}
