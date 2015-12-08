// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AncsNotificationParcelable

public class zzg
    implements android.os.Parcelable.Creator
{

    public zzg()
    {
    }

    static void zza(AncsNotificationParcelable ancsnotificationparcelable, Parcel parcel, int i)
    {
        i = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, ancsnotificationparcelable.mVersionCode);
        zzb.zzc(parcel, 2, ancsnotificationparcelable.getId());
        zzb.zza(parcel, 3, ancsnotificationparcelable.zztW(), false);
        zzb.zza(parcel, 4, ancsnotificationparcelable.zzCw(), false);
        zzb.zza(parcel, 5, ancsnotificationparcelable.zzCx(), false);
        zzb.zza(parcel, 6, ancsnotificationparcelable.getTitle(), false);
        zzb.zza(parcel, 7, ancsnotificationparcelable.zztn(), false);
        zzb.zza(parcel, 8, ancsnotificationparcelable.getDisplayName(), false);
        zzb.zza(parcel, 9, ancsnotificationparcelable.zzCy());
        zzb.zza(parcel, 10, ancsnotificationparcelable.zzCz());
        zzb.zza(parcel, 11, ancsnotificationparcelable.zzCA());
        zzb.zza(parcel, 12, ancsnotificationparcelable.zzCB());
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzhr(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzkz(i);
    }

    public AncsNotificationParcelable zzhr(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        int j = 0;
        int i = 0;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        String s = null;
        byte byte3 = 0;
        byte byte2 = 0;
        byte byte1 = 0;
        byte byte0 = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbH(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 3: // '\003'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 4: // '\004'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 9: // '\t'
                    byte3 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 10: // '\n'
                    byte2 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 11: // '\013'
                    byte1 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 12: // '\f'
                    byte0 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new AncsNotificationParcelable(j, i, s5, s4, s3, s2, s1, s, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public AncsNotificationParcelable[] zzkz(int i)
    {
        return new AncsNotificationParcelable[i];
    }
}
