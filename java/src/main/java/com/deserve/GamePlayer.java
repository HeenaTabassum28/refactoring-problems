package com.deserve;

public class GamePlayer implements ResultProvider {
    private final Game game;
    private final ResultProvider nextResult;

    public GamePlayer(Game game, ResultProvider nextResult) {
        this.game = game;
        this.nextResult = nextResult;
    }

    @Override
    public Result getResult() {
        if (game.isGame()) {
            return new Result("Win for " + game.getLeadPlayer().getName(), "");
        }
        return this.nextResult.getResult();
    }
}
