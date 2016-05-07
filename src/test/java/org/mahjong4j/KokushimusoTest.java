package org.mahjong4j;

import org.junit.Before;
import org.junit.Test;
import org.mahjong4j.hands.MahjongHands;
import org.mahjong4j.yaku.yakuman.MahjongYakumanEnum;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mahjong4j.tile.MahjongTile.M1;
import static org.mahjong4j.yaku.yakuman.MahjongYakumanEnum.KOKUSHIMUSO;

/**
 * @author yu1ro
 */
public class KokushimusoTest {
    MahjongPlayer mahjongPlayer;

    @Before
    public void setUp() throws Exception {
        int[] match = {
            1, 0, 0, 0, 0, 0, 0, 0, 1,
            1, 0, 0, 0, 0, 0, 0, 0, 1,
            1, 0, 0, 0, 0, 0, 0, 0, 1,
            1, 1, 1, 1,
            1, 2, 1
        };
        MahjongHands hands = new MahjongHands(match, M1);
        mahjongPlayer = new MahjongPlayer(hands);
        mahjongPlayer.calculate();
    }

    @Test
    public void testChinrohtoh() throws Exception {
        List<MahjongYakumanEnum> actual = mahjongPlayer.getYakumanList();

        assertEquals(1, actual.size());
        assertEquals(KOKUSHIMUSO, actual.get(0));
    }

    @Test
    public void testGetFu() throws Exception {
        assertEquals(0, mahjongPlayer.getFu());
    }

    @Test
    public void testGetScore() throws Exception {
        assertEquals(Score.SCORE0, mahjongPlayer.getScore());
    }
}
