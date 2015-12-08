// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.internal.zzx;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.zzlo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            zzh, zze

public final class MetadataBundle
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    final int zzCY;
    final Bundle zzagI;

    MetadataBundle(int i, Bundle bundle)
    {
        zzCY = i;
        zzagI = (Bundle)zzu.zzu(bundle);
        zzagI.setClassLoader(getClass().getClassLoader());
        bundle = new ArrayList();
        Iterator iterator = zzagI.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (zze.zzcw(s1) == null)
            {
                bundle.add(s1);
                zzx.zzu("MetadataBundle", (new StringBuilder()).append("Ignored unknown metadata field in bundle: ").append(s1).toString());
            }
        } while (true);
        String s;
        for (bundle = bundle.iterator(); bundle.hasNext(); zzagI.remove(s))
        {
            s = (String)bundle.next();
        }

    }

    private MetadataBundle(Bundle bundle)
    {
        this(1, bundle);
    }

    public static MetadataBundle zza(MetadataField metadatafield, Object obj)
    {
        MetadataBundle metadatabundle = zzpX();
        metadatabundle.zzb(metadatafield, obj);
        return metadatabundle;
    }

    public static MetadataBundle zza(MetadataBundle metadatabundle)
    {
        return new MetadataBundle(new Bundle(metadatabundle.zzagI));
    }

    public static MetadataBundle zzpX()
    {
        return new MetadataBundle(new Bundle());
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof MetadataBundle))
        {
            return false;
        }
        obj = (MetadataBundle)obj;
        Object obj1 = zzagI.keySet();
        if (!((Set) (obj1)).equals(((MetadataBundle) (obj)).zzagI.keySet()))
        {
            return false;
        }
        for (obj1 = ((Set) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            String s = (String)((Iterator) (obj1)).next();
            if (!zzt.equal(zzagI.get(s), ((MetadataBundle) (obj)).zzagI.get(s)))
            {
                return false;
            }
        }

        return true;
    }

    public int hashCode()
    {
        Iterator iterator = zzagI.keySet().iterator();
        String s;
        int i;
        for (i = 1; iterator.hasNext(); i = zzagI.get(s).hashCode() + i * 31)
        {
            s = (String)iterator.next();
        }

        return i;
    }

    public void setContext(Context context)
    {
        BitmapTeleporter bitmapteleporter = (BitmapTeleporter)zza(zzlo.zzaho);
        if (bitmapteleporter != null)
        {
            bitmapteleporter.zzc(context.getCacheDir());
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("MetadataBundle [values=").append(zzagI).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public Object zza(MetadataField metadatafield)
    {
        return metadatafield.zzi(zzagI);
    }

    public void zzb(MetadataField metadatafield, Object obj)
    {
        if (zze.zzcw(metadatafield.getName()) == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unregistered field: ").append(metadatafield.getName()).toString());
        } else
        {
            metadatafield.zza(obj, zzagI);
            return;
        }
    }

    public boolean zzc(MetadataField metadatafield)
    {
        return zzagI.containsKey(metadatafield.getName());
    }

    public Set zzpY()
    {
        HashSet hashset = new HashSet();
        for (Iterator iterator = zzagI.keySet().iterator(); iterator.hasNext(); hashset.add(zze.zzcw((String)iterator.next()))) { }
        return hashset;
    }

}
