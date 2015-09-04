package helloworld_UseAPI;

import org.springframework.web.client.RestTemplate;

public class Application1 {

	public static void main(String[] args) {
		 RestTemplate restTemplate = new RestTemplate();
		 HelloWorld hellowrld= restTemplate.getForObject("http://localhost:8080/greeting?name=Bubul", HelloWorld.class);
		 System.out.println("Id is " + hellowrld.getId());
		 System.out.println("Content is " + hellowrld.getContent());
	}
}
