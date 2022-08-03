package com.deserve;

public class AdvantagePlayer implements ResultProvider {
    private final Game game;
    private final ResultProvider nextResult;

    public AdvantagePlayer(Game game, ResultProvider nextResult) {
        this.game = game;
        this.nextResult = nextResult;
    }

    @Override
    public Result getResult() {
        if (game.hasAdvantage()) {
            return new Result("Advantage " + game.getLeadPlayer().getName(), "");
        }
        return this.nextResult.getResult();
    }
}
