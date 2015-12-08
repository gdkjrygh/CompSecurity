// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.r;
import java.util.ArrayList;
import java.util.List;

class fk
    implements r
{

    public final int a;
    private final List b = new ArrayList();

    public fk(int i)
    {
        a = i;
    }

    public final fk a(VastAd vastad)
    {
        b.add(vastad);
        return this;
    }

    public final List a()
    {
        return new ArrayList(b);
    }

    public Object build()
    {
        return a();
    }
}
