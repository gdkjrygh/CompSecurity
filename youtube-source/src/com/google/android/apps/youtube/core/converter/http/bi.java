// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.datalib.legacy.model.InfoCard;
import com.google.android.apps.youtube.datalib.legacy.model.r;
import java.util.ArrayList;
import java.util.List;

public class bi
    implements r
{

    private final List a = new ArrayList();

    public bi()
    {
    }

    public final bi a(InfoCard infocard)
    {
        a.add(infocard);
        return this;
    }

    public final List a()
    {
        return new ArrayList(a);
    }

    public Object build()
    {
        return a();
    }
}
