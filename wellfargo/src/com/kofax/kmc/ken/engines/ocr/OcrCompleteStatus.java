// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.ocr;


// Referenced classes of package com.kofax.kmc.ken.engines.ocr:
//            OcrFailureData

public class OcrCompleteStatus
{

    OcrFailureData a;
    OcrFailureData b;
    OcrFailureData c;

    public OcrCompleteStatus()
    {
    }

    public OcrFailureData getOCRStatus()
    {
        return c;
    }

    public void setOCRStatus(int i)
    {
        if (i < 0)
        {
            c = a;
            return;
        } else
        {
            c = b;
            return;
        }
    }
}
