package practice.cicd.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    @GetMapping("/aws/v1")
    public String hello(@RequestParam(defaultValue = "1") Integer number) {
        if (number == 1) {
            log.info("/aws/v1이 호출되었어요 info 로그 ###############");
        } else if (number == -1) {
            log.error("/aws/v1이 호출되었어요 error 로그 ###############");
        } else if (number == 0) {
            log.warn("/aws/v1이 호출되었어요 warn 로그 ###############");
        }
        return "<h1> aws v1 </h1>";
    }
}
