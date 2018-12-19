package com.parsons.elliott.garageDatabase.mySpringBootGarageDatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parsons.elliott.garageDatabase.mySpringBootGarageDatabase.model.MySpringBootDataModel;

@Repository
public interface MySpringBootRepository extends JpaRepository<MySpringBootDataModel,Long>{

}
