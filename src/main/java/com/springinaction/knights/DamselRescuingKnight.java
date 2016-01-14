package com.springinaction.knights;

/**
 * Created by IntelliJ IDEA
 * Author: kangxiongwei1
 * Date: 2016/1/14 12:01
 */
public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    public DamselRescuingKnight(RescueDamselQuest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() throws Exception {
        quest.embark();
    }
}
