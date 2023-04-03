package com.gimgongta.chordmoum.activity

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import com.gimgongta.chordmoum.databinding.ActivityChordmoumBinding
import com.gimgongta.chordmoum.service.ChordmoumService.getNoteArr
import com.gimgongta.chordmoum.service.ChordmoumService.list
import com.gimgongta.chordmoum.service.ChordmoumService.noteList

class Chordmoum : AppCompatActivity() {

    private lateinit var soundPool: SoundPool
    private lateinit var binding: ActivityChordmoumBinding
    private lateinit var baseNoteArr: ArrayList<LinearLayout>
    private lateinit var buttonArr: ArrayList<LinearLayout>
    private lateinit var textArr: ArrayList<TextView>
    private lateinit var noteArr: ArrayList<Int>
    private var baseNote = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        binding = ActivityChordmoumBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    @SuppressLint("SetTextI18n")
    private fun init() {

        val ctx = this
        soundPool = SoundPool.Builder().setMaxStreams(7).build()

        noteArr = getNoteArr(soundPool, ctx)

        baseNoteArr = arrayListOf(
            binding.baseNote.noteC,
            binding.baseNote.noteDb,
            binding.baseNote.noteD,
            binding.baseNote.noteEb,
            binding.baseNote.noteE,
            binding.baseNote.noteF,
            binding.baseNote.noteGb,
            binding.baseNote.noteG,
            binding.baseNote.noteAb,
            binding.baseNote.noteA,
            binding.baseNote.noteBb,
            binding.baseNote.noteB,
        )

        for (i in baseNoteArr.indices) {
            baseNoteArr[i].setOnClickListener {
                setBaseNote(i)
            }
        }

        setBaseNote(0)

        buttonArr = arrayListOf(
            binding.chordButton.line0Button0,
            binding.chordButton.line0Button1,
            binding.chordButton.line0Button2,
            binding.chordButton.line0Button3,
            binding.chordButton.line0Button4,

            binding.chordButton.line1Button0,
            binding.chordButton.line1Button1,
            binding.chordButton.line1Button2,
            binding.chordButton.line1Button3,
            binding.chordButton.line1Button4,

            binding.chordButton.line2Button0,
            binding.chordButton.line2Button1,
            binding.chordButton.line2Button2,
            binding.chordButton.line2Button3,
            binding.chordButton.line2Button4,

            binding.chordButton.line3Button0,
            binding.chordButton.line3Button1,
            binding.chordButton.line3Button2,
            binding.chordButton.line3Button3,
            binding.chordButton.line3Button4,

            binding.chordButton.line4Button0,
            binding.chordButton.line4Button1,
            binding.chordButton.line4Button2,
            binding.chordButton.line4Button3,
            binding.chordButton.line4Button4,
        )

        for (i in buttonArr.indices) {
            buttonArr[i].setOnClickListener {
                binding.chordmoumText.text = "${noteList[baseNote]}${list[i].name}"
                playChord(baseNote, i)
            }
        }

        textArr = arrayListOf(
            binding.chordButton.line0Button0Text,
            binding.chordButton.line0Button1Text,
            binding.chordButton.line0Button2Text,
            binding.chordButton.line0Button3Text,
            binding.chordButton.line0Button4Text,

            binding.chordButton.line1Button0Text,
            binding.chordButton.line1Button1Text,
            binding.chordButton.line1Button2Text,
            binding.chordButton.line1Button3Text,
            binding.chordButton.line1Button4Text,

            binding.chordButton.line2Button0Text,
            binding.chordButton.line2Button1Text,
            binding.chordButton.line2Button2Text,
            binding.chordButton.line2Button3Text,
            binding.chordButton.line2Button4Text,

            binding.chordButton.line3Button0Text,
            binding.chordButton.line3Button1Text,
            binding.chordButton.line3Button2Text,
            binding.chordButton.line3Button3Text,
            binding.chordButton.line3Button4Text,

            binding.chordButton.line4Button0Text,
            binding.chordButton.line4Button1Text,
            binding.chordButton.line4Button2Text,
            binding.chordButton.line4Button3Text,
            binding.chordButton.line4Button4Text,
        )

        for (i in textArr.indices) {
            textArr[i].textSize = 12f
            textArr[i].text = list[i].name
        }
    }

    private fun setBaseNote(note: Int) {
        binding.baseNote.selectedNote = note
        baseNote = note
        binding.baseNote.note = noteList[note]
    }

    private fun playChord(baseNote: Int, index: Int) {
        println("mylog baseNote : $baseNote")
        println("mylog chordNoteArrList[index] : ${list[index].noteArr}")
        list[index].noteArr.forEach {
            soundPool.play(noteArr[it + baseNote], 1f, 1f, 0, 0, 1f)
        }
    }
}