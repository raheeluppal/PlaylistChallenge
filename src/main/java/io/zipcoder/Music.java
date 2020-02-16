package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        Integer forward = 0;
        Integer backwards = 0;

        for (int up = startIndex; up < playList.length - 1; up++) {

            if (up == playList.length-1){
                startIndex = 0;
            }

            if (!playList[up].equals(selection)) {
                forward++;
            }

            else {
                up = playList.length;
            }
        }

        for (int down = startIndex; down < playList.length; down--) {

            if (down == -1){
                down = playList.length-1;
            }

            if (!playList[down].equals((selection))){
                backwards++;
            }
            else {
                down = (playList.length + 1);
            }
        }


        if (backwards > forward) {

            return forward;

        } else {
            return backwards;
        }

    }
}