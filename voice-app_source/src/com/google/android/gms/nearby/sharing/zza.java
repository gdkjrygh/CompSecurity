// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.nearby.sharing:
//            AppContentReceivedResult

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(AppContentReceivedResult appcontentreceivedresult, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, appcontentreceivedresult.getVersionCode());
        zzb.zza(parcel, 2, appcontentreceivedresult.zzxc(), i, false);
        zzb.zzc(parcel, 3, appcontentreceivedresult.getStatusCode());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfy(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzin(i);
    }

    public AppContentReceivedResult zzfy(Parcel parcel)
    {
        int i = 0;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        Uri uri = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, Uri.CREATOR);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new AppContentReceivedResult(j, uri, i);
            }
        } while (true);
    }

    public AppContentReceivedResult[] zzin(int i)
    {
        return new AppContentReceivedResult[i];
    }
}
