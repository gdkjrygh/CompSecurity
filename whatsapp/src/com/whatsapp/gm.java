// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            g3, DialogToastActivity

public class gm extends g3
{

    public gm()
    {
    }

    public int a(int i)
    {
        byte byte0;
        int j;
        int k;
        boolean flag;
        byte0 = 2;
        flag = g3.a;
        j = i % 100;
        k = i % 10;
        if (k != 1) goto _L2; else goto _L1
_L1:
        i = byte0;
        if (j < 11) goto _L4; else goto _L3
_L3:
        if (j <= 19) goto _L2; else goto _L5
_L5:
        i = byte0;
_L4:
        return i;
_L2:
        if (k >= 2 && k <= 9 && (j < 11 || j > 19))
        {
            return 8;
        }
        i = 0;
        if (flag)
        {
            DialogToastActivity.g++;
            return 0;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }
}
