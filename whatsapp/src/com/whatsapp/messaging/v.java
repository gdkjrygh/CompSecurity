// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c5;
import com.whatsapp.vp;
import java.util.List;

public class v
{

    List a;
    vp b;
    int c;
    a d;
    List e;
    List f;
    String g;
    c5 h;
    String i;

    public v(int j, List list, vp vp)
    {
        c = j;
        a = list;
        b = vp;
    }

    public v(a a1, int j, vp vp)
    {
        d = a1;
        b = vp;
        c = j;
    }

    public v(c5 c5, vp vp)
    {
        h = c5;
        b = vp;
    }

    public v(String s, vp vp)
    {
        i = s;
        b = vp;
    }

    public v(String s, vp vp, List list)
    {
        i = s;
        e = list;
        b = vp;
    }

    public v(String s, List list, int j, vp vp)
    {
        g = s;
        a = list;
        c = j;
        b = vp;
    }

    public v(String s, List list, vp vp)
    {
        i = s;
        f = list;
        b = vp;
    }

    public v(List list, vp vp)
    {
        a = list;
        b = vp;
    }
}
