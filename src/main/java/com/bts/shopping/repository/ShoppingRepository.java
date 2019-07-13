package com.bts.shopping.repository;

import com.bts.shopping.model.Shopping;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mohdr on 12/07/2019
 */


public interface ShoppingRepository extends JpaRepository<Shopping, Integer> {
}
