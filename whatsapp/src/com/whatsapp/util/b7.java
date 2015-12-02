// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.util.LinkedHashMap;

public class b7 extends LinkedHashMap
{

    private static final float b = 0.75F;
    private int a;

    public b7(int i)
    {
        super((int)Math.ceil((float)i / 0.75F) + 1, 0.75F, true);
        a = i;
    }

    protected boolean removeEldestEntry(java.util.Map.Entry entry)
    {
        return size() > a;
    }
}
