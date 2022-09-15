package com.hillel.nevinchanyi.lesson13;

    public class Main {
        public static void main(String[] args) {
            MusicStyle[] musicStyles = { new RockMusic(), new PopMusic(), new ClassicMusic()};
            for (MusicStyle musicStyle : musicStyles) {
                musicStyle.playMusic();
            }
        }
    }
