package com.home.dguymon.domain.subdomain.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/logs")
public class DownstreamController {
  
  private static final Logger logger = LogManager.getLogger(DownstreamController.class);
  
  /**
   * Generates sample logs.
   * 
   * @return String
   */
  @RequestMapping(value = "/sample", method = RequestMethod.GET)
  public ResponseEntity<String> generateSampleLogs() {
    
    logger.debug("Downstream DEBUG log");
    logger.trace("Downstream TRACE log");
    logger.info("Downstream INFO log");
    logger.warn("Downstream WARN log");
    logger.error("Downstream ERROR log");

    return new ResponseEntity<>("Downstream", HttpStatus.OK);
  }
}