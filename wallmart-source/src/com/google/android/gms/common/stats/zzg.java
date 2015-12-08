// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.stats:
//            WakeLockEvent

public class zzg
    implements android.os.Parcelable.Creator
{

    public zzg()
    {
    }

    static void zza(WakeLockEvent wakelockevent, Parcel parcel, int i)
    {
        i = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, wakelockevent.mVersionCode);
        zzb.zza(parcel, 2, wakelockevent.getTimeMillis());
        zzb.zza(parcel, 4, wakelockevent.zzpE(), false);
        zzb.zzc(parcel, 5, wakelockevent.zzpG());
        zzb.zzb(parcel, 6, wakelockevent.zzpH(), false);
        zzb.zza(parcel, 8, wakelockevent.zzpC());
        zzb.zza(parcel, 10, wakelockevent.zzpF(), false);
        zzb.zzc(parcel, 11, wakelockevent.getEventType());
        zzb.zza(parcel, 12, wakelockevent.zzpA(), false);
        zzb.zza(parcel, 13, wakelockevent.zzpJ(), false);
        zzb.zzc(parcel, 14, wakelockevent.zzpI());
        zzb.zza(parcel, 15, wakelockevent.zzpK());
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzav(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzbU(i);
    }

    public WakeLockEvent zzav(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        int l = 0;
        long l2 = 0L;
        int k = 0;
        String s3 = null;
        int j = 0;
        java.util.ArrayList arraylist = null;
        String s2 = null;
        long l1 = 0L;
        int i = 0;
        String s1 = null;
        String s = null;
        float f = 0.0F;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbH(j1))
                {
                case 3: // '\003'
                case 7: // '\007'
                case 9: // '\t'
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 2: // '\002'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, j1);
                    break;

                case 4: // '\004'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 6: // '\006'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, j1);
                    break;

                case 8: // '\b'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, j1);
                    break;

                case 10: // '\n'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 11: // '\013'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 12: // '\f'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 13: // '\r'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 14: // '\016'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 15: // '\017'
                    f = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new WakeLockEvent(l, l2, k, s3, j, arraylist, s2, l1, i, s1, s, f);
            }
        } while (true);
    }

    public WakeLockEvent[] zzbU(int i)
    {
        return new WakeLockEvent[i];
    }
}
