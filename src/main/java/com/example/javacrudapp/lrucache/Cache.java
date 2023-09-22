package com.example.javacrudapp.lrucache;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface Cache {
    String insert(String key);
    String Get(String Key);
    String Delete(String Key);

    String insert(String key, String value);
}
