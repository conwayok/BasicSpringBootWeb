package com.conway.basicspringbootweb.controller;

import com.conway.basicspringbootweb.service.BasicService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

  private final BasicService basicService;

  public BasicController(BasicService basicService) {
    this.basicService = basicService;
  }

  @GetMapping("/t")
  public String t() {
    return basicService.t();
  }
}
