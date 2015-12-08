// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            FilterHolder, ComparisonFilter, FieldOnlyFilter, LogicalFilter, 
//            NotFilter, InFilter, MatchAllFilter, HasFilter, 
//            FullTextSearchFilter, OwnedByMeFilter

public class zzd
    implements android.os.Parcelable.Creator
{

    public zzd()
    {
    }

    static void zza(FilterHolder filterholder, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, filterholder.zzahU, i, false);
        zzb.zzc(parcel, 1000, filterholder.zzCY);
        zzb.zza(parcel, 2, filterholder.zzahV, i, false);
        zzb.zza(parcel, 3, filterholder.zzahW, i, false);
        zzb.zza(parcel, 4, filterholder.zzahX, i, false);
        zzb.zza(parcel, 5, filterholder.zzahY, i, false);
        zzb.zza(parcel, 6, filterholder.zzahZ, i, false);
        zzb.zza(parcel, 7, filterholder.zzaia, i, false);
        zzb.zza(parcel, 8, filterholder.zzaib, i, false);
        zzb.zza(parcel, 9, filterholder.zzaic, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzbK(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzdz(i);
    }

    public FilterHolder zzbK(Parcel parcel)
    {
        OwnedByMeFilter ownedbymefilter = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        FullTextSearchFilter fulltextsearchfilter = null;
        HasFilter hasfilter = null;
        MatchAllFilter matchallfilter = null;
        InFilter infilter = null;
        NotFilter notfilter = null;
        LogicalFilter logicalfilter = null;
        FieldOnlyFilter fieldonlyfilter = null;
        ComparisonFilter comparisonfilter = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    comparisonfilter = (ComparisonFilter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ComparisonFilter.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    fieldonlyfilter = (FieldOnlyFilter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, FieldOnlyFilter.CREATOR);
                    break;

                case 3: // '\003'
                    logicalfilter = (LogicalFilter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, LogicalFilter.CREATOR);
                    break;

                case 4: // '\004'
                    notfilter = (NotFilter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, NotFilter.CREATOR);
                    break;

                case 5: // '\005'
                    infilter = (InFilter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, InFilter.CREATOR);
                    break;

                case 6: // '\006'
                    matchallfilter = (MatchAllFilter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, MatchAllFilter.CREATOR);
                    break;

                case 7: // '\007'
                    hasfilter = (HasFilter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, HasFilter.CREATOR);
                    break;

                case 8: // '\b'
                    fulltextsearchfilter = (FullTextSearchFilter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, FullTextSearchFilter.CREATOR);
                    break;

                case 9: // '\t'
                    ownedbymefilter = (OwnedByMeFilter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, OwnedByMeFilter.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new FilterHolder(i, comparisonfilter, fieldonlyfilter, logicalfilter, notfilter, infilter, matchallfilter, hasfilter, fulltextsearchfilter, ownedbymefilter);
            }
        } while (true);
    }

    public FilterHolder[] zzdz(int i)
    {
        return new FilterHolder[i];
    }
}
