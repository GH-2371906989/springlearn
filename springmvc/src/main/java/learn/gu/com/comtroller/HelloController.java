package learn.gu.com.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//1 创建modelAndView
        ModelAndView mv = new ModelAndView();
        //2 调用业务层，这里没有，就不写
        //3 封装对象，放在mv中添加
        mv.addObject("msg", "Hello SpringMvc");
        //4 封装要跳转的视图，WEB-INF/jsp/hello.jsp
        mv.setViewName("springmvc");
        return mv;
    }
}*/
@Controller
public class HelloController {
    /**
     * @param model 模型
     * @return 被视图解析器处理：访问"/WEB-INF/jsp/hello.jsp资源
     * 访问的url:RequestMapping("/hello")
     */
    @RequestMapping("/springmvc")
    public String hello(Model model) {
        //封装数据
        model.addAttribute("msg", "Hello SpringMvc_annotation");
        //被视图解析器处理：访问"/WEB-INF/jsp/hello.jsp资源
        return "springmvc";
    }
}
