// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            am

public class RegisteredPackageInfo
    implements SafeParcelable
{

    public static final am CREATOR = new am();
    public final boolean blocked;
    final int jE;
    public final String packageName;
    public final long reclaimableDiskBytes;
    public final long usedDiskBytes;

    RegisteredPackageInfo(int i, String s, long l, boolean flag, long l1)
    {
        jE = i;
        packageName = s;
        usedDiskBytes = l;
        blocked = flag;
        reclaimableDiskBytes = l1;
    }

    public RegisteredPackageInfo(String s, long l, boolean flag, long l1)
    {
        this(0, s, l, flag, l1);
    }

    public int describeContents()
    {
        am am1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        am am1 = CREATOR;
        am.a(this, parcel);
    }

}
