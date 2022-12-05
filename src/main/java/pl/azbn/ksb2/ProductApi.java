package pl.azbn.ksb2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductApi {

    // PARAMETER
    @GetMapping("/1")
    public String get(@RequestParam String name, @RequestParam(defaultValue = "", required = false) String surname) {
        return "Hello " + name + " " + surname;
    }

    // PATH
    @GetMapping("{name}")
    public String get(@PathVariable String name) {
        return "Hello " + name;
    }

    // HEADER
    @GetMapping
    public String getHeader(@RequestHeader String name) {
        return "Hello " + name;
    }

    // BODY
    @GetMapping("/body")
    public String getBody(@RequestBody String name) {
        return "Hello " + name;
    }

    @GetMapping("/mix")
    public String getBody(@RequestParam String name,
                          @RequestHeader(required = false, defaultValue = "") String surname) {
        return "Hello " + name + " " + surname;
    }

    @PostMapping
    public String addProduct() {
        return "Hello world with POST ";
    }

    @PutMapping
    public String modProduct() {
        return "Hello world with PUT ";
    }

    @DeleteMapping
    public String removeProduct() {
        return "Hello world with DELETE ";
    }
}
