package com.gimgongta.chordmoum.service

import android.content.Context
import android.media.SoundPool
import com.gimgongta.chordmoum.R
import com.gimgongta.chordmoum.data.ChordmoumData

object ChordmoumService {

    private val major = ChordmoumData(name = "M", noteArr = arrayListOf(0, 16, 19))
    private val minor = ChordmoumData(name = "m", noteArr = arrayListOf(0, 15, 19))
    private val aug = ChordmoumData(name = "aug", noteArr = arrayListOf(0, 16, 20))
    private val dim = ChordmoumData(name = "dim", noteArr = arrayListOf(0, 15, 18))
    private val sus4 = ChordmoumData(name = "sus4", noteArr = arrayListOf(0, 17, 19))
    private val major7 = ChordmoumData(name = "M7", noteArr = arrayListOf(0, 11, 16, 19))
    private val minor7 = ChordmoumData(name = "m7", noteArr = arrayListOf(0, 10, 15, 19))
    private val dim7 = ChordmoumData(name = "dim7", noteArr = arrayListOf(0, 9, 15, 18))
    private val mM7 = ChordmoumData(name = "mM7", noteArr = arrayListOf(0, 10, 16, 19, 23))
    private val b5 = ChordmoumData(name = "b5", noteArr = arrayListOf(0, 16, 18))
    private val mb5 = ChordmoumData(name = "mb5", noteArr = arrayListOf(0, 15, 18))
    private val six = ChordmoumData(name = "6", noteArr = arrayListOf(0, 7, 16, 21))
    private val seven = ChordmoumData(name = "7", noteArr = arrayListOf(0, 10, 16, 19))
    private val nine = ChordmoumData(name = "9", noteArr = arrayListOf(0, 10, 14, 16, 19))
    private val eleven = ChordmoumData(name = "11", noteArr = arrayListOf(0, 4, 10, 17, 19))
    private val thirteen = ChordmoumData(name = "13", noteArr = arrayListOf(0, 10, 16, 21))
    private val seven913 = ChordmoumData(name = "9, 13", noteArr = arrayListOf(0, 10, 14, 16, 21)) // 1 7 2 3 6
    private val sevenF9F13 = ChordmoumData(name = "7(b9, b13)", noteArr = arrayListOf(0, 4, 7, 10, 13, 20))
    private val sevenS9F13 = ChordmoumData(name = "7(#9, b13)", noteArr = arrayListOf(0, 4, 7, 10, 15, 20))
    private val seven9S1113 = ChordmoumData(name = "7(9, #11, 13)", noteArr = arrayListOf(0, 4, 7, 10, 14, 17, 21))

    private val add2 = ChordmoumData(name = "add2", noteArr = arrayListOf(0, 14, 16, 19))
    private val fNine = ChordmoumData(name = "b9", noteArr = arrayListOf(0, 10, 13, 16, 19))
    private val sNine = ChordmoumData(name = "#9", noteArr = arrayListOf(0, 10, 15, 16, 19))
    private val sEleven = ChordmoumData(name = "#11", noteArr = arrayListOf(0, 4, 10, 18, 19))
    private val fThirteen = ChordmoumData(name = "b13", noteArr = arrayListOf(0, 10, 16, 20))

    val list = arrayListOf(
        major,
        minor,
        add2,
        aug,
        dim,
        sus4,
        minor7,
        major7,
        dim7,
        mM7,
        b5,
        mb5,
        six,
        seven,
        fNine,
        nine,
        sNine,
        eleven,
        sEleven,
        fThirteen,
        thirteen,
        seven913,
        sevenF9F13,
        sevenS9F13,
        seven9S1113,
    )

    val noteList = arrayListOf(
        "C",
        "Db",
        "D",
        "Eb",
        "E",
        "F",
        "Gb",
        "G",
        "Ab",
        "A",
        "Bb",
        "B"
    )

    fun getNoteArr(soundPool: SoundPool, ctx: Context): ArrayList<Int> {

        return arrayListOf(

            soundPool.load(ctx, R.raw.c4, 1), soundPool.load(ctx, R.raw.c4black, 1),
            soundPool.load(ctx, R.raw.d4, 1), soundPool.load(ctx, R.raw.d4black, 1),
            soundPool.load(ctx, R.raw.e4, 1),
            soundPool.load(ctx, R.raw.f4, 1), soundPool.load(ctx, R.raw.f4black, 1),
            soundPool.load(ctx, R.raw.g4, 1), soundPool.load(ctx, R.raw.g4black, 1),
            soundPool.load(ctx, R.raw.a4, 1), soundPool.load(ctx, R.raw.a4black, 1),
            soundPool.load(ctx, R.raw.b4, 1),

            soundPool.load(ctx, R.raw.c5, 1), soundPool.load(ctx, R.raw.c5black, 1),
            soundPool.load(ctx, R.raw.d5, 1), soundPool.load(ctx, R.raw.d5black, 1),
            soundPool.load(ctx, R.raw.e5, 1),
            soundPool.load(ctx, R.raw.f5, 1), soundPool.load(ctx, R.raw.f5black, 1),
            soundPool.load(ctx, R.raw.g5, 1), soundPool.load(ctx, R.raw.g5black, 1),
            soundPool.load(ctx, R.raw.a5, 1), soundPool.load(ctx, R.raw.a5black, 1),
            soundPool.load(ctx, R.raw.b5, 1),

            soundPool.load(ctx, R.raw.c6, 1), soundPool.load(ctx, R.raw.c6black, 1),
            soundPool.load(ctx, R.raw.d6, 1), soundPool.load(ctx, R.raw.d6black, 1),
            soundPool.load(ctx, R.raw.e6, 1),
            soundPool.load(ctx, R.raw.f6, 1), soundPool.load(ctx, R.raw.f6black, 1),
            soundPool.load(ctx, R.raw.g6, 1), soundPool.load(ctx, R.raw.g6black, 1),
            soundPool.load(ctx, R.raw.a6, 1), soundPool.load(ctx, R.raw.a6black, 1),
            soundPool.load(ctx, R.raw.b6, 1),

            soundPool.load(ctx, R.raw.c7, 1), soundPool.load(ctx, R.raw.c7black, 1),
            soundPool.load(ctx, R.raw.d7, 1), soundPool.load(ctx, R.raw.d7black, 1),
            soundPool.load(ctx, R.raw.e7, 1),
            soundPool.load(ctx, R.raw.f7, 1), soundPool.load(ctx, R.raw.f7black, 1),
            soundPool.load(ctx, R.raw.g7, 1), soundPool.load(ctx, R.raw.g7black, 1),
            soundPool.load(ctx, R.raw.a7, 1), soundPool.load(ctx, R.raw.a7black, 1),
            soundPool.load(ctx, R.raw.b7, 1),
        )
    }
}