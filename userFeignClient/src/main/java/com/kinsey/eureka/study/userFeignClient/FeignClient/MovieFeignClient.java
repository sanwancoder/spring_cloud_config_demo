package com.kinsey.eureka.study.userFeignClient.FeignClient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient("eureka-movie-comps")
public interface MovieFeignClient {

	@RequestMapping(method=RequestMethod.GET,value="/movie/name/{id}")
	public String getMovieNameByName(@PathVariable("id") String id);
	
}