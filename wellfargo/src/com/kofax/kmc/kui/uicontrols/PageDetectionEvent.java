// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import java.util.EventObject;

public class PageDetectionEvent extends EventObject
{

    private static final long serialVersionUID = 1L;
    private Bitmap a;
    private BoundingTetragon b;

    public PageDetectionEvent(Object obj, Bitmap bitmap, BoundingTetragon boundingtetragon)
    {
        super(obj);
        a = bitmap;
        b = boundingtetragon;
    }

    public final BoundingTetragon getBound()
    {
        return b;
    }

    public final Bitmap getPreviewImage()
    {
        return a;
    }
}
