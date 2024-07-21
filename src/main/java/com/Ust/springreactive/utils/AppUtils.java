package com.Ust.springreactive.utils;

import com.Ust.springreactive.dto.Tripdto;
import com.Ust.springreactive.entity.Trip;
import org.springframework.beans.BeanUtils;

public class AppUtils {


    public static Tripdto entityToDto(Trip trip){
        Tripdto tripdto1 = new Tripdto();
        BeanUtils.copyProperties(trip,tripdto1);

        return tripdto1;
    }
    public static Trip dtoToEntity(Tripdto tripdto){
        Trip trip = new Trip();
        BeanUtils.copyProperties(tripdto,trip);
        return trip;
    }
}
