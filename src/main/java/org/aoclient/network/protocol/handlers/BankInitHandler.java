package org.aoclient.network.protocol.handlers;

import org.aoclient.network.ByteQueue;
import org.aoclient.network.protocol.PacketHandler;
import org.tinylog.Logger;

public class BankInitHandler implements PacketHandler {
    @Override
    public void handle(ByteQueue data) {
        // Remove packet ID
        data.readByte();

        int bankGold = data.readLong();
        //Call InvBanco(0).Initialize(DirectDraw, frmBancoObj.PicBancoInv, MAX_BANCOINVENTORY_SLOTS)
        //Call InvBanco(1).Initialize(DirectDraw, frmBancoObj.PicInv, Inventario.MaxObjs)

        // For i = 1 To Inventario.MaxObjs
        //        With Inventario
        //            Call InvBanco(1).SetItem(i, .OBJIndex(i), _
        //                .Amount(i), .Equipped(i), .GrhIndex(i), _
        //                .OBJType(i), .MaxHit(i), .MinHit(i), .MaxDef(i), .MinDef(i), _
        //                .Valor(i), .ItemName(i))
        //        End With
        //    Next i
        //
        //    For i = 1 To MAX_BANCOINVENTORY_SLOTS
        //        With UserBancoInventory(i)
        //            Call InvBanco(0).SetItem(i, .OBJIndex, _
        //                .Amount, .Equipped, .GrhIndex, _
        //                .OBJType, .MaxHit, .MinHit, .MaxDef, .MinDef, _
        //                .Valor, .Name)
        //        End With
        //    Next i
        //
        //    'Set state and show form
        //    Comerciando = True
        //
        //    frmBancoObj.lblUserGld.Caption = BankGold
        //
        //    frmBancoObj.Show , //FrmMain

        Logger.debug("handleBankInit CARGADO - FALTA TERMINAR!");
    }
}
