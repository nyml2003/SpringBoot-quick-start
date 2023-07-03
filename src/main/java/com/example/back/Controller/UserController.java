package com.example.back.Controller;
import com.example.back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.back.Entity.Response;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findAllUsers")
    public Response findAllUsers() {
        Response response = new Response();
        response.setCode(200);
        response.setMsg("success");
        response.setData(userService.findAllUsers());
        return response;
    }

    @GetMapping("/test")
    public Response test() {
        Response response = new Response();
        response.setCode(200);
        response.setMsg("success");
        response.setData("test");
        return response;
    }

}
