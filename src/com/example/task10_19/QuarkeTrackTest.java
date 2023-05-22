package com.example.task10_19;

import java.util.Objects;
import java.util.Arrays;

class QuarkeTrackTest {
    public static void main(String[] args) {
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);
        System.out.println(track1.equals(track2));
        System.out.println(track1.equals(track3));
        System.out.println(track1.hashCode() == track2.hashCode());
        System.out.println(track1.hashCode() == track3.hashCode());
    }
}


class QuarkeTrack {
    private int[] lines;

    public QuarkeTrack(int[] lines) {
        this.lines = lines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuarkeTrack that = (QuarkeTrack) o;
        return Arrays.stream(lines).sum() == Arrays.stream(that.lines).sum();
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for (int i = 0; i < lines.length; i++) {
            hash += Integer.hashCode(lines[i]);
        }
        return hash;
    }


    public int[] getLines() {
        return lines;
    }
}
