// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            App

public class asd
{

    int a;
    asd b;
    private int c;
    asd d;
    float e;
    c4 f;

    public asd(int i, c4 c4)
    {
        a = -99;
        a = i;
        f = c4;
    }

    public asd(asd asd1, boolean flag, c4 c4)
    {
label0:
        {
            super();
            a = -99;
            if (flag)
            {
                d = asd1;
                if (App.am == 0)
                {
                    break label0;
                }
            }
            b = asd1;
        }
        f = c4;
    }

    static int a(asd asd1)
    {
        return asd1.c;
    }

    public void a(int i)
    {
        c = i;
    }
}
