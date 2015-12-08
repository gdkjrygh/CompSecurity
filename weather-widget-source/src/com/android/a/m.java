// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a;

import java.util.Map;

public class m
{

    public final int a;
    public final byte b[];
    public final Map c;
    public final boolean d;

    public m(int i, byte abyte0[], Map map, boolean flag)
    {
        a = i;
        b = abyte0;
        c = map;
        d = flag;
    }

    public m(byte abyte0[], Map map)
    {
        this(200, abyte0, map, false);
    }
}
