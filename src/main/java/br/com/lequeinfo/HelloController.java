package br.com.lequeinfo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {

	//http://localhost:8080/hello/
	@RequestMapping
	@ResponseBody
	public String hello() {
		return "Hello World of Controller!!!";
	}
	
	@GetMapping(path="/say")
	@ResponseBody
	public String say() {
		return "This is my new method!!!";
	}
	
	@GetMapping(path="/say/{name}")
	@ResponseBody
	public String sayParameter(@PathVariable String name) {
		return "Hello "+name+" this is my new method Get!!!";
	}
	
	@PostMapping(path="/sayPost")
	@ResponseBody
	public String sayPost(@RequestParam String name) {
		return "Hello "+name+" this is my new method Post!!!";
	}
	
	@PutMapping(path="/sayPut")
	@ResponseBody
	public String sayPut(@RequestParam String name) {
		return "Hello "+name+" this is my new method Put!!!";
	}
	
	@DeleteMapping(path="/sayDelete/{name}")
	@ResponseBody
	public String sayDelete(@PathVariable String name) {
		return "Hello "+name+" this is my new method Delete!!!";
	}
	
	
}
