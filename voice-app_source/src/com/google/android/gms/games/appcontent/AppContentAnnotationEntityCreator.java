// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentAnnotationEntity

public class AppContentAnnotationEntityCreator
    implements android.os.Parcelable.Creator
{

    public AppContentAnnotationEntityCreator()
    {
    }

    static void zza(AppContentAnnotationEntity appcontentannotationentity, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, appcontentannotationentity.getDescription(), false);
        zzb.zzc(parcel, 1000, appcontentannotationentity.getVersionCode());
        zzb.zza(parcel, 2, appcontentannotationentity.zzrU(), i, false);
        zzb.zza(parcel, 3, appcontentannotationentity.getTitle(), false);
        zzb.zza(parcel, 5, appcontentannotationentity.getId(), false);
        zzb.zza(parcel, 6, appcontentannotationentity.zzrX(), false);
        zzb.zza(parcel, 7, appcontentannotationentity.zzrS(), false);
        zzb.zzc(parcel, 8, appcontentannotationentity.zzrT());
        zzb.zzc(parcel, 9, appcontentannotationentity.zzrW());
        zzb.zza(parcel, 10, appcontentannotationentity.zzrV(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdx(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzft(i);
    }

    public AppContentAnnotationEntity zzdx(Parcel parcel)
    {
        int i = 0;
        android.os.Bundle bundle = null;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int j = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        Uri uri = null;
        String s4 = null;
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
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, Uri.CREATOR);
                    break;

                case 3: // '\003'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 5: // '\005'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 8: // '\b'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 9: // '\t'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 10: // '\n'
                    bundle = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new AppContentAnnotationEntity(k, s4, uri, s3, s2, s1, s, j, i, bundle);
            }
        } while (true);
    }

    public AppContentAnnotationEntity[] zzft(int i)
    {
        return new AppContentAnnotationEntity[i];
    }
}
