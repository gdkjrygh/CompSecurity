// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            f8, afn, ak3

class fs extends f8
{

    private fs(int i, int j, int k)
    {
        super(i, null, j, k, null);
    }

    fs(int i, int j, int k, ak3 ak3)
    {
        this(i, j, k);
    }

    public int a()
    {
        return Math.min(35, afn.b().size());
    }

    public int a(int i)
    {
        return ((EmojiPicker.EmojiWeight)afn.b().get(i)).code;
    }
}
