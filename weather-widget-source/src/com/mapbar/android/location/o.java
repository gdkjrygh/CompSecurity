// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;


public final class o extends Enum
{

    private static o a;
    private static o b;
    private static final o c[];

    private o(String s, int i)
    {
        super(s, i);
    }

    public static o a(int i)
    {
        o ao[] = (o[])c.clone();
        int k = ao.length;
        for (int j = 0; j < k; j++)
        {
            o o1 = ao[j];
            if (o1.ordinal() == i)
            {
                return o1;
            }
        }

        return null;
    }

    static 
    {
        a = new o("normal", 0);
        b = new o("highflow", 1);
        c = (new o[] {
            a, b
        });
    }
}
