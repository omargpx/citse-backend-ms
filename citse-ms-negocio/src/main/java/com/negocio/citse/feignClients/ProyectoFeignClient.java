package com.negocio.citse.feignClients;

import com.negocio.citse.entity.Proyecto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

@FeignClient(name = "negocio-service")
@RequestMapping("ms/proyecto")
public interface ProyectoFeignClient {

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Proyecto findById(@PathVariable("id") Integer id, HttpRequestHandlerServlet request);
}
