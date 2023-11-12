package bitxon.hz;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HzController {

    private final ConcurrentMap<String, String> cache = new ConcurrentHashMap<>();

    @GetMapping("/cache/{key}")
    public String get(@PathVariable("key") String key) {
        return cache().get(key);
    }

    @PutMapping("/cache/{key}/{value}")
    public String put(@PathVariable("key") String key, @PathVariable("value") String value) {
        cache().put(key, value);
        return value;
    }


    private ConcurrentMap<String, String> cache() {
        return cache;
    }

}
