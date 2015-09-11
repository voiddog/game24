package voiddog.org.game24.event;

import voiddog.org.game24.data.GameMode;

/**
 * 游戏结束事件
 * Created by Dog on 2015/9/11.
 */
public class GameOverEvent {
    public GameMode gameMode;   //游戏模式
    public int score;           //分数

    public GameOverEvent(GameMode gameMode, int score){
        this.gameMode = gameMode;
        this.score = score;
    }
}
