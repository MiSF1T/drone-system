package com.drone.dronesys;

import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class Delivery {
    private Integer del_id;                     // Delivery ID
    private static AtomicInteger id_init = new AtomicInteger(1000);    // Auto increment id for new deliveries
    private LocalDateTime deliveryReq;      // Delivery request received timestamp
    private LocalDateTime deliverAck;       // Delivery completion/status ack
    private Item load;                      // Init item to be delivered
    private Position initPos, destPos;      // Item retrieval and delivery positions
    private Drone delivDrone;            // Drone selected for the delivery

    public Delivery(LocalDateTime deliveryReq, Item load, Position initPos, Position destPos) {
        this.del_id = id_init.getAndIncrement();
        this.deliveryReq = deliveryReq;
        this.load = load;
        this.initPos = initPos;
        this.destPos = destPos;
    }

    public void update_delivery(){
        if (Mapping.selectDrone()) deliverAck = LocalDateTime.now();
        else deliverAck = LocalDateTime.parse("1753-01-01");     //Set to a sentinel value
    }
}
