// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import com.whatsapp.protocol.a;
import com.whatsapp.protocol.b6;
import com.whatsapp.protocol.bc;
import com.whatsapp.protocol.bl;
import com.whatsapp.protocol.c4;
import com.whatsapp.protocol.cf;

public class ar
{

    cf a;
    String b;
    b6 c;
    c4 d;
    int e;
    String f;
    bc g;
    bl h;
    String i;
    String j;
    a k;
    int l;

    public ar(String s, String s1)
    {
        f = s;
        b = s1;
    }

    public ar(String s, String s1, int i1, cf cf)
    {
        this(s, s1);
        l = i1;
        a = cf;
    }

    public ar(String s, String s1, b6 b6)
    {
        this(s, s1);
        c = b6;
    }

    public ar(String s, String s1, bc bc)
    {
        this(s, s1);
        g = bc;
    }

    public ar(String s, String s1, bl bl)
    {
        this(s, s1);
        h = bl;
    }

    public ar(String s, String s1, c4 c4)
    {
        this(s, s1);
        d = c4;
    }

    public ar(String s, String s1, String s2)
    {
        this(s, s1);
        j = s2;
    }

    public ar(String s, String s1, String s2, a a1)
    {
        this(s, s1);
        i = s2;
        k = a1;
    }

    public ar(String s, String s1, String s2, a a1, int i1)
    {
        this(s, s1);
        j = s2;
        k = a1;
        e = i1;
    }
}
