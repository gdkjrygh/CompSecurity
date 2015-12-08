// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzod

public final class zzok extends zzod
{

    private String zzNT;
    private String zzNU;
    private String zzaIs;
    private String zzaIt;

    public zzok()
    {
    }

    public void setAppId(String s)
    {
        zzaIs = s;
    }

    public void setAppInstallerId(String s)
    {
        zzaIt = s;
    }

    public void setAppName(String s)
    {
        zzNT = s;
    }

    public void setAppVersion(String s)
    {
        zzNU = s;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("appName", zzNT);
        hashmap.put("appVersion", zzNU);
        hashmap.put("appId", zzaIs);
        hashmap.put("appInstallerId", zzaIt);
        return zzA(hashmap);
    }

    public volatile void zza(zzod zzod1)
    {
        zza((zzok)zzod1);
    }

    public void zza(zzok zzok1)
    {
        if (!TextUtils.isEmpty(zzNT))
        {
            zzok1.setAppName(zzNT);
        }
        if (!TextUtils.isEmpty(zzNU))
        {
            zzok1.setAppVersion(zzNU);
        }
        if (!TextUtils.isEmpty(zzaIs))
        {
            zzok1.setAppId(zzaIs);
        }
        if (!TextUtils.isEmpty(zzaIt))
        {
            zzok1.setAppInstallerId(zzaIt);
        }
    }

    public String zzjZ()
    {
        return zzNT;
    }

    public String zzkb()
    {
        return zzNU;
    }

    public String zztW()
    {
        return zzaIs;
    }

    public String zzxA()
    {
        return zzaIt;
    }
}
