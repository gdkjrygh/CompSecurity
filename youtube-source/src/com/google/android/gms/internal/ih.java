// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            id

public class ih
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new id();
    private final boolean Gv;
    private final boolean Gw;
    private final int jE;
    private final String lr;

    ih(int i, String s, boolean flag, boolean flag1)
    {
        jE = i;
        lr = s;
        Gv = flag;
        Gw = flag1;
    }

    public ih(String s, boolean flag, boolean flag1)
    {
        jE = 1;
        lr = s;
        Gv = flag;
        Gw = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountName()
    {
        return lr;
    }

    int getVersionCode()
    {
        return jE;
    }

    public boolean isOptedInForAppUsageCollection()
    {
        return Gv;
    }

    public boolean isOptedInForCallAndSmsLogCollection()
    {
        return Gw;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        id.a(this, parcel);
    }

}
