// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.drive.metadata.zzb;
import java.util.ArrayList;
import java.util.Collection;

public class zzi extends zzb
{

    public zzi(String s, Collection collection, Collection collection1, int i)
    {
        super(s, collection, collection1, i);
    }

    protected volatile void zza(Bundle bundle, Object obj)
    {
        zza(bundle, (Collection)obj);
    }

    protected void zza(Bundle bundle, Collection collection)
    {
        String s = getName();
        if (collection instanceof ArrayList)
        {
            collection = (ArrayList)collection;
        } else
        {
            collection = new ArrayList(collection);
        }
        bundle.putParcelableArrayList(s, collection);
    }

    protected Object zzj(Bundle bundle)
    {
        return zzo(bundle);
    }

    protected Collection zzo(Bundle bundle)
    {
        return bundle.getParcelableArrayList(getName());
    }
}
