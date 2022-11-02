package org.mataelang.kaspacore.models;

import java.util.Arrays;

public class AggrDestIP extends AggregationModel{
    public AggrDestIP() {
        fields = Arrays.asList(
                "action",
                "dst_addr",
                "dst_city_name",
                "dst_country_code",
                "dst_country_name",
                "dst_lat",
                "dst_long",
                "dst_port",
                "eth_dst",
                "sensor_id"
        );
        delayThreshold = "1 minute";
        windowDuration = "10 seconds";
        topic = "destination_ip_address_10s";
    }
}
