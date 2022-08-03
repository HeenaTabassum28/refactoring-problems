package com.deserve;

class Deuce implements ResultProvider {
    private final Game game;
    private final ResultProvider nextResult;

    public Deuce(Game game, ResultProvider nextResult) {
        this.game = game;
        this.nextResult = nextResult;
    }

    @Override
    public Result getResult() {
        if (game.isDeuce())
            return new Result("Deuce", "");
        return this.nextResult.getResult();
    }
}
