// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.graphics.Bitmap;
import java.util.EventObject;

public final class PreviewFrameEvent extends EventObject
{

    private static final long serialVersionUID = 1L;
    private final BusEvents.RealtimeVideoEvent a;

    PreviewFrameEvent(Object obj, BusEvents.RealtimeVideoEvent realtimevideoevent)
    {
        super(obj);
        a = realtimevideoevent;
    }

    public final Bitmap getBitmap()
    {
        return getBitmap(true);
    }

    public final Bitmap getBitmap(boolean flag)
    {
        return a.getBitmap(Boolean.valueOf(flag));
    }
}
