package com.ticketnet.mainservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
public class ConcertEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;



}
