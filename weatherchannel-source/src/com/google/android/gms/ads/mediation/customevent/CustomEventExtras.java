// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.NetworkExtras;
import java.util.HashMap;

public final class CustomEventExtras
    implements NetworkExtras
{

    private final HashMap zzHL = new HashMap();

    public CustomEventExtras()
    {
    }

    public Object getExtra(String s)
    {
        return zzHL.get(s);
    }

    public void setExtra(String s, Object obj)
    {
        zzHL.put(s, obj);
    }
}
