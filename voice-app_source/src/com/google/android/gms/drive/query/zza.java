// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.query.internal.LogicalFilter;

// Referenced classes of package com.google.android.gms.drive.query:
//            Query, SortOrder

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(Query query, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1000, query.zzCY);
        zzb.zza(parcel, 1, query.zzahG, i, false);
        zzb.zza(parcel, 3, query.zzahH, false);
        zzb.zza(parcel, 4, query.zzahI, i, false);
        zzb.zzb(parcel, 5, query.zzahJ, false);
        zzb.zza(parcel, 6, query.zzahK);
        zzb.zzc(parcel, 7, query.zzadR, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzbF(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzdu(i);
    }

    public Query zzbF(Parcel parcel)
    {
        boolean flag = false;
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        java.util.ArrayList arraylist1 = null;
        SortOrder sortorder = null;
        String s = null;
        LogicalFilter logicalfilter = null;
        int i = 0;
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

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 1: // '\001'
                    logicalfilter = (LogicalFilter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, LogicalFilter.CREATOR);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 4: // '\004'
                    sortorder = (SortOrder)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, SortOrder.CREATOR);
                    break;

                case 5: // '\005'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, k);
                    break;

                case 6: // '\006'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 7: // '\007'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, DriveSpace.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new Query(i, logicalfilter, s, sortorder, arraylist1, flag, arraylist);
            }
        } while (true);
    }

    public Query[] zzdu(int i)
    {
        return new Query[i];
    }
}
