package com.kotlinstudy.hangmangame.home

/**
 * Created by eferraz on 04/10/17.
 * Contrato para home
 */
interface HomeContract {

    interface View {

        fun showWord(word: Word)
    }

    interface Presenter {

        fun findWord(): Word
    }

    interface Business {

        fun findWord(): Word
    }

    interface Repository {

        fun findWord(): Word
    }
}