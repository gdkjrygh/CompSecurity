// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.a;

import com.gau.go.launcherex.gowidget.scriptengine.parser.z;

class k
{

    z a;
    int b;
    int c;

    public k(z z, int i, int j)
    {
        a = z;
        b = i;
        c = j;
    }

    boolean a(k k1)
    {
        return a.equals(k1.a) && b == k1.b && c == k1.c;
    }
}
