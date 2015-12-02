// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            g3

public class g4 extends g3
{

    public g4()
    {
    }

    public int a(int i)
    {
        int j = i % 100;
        if (i == 1)
        {
            return 2;
        }
        if (i == 0 || j >= 2 && j <= 10)
        {
            return 8;
        }
        return j < 11 || j > 19 ? 0 : 16;
    }
}
