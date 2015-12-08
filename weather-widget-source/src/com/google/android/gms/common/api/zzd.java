// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.data.DataHolder;

public abstract class zzd
    implements zzl.zzb
{

    private final DataHolder zzYX;

    protected zzd(DataHolder dataholder)
    {
        zzYX = dataholder;
    }

    protected abstract void zza(Object obj, DataHolder dataholder);

    public void zznh()
    {
        if (zzYX != null)
        {
            zzYX.close();
        }
    }

    public final void zzo(Object obj)
    {
        zza(obj, zzYX);
    }
}
