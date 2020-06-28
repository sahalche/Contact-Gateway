package com.illud.client.sas.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.illud.client.sas.ClientConfiguration;

@FeignClient(name="${productResource.name:productResource}", url="${productResource.url:http://localhost:8082}", configuration = ClientConfiguration.class)
public interface ProductResourceApiClient extends ProductResourceApi {
}
