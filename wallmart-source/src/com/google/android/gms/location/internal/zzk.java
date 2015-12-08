// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.location.internal:
//            LocationRequestInternal, ClientIdentity

public class zzk
    implements android.os.Parcelable.Creator
{

    public zzk()
    {
    }

    static void zza(LocationRequestInternal locationrequestinternal, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zza(parcel, 1, locationrequestinternal.zzaqq, i, false);
        zzb.zzc(parcel, 1000, locationrequestinternal.getVersionCode());
        zzb.zza(parcel, 2, locationrequestinternal.zzaCU);
        zzb.zza(parcel, 3, locationrequestinternal.zzaCV);
        zzb.zza(parcel, 4, locationrequestinternal.zzaCW);
        zzb.zzc(parcel, 5, locationrequestinternal.zzaCX, false);
        zzb.zza(parcel, 6, locationrequestinternal.mTag, false);
        zzb.zza(parcel, 7, locationrequestinternal.zzaCY);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzew(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzgR(i);
    }

    public LocationRequestInternal zzew(Parcel parcel)
    {
        String s = null;
        boolean flag1 = true;
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        Object obj = LocationRequestInternal.zzaCT;
        boolean flag2 = true;
        boolean flag3 = false;
        LocationRequest locationrequest = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    locationrequest = (LocationRequest)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, LocationRequest.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    flag3 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 3: // '\003'
                    flag2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 4: // '\004'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 5: // '\005'
                    obj = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, ClientIdentity.CREATOR);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new LocationRequestInternal(i, locationrequest, flag3, flag2, flag1, ((java.util.List) (obj)), s, flag);
            }
        } while (true);
    }

    public LocationRequestInternal[] zzgR(int i)
    {
        return new LocationRequestInternal[i];
    }
}
