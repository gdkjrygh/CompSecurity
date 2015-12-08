// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            AppDescription

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(AppDescription appdescription, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, appdescription.version);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, appdescription.nz);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, appdescription.hy, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, appdescription.nA, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, appdescription.nB, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, appdescription.mn);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s1 = null;
        String s2 = null;
        int i = 0;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 4: // '\004'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 6: // '\006'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new AppDescription(j, i, s2, s1, s, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AppDescription[i];
    }
}
