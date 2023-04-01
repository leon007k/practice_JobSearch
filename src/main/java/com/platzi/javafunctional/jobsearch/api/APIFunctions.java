package com.platzi.javafunctional.jobsearch.api;

import feign.Feign;
import feign.gson.GsonDecoder;

public interface APIFunctions {
    static <T> T biuldAPI(Class<T> clazz, String url){
        return Feign.builder()
                .decoder(new GsonDecoder())
                .target(clazz, url);
    }
}
