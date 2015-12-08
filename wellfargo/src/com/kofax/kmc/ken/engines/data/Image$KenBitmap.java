// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;

import android.graphics.Bitmap;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;

public class bitmap
{

    public Bitmap bitmap;
    public ErrorInfo errInfo;
    public Integer mDpiX;
    public Integer mDpiY;
    public int scaleFactor;

    public ()
    {
        bitmap = null;
        mDpiX = null;
        mDpiY = null;
        scaleFactor = 1;
        errInfo = ErrorInfo.KMC_SUCCESS;
    }

    public _SUCCESS(Bitmap bitmap1)
    {
        bitmap = null;
        mDpiX = null;
        mDpiY = null;
        scaleFactor = 1;
        errInfo = ErrorInfo.KMC_SUCCESS;
        bitmap = bitmap1;
    }
}
