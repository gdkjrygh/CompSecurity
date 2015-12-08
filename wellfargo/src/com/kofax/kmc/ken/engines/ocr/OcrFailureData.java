// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.ocr;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;

public class OcrFailureData
{

    String a;
    ErrorInfo b;

    public OcrFailureData()
    {
    }

    public ErrorInfo getErrorCode()
    {
        return b;
    }

    public String getImageID()
    {
        return a;
    }

    public void setImageID(String s)
    {
        a = s;
    }
}
