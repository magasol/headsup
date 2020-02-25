package com.example.headsup.gameRound;

interface GameRoundActivityListener {

    void gameRoundOver(int rightAnswers, int wrongAnswers);

    void startGameRound(int roundTime);
}
