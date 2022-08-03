package com.deserve;

public class Game {

    private final Player playerOne;
    private final Player playerTwo;

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public String getResult() {
        return new Deuce(this, new GamePlayer(this, new AdvantagePlayer(this, new DefaultResult(this)))).getResult().format();
    }

    boolean isDeuce() {
        return playerOne.getScore() >= 3 && playerTwo.getScore() >= 3 && haveEqualScores();
    }

    private boolean haveEqualScores() {
        return playerOne.getScore() == playerTwo.getScore();
    }

    public boolean isGame() {
        return atLeastOnePlayerHasScoreGreaterThan4() && scoreDifference() >= 2;
    }

    public boolean hasAdvantage() {
        return atLeastOnePlayerHasScoreGreaterThan4() && scoreDifference() == 1;
    }

    Player getLeadPlayer() {
        return playerOne.getScore() > playerTwo.getScore() ? playerOne : playerTwo;
    }

    private int scoreDifference() {
        return Math.abs(playerOne.getScore() - playerTwo.getScore());
    }

    private boolean atLeastOnePlayerHasScoreGreaterThan4() {
        return playerOne.getScore() >= 4 || playerTwo.getScore() >= 4;
    }
}

