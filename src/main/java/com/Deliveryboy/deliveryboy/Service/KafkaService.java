package com.Deliveryboy.deliveryboy.Service;

import com.Deliveryboy.deliveryboy.Config.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
@Autowired
      private KafkaTemplate<String,String>  kafkaTemplate;
    public boolean updateLocation(String location) {
        try {
            this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, location).get();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
