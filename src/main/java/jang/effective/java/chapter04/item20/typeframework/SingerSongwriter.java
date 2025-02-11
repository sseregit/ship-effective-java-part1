package jang.effective.java.chapter04.item20.typeframework;

public interface SingerSongwriter extends Singer, Songwriter {

    AudioClip strum();

    void actSensitive();
}
