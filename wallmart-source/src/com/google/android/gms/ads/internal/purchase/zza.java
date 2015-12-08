// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            GInAppPurchaseManagerInfoParcel

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(GInAppPurchaseManagerInfoParcel ginapppurchasemanagerinfoparcel, Parcel parcel, int i)
    {
        i = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, ginapppurchasemanagerinfoparcel.versionCode);
        zzb.zza(parcel, 3, ginapppurchasemanagerinfoparcel.zzfd(), false);
        zzb.zza(parcel, 4, ginapppurchasemanagerinfoparcel.zzfe(), false);
        zzb.zza(parcel, 5, ginapppurchasemanagerinfoparcel.zzff(), false);
        zzb.zza(parcel, 6, ginapppurchasemanagerinfoparcel.zzfc(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzi(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzx(i);
    }

    public GInAppPurchaseManagerInfoParcel zzi(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        int i = 0;
        android.os.IBinder ibinder1 = null;
        android.os.IBinder ibinder2 = null;
        android.os.IBinder ibinder3 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbH(k))
                {
                case 2: // '\002'
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 3: // '\003'
                    ibinder3 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;

                case 4: // '\004'
                    ibinder2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;

                case 5: // '\005'
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;

                case 6: // '\006'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new GInAppPurchaseManagerInfoParcel(i, ibinder3, ibinder2, ibinder1, ibinder);
            }
        } while (true);
    }

    public GInAppPurchaseManagerInfoParcel[] zzx(int i)
    {
        return new GInAppPurchaseManagerInfoParcel[i];
    }
}
