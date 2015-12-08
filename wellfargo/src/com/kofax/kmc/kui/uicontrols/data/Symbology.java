// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.data;


public final class Symbology extends Enum
{

    public static final Symbology AZTEC;
    public static final Symbology CODABAR;
    public static final Symbology CODE128;
    public static final Symbology CODE25;
    public static final Symbology CODE39;
    public static final Symbology CODE93;
    public static final Symbology DATAMATRIX;
    public static final Symbology EAN;
    public static final Symbology PDF417;
    public static final Symbology QR;
    public static final Symbology UPC;
    private static final Symbology a[];

    private Symbology(String s, int i)
    {
        super(s, i);
    }

    public static Symbology valueOf(String s)
    {
        return (Symbology)Enum.valueOf(com/kofax/kmc/kui/uicontrols/data/Symbology, s);
    }

    public static Symbology[] values()
    {
        return (Symbology[])a.clone();
    }

    static 
    {
        CODE39 = new Symbology("CODE39", 0);
        PDF417 = new Symbology("PDF417", 1);
        QR = new Symbology("QR", 2);
        DATAMATRIX = new Symbology("DATAMATRIX", 3);
        CODE128 = new Symbology("CODE128", 4);
        CODE25 = new Symbology("CODE25", 5);
        EAN = new Symbology("EAN", 6);
        UPC = new Symbology("UPC", 7);
        CODABAR = new Symbology("CODABAR", 8);
        AZTEC = new Symbology("AZTEC", 9);
        CODE93 = new Symbology("CODE93", 10);
        a = (new Symbology[] {
            CODE39, PDF417, QR, DATAMATRIX, CODE128, CODE25, EAN, UPC, CODABAR, AZTEC, 
            CODE93
        });
    }
}
