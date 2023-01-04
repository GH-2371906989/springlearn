package learn.gu.com.controller;

import learn.gu.com.mapper.RuledrlMapper;
import learn.gu.com.pojo.Ruledrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RuleDrlController {
    @Autowired
    RuledrlMapper ruledrlMapper;

    @RequestMapping("/getrule/{id}")
    public String getrule(@PathVariable("id") int id, Model model){
        Ruledrl getdrl = ruledrlMapper.getdrl(id);
        model.addAttribute("rule",getdrl);
        return "customer";
    }
}
