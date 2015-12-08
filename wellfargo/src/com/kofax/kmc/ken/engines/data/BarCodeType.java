// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;


public final class BarCodeType extends Enum
{

    private static final BarCodeType $VALUES[];
    public static final BarCodeType AZTEC;
    public static final BarCodeType CODABAR;
    public static final BarCodeType CODE128;
    public static final BarCodeType CODE25;
    public static final BarCodeType CODE39;
    public static final BarCodeType CODE93;
    public static final BarCodeType DATAMATRIX;
    public static final BarCodeType EAN;
    public static final BarCodeType PDF417;
    public static final BarCodeType POSTNET;
    public static final BarCodeType QR;
    public static final BarCodeType UNKNOWN;
    public static final BarCodeType UPC;

    private BarCodeType(String s, int i)
    {
        super(s, i);
    }

    public static BarCodeType valueOf(String s)
    {
        return (BarCodeType)Enum.valueOf(com/kofax/kmc/ken/engines/data/BarCodeType, s);
    }

    public static BarCodeType[] values()
    {
        return (BarCodeType[])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new BarCodeType("UNKNOWN", 0);
        PDF417 = new BarCodeType("PDF417", 1);
        CODE39 = new BarCodeType("CODE39", 2);
        QR = new BarCodeType("QR", 3);
        DATAMATRIX = new BarCodeType("DATAMATRIX", 4);
        CODE128 = new BarCodeType("CODE128", 5);
        CODE25 = new BarCodeType("CODE25", 6);
        EAN = new BarCodeType("EAN", 7);
        UPC = new BarCodeType("UPC", 8);
        CODABAR = new BarCodeType("CODABAR", 9);
        AZTEC = new BarCodeType("AZTEC", 10);
        CODE93 = new BarCodeType("CODE93", 11);
        POSTNET = new BarCodeType("POSTNET", 12);
        $VALUES = (new BarCodeType[] {
            UNKNOWN, PDF417, CODE39, QR, DATAMATRIX, CODE128, CODE25, EAN, UPC, CODABAR, 
            AZTEC, CODE93, POSTNET
        });
    }
}
