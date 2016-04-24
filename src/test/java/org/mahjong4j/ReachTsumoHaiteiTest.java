package org.mahjong4j;

import org.junit.Before;
import org.junit.Test;
import org.mahjong4j.hands.MahjongHands;
import org.mahjong4j.tile.MahjongTile;
import org.mahjong4j.yaku.normals.MahjongYakuEnum;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertThat;

/**
 * @author yu1ro
 */
public class ReachTsumoHaiteiTest {
    private Mahjong mahjong;

    @Before
    public void setUp() throws Exception {
        int[] tiles = {
            0, 0, 0, 0, 0, 0, 1, 1, 1,
            0, 0, 0, 0, 0, 1, 1, 1, 0,
            0, 0, 2, 0, 0, 0, 1, 1, 1,
            0, 0, 3, 0,
            0, 0, 0
        };
        MahjongTile last = MahjongTile.M9;
        MahjongHands hands = new MahjongHands(tiles, last);
        List<MahjongTile> dora = new ArrayList<>(1);
        dora.add(MahjongTile.CHN);

        List<MahjongTile> uradora = new ArrayList<>(1);
        uradora.add(MahjongTile.M2);
        GeneralSituation generalSituation;
        generalSituation = new GeneralSituation(false, true, MahjongTile.NAN, dora, uradora);
        PersonalSituation personalSituation;
        personalSituation = new PersonalSituation(false, true, false, true, false, false, false, MahjongTile.NAN);

        mahjong = new Mahjong(hands, generalSituation, personalSituation);
        mahjong.calculate();
    }

    @Test
    public void testGetNormalYakuList() throws Exception {
        List<MahjongYakuEnum> actual = mahjong.getNormalYakuList();

        assertEquals(3, actual.size());
        assertThat(actual, hasItems(
            MahjongYakuEnum.REACHE,
            MahjongYakuEnum.TSUMO,
            MahjongYakuEnum.HAITEI
        ));
    }
}