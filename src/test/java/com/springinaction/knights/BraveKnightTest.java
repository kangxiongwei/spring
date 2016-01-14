package com.springinaction.knights;

import org.junit.Test;
import static org.mockito.Mockito.*;

/**
 * Created by IntelliJ IDEA
 * Author: kangxiongwei1
 * Date: 2016/1/14 12:06
 */
public class BraveKnightTest {

    /**
     * 对于DamselRescuingKnight，无法实现测试，因为紧耦合，
     * 而BraveKnight是松耦合的，因为是松耦合
     * @throws Exception
     */
    @Test
    public void knightShouldEmbarkOnQuest() throws Exception {
        Quest quest = mock(Quest.class);

        BraveKnight knight = new BraveKnight(quest);
        knight.embarkOnQuest();

        verify(quest, times(1)).embark();

    }

}
