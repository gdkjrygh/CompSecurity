// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            g3

public class gr extends g3
{

    public gr()
    {
    }

    public int a(int i)
    {
        if (i == 0)
        {
            return 1;
        }
        return i % 10 != 1 || i % 100 == 11 ? 0 : 2;
    }
}
