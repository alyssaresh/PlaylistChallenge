package io.zipcoder;

import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList) {

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        }


//1 ≤ n ≤ 100
//        0 ≤ k ≤ n−1
//        1 ≤ length of si ≤ 100
//It is guaranteed that song q is in the playlist.


//        int jumpsForward = 0;
//        for (int i = startIndex; i < playList.length; i++) {
//            if (playList[i] != selection) {
//                jumpsForward += 1;
//            }
//        }
//        if (jumpsForward < playList.length - jumpsForward) {
//            return jumpsForward;
//        } else {
//            return playList.length - jumpsForward; //returns jumps back
//        }
//    }
//        return startIndex;



//    String[] songs = new String[playList.length * 2];
//        System.arraycopy(playList, 0, songs, 0, playList.length);
//        System.arraycopy(playList, 0, songs, playList.length, playList.length);
//    int jumpsForward = 0;
//    int jumpsBack = 0;
//        for (int i = startIndex; i<playList.length; i++){
//        if (songs[i] != selection){
//            jumpsForward+= 1;
//        }
//    } for (int i = (startIndex + playList.length); i > startIndex; i--) {
//        if (songs[i] != selection) {
//            jumpsBack += 1;
//        }
//    } if (jumpsBack < jumpsForward || jumpsBack == jumpsForward) {
//        return jumpsBack; }
//            else {return jumpsForward;}
//}