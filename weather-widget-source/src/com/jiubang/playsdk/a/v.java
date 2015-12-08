// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.a;

import com.jiubang.playsdk.d.d;
import java.util.LinkedHashMap;

public class v
{

    private long a;
    private int b;
    private int c;
    private LinkedHashMap d;

    public v()
    {
        a = -1L;
        d = new LinkedHashMap();
    }

    public long a()
    {
        return a;
    }

    public d a(long l)
    {
        return (d)d.get(Long.valueOf(l));
    }

    public void a(int i)
    {
        b = i;
    }

    public void a(d d1)
    {
        d.put(Long.valueOf(d1.a()), d1);
    }

    public int b()
    {
        return c;
    }

    public void b(int i)
    {
        c = i;
    }

    public void b(long l)
    {
        a = l;
    }

    public String toString()
    {
        return (new StringBuilder()).append("KtpPageDataBean [mTypeId=").append(a).append(", mPageId=").append(b).append(", mData=").append(d).append("]").toString();
    }
}
