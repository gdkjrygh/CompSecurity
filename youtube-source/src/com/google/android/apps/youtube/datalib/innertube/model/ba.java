// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.pb;
import com.google.a.a.a.a.ww;
import com.google.a.a.a.a.xa;
import com.google.android.apps.youtube.datalib.innertube.a.b;

public final class ba
{

    private final ww a;
    private CharSequence b;
    private kz c;

    public ba(ww ww1)
    {
        a = ww1;
    }

    public final CharSequence a()
    {
        if (b != null)
        {
            return b;
        }
        Object obj = a.d;
        if (obj == null)
        {
            return null;
        }
        if (((pb) (obj)).c != null)
        {
            obj = ((pb) (obj)).c;
            if (((xa) (obj)).b != null)
            {
                b = com.google.android.apps.youtube.datalib.innertube.a.b.a(((xa) (obj)).b);
            }
        }
        return b;
    }

    public final kz b()
    {
        if (c != null)
        {
            return c;
        }
        if (a.d == null)
        {
            return null;
        } else
        {
            return c;
        }
    }
}
