// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable:
//            ConnectionConfiguration

public class zzg
    implements android.os.Parcelable.Creator
{

    public zzg()
    {
    }

    static void zza(ConnectionConfiguration connectionconfiguration, Parcel parcel, int i)
    {
        i = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, connectionconfiguration.mVersionCode);
        zzb.zza(parcel, 2, connectionconfiguration.getName(), false);
        zzb.zza(parcel, 3, connectionconfiguration.getAddress(), false);
        zzb.zzc(parcel, 4, connectionconfiguration.getType());
        zzb.zzc(parcel, 5, connectionconfiguration.getRole());
        zzb.zza(parcel, 6, connectionconfiguration.isEnabled());
        zzb.zza(parcel, 7, connectionconfiguration.isConnected());
        zzb.zza(parcel, 8, connectionconfiguration.zzCp(), false);
        zzb.zza(parcel, 9, connectionconfiguration.zzCq());
        zzb.zza(parcel, 10, connectionconfiguration.getNodeId(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzhm(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzku(i);
    }

    public ConnectionConfiguration zzhm(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        String s1 = null;
        boolean flag1 = false;
        boolean flag2 = false;
        int i = 0;
        int j = 0;
        String s2 = null;
        String s3 = null;
        int k = 0;
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
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 6: // '\006'
                    flag2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 7: // '\007'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 8: // '\b'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 9: // '\t'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 10: // '\n'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new ConnectionConfiguration(k, s3, s2, j, i, flag2, flag1, s1, flag, s);
            }
        } while (true);
    }

    public ConnectionConfiguration[] zzku(int i)
    {
        return new ConnectionConfiguration[i];
    }
}
