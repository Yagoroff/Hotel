package com.agacorporation.demo.domain;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.Date;

@Entity
@Table(name = "room_reservations")
public class RoomReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Valid
    @ManyToOne(fetch = FetchType.EAGER)//
    @JoinColumn(name="rooms_id", nullable = false)
    private Room room;


    @Valid
    @ManyToOne(fetch = FetchType.EAGER)//
    @JoinColumn(name="users_id", nullable = false)
    private User user;

    @Column(name="number_of_people", nullable=false)
    private int numberOfPeople;

    @Column(name="reservation_start_date", nullable=false)
    private Date reservationStartDate;

    @Column(name="reservation_end_date", nullable=false)
    private Date reservationEndDate;

    public RoomReservation(@Valid Room room, @Valid User user, int numberOfPeople, Date reservationStartDate, Date reservationEndDate) {
        this.room = room;
        this.user = user;
        this.numberOfPeople = numberOfPeople;
        this.reservationStartDate = reservationStartDate;
        this.reservationEndDate = reservationEndDate;
    }
    public RoomReservation(){
this.user=new User();
this.room=new Room();
    }
    public Room getRoom() {
        return room;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public Date getReservationStartDate() {
        return reservationStartDate;
    }

    public void setReservationStartDate(Date reservationStartDate) {
        this.reservationStartDate = reservationStartDate;
    }

    public Date getReservationEndDate() {
        return reservationEndDate;
    }

    public void setReservationEndDate(Date reservationEndDate) {
        this.reservationEndDate = reservationEndDate;
    }
}
