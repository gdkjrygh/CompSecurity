// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.c.a;

import java.io.File;

public class a
{

    public final String a;
    public final String b;
    public final String c;
    public volatile Object d;
    public volatile int e;
    public volatile int f;

    public a(String s, String s1, String s2)
    {
        f = 0;
        a = s;
        b = s1;
        c = s2;
    }

    public String a()
    {
        return (new StringBuilder()).append(b).append(File.separator).append(c).toString();
    }
}
