package com.platzi.javafunctional.jobsearch.dao;

import com.platzi.javafunctional.jobsearch.entities.JobPositions;
import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;

import java.util.List;
import java.util.Map;

@Headers(
        {"Host: data.usajobs.gov", "User-Agent: leodark17@hotmail.com",
                "Authorization-Key: ubjv9eZ1eWqvwHS4Ngj21iM0rNfG4mcA5ESAygX5qcU=",
                "Accept: */*"
        })
public interface ApiJobsDao {

    @RequestLine("GET /search")
    List<JobPositions> jobs(@QueryMap Map<String, Object> queryMap);
}
