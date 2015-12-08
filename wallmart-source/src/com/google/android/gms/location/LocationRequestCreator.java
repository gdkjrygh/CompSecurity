// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location:
//            LocationRequest

public class LocationRequestCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public LocationRequestCreator()
    {
    }

    static void zza(LocationRequest locationrequest, Parcel parcel, int i)
    {
        i = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, locationrequest.mPriority);
        zzb.zzc(parcel, 1000, locationrequest.getVersionCode());
        zzb.zza(parcel, 2, locationrequest.zzaBW);
        zzb.zza(parcel, 3, locationrequest.zzaBX);
        zzb.zza(parcel, 4, locationrequest.zzaqs);
        zzb.zza(parcel, 5, locationrequest.zzaBB);
        zzb.zzc(parcel, 6, locationrequest.zzaBY);
        zzb.zza(parcel, 7, locationrequest.zzaBZ);
        zzb.zza(parcel, 8, locationrequest.zzaCa);
        zzb.zzH(parcel, i);
    }

    public LocationRequest createFromParcel(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        int k = 0;
        int j = 102;
        long l4 = 0x36ee80L;
        long l3 = 0x927c0L;
        boolean flag = false;
        long l2 = 0x7fffffffffffffffL;
        int i = 0x7fffffff;
        float f = 0.0F;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbH(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    l4 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 3: // '\003'
                    l3 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 5: // '\005'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 7: // '\007'
                    f = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, i1);
                    break;

                case 8: // '\b'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new LocationRequest(k, j, l4, l3, flag, l2, i, f, l1);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public LocationRequest[] newArray(int i)
    {
        return new LocationRequest[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
