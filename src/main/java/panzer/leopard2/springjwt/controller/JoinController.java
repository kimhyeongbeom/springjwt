package panzer.leopard2.springjwt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import panzer.leopard2.springjwt.dto.JoinDTO;
import panzer.leopard2.springjwt.service.JoinService;

@RestController
@ResponseBody
public class JoinController {

    private final JoinService joinService;

    public JoinController(JoinService joinService){
        this.joinService = joinService;
    }

    @PostMapping("/join")
    public String joinProcess(JoinDTO joinDTO){

        String result = "ERROR";
        if (joinService.joinProcess(joinDTO) ){
            result = "OK";
        }

        return result;
    }
}
