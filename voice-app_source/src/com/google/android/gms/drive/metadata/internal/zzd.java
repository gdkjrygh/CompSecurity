// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Date;

public class zzd extends com.google.android.gms.drive.metadata.zzd
{

    public zzd(String s, int i)
    {
        super(s, i);
    }

    protected volatile void zza(Bundle bundle, Object obj)
    {
        zza(bundle, (Date)obj);
    }

    protected void zza(Bundle bundle, Date date)
    {
        bundle.putLong(getName(), date.getTime());
    }

    protected Object zzc(DataHolder dataholder, int i, int j)
    {
        return zzf(dataholder, i, j);
    }

    protected Date zzf(DataHolder dataholder, int i, int j)
    {
        return new Date(dataholder.zzb(getName(), i, j));
    }

    protected Object zzj(Bundle bundle)
    {
        return zzl(bundle);
    }

    protected Date zzl(Bundle bundle)
    {
        return new Date(bundle.getLong(getName()));
    }
}
