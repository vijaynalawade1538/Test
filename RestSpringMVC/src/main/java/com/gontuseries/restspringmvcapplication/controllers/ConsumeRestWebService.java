/*
 * package com.gontuseries.restspringmvcapplication.controllers;
 * 
 * import java.util.Arrays; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController; import
 * org.springframework.web.client.RestTemplate;
 * 
 * @RestController
 * 
 * @RequestMapping("/myapp") public class ConsumeRestWebService {
 * 
 * @Autowired private RestTemplate restTemplate;
 * 
 * @GetMapping("/countries") public List<Object> getListOfStdents(){ String url
 * = "https://restcountries.eu/rest/v2/all"; Object[] objects =
 * restTemplate.getForObject(url, Object[].class);
 * 
 * return Arrays.asList(objects); } }
 */