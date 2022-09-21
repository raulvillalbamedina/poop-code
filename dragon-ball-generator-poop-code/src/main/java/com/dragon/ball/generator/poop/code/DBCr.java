package com.dragon.ball.generator.poop.code;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@ResponseBody
public class DBCr{

    @Autowired
    private ObjectMapper om;

    @Autowired
    private ToolsDBC tls;

    @GetMapping("/npc/random")
    String aleaTOR(String param1, String specialNivel) throws Exception{
        return CREAR_NPC_randomizzato(specialNivel, param1);
    }

    private String CREAR_NPC_randomizzato(String specialNivel, String param1) throws Exception{
        NPC a = null;

        String i = "0";
        if(specialNivel != null){
            a = new NPC(param1 != null ? param1 : tls.nombrs[ThreadLocalRandom.current().nextInt(0, tls.nombrs.length)],
                    tls.tip[ThreadLocalRandom.current().nextInt(0, tls.tip.length)], specialNivel,
                    tls.os[ThreadLocalRandom.current().nextInt(0, tls.os.length)],
                    tls.couleurs[ThreadLocalRandom.current().nextInt(0, tls.os.length)]
            );
        }else{
            a = new NPC(param1 != null ? param1 : tls.nombrs[ThreadLocalRandom.current().nextInt(0, tls.nombrs.length)],
                    tls.tip[ThreadLocalRandom.current().nextInt(0, tls.tip.length)], i,
                    tls.os[ThreadLocalRandom.current().nextInt(0, tls.os.length)],
                    tls.couleurs[ThreadLocalRandom.current().nextInt(0, tls.os.length)]
            );
        }

        return om.writeValueAsString(a);
    }
}
