// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.data.DataHolder;

public abstract class zzb
    implements zzi.zzb
{

    private final DataHolder zzWu;

    protected zzb(DataHolder dataholder)
    {
        zzWu = dataholder;
    }

    protected abstract void zza(Object obj, DataHolder dataholder);

    public void zzmw()
    {
        if (zzWu != null)
        {
            zzWu.close();
        }
    }

    public final void zzn(Object obj)
    {
        zza(obj, zzWu);
    }
}
