package org.aoclient.engine.game.models;

/**
 * <p>
 * Cataloga todos los posibles tipos de items que pueden encontrarse en el mundo, desde armas y armaduras hasta recursos, pociones
 * y elementos decorativos. Cada tipo de objeto tiene un valor numerico asociado que se utiliza en la comunicacion con el servidor
 * y en el procesamiento interno.
 * <p>
 * Adicionalmente, cada tipo de objeto posee un atributo booleano {@code equippable} que indica si dicho objeto puede ser equipado
 * por un personaje. Por ejemplo, armas, armaduras y cascos son equipables, mientras que pociones, oro o recursos no lo son.
 */

public enum E_ObjType {

    otUseOnce(1),
    otWeapon(2, true),
    otArmor(3, true),
    otArboles(4),
    otGuita(5),
    otPuertas(6),
    otContenedores(7),
    otCarteles(8),
    otLlaves(9),
    otForos(10),
    otPociones(11),
    otBooks(12),
    otBebidas(13),
    otFirewood(14),
    otFogata(15),
    otShield(16, true),
    otHelmet(17, true),
    otAnillo(18, true),
    otTeleport(19),
    otMuebles(20),
    otJoyas(21),
    otYacimiento(22),
    otMinerales(23),
    otPergaminos(24),
    otAura(25),
    otInstrumentos(26),
    otYunque(27),
    otFragua(28),
    otGema(29),
    otFlowers(30),
    otBarcos(31, true),
    otFlechas(32, true),
    otBotellaVacia(33),
    otBotellaLlena(34),
    otManchas(35),
    otArbolElfico(36),
    otMochilas(37),
    otCualquiera(1000);

    public final int value;
    public final boolean equippable;


    E_ObjType(int value, boolean equippable) {
        this.value = value;
        this.equippable = equippable;
    }

    E_ObjType(int value) {
        this.value = value;
        this.equippable = false;
    }

}
