// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class aa extends Enum
{

    public static final aa A;
    public static final aa B;
    private static final aa b[];
    private final int a;

    private aa(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static aa valueOf(String s)
    {
        return (aa)Enum.valueOf(com/whatsapp/fieldstats/aa, s);
    }

    public static aa[] values()
    {
        return (aa[])b.clone();
    }

    public int getCode()
    {
        return a;
    }

    static 
    {
        A = new aa("A", 0, 0);
        B = new aa("B", 1, 1);
        b = (new aa[] {
            A, B
        });
    }
}
