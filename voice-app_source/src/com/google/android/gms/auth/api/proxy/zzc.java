// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            ProxyResponse

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void zza(ProxyResponse proxyresponse, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, proxyresponse.zzPu);
        zzb.zzc(parcel, 1000, proxyresponse.versionCode);
        zzb.zza(parcel, 2, proxyresponse.zzPv, i, false);
        zzb.zzc(parcel, 3, proxyresponse.zzPw);
        zzb.zza(parcel, 4, proxyresponse.zzPt, false);
        zzb.zza(parcel, 5, proxyresponse.zzPs, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzI(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzay(i);
    }

    public ProxyResponse zzI(Parcel parcel)
    {
        byte abyte0[] = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        android.os.Bundle bundle = null;
        PendingIntent pendingintent = null;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(i1))
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
                    pendingintent = (PendingIntent)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, PendingIntent.CREATOR);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 4: // '\004'
                    bundle = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, i1);
                    break;

                case 5: // '\005'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.zza.zzr(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new ProxyResponse(k, j, pendingintent, i, bundle, abyte0);
            }
        } while (true);
    }

    public ProxyResponse[] zzay(int i)
    {
        return new ProxyResponse[i];
    }
}
