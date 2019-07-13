package com.bts.shopping.controller;

import com.bts.shopping.model.Shopping;
import com.bts.shopping.payload.GetShoppingResponse;
import com.bts.shopping.service.ShoppingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/**
 * Created by mohdr on 12/07/2019
 */

@RestController
@RequestMapping("/api/shopping")
public class ShoppingController {

    @Autowired
    private ShoppingListService shoppingListService;

    @GetMapping
    public ResponseEntity<List<Shopping>> findAll() {
        return ResponseEntity.ok(shoppingListService.findAll());
    }

    @PostMapping
    public ResponseEntity create(@Valid @RequestBody Shopping shopping) {
        Shopping response = shoppingListService.save(shopping);
        GetShoppingResponse getShoppingResponse = new GetShoppingResponse(response);
        return ResponseEntity.ok(getShoppingResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetShoppingResponse> findById(@PathVariable Integer id) {
        Optional<Shopping> shopping = shoppingListService.findById(id);
        if (!shopping.isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        Shopping response = shopping.get();
        GetShoppingResponse getShoppingResponse = new GetShoppingResponse(response);
        return ResponseEntity.ok(getShoppingResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Shopping> update(@PathVariable Integer id, @Valid @RequestBody Shopping shopping) {
        if (!shoppingListService.findById(id).isPresent()) {
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(shoppingListService.save(shopping));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        if (!shoppingListService.findById(id).isPresent()) {
            ResponseEntity.badRequest().build();
        }

        shoppingListService.deleteById(id);

        return ResponseEntity.ok().build();
    }

}
