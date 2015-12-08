// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.sharing.SharedContent;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            ProvideContentRequest

public class zzf
    implements android.os.Parcelable.Creator
{

    public zzf()
    {
    }

    static void zza(ProvideContentRequest providecontentrequest, Parcel parcel, int i)
    {
        i = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, providecontentrequest.versionCode);
        zzb.zza(parcel, 2, providecontentrequest.zzaGp, false);
        zzb.zza(parcel, 3, providecontentrequest.zzxi(), false);
        zzb.zzc(parcel, 4, providecontentrequest.zzaGr, false);
        zzb.zza(parcel, 5, providecontentrequest.zzaGs);
        zzb.zza(parcel, 6, providecontentrequest.zzxa(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfC(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzir(i);
    }

    public ProvideContentRequest zzfC(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        long l = 0L;
        java.util.ArrayList arraylist = null;
        android.os.IBinder ibinder1 = null;
        android.os.IBinder ibinder2 = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;

                case 3: // '\003'
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, SharedContent.CREATOR);
                    break;

                case 5: // '\005'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;

                case 6: // '\006'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ProvideContentRequest(i, ibinder2, ibinder1, arraylist, l, ibinder);
            }
        } while (true);
    }

    public ProvideContentRequest[] zzir(int i)
    {
        return new ProvideContentRequest[i];
    }
}
