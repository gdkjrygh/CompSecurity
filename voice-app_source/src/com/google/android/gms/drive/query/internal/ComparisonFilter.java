// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, zza, zze, zzf, 
//            Operator

public class ComparisonFilter extends AbstractFilter
{

    public static final zza CREATOR = new zza();
    final int zzCY;
    final Operator zzahQ;
    final MetadataBundle zzahR;
    final MetadataField zzahS;

    ComparisonFilter(int i, Operator operator, MetadataBundle metadatabundle)
    {
        zzCY = i;
        zzahQ = operator;
        zzahR = metadatabundle;
        zzahS = zze.zzb(metadatabundle);
    }

    public ComparisonFilter(Operator operator, SearchableMetadataField searchablemetadatafield, Object obj)
    {
        this(1, operator, MetadataBundle.zza(searchablemetadatafield, obj));
    }

    public int describeContents()
    {
        return 0;
    }

    public Object getValue()
    {
        return zzahR.zza(zzahS);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.query.internal.zza.zza(this, parcel, i);
    }

    public Object zza(zzf zzf1)
    {
        return zzf1.zzb(zzahQ, zzahS, getValue());
    }

}
