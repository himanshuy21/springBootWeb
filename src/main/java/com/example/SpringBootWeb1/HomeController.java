package com.example.SpringBootWeb1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")

    public String home(){
        // here should pe view technology
        return "index";
    }

    @RequestMapping("add")
   // public String add(HttpServletRequest req , HttpSession session){
   // public String add(int num1 , int num2 , HttpSession session){
  //  public String add(@RequestParam("num1") int num , int num2 , HttpSession session){
    // now we will use Model here
        public String add(@RequestParam("num1") int num , int num2 , Model model){
        // here we we ar differntly using this
        // int num1 = Integer.parseInt(req.getParameter("num1"));
        // int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num + num2;
        System.out.println("Result : " + result);
        model.addAttribute("Result",result);
        //session.setAttribute("Result", result);
//        return "result.jsp";
        return "result";
    }
    @RequestMapping("addition")
    public ModelAndView addition(@RequestParam("num1") int number , int num2, ModelAndView mv){
        int result = number + num2;
        System.out.println("Result : " + result);
        mv.addObject("Result",result);
        mv.setViewName("result");
        System.out.println("mv : " + mv.toString());
        return mv;
    }
    @RequestMapping("StudentData")
    public String StudentData(@ModelAttribute Student student){
        return "result";
    }
}
