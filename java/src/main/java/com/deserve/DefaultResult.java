package com.deserve;

class DefaultResult implements ResultProvider {

    private static final String[] pointsDescription = {"Love", "Fifteen", "Thirty", "Forty"};

    private final Game game;

    public DefaultResult(Game game) {
        this.game = game;
    }

    @Override
    public Result getResult() {
        return new Result(pointsDescription[game.getPlayerOne().getScore()], pointsDescription[game.getPlayerTwo().getScore()]);
    }
}
