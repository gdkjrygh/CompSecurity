// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.data.BarCodeType;

public final class a extends Enum
{

    public static final QRCode Codabar;
    public static final QRCode Code128;
    public static final QRCode Code25;
    public static final QRCode Code39;
    public static final QRCode Code93;
    public static final QRCode Ean;
    public static final QRCode Pdf417;
    public static final QRCode Postnet;
    public static final QRCode QRCode;
    public static final QRCode Upc;
    private static final QRCode b[];
    private final int a;

    static int a(a a1)
    {
        return a1.a;
    }

    public static BarCodeType getBarCodeType(int i)
    {
        switch (i)
        {
        default:
            return BarCodeType.UNKNOWN;

        case 1: // '\001'
            return BarCodeType.CODE128;

        case 2: // '\002'
        case 4: // '\004'
            return BarCodeType.EAN;

        case 8: // '\b'
        case 16: // '\020'
            return BarCodeType.UPC;

        case 32: // ' '
            return BarCodeType.CODE39;

        case 64: // '@'
            return BarCodeType.CODE25;

        case 512: 
            return BarCodeType.CODE93;

        case 1024: 
            return BarCodeType.CODABAR;

        case 4096: 
            return BarCodeType.POSTNET;

        case 2097152: 
            return BarCodeType.PDF417;

        case 4194304: 
            return BarCodeType.QR;
        }
    }

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/ken/engines/BarCodeReader$Symbology, s);
    }

    public static [] values()
    {
        return ([])b.clone();
    }

    static 
    {
        Code128 = new <init>("Code128", 0, 1);
        Ean = new <init>("Ean", 1, 6);
        Upc = new <init>("Upc", 2, 24);
        Code39 = new <init>("Code39", 3, 32);
        Code25 = new <init>("Code25", 4, 64);
        Code93 = new <init>("Code93", 5, 512);
        Codabar = new <init>("Codabar", 6, 1024);
        Postnet = new <init>("Postnet", 7, 4096);
        Pdf417 = new <init>("Pdf417", 8, 0x200000);
        QRCode = new <init>("QRCode", 9, 0x400000);
        b = (new b[] {
            Code128, Ean, Upc, Code39, Code25, Code93, Codabar, Postnet, Pdf417, QRCode
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        a = j;
    }
}
