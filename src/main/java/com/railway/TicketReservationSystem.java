/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.railway;
import com.railway.model.*;
/**
 *
 * @author vikas
 */
public class TicketReservationSystem {

     public static void main(String[] args) {

        Passenger p = new Passenger("Vikas", 22, "Vellore");
        Train t = new Train("Express", 101);
        Ticket ticket = new Ticket(1, "Chennai", "Delhi", 101);
        Payment payment = new Payment(500);

        p.searchTrains();
        t.displayTrainDetails();
        p.reserveSeat();
        p.purchaseTicket();

        payment.processPayment();

        ticket.cancelTicket();
    }
}
