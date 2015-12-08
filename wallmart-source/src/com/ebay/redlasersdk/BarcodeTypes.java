// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ebay.redlasersdk;


// Referenced classes of package com.ebay.redlasersdk:
//            BarcodeScanActivity

public class BarcodeTypes
{

    public static final int CODABAR = 2048;
    public static final int CODE128 = 32;
    public static final int CODE39 = 64;
    public static final int CODE93 = 512;
    public static final int DATAMATRIX = 128;
    public static final int EAN13 = 1;
    public static final int EAN2 = 8192;
    public static final int EAN5 = 4096;
    public static final int EAN8 = 4;
    public static final int GS1DATABAR = 1024;
    public static final int GS1DATABAR_EXPANDED = 32768;
    public static final int ITF = 256;
    public static final int NONE = 0;
    public static final int PDF417 = 16384;
    public static final int QRCODE = 16;
    public static final int RSS14 = 1024;
    public static final int UPCE = 2;
    BarcodeScanActivity changeListener;
    private int enabledTypes;

    public BarcodeTypes()
    {
        enabledTypes = 0;
        changeListener = null;
    }

    private void setBitfield(int i, boolean flag)
    {
        int j = enabledTypes;
        enabledTypes = enabledTypes & ~i;
        if (flag)
        {
            enabledTypes = enabledTypes | i;
        }
        if (enabledTypes != j && changeListener != null)
        {
            changeListener.enabledBarcodeTypesChanged();
        }
    }

    public boolean getCodabar()
    {
        return (enabledTypes & 0x800) != 0;
    }

    public boolean getCode128()
    {
        return (enabledTypes & 0x20) != 0;
    }

    public boolean getCode39()
    {
        return (enabledTypes & 0x40) != 0;
    }

    public boolean getCode93()
    {
        return (enabledTypes & 0x200) != 0;
    }

    public boolean getDataMatrix()
    {
        return (enabledTypes & 0x80) != 0;
    }

    public boolean getEAN2()
    {
        return (enabledTypes & 0x2000) != 0;
    }

    public boolean getEAN5()
    {
        return (enabledTypes & 0x1000) != 0;
    }

    public boolean getEan13()
    {
        return (enabledTypes & 1) != 0;
    }

    public boolean getEan8()
    {
        return (enabledTypes & 4) != 0;
    }

    public int getEnabledTypes()
    {
        return enabledTypes;
    }

    public boolean getGS1Databar()
    {
        return (enabledTypes & 0x400) != 0;
    }

    public boolean getGS1DatabarExpanded()
    {
        return (enabledTypes & 0x8000) != 0;
    }

    public boolean getITF()
    {
        return (enabledTypes & 0x100) != 0;
    }

    public boolean getPDF417()
    {
        return (enabledTypes & 0x4000) != 0;
    }

    public boolean getQRCode()
    {
        return (enabledTypes & 0x10) != 0;
    }

    public boolean getRSS14()
    {
        return (enabledTypes & 0x400) != 0;
    }

    public boolean getSticky()
    {
        return false;
    }

    public boolean getUpce()
    {
        return (enabledTypes & 2) != 0;
    }

    public void setCodabar(boolean flag)
    {
        setBitfield(2048, flag);
    }

    public void setCode128(boolean flag)
    {
        setBitfield(32, flag);
    }

    public void setCode39(boolean flag)
    {
        setBitfield(64, flag);
    }

    public void setCode93(boolean flag)
    {
        setBitfield(512, flag);
    }

    public void setDataMatrix(boolean flag)
    {
        setBitfield(128, flag);
    }

    public void setEan13(boolean flag)
    {
        setBitfield(1, flag);
    }

    public void setEan2(boolean flag)
    {
        setBitfield(8192, flag);
    }

    public void setEan5(boolean flag)
    {
        setBitfield(4096, flag);
    }

    public void setEan8(boolean flag)
    {
        setBitfield(4, flag);
    }

    public void setEnabledTypes(int i)
    {
        int j = enabledTypes;
        enabledTypes = i;
        if (enabledTypes != j && changeListener != null)
        {
            changeListener.enabledBarcodeTypesChanged();
        }
    }

    public void setGS1Databar(boolean flag)
    {
        setBitfield(1024, flag);
    }

    public void setGS1DatabarExpanded(boolean flag)
    {
        setBitfield(32768, flag);
    }

    public void setITF(boolean flag)
    {
        setBitfield(256, flag);
    }

    public void setPDF417(boolean flag)
    {
        setBitfield(16384, flag);
    }

    public void setQRCode(boolean flag)
    {
        setBitfield(16, flag);
    }

    public void setRSS14(boolean flag)
    {
        setBitfield(1024, flag);
    }

    public void setSticky(boolean flag)
    {
    }

    public void setUpce(boolean flag)
    {
        setBitfield(2, flag);
    }
}
