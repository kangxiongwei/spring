package com.springinaction.knights;

/**
 * Created by IntelliJ IDEA
 * Author: kangxiongwei1
 * Date: 2016/1/14 12:04
 *
 * 勇敢的骑士
 */
public class BraveKnight implements Knight {

    private Quest quest;

    private Minstrel minstrel;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public BraveKnight(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }

    /**
     * 实际上，吟游诗人不应该由骑士来进行管理，应该用切面来声明吟游诗人必须歌颂骑士的勇敢事迹
     * @throws Exception
     */
    @Override
    public void embarkOnQuest() throws Exception {
        //minstrel.singBeforeQuest();
        quest.embark();
        //minstrel.singAfterQuest();
    }
}
