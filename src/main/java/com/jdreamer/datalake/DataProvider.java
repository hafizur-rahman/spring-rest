package com.jdreamer.datalake;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataProvider {
    @GetMapping(value = "/datalake/{tenantId}/catalog/{catalog}", produces = "text/csv")
    public ResponseEntity<Object> getData(@PathVariable String tenantId, @PathVariable String catalog) {
        String dataFile = "COVID-19-vaccine.csv";

        return ResponseEntity.ok()
                .body(new ClassPathResource(dataFile));
    }
}
