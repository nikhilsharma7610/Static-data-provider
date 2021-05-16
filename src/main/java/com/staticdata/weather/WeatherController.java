package com.staticdata.weather;

import com.staticdata.utils.ResourceUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/static/weather")
@Slf4j
public class WeatherController {

    @RequestMapping(value = "/data", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getWeatherStaticData() {
        return ResourceUtils.getResourceAsJson("weather/data.json");
    }

}
