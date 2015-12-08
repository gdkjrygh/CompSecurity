// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            PlayLoggerContext

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void zza(PlayLoggerContext playloggercontext, Parcel parcel, int i)
    {
        i = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, playloggercontext.versionCode);
        zzb.zza(parcel, 2, playloggercontext.packageName, false);
        zzb.zzc(parcel, 3, playloggercontext.zzaGP);
        zzb.zzc(parcel, 4, playloggercontext.zzaGQ);
        zzb.zza(parcel, 5, playloggercontext.zzaGR, false);
        zzb.zza(parcel, 6, playloggercontext.zzaGS, false);
        zzb.zza(parcel, 7, playloggercontext.zzaGT);
        zzb.zza(parcel, 8, playloggercontext.zzaGU, false);
        zzb.zza(parcel, 9, playloggercontext.zzaGV);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfH(parcel);
    }

    public Object[] newArray(int i)
    {
        return zziw(i);
    }

    public PlayLoggerContext zzfH(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        boolean flag1 = true;
        String s1 = null;
        String s2 = null;
        int i = 0;
        int j = 0;
        String s3 = null;
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
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 5: // '\005'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 7: // '\007'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 9: // '\t'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new PlayLoggerContext(k, s3, j, i, s2, s1, flag1, s, flag);
            }
        } while (true);
    }

    public PlayLoggerContext[] zziw(int i)
    {
        return new PlayLoggerContext[i];
    }
}
