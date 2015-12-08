// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.stats:
//            ConnectionEvent

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(ConnectionEvent connectionevent, Parcel parcel, int i)
    {
        i = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, connectionevent.mVersionCode);
        zzb.zza(parcel, 2, connectionevent.getTimeMillis());
        zzb.zza(parcel, 4, connectionevent.zzpv(), false);
        zzb.zza(parcel, 5, connectionevent.zzpw(), false);
        zzb.zza(parcel, 6, connectionevent.zzpx(), false);
        zzb.zza(parcel, 7, connectionevent.zzpy(), false);
        zzb.zza(parcel, 8, connectionevent.zzpz(), false);
        zzb.zza(parcel, 10, connectionevent.zzpC());
        zzb.zza(parcel, 11, connectionevent.zzpB());
        zzb.zzc(parcel, 12, connectionevent.getEventType());
        zzb.zza(parcel, 13, connectionevent.zzpA(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzau(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzbT(i);
    }

    public ConnectionEvent zzau(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        int j = 0;
        long l3 = 0L;
        int i = 0;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        String s = null;
        long l2 = 0L;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbH(l))
                {
                case 3: // '\003'
                case 9: // '\t'
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    l3 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, l);
                    break;

                case 4: // '\004'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 5: // '\005'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 6: // '\006'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 7: // '\007'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 8: // '\b'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 10: // '\n'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, l);
                    break;

                case 11: // '\013'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, l);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 13: // '\r'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new ConnectionEvent(j, l3, i, s5, s4, s3, s2, s1, s, l2, l1);
            }
        } while (true);
    }

    public ConnectionEvent[] zzbT(int i)
    {
        return new ConnectionEvent[i];
    }
}
