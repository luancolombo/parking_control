package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;
@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, UUID> {

    boolean existsBylicensePlateCar(String licensePlateCar);
    boolean existsByParkingSpotNumber(String parkSpotNumber);
    boolean existsByApartmentAndBlock(String apartment, String block);
}
