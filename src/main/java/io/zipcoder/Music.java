package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        //Get to string specified index for the start index
        //return a positive number
        //return the spaces between the songs


        for (int i = startIndex; i < playList.length; i++) {

            if (i - playList.length == 1 || i - playList.length / 2 == 1) {
                startIndex++;
            }

        }
        return startIndex;

    }
}
