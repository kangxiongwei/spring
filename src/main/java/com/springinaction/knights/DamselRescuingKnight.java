package com.springinaction.knights;

/**
 * Created by IntelliJ IDEA
 * Author: kangxiongwei1
 * Date: 2016/1/14 12:01
 */
public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    //这种程序缺陷：与RescueDamselQuest紧耦合
    public DamselRescuingKnight(RescueDamselQuest quest) {
        this.quest = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest() throws Exception {
        quest.embark();
    }
}
