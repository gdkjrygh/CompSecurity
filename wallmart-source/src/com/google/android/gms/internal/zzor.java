// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzod

public final class zzor extends zzod
{

    public String zzOj;
    public String zzaIN;
    public String zzaIO;

    public zzor()
    {
    }

    public String getAction()
    {
        return zzOj;
    }

    public String getTarget()
    {
        return zzaIO;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("network", zzaIN);
        hashmap.put("action", zzOj);
        hashmap.put("target", zzaIO);
        return zzA(hashmap);
    }

    public volatile void zza(zzod zzod1)
    {
        zza((zzor)zzod1);
    }

    public void zza(zzor zzor1)
    {
        if (!TextUtils.isEmpty(zzaIN))
        {
            zzor1.zzdW(zzaIN);
        }
        if (!TextUtils.isEmpty(zzOj))
        {
            zzor1.zzdS(zzOj);
        }
        if (!TextUtils.isEmpty(zzaIO))
        {
            zzor1.zzdX(zzaIO);
        }
    }

    public void zzdS(String s)
    {
        zzOj = s;
    }

    public void zzdW(String s)
    {
        zzaIN = s;
    }

    public void zzdX(String s)
    {
        zzaIO = s;
    }

    public String zzya()
    {
        return zzaIN;
    }
}
