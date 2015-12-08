// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzod;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Promotion
{

    public static final String ACTION_CLICK = "click";
    public static final String ACTION_VIEW = "view";
    Map zzLj;

    public Promotion()
    {
        zzLj = new HashMap();
    }

    void put(String s, String s1)
    {
        zzx.zzb(s, "Name should be non-null");
        zzLj.put(s, s1);
    }

    public Promotion setCreative(String s)
    {
        put("cr", s);
        return this;
    }

    public Promotion setId(String s)
    {
        put("id", s);
        return this;
    }

    public Promotion setName(String s)
    {
        put("nm", s);
        return this;
    }

    public Promotion setPosition(String s)
    {
        put("ps", s);
        return this;
    }

    public String toString()
    {
        return zzod.zzF(zzLj);
    }

    public Map zzaV(String s)
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = zzLj.entrySet().iterator(); iterator.hasNext(); hashmap.put((new StringBuilder()).append(s).append((String)entry.getKey()).toString(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return hashmap;
    }
}
