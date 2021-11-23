/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Membership.*;

/**
 *
 * @author Kaitoga
 */
public class MainClass {
    public static void main(String[] args) {
        Member membership = new Member();
        membership.tambahMember(new DataMember("M001", "Mr. X", "Silver"));
        membership.tambahMember(new DataMember("M002", "Mr. Y", "Gold"));
        membership.tambahMember(new DataMember("M003", "Mr. Z", "Platinum"));
        
        DataMember member = membership.inputMember();
        switch(member.Jenis) {
            case "Silver":
                Silver s = new Silver(member);
                s.hitungBiaya();
                s.output();
                break;
            case "Gold":
                Gold g = new Gold(member);
                g.hitungBiaya();
                g.output();
                break;
            case "Platinum":
                Platinum p = new Platinum(member);
                p.hitungBiaya();
                p.output();
                break;
        }
    }
}
