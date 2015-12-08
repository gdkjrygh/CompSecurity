// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            StorageStats, RegisteredPackageInfo

public final class q
    implements android.os.Parcelable.Creator
{

    public q()
    {
    }

    static void a(StorageStats storagestats, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, storagestats.packageStats, i, false);
        b.a(parcel, 1000, storagestats.jE);
        b.a(parcel, 2, storagestats.otherReclaimableBytes);
        b.a(parcel, 3, storagestats.searchDiskUsageBytes);
        b.a(parcel, 4, storagestats.allServicesDiskUsageBytes);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        long l = 0L;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        RegisteredPackageInfo aregisteredpackageinfo[] = null;
        long l1 = 0L;
        long l2 = 0L;
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
                    aregisteredpackageinfo = (RegisteredPackageInfo[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, RegisteredPackageInfo.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, k);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, k);
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
                return new StorageStats(i, aregisteredpackageinfo, l2, l1, l);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new StorageStats[i];
    }
}
