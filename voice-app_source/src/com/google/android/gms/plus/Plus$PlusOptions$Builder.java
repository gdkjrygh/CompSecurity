// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import com.google.android.gms.common.internal.zzu;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus:
//            Plus

public static final class 
{

    String zzaHb;
    final Set zzaHc = new HashSet();

    public transient  addActivityTypes(String as[])
    {
        zzu.zzb(as, "activityTypes may not be null.");
        for (int i = 0; i < as.length; i++)
        {
            zzaHc.add(as[i]);
        }

        return this;
    }

    public zzaHc build()
    {
        return new zzaHc(this, null);
    }

    public zzaHc setServerClientId(String s)
    {
        zzaHb = s;
        return this;
    }

    public ()
    {
    }
}
