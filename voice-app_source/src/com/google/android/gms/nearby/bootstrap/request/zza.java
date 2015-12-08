// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.bootstrap.Device;

// Referenced classes of package com.google.android.gms.nearby.bootstrap.request:
//            ConnectRequest

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(ConnectRequest connectrequest, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, connectrequest.zzwM(), i, false);
        zzb.zzc(parcel, 1000, connectrequest.versionCode);
        zzb.zza(parcel, 2, connectrequest.getName(), false);
        zzb.zza(parcel, 3, connectrequest.getDescription(), false);
        zzb.zza(parcel, 4, connectrequest.zzwO(), false);
        zzb.zza(parcel, 5, connectrequest.zzwP(), false);
        zzb.zza(parcel, 6, connectrequest.zzqU(), false);
        zzb.zza(parcel, 7, connectrequest.zzwK());
        zzb.zza(parcel, 8, connectrequest.zzwN());
        zzb.zza(parcel, 9, connectrequest.getToken(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzff(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhN(i);
    }

    public ConnectRequest zzff(Parcel parcel)
    {
        byte byte0 = 0;
        android.os.IBinder ibinder = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        long l = 0L;
        android.os.IBinder ibinder1 = null;
        android.os.IBinder ibinder2 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        Device device = null;
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

                case 1: // '\001'
                    device = (Device)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Device.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
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

                case 7: // '\007'
                    byte0 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, k);
                    break;

                case 8: // '\b'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;

                case 9: // '\t'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ConnectRequest(i, device, s2, s1, byte0, l, s, ibinder2, ibinder1, ibinder);
            }
        } while (true);
    }

    public ConnectRequest[] zzhN(int i)
    {
        return new ConnectRequest[i];
    }
}
