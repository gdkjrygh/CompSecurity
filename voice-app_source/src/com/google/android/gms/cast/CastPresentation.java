// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.app.Presentation;
import android.content.Context;
import android.view.Display;
import android.view.Window;

public abstract class CastPresentation extends Presentation
{

    public CastPresentation(Context context, Display display)
    {
        super(context, display);
        zzlf();
    }

    public CastPresentation(Context context, Display display, int i)
    {
        super(context, display, i);
        zzlf();
    }

    private void zzlf()
    {
        Window window = getWindow();
        if (window != null)
        {
            window.setType(2030);
            window.addFlags(0x10000000);
            window.addFlags(0x1000000);
            window.addFlags(1024);
        }
    }
}
