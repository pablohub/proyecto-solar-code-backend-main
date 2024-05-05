package com.solar.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path= "api/v1/categoria")
public class CategoriaController {
	
  @GetMapping("/obtenerCategorias")
  public String obtenerCategorias() {
    return "Categorias";
  }
}
