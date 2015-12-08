// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location:
//            ActivityRecognitionResult, DetectedActivity

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(ActivityRecognitionResult activityrecognitionresult, Parcel parcel)
    {
        int i = b.a(parcel);
        b.b(parcel, 1, activityrecognitionresult.Cc, false);
        b.a(parcel, 1000, activityrecognitionresult.getVersionCode());
        b.a(parcel, 2, activityrecognitionresult.Cd);
        b.a(parcel, 3, activityrecognitionresult.Ce);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        long l = 0L;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        java.util.ArrayList arraylist = null;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, DetectedActivity.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, k);
                    break;

                case 3: // '\003'
                    l = com.google.android.gms.common.internal.safeparcel.a.h(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ActivityRecognitionResult(i, arraylist, l1, l);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ActivityRecognitionResult[i];
    }
}
