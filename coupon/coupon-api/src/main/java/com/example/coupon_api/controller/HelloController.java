package com.example.coupon_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /*
    * 톰캣에서는 기본적으로 200개의 쓰레드를 제공하여 클라이언트의 요청을 처리할 수 있다.
    * 설정을 변경하여 쓰레드를 800개까지 늘릴 수는 있지만, 상황에 따라 이미 리소스를
    * 다 쓰고 있는 상태일 수 있고, 쓰레드를 늘려도 더 좋은 성능이 나오지 않을 수 있다.
    * 쓰레드를 변화시켜가면서 성능테스트를 해보아야 몇개의 쓰레드가 적절한지 알 수 있다.
    *
    * 서버가 처리할 수 있는 처리량 이상의 요청을 받을 때에는 응답시간이 늘어나게 되고,
    * 응답 실패가 증가하게 되는 문제가 발생한다.
    * */
    @GetMapping("/hello")
    public String hello() {
        return "hello!";
    }
}
