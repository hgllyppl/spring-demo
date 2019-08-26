package com.spring.mvc.servlet3;

import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.Map;

/**
 * Created by xin on 2019/4/29.
 */
@RestController
@RequestMapping("/mvc")
public class MvcController {

    @RequestMapping("helloForm")
    public Object helloForm(String name) {
        Map<String, Object> map = Maps.newHashMap();
        map.put("time", LocalTime.now().toString());
        map.put("ack", "hello, " + name);
        return map;
    }

    @RequestMapping("helloBody")
    public Object helloBody(@RequestBody Student student) {
        Map<String, Object> map = Maps.newHashMap();
        map.put("time", LocalTime.now().toString());
        map.put("ack", "hello, " + student.name);
        Integer.parseInt("xx");
        return map;
    }

    public static class Student {
        String name;
        public String getName() {
            return name;
        }
        public Student setName(String name) {
            this.name = name;
            return this;
        }
    }
}
