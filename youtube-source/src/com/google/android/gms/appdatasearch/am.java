// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            RegisteredPackageInfo

public final class am
    implements android.os.Parcelable.Creator
{

    public am()
    {
    }

    static void a(RegisteredPackageInfo registeredpackageinfo, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, registeredpackageinfo.packageName, false);
        b.a(parcel, 1000, registeredpackageinfo.jE);
        b.a(parcel, 2, registeredpackageinfo.usedDiskBytes);
        b.a(parcel, 3, registeredpackageinfo.blocked);
        b.a(parcel, 4, registeredpackageinfo.reclaimableDiskBytes);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        long l = 0L;
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s = null;
        long l1 = 0L;
        int i = 0;
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
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, k);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    l = com.google.android.gms.common.internal.safeparcel.a.h(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new RegisteredPackageInfo(i, s, l1, flag, l);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new RegisteredPackageInfo[i];
    }
}
