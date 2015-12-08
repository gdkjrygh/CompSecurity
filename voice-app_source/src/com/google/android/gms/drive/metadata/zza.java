// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.metadata:
//            MetadataField

public abstract class zza
    implements MetadataField
{

    private final Set zzagA;
    private final int zzagB;
    private final String zzagy;
    private final Set zzagz;

    protected zza(String s, int i)
    {
        zzagy = (String)zzu.zzb(s, "fieldName");
        zzagz = Collections.singleton(s);
        zzagA = Collections.emptySet();
        zzagB = i;
    }

    protected zza(String s, Collection collection, Collection collection1, int i)
    {
        zzagy = (String)zzu.zzb(s, "fieldName");
        zzagz = Collections.unmodifiableSet(new HashSet(collection));
        zzagA = Collections.unmodifiableSet(new HashSet(collection1));
        zzagB = i;
    }

    public final String getName()
    {
        return zzagy;
    }

    public String toString()
    {
        return zzagy;
    }

    public final Object zza(DataHolder dataholder, int i, int j)
    {
        if (zzb(dataholder, i, j))
        {
            return zzc(dataholder, i, j);
        } else
        {
            return null;
        }
    }

    protected abstract void zza(Bundle bundle, Object obj);

    public final void zza(DataHolder dataholder, MetadataBundle metadatabundle, int i, int j)
    {
        zzu.zzb(dataholder, "dataHolder");
        zzu.zzb(metadatabundle, "bundle");
        if (zzb(dataholder, i, j))
        {
            metadatabundle.zzb(this, zzc(dataholder, i, j));
        }
    }

    public final void zza(Object obj, Bundle bundle)
    {
        zzu.zzb(bundle, "bundle");
        if (obj == null)
        {
            bundle.putString(getName(), null);
            return;
        } else
        {
            zza(bundle, obj);
            return;
        }
    }

    protected boolean zzb(DataHolder dataholder, int i, int j)
    {
        for (Iterator iterator = zzagz.iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            if (!dataholder.zzbV(s) || dataholder.zzi(s, i, j))
            {
                return false;
            }
        }

        return true;
    }

    protected abstract Object zzc(DataHolder dataholder, int i, int j);

    public final Object zzi(Bundle bundle)
    {
        zzu.zzb(bundle, "bundle");
        if (bundle.get(getName()) != null)
        {
            return zzj(bundle);
        } else
        {
            return null;
        }
    }

    protected abstract Object zzj(Bundle bundle);
}
