package com.drone.dronesys;

import java.time.LocalDateTime;

public class Delivery {
    private Integer id;                     // Delivery ID

    private LocalDateTime deliveryReq;      // Delivery request received timestamp
    private LocalDateTime deliverAck;       // Delivery completion/status ack

    private Item load;                      // Init item to be delivered

    private Position initPos, destPos;      // Item retrieval and delivery positions


}
