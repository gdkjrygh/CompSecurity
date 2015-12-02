// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import java.util.LinkedHashMap;

// Referenced classes of package com.whatsapp.messaging:
//            bu

final class x extends LinkedHashMap
{

    private static final long serialVersionUID = 1L;

    private x()
    {
    }

    x(bu bu)
    {
        this();
    }

    public static boolean a(Long long1)
    {
        return long1 == null || long1.longValue() + 0x5265c00L < System.currentTimeMillis();
    }

    public static boolean a(java.util.Map.Entry entry)
    {
        return ((Long)entry.getValue()).longValue() + 0x5265c00L < System.currentTimeMillis();
    }

    protected boolean removeEldestEntry(java.util.Map.Entry entry)
    {
        return a(entry);
    }
}
