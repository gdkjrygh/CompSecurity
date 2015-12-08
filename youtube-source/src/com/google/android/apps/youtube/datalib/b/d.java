// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.b;

import com.google.android.apps.youtube.datalib.a.e;
import java.util.Map;

final class d
    implements e
{

    final String a;

    d(String s)
    {
        a = s;
        super();
    }

    public final void a(Map map)
    {
        map.put("User-Agent", a);
    }
}
