// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import java.util.EventObject;

public class b extends EventObject
{

    private static final long serialVersionUID = 0x47e6346f54c5d67dL;
    private ErrorInfo a;
    private Image b;

    public Image getImage()
    {
        return b;
    }

    public ErrorInfo getStatus()
    {
        return a;
    }

    public (Object obj, ErrorInfo errorinfo, Image image)
    {
        super(obj);
        a = errorinfo;
        b = image;
    }
}
