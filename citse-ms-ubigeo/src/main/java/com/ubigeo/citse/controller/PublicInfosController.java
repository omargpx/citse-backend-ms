package com.ubigeo.citse.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PublicInfosController {

    String nombre="Omar";

    @GetMapping
    public String getActuator(){
        String msm = "Bienvenido "+nombre;
        return msm;
    }

    @GetMapping("actuator/info")
    public String getInfo(){

        JSONObject DataInfo = new JSONObject();

        // Matrices
        String[] depMs = {"get: /ms/departamento","get: /ms/departamento/id"};
        String[] provMs = {"get: /ms/provincia","get: /ms/provincia/id"};
        String[] disMs = {"get: /ms/distrito","get: /ms/distrito/id"};
        JSONObject ms = new JSONObject();
        JSONObject dep = new JSONObject();
        JSONObject pv = new JSONObject();
        JSONObject dis = new JSONObject();
        pv.put("peticiones",provMs);
        dis.put("peticiones",disMs);
        dep.put("peticiones",depMs);
        ms.put("departamento",dep);
        ms.put("Provincia",pv);
        ms.put("Distrito",dis);
        DataInfo.put("Microservices",ms);
        System.out.print(DataInfo);

        return DataInfo.toString();
    }
}
