package org.mahjong4j;

import org.mahjong4j.tile.MahjongTile;

/**
 * @author yu1ro
 */
public class PersonalSituation {
    private boolean isDealer;
    private boolean isTsumo;
    private boolean isIppatsu;
    private boolean isReache;
    private boolean isDoubleReach;
    private boolean isChankan;
    private boolean isRinshankaihoh;
    private MahjongTile jikaze;

    public PersonalSituation(boolean isDealer, boolean isTsumo, boolean isIppatsu, boolean isReache, boolean isDoubleReach, boolean isChankan, boolean isRinshankaihoh, MahjongTile jikaze) {
        this.isDealer = isDealer;
        this.isTsumo = isTsumo;
        this.isIppatsu = isIppatsu;
        this.isReache = isReache;
        this.isDoubleReach = isDoubleReach;
        this.isChankan = isChankan;
        this.isRinshankaihoh = isRinshankaihoh;
        this.jikaze = jikaze;
    }

    public boolean isDealer() {
        return isDealer;
    }

    public void setDealer(boolean dealer) {
        isDealer = dealer;
    }

    public boolean isTsumo() {
        return isTsumo;
    }

    public void setTsumo(boolean tsumo) {
        isTsumo = tsumo;
    }

    public boolean isIppatsu() {
        return isIppatsu;
    }

    public void setIppatsu(boolean ippatsu) {
        isIppatsu = ippatsu;
    }

    public boolean isReach() {
        return isReache;
    }

    public void setReach(boolean reach) {
        this.isReache = reach;
    }

    public boolean isDoubleReach() {
        return isDoubleReach;
    }

    public void setDoubleReach(boolean doubleReach) {
        isDoubleReach = doubleReach;
    }

    public boolean isChankan() {
        return isChankan;
    }

    public void setChankan(boolean chankan) {
        isChankan = chankan;
    }

    public boolean isRinshankaihoh() {
        return isRinshankaihoh;
    }

    public void setRinshankaihoh(boolean rinshankaihoh) {
        isRinshankaihoh = rinshankaihoh;
    }

    public MahjongTile getJikaze() {
        return jikaze;
    }

    public void setJikaze(MahjongTile jikaze) {
        this.jikaze = jikaze;
    }
}
