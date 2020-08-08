package com.geek.part1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * com.geek.part1
 *
 * @author maoenqi
 * @date 2020/3/11
 */
@RestController
@RequestMapping("/threadLocal")
public class ThreadLocalDemoController {
    private ThreadLocal<Integer> currentUser = new ThreadLocal();

    @GetMapping("wrong")
    public Map wrong(@RequestParam("userId") Integer userId) {
        String before = Thread.currentThread().getName() + ":" + currentUser.get();
        currentUser.set(userId);
        String after = Thread.currentThread().getName() + ":" + currentUser.get();
        Map result = new HashMap(2);
        result.put("before", before);
        result.put("after", after);
        return result;
    }

    @GetMapping("/right")
    public Map right(@RequestParam("userId") Integer userId) {
        try {
            String before = Thread.currentThread().getName() + ":" + currentUser.get();
            currentUser.set(userId);
            String after = Thread.currentThread().getName() + ":" + currentUser.get();
            Map result = new HashMap(2);
            result.put("before", before);
            result.put("after", after);
            return result;
        } finally {
            currentUser.remove();
        }
    }
}
