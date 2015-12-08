// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.zza;

public class zzg extends zza
{

    public zzg(String s, int i)
    {
        super(s, i);
    }

    protected void zza(Bundle bundle, Long long1)
    {
        bundle.putLong(getName(), long1.longValue());
    }

    protected volatile void zza(Bundle bundle, Object obj)
    {
        zza(bundle, (Long)obj);
    }

    protected Object zzc(DataHolder dataholder, int i, int j)
    {
        return zzh(dataholder, i, j);
    }

    protected Long zzh(DataHolder dataholder, int i, int j)
    {
        return Long.valueOf(dataholder.zzb(getName(), i, j));
    }

    protected Object zzj(Bundle bundle)
    {
        return zzn(bundle);
    }

    protected Long zzn(Bundle bundle)
    {
        return Long.valueOf(bundle.getLong(getName()));
    }
}
