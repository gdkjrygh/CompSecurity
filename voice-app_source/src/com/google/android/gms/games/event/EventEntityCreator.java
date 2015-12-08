// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.PlayerEntity;

// Referenced classes of package com.google.android.gms.games.event:
//            EventEntity

public class EventEntityCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public EventEntityCreator()
    {
    }

    static void zza(EventEntity evententity, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, evententity.getEventId(), false);
        zzb.zzc(parcel, 1000, evententity.getVersionCode());
        zzb.zza(parcel, 2, evententity.getName(), false);
        zzb.zza(parcel, 3, evententity.getDescription(), false);
        zzb.zza(parcel, 4, evententity.getIconImageUri(), i, false);
        zzb.zza(parcel, 5, evententity.getIconImageUrl(), false);
        zzb.zza(parcel, 6, evententity.getPlayer(), i, false);
        zzb.zza(parcel, 7, evententity.getValue());
        zzb.zza(parcel, 8, evententity.getFormattedValue(), false);
        zzb.zza(parcel, 9, evententity.isVisible());
        zzb.zzH(parcel, j);
    }

    public EventEntity createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        long l = 0L;
        PlayerEntity playerentity = null;
        String s1 = null;
        Uri uri = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
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
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 4: // '\004'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 6: // '\006'
                    playerentity = (PlayerEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, PlayerEntity.CREATOR);
                    break;

                case 7: // '\007'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 9: // '\t'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new EventEntity(i, s4, s3, s2, uri, s1, playerentity, l, s, flag);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public EventEntity[] newArray(int i)
    {
        return new EventEntity[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
