// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.data.Image;
import java.util.EventObject;

public class ImageClassificationCompleteEvent extends EventObject
{

    private static final long serialVersionUID = 1L;
    private Image a;

    public ImageClassificationCompleteEvent(Object obj, Image image)
    {
        super(obj);
        a = null;
        a = image;
    }

    public Image getImage()
    {
        return a;
    }
}
