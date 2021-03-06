package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.BaseResource;

import java.time.LocalDate;
import java.time.LocalTime;

public class FlightSectorResource extends BaseResource {
    private String flightNumber;
    private LocalDate flightDate;
    private String departureStation;
    private String arrivalStation;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
    private String tailNumber;
    private String aircraftType;

    public FlightSectorResource() {
    }

    public FlightSectorResource(String flightNumber, LocalDate flightDate, String departureStation, String arrivalStation, LocalTime departureTime, LocalTime arrivalTime, String tailNumber) {
        this.flightNumber = flightNumber;
        this.flightDate = flightDate;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.tailNumber = tailNumber;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public LocalDate getFlightDate() {
        return this.flightDate;
    }

    public String getDepartureStation() {
        return this.departureStation;
    }

    public String getArrivalStation() {
        return this.arrivalStation;
    }

    public LocalTime getDepartureTime() {
        return this.departureTime;
    }

    public LocalTime getArrivalTime() {
        return this.arrivalTime;
    }

    public String getTailNumber() {
        return this.tailNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FlightSectorResource)) return false;
        final FlightSectorResource other = (FlightSectorResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$flightNumber = this.flightNumber;
        final Object other$flightNumber = other.flightNumber;
        if (this$flightNumber == null ? other$flightNumber != null : !this$flightNumber.equals(other$flightNumber))
            return false;
        final Object this$flightDate = this.flightDate;
        final Object other$flightDate = other.flightDate;
        if (this$flightDate == null ? other$flightDate != null : !this$flightDate.equals(other$flightDate))
            return false;
        final Object this$departureStation = this.departureStation;
        final Object other$departureStation = other.departureStation;
        if (this$departureStation == null ? other$departureStation != null : !this$departureStation.equals(other$departureStation))
            return false;
        final Object this$arrivalStation = this.arrivalStation;
        final Object other$arrivalStation = other.arrivalStation;
        if (this$arrivalStation == null ? other$arrivalStation != null : !this$arrivalStation.equals(other$arrivalStation))
            return false;
        final Object this$departureTime = this.departureTime;
        final Object other$departureTime = other.departureTime;
        if (this$departureTime == null ? other$departureTime != null : !this$departureTime.equals(other$departureTime))
            return false;
        final Object this$arrivalTime = this.arrivalTime;
        final Object other$arrivalTime = other.arrivalTime;
        if (this$arrivalTime == null ? other$arrivalTime != null : !this$arrivalTime.equals(other$arrivalTime))
            return false;
        final Object this$tailNo = this.tailNumber;
        final Object other$tailNo = other.tailNumber;
        if (this$tailNo == null ? other$tailNo != null : !this$tailNo.equals(other$tailNo)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $flightNumber = this.flightNumber;
        result = result * PRIME + ($flightNumber == null ? 0 : $flightNumber.hashCode());
        final Object $flightDate = this.flightDate;
        result = result * PRIME + ($flightDate == null ? 0 : $flightDate.hashCode());
        final Object $departureStation = this.departureStation;
        result = result * PRIME + ($departureStation == null ? 0 : $departureStation.hashCode());
        final Object $arrivalStation = this.arrivalStation;
        result = result * PRIME + ($arrivalStation == null ? 0 : $arrivalStation.hashCode());
        final Object $departureTime = this.departureTime;
        result = result * PRIME + ($departureTime == null ? 0 : $departureTime.hashCode());
        final Object $arrivalTime = this.arrivalTime;
        result = result * PRIME + ($arrivalTime == null ? 0 : $arrivalTime.hashCode());
        final Object $tailNo = this.tailNumber;
        result = result * PRIME + ($tailNo == null ? 0 : $tailNo.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof FlightSectorResource;
    }
}