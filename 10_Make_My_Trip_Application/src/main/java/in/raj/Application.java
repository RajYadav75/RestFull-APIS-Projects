package in.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class Application {
	static String url = "http://localhost:8080/ticket/{ticketNumber}";
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);


		WebClient webClient = WebClient.create();
		System.out.println("Request Sending start......");
//		String response =
		webClient.get()
				.uri(url,6)
				.retrieve()
				.bodyToMono(String.class)
				.subscribe(Application::handleResponse);//async call
//		.block();

		System.out.println("request sending end...");
//		System.out.println(response);
	}
	public static void handleResponse(String response) {
		System.out.println(response);
	}

}
