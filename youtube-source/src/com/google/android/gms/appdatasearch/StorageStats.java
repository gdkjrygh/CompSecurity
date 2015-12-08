// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            q, RegisteredPackageInfo

public class StorageStats
    implements SafeParcelable
{

    public static final q CREATOR = new q();
    public final long allServicesDiskUsageBytes;
    final int jE;
    public final long otherReclaimableBytes;
    public final RegisteredPackageInfo packageStats[];
    public final long searchDiskUsageBytes;

    StorageStats(int i, RegisteredPackageInfo aregisteredpackageinfo[], long l, long l1, long l2)
    {
        jE = i;
        packageStats = aregisteredpackageinfo;
        otherReclaimableBytes = l;
        searchDiskUsageBytes = l1;
        allServicesDiskUsageBytes = l2;
    }

    public StorageStats(RegisteredPackageInfo aregisteredpackageinfo[], long l, long l1, long l2)
    {
        jE = 0;
        packageStats = aregisteredpackageinfo;
        otherReclaimableBytes = l;
        searchDiskUsageBytes = l1;
        allServicesDiskUsageBytes = l2;
    }

    public int describeContents()
    {
        q q1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        q q1 = CREATOR;
        q.a(this, parcel, i);
    }

}
