// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            g3

public class gv extends g3
{

    public gv()
    {
    }

    public int a(int i)
    {
        if (i == 0)
        {
            return 1;
        }
        if (i == 1)
        {
            return 2;
        }
        if (i == 2)
        {
            return 4;
        }
        if (i == 3)
        {
            return 8;
        }
        return i != 6 ? 0 : 16;
    }
}
