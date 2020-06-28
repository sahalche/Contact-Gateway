package com.illud.client.apidocs.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.illud.client.apidocs.ClientConfiguration;

@FeignClient(name="${productResource.name:productResource}", url="${productResource.url:http://localhost:8082}", configuration = ClientConfiguration.class)
public interface ProductResourceApiClient extends ProductResourceApi {
}
