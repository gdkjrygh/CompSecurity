// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            g3, DialogToastActivity

public class gq extends g3
{

    public gq()
    {
    }

    public int a(int i)
    {
        boolean flag1 = true;
        boolean flag = false;
        boolean flag2 = g3.a;
        int j = i % 100;
        i %= 10;
        if (i == 1 && j != 11)
        {
            i = 2;
        } else
        {
            if (i >= 2 && i <= 4 && (j < 12 || j > 14))
            {
                return 8;
            }
            if (i == 0 || i >= 5 && i <= 9 || j >= 11 && j <= 14)
            {
                return 16;
            }
            i = ((flag) ? 1 : 0);
            if (DialogToastActivity.g != 0)
            {
                if (flag2)
                {
                    flag1 = false;
                }
                g3.a = flag1;
                return 0;
            }
        }
        return i;
    }
}
