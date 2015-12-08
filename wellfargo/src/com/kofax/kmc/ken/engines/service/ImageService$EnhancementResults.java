// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.service;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;

public class errorInfo
{

    public ErrorInfo errorInfo;
    public Image image;
    public Image originalImage;

    public (Image image1, Image image2)
    {
        errorInfo = ErrorInfo.KMC_SUCCESS;
        image = image1;
        originalImage = image2;
    }

    public originalImage(ErrorInfo errorinfo)
    {
        errorInfo = errorinfo;
    }
}
