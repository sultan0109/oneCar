package onevision.onecar.controller;

import onevision.onecar.dto.ApiResponse;
import onevision.onecar.dto.user.UserDto;
import onevision.onecar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user/")
public class UserController {

    @Autowired
    private UserService userService;



    @PostMapping("register")
    public ApiResponse signUp(@RequestBody UserDto.Create signUp){
        return userService.signUp(signUp);
    }


    @PostMapping("makeOrder")
    public ApiResponse makeOrder(@RequestBody UserDto.Order request){
        return userService.order(request);
    }

    @GetMapping("chackStatus")
    public ApiResponse chackStatus(@RequestParam Long orderId){
        return userService.checkStatus(orderId);
    }

    @GetMapping("invoise")
    public ApiResponse getInvoise(@RequestParam Long orderId,
                                  @RequestParam Long userId  ){
        return userService.invoise(orderId,userId);
    }
}
