package com.tts.WeatherApp.repository;

import com.tts.WeatherApp.model.ZipCode;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ZipCodeRepository extends CrudRepository<ZipCode,Long>{

    List<ZipCode> findAll();
    ZipCode deleteById(long id);
    ZipCode findById(long id);

}
