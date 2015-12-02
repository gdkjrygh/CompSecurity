// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.LinkedHashMap;

// Referenced classes of package com.google:
//            d3

class c3 extends LinkedHashMap
{

    final d3 a;

    c3(d3 d3_1, int i, float f, boolean flag)
    {
        a = d3_1;
        super(i, f, flag);
    }

    protected boolean removeEldestEntry(java.util.Map.Entry entry)
    {
        return size() > d3.a(a);
    }
}
