// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;

// Referenced classes of package com.kofax.kmc.ken.engines:
//            Barcode, RecognitionContext

class BarcodeReaderEngineManager
{

    private Barcode a;
    private BarCodeReader.Symbology b[];
    private BarCodeReader.Direction c;
    private int d;

    BarcodeReaderEngineManager()
    {
    }

    native RecognitionContext ABE_BarcodeEngine_Recognize(Bitmap bitmap, int i, int j, int k, int l, int i1, int j1);

    Barcode a()
    {
        return a;
    }

    void a(Barcode barcode)
    {
        a = barcode;
    }

    static 
    {
        try
        {
            System.loadLibrary("AtalaBar");
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
