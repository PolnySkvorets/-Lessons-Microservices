package main;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ServiceController {
    @RequestMapping(value = "/heartBeat", method = RequestMethod.GET)
    public ResponseEntity<String> heartBeat(){
        return new ResponseEntity<String>("ACK", HttpStatus.OK);
    }
}
