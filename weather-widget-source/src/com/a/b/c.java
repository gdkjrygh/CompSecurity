// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.b;


public abstract class c
{

    private final String a;
    private final Class b;

    public c(Class class1, String s)
    {
        a = s;
        b = class1;
    }

    public abstract Object a(Object obj);

    public String a()
    {
        return a;
    }

    public void a(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException((new StringBuilder()).append("Property ").append(a()).append(" is read-only").toString());
    }
}
