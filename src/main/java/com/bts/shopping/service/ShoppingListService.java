package com.bts.shopping.service;

import com.bts.shopping.model.Shopping;
import com.bts.shopping.repository.ShoppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * Created by mohdr on 12/07/2019
 */

@Service
public class ShoppingListService {

    @Autowired
    private ShoppingRepository shoppingRepository;


    public List<Shopping> findAll() {
        return shoppingRepository.findAll();
    }

    public Optional<Shopping> findById(Integer id) {
        return shoppingRepository.findById(id);
    }

    public Shopping save(Shopping shopping) {
        return shoppingRepository.save(shopping);
    }

    public void deleteById(Integer id) {
        shoppingRepository.deleteById(id);
    }

}
