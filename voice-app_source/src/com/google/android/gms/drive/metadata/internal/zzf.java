// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.zza;

public class zzf extends zza
{

    public zzf(String s, int i)
    {
        super(s, i);
    }

    protected void zza(Bundle bundle, Integer integer)
    {
        bundle.putInt(getName(), integer.intValue());
    }

    protected volatile void zza(Bundle bundle, Object obj)
    {
        zza(bundle, (Integer)obj);
    }

    protected Object zzc(DataHolder dataholder, int i, int j)
    {
        return zzg(dataholder, i, j);
    }

    protected Integer zzg(DataHolder dataholder, int i, int j)
    {
        return Integer.valueOf(dataholder.zzc(getName(), i, j));
    }

    protected Object zzj(Bundle bundle)
    {
        return zzm(bundle);
    }

    protected Integer zzm(Bundle bundle)
    {
        return Integer.valueOf(bundle.getInt(getName()));
    }
}
