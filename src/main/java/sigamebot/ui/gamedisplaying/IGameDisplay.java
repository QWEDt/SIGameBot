package sigamebot.ui.gamedisplaying;

import sigamebot.logic.Player;
import sigamebot.logic.scenariologic.Question;

public interface IGameDisplay {
    void displayStartMessage();
    void updateGameStateView(Question currentQuestion, Player player);

    void displayEndMessage(Player player);
}
