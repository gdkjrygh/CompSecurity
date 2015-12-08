// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzx;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

public static class zzZp
{

    private boolean zzZo;
    private Set zzZp;

    public static zzZp newAuthNotRequiredResult()
    {
        return new <init>(false, null);
    }

    public static <init> newAuthRequiredResult(Set set)
    {
        boolean flag;
        if (set != null && !set.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "A non-empty scope set is required if further auth is needed.");
        return new <init>(true, set);
    }

    public boolean zznl()
    {
        return zzZo;
    }

    public Set zznm()
    {
        return zzZp;
    }

    private (boolean flag, Set set)
    {
        zzZo = flag;
        zzZp = set;
    }
}
