package com.nestdigital.fasionappbackend.dao;

import com.nestdigital.fasionappbackend.model.FasionModel;
import org.springframework.data.repository.CrudRepository;

public interface FasionDao extends CrudRepository<FasionModel,Integer> {
}
