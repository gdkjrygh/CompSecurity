// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location:
//            LocationStatus

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(LocationStatus locationstatus, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, locationstatus.Cv);
        b.a(parcel, 1000, locationstatus.getVersionCode());
        b.a(parcel, 2, locationstatus.Cw);
        b.a(parcel, 3, locationstatus.Cx);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 1;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int k = 0;
        long l1 = 0L;
        int j = 1;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new LocationStatus(k, j, i, l1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new LocationStatus[i];
    }
}
