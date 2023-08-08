package com.suarez.examenfinalsuarez.service;



import com.suarez.examenfinalsuarez.model.Restaurante;
import com.suarez.examenfinalsuarez.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class RestauranteServiceImpl extends GenericServiceImpl<Restaurante,Long> implements GenericService<Restaurante,Long>{


    @Autowired
    RestauranteRepository restauranteRepository;

    @Override
    public CrudRepository<Restaurante, Long> getDao(){return restauranteRepository;}
}
