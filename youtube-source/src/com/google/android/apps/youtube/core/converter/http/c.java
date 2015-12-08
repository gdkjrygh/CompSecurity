// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.fromguava.b;
import java.util.Collections;
import java.util.Map;

public final class c
{

    public final String a;
    public final Map b;

    public c(String s, Map map)
    {
        a = com.google.android.apps.youtube.common.fromguava.c.a(s, "videoId cannot be null or empty");
        if (map == null || map == Collections.EMPTY_MAP)
        {
            s = Collections.emptyMap();
        } else
        {
            s = Collections.unmodifiableMap(map);
        }
        b = (Map)com.google.android.apps.youtube.common.fromguava.c.a(s);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof c))
            {
                return false;
            }
            obj = (c)obj;
            if (!a.equals(((c) (obj)).a) || !com.google.android.apps.youtube.common.fromguava.b.a(b, ((c) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (a.hashCode() + 17) * 31 + b.hashCode();
    }
}
