// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.ocr;


// Referenced classes of package com.kofax.kmc.ken.engines.ocr:
//            OcrRegion

public class OcrParameters
{

    int a;
    private Font b;
    private OcrRegion c;

    public OcrParameters()
    {
        a = 2000;
        b = Font.DEFAULT;
    }

    public Font getFont()
    {
        return b;
    }

    public int getOcrBufferSize()
    {
        return a;
    }

    public OcrRegion getRegion()
    {
        return c;
    }

    public void setFont(Font font)
    {
        b = font;
    }

    public void setOcrBufferSize(int i)
    {
        a = i;
    }

    public void setRegion(OcrRegion ocrregion)
    {
        c = ocrregion;
    }

    private class Font extends Enum
    {

        public static final Font DEFAULT;
        public static final Font E13B_MICR;
        public static final Font FARRINGTON_CREDIT_CARD;
        public static final Font GENERIC_MACHINE_PRINT;
        private static final Font a[];

        public static Font valueOf(String s)
        {
            return (Font)Enum.valueOf(com/kofax/kmc/ken/engines/ocr/OcrParameters$Font, s);
        }

        public static Font[] values()
        {
            return (Font[])a.clone();
        }

        static 
        {
            DEFAULT = new Font("DEFAULT", 0);
            GENERIC_MACHINE_PRINT = new Font("GENERIC_MACHINE_PRINT", 1);
            FARRINGTON_CREDIT_CARD = new Font("FARRINGTON_CREDIT_CARD", 2);
            E13B_MICR = new Font("E13B_MICR", 3);
            a = (new Font[] {
                DEFAULT, GENERIC_MACHINE_PRINT, FARRINGTON_CREDIT_CARD, E13B_MICR
            });
        }

        private Font(String s, int i)
        {
            super(s, i);
        }
    }

}
