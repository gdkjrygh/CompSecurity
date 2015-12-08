// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import com.kofax.kmc.ken.engines.data.Image;
import java.util.EventObject;

public class ImageCapturedEvent extends EventObject
{

    private static final long serialVersionUID = 1L;
    private Image a;

    public ImageCapturedEvent(Object obj, Image image)
    {
        super(obj);
        a = image;
    }

    public final Image getImage()
    {
        return a;
    }
}
