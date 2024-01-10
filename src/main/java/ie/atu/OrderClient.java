package ie.atu;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "order-service", url = "http//localhost:8082")
public interface OrderClient {
    @PostMapping("/order-service")
    ResponseEntity<String> someDetails(@RequestBody Order order);
}
