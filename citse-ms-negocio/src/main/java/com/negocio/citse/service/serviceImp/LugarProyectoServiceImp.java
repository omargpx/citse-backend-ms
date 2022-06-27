package com.negocio.citse.service.serviceImp;

import com.negocio.citse.dao.LugarProyectoDao;
import com.negocio.citse.entity.LugarProyecto;
import com.negocio.citse.entity.Proyecto;
import com.negocio.citse.feignClients.DistritoFeignClient;
import com.negocio.citse.models.Distrito;
import com.negocio.citse.service.LugarProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class LugarProyectoServiceImp implements LugarProyectoService {

    @Autowired
    private LugarProyectoDao repo;


    @Override
    public List<LugarProyecto> findAll() {
        return repo.findAll();
    }

    @Override
    public LugarProyecto findById(Integer id) {

        return repo.findById(id).orElse(null);
    }

    @Override
    public LugarProyecto save(LugarProyecto lugarProyecto) {
        return repo.save(lugarProyecto);
    }

    @Override
    public LugarProyecto deleteById(Integer id) {
        LugarProyecto lp = findById(id);
        lp.setEsLugarProyecto(false);
        repo.save(lp);
        return lp;
    }

    @Override
    public List<LugarProyecto> findByDistrito(Integer id) {
        return repo.findByDistrito(id);
    }

    @Override
    public List<LugarProyecto> findByProyecto(Proyecto proyecto) {
        return repo.findByProyecto(proyecto);
    }

}
