package com.deserve;

class Result {
    String playerOneScore;
    String playerTwoScore;

    Result(String playerOneScore, String playerTwoScore) {
        this.playerOneScore = playerOneScore;
        this.playerTwoScore = playerTwoScore;
    }

    String format() {
        if (this.playerTwoScore.isEmpty())
            return this.playerOneScore;
        if (playerOneScore.equals(playerTwoScore))
            return playerOneScore + "-All";
        return this.playerOneScore + "-" + this.playerTwoScore;
    }
}
