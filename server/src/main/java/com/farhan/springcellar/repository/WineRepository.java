package com.farhan.springcellar.repository;

import com.farhan.springcellar.domain.Wine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by farhan on 7/24/16.
 */
@Repository
public interface WineRepository extends JpaRepository<Wine,Long> {

}
