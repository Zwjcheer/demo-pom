package com.baozun.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;




public class DemoController {
    public static void main(String[] args) {

        ArrayList<Object> objects = new ArrayList<>();
        String[] atp = {"1","2","10","11","9"};
      List<String> players = Arrays.asList(atp);
        HashMap<Object, Object> objectObjectHashMap =new HashMap<>();
     players.forEach((play)->System.out.println(play+";"));
//        for (String player:players) {
//            System.out.print(player);
//
//        }
        }



}
