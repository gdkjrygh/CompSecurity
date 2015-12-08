// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzod

public final class zzop extends zzod
{

    public boolean zzaIE;
    public String zzaoB;

    public zzop()
    {
    }

    public String getDescription()
    {
        return zzaoB;
    }

    public void setDescription(String s)
    {
        zzaoB = s;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("description", zzaoB);
        hashmap.put("fatal", Boolean.valueOf(zzaIE));
        return zzA(hashmap);
    }

    public volatile void zza(zzod zzod1)
    {
        zza((zzop)zzod1);
    }

    public void zza(zzop zzop1)
    {
        if (!TextUtils.isEmpty(zzaoB))
        {
            zzop1.setDescription(zzaoB);
        }
        if (zzaIE)
        {
            zzop1.zzak(zzaIE);
        }
    }

    public void zzak(boolean flag)
    {
        zzaIE = flag;
    }

    public boolean zzxR()
    {
        return zzaIE;
    }
}
