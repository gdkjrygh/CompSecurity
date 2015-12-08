// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzx;
import java.util.Set;

public final class zzly
{

    public static String[] zza(Scope ascope[])
    {
        zzx.zzb(ascope, "scopes can't be null.");
        String as[] = new String[ascope.length];
        for (int i = 0; i < ascope.length; i++)
        {
            as[i] = ascope[i].zznG();
        }

        return as;
    }

    public static String[] zzc(Set set)
    {
        zzx.zzb(set, "scopes can't be null.");
        return zza((Scope[])set.toArray(new Scope[set.size()]));
    }
}
