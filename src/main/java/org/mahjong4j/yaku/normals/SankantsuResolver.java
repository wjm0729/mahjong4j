package org.mahjong4j.yaku.normals;


import org.mahjong4j.hands.MentsuComp;

import static org.mahjong4j.yaku.normals.MahjongYakuEnum.SANKANTSU;

/**
 * 三槓子判定クラス
 * 槓子が３つ存在する場合に成立
 *
 * @author yu1ro
 */
public class SankantsuResolver implements NormalYakuResolver {
    private MahjongYakuEnum yakuEnum = SANKANTSU;
    private int kantsuCount;

    public SankantsuResolver(MentsuComp comp) {
        kantsuCount = comp.getKantsuCount();
    }

    public MahjongYakuEnum getNormalYaku() {
        return yakuEnum;
    }

    public boolean isMatch() {
        return kantsuCount == 3;
    }
}
