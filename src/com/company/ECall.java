package com.company;

import java.util.ArrayList;

public class ECall {

    ArrayList<Float> loc = new ArrayList<Float>();
    int dm;



    ECall(ArrayList<Float> loc, int dm ) {
        dm = this.dm;
        loc = this.loc;

    }

    public void send_Ecall(int dm){
        if (dm == 11) {

            // use location to send ecall
            System.out.println("Ecall has been sent");

        }

    }
}
