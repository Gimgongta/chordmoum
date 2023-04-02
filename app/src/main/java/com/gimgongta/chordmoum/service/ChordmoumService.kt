package com.gimgongta.chordmoum.service

import android.content.Context
import android.media.SoundPool
import com.gimgongta.chordmoum.R

object ChordmoumService {

    private val major = arrayListOf(0, 16, 19)
    private val minor = arrayListOf(0, 15, 19)
    private val aug = arrayListOf(0, 16, 20)
    private val dim = arrayListOf(0, 15, 18)
    private val sus4 = arrayListOf(0, 17, 19)
    private val major7 = arrayListOf(0, 11, 16, 19)
    private val minor7 = arrayListOf(0, 10, 15, 19)
    private val dim7 = arrayListOf(0, 9, 15, 18)

    private val sevenF5 = arrayListOf(0, 4, 6, 10)
    private val seven913 = arrayListOf(0, 4, 7, 10, 14, 21)
    private val sevenF9F13 = arrayListOf(0, 4, 7, 10, 13, 20)
    private val sevenS9F13 = arrayListOf(0, 4, 7, 10, 15, 20)
    private val seven9S1113 = arrayListOf(0, 4, 7, 10, 14, 17, 21)

    val chordList = arrayListOf(
        "M",
        "m",
        "aug",
        "dim",
        "sus4",
        "m7",
        "M7",
        "dim7",
        "mM7",
        "b5",
        "7b5",
        "6",
        "7",
        "9",
        "11",
        "13",
        "7(9, 13)",
        "7(b9, b13)",
        "7(#9, b13)",
        "7(9, #11, 13)",
    )

    val chordNoteArrList = arrayListOf(
        major,
        minor,
        aug,
        dim,
        sus4,
        minor7,
        major7,
        dim7,
        getMinorMajor7(),
        getF5(),
        sevenF5,
        getMajor6(),
        get7th(),
        get9(),
        get11(),
        get13(),
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

    fun getMajor(): ArrayList<Int> {
        return arrayListOf(0, 4, 7)
    }

    fun getMajor6(): ArrayList<Int> {
        return arrayListOf(0, 4, 7, 9)
    }

    fun getMajor7(): ArrayList<Int> {
        return arrayListOf(0, 4, 7, 11)
    }

    fun get7th(): ArrayList<Int> {
        return arrayListOf(0, 4, 7, 10)
    }

    fun getMinor7(): ArrayList<Int> {
        return arrayListOf(0, 3, 7, 10)
    }

    fun getMinorMajor7(): ArrayList<Int> {
        return arrayListOf(0, 3, 7, 11)
    }

    fun getMinor7F5(): ArrayList<Int> {
        return arrayListOf(0, 3, 6, 10)
    }

    fun getSus4(): ArrayList<Int> {
        return arrayListOf(0, 5, 7)
    }

    fun getAug(): ArrayList<Int> {
        return arrayListOf(0, 4, 8)
    }

    fun getAug7(): ArrayList<Int> {
        return arrayListOf(0, 4, 8, 10)
    }

    fun getAugMajor7(): ArrayList<Int> {
        return arrayListOf(0, 4, 8, 11)
    }

    fun getDim(): ArrayList<Int> {
        return arrayListOf(0, 3, 6)
    }

    fun getDim7(): ArrayList<Int> {
        return arrayListOf(0, 3, 6, 9)
    }

    fun get2(): ArrayList<Int> { // == add9
        return arrayListOf(0, 4, 7, 14)
    }

    fun getSus2(): ArrayList<Int> { // == add2
        return arrayListOf(0, 2, 7)
    }

    fun get9(): ArrayList<Int> {
        return arrayListOf(0, 4, 7, 11, 14)
    }

    fun getMajor9(): ArrayList<Int> {
        return arrayListOf(0, 4, 7, 10, 14)
    }

    fun getS9(): ArrayList<Int> {
        return arrayListOf(0, 4, 7, 11, 15)
    }

    fun getF9(): ArrayList<Int> {
        return arrayListOf(0, 4, 7, 11, 13)
    }

    fun get11(): ArrayList<Int> {
        return arrayListOf(0, 4, 7, 11, 14, 17)
    }

    fun get7Add11(): ArrayList<Int> {
        return arrayListOf(0, 4, 7, 11, 17)
    }

    fun getS11(): ArrayList<Int> {
        return arrayListOf(0, 4, 7, 11, 18)
    }

    fun get13(): ArrayList<Int> {
        return arrayListOf(0, 4, 7, 11, 21)
    }

    fun getF13(): ArrayList<Int> {
        return arrayListOf(0, 4, 7, 11, 20)
    }

    fun getF5(): ArrayList<Int> {
        return arrayListOf(0, 4, 6)
    }


}