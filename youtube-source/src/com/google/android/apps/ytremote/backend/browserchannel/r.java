// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;

import com.google.android.apps.ytremote.backend.model.Method;
import com.google.android.apps.ytremote.backend.model.Params;
import java.util.List;

final class r
{

    static int a = 30000;
    final List b;
    final Method c;
    final Params d;
    private final long e = System.currentTimeMillis();

    public r(Method method, Params params, List list)
    {
        c = method;
        d = params;
        b = list;
    }

    public final boolean a()
    {
        return System.currentTimeMillis() - e > (long)a;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(c).append("(").append(d.toString()).append(")").toString();
    }

}
