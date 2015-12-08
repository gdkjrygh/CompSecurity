// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.zza;
import java.util.Collection;

public abstract class zzj extends zza
{

    public zzj(String s, Collection collection, Collection collection1, int i)
    {
        super(s, collection, collection1, i);
    }

    protected void zza(Bundle bundle, Parcelable parcelable)
    {
        bundle.putParcelable(getName(), parcelable);
    }

    protected volatile void zza(Bundle bundle, Object obj)
    {
        zza(bundle, (Parcelable)obj);
    }

    protected Object zzj(Bundle bundle)
    {
        return zzp(bundle);
    }

    protected Parcelable zzp(Bundle bundle)
    {
        return bundle.getParcelable(getName());
    }
}
