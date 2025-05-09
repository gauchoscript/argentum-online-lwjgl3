package org.aoclient.network.protocol.handlers;

import org.aoclient.engine.game.User;
import org.aoclient.network.ByteQueue;
import org.aoclient.network.protocol.PacketHandler;

import static org.aoclient.engine.game.models.Character.refreshAllChars;
import static org.aoclient.engine.utils.GameData.charList;

public class CharacterMoveHandler implements PacketHandler {

    @Override
    public void handle(ByteQueue data) {
        if (data.checkPacketData(5)) return;

        data.readByte();

        short charIndex = data.readInteger();
        int x = data.readByte();
        int y = data.readByte();

        // Si esta meditando, removemos el FX.
        if (charList[charIndex].getFxIndex() >= 40 && charList[charIndex].getFxIndex() <= 49) {
            charList[charIndex].setFxIndex(0);
        }

        // Play steps sounds if the user is not an admin of any kind
        int priv = charList[charIndex].getPriv();
        if (priv != 1 && priv != 2 && priv != 3 && priv != 5 && priv != 25) {
            User.get().doPasosFx(charIndex);
        }

        User.get().moveCharbyPos(charIndex, x, y);
        refreshAllChars();
    }

}
