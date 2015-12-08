// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location:
//            ActivityRecognitionResult, DetectedActivity

public class ActivityRecognitionResultCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public ActivityRecognitionResultCreator()
    {
    }

    static void zza(ActivityRecognitionResult activityrecognitionresult, Parcel parcel, int i)
    {
        i = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, activityrecognitionresult.zzaBt, false);
        zzb.zzc(parcel, 1000, activityrecognitionresult.getVersionCode());
        zzb.zza(parcel, 2, activityrecognitionresult.zzaBu);
        zzb.zza(parcel, 3, activityrecognitionresult.zzaBv);
        zzb.zzc(parcel, 4, activityrecognitionresult.zzaBw);
        zzb.zzH(parcel, i);
    }

    public ActivityRecognitionResult createFromParcel(Parcel parcel)
    {
        long l1 = 0L;
        int i = 0;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        java.util.ArrayList arraylist = null;
        long l2 = 0L;
        int j = 0;
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
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l, DetectedActivity.CREATOR);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new ActivityRecognitionResult(j, arraylist, l2, l1, i);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public ActivityRecognitionResult[] newArray(int i)
    {
        return new ActivityRecognitionResult[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
