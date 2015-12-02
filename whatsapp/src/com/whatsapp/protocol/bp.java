// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


public class bp extends Exception
{

    private static final long serialVersionUID = 1L;
    String a;

    public bp()
    {
    }

    public bp(String s)
    {
        super(s);
    }

    public bp(String s, String s1)
    {
        super(s);
        a = s1;
    }

    public String a()
    {
        return a;
    }
}
