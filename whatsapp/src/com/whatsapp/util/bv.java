// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.os.SystemClock;
import android.view.View;

public abstract class bv
    implements android.view.View.OnClickListener
{

    private long a;

    public bv()
    {
    }

    public abstract void a(View view);

    public final void onClick(View view)
    {
        long l = SystemClock.elapsedRealtime();
        if (l - a > 1000L)
        {
            a = l;
            a(view);
        }
    }
}
