// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.zza;
import java.util.Collection;

public class zzb extends zza
{

    public zzb(String s, int i)
    {
        super(s, i);
    }

    public zzb(String s, Collection collection, Collection collection1, int i)
    {
        super(s, collection, collection1, i);
    }

    protected void zza(Bundle bundle, Boolean boolean1)
    {
        bundle.putBoolean(getName(), boolean1.booleanValue());
    }

    protected volatile void zza(Bundle bundle, Object obj)
    {
        zza(bundle, (Boolean)obj);
    }

    protected Object zzc(DataHolder dataholder, int i, int j)
    {
        return zze(dataholder, i, j);
    }

    protected Boolean zze(DataHolder dataholder, int i, int j)
    {
        return Boolean.valueOf(dataholder.zze(getName(), i, j));
    }

    protected Object zzj(Bundle bundle)
    {
        return zzk(bundle);
    }

    protected Boolean zzk(Bundle bundle)
    {
        return Boolean.valueOf(bundle.getBoolean(getName()));
    }
}
