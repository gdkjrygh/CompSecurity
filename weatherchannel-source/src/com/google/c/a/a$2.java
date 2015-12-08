// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.a;


// Referenced classes of package com.google.c.a:
//            a

static final class <init> extends <init>
{

    final char q;
    final char r;

    public boolean a(char c)
    {
        return q <= c && c <= r;
    }

    (String s, char c, char c1)
    {
        q = c;
        r = c1;
        super(s);
    }
}
