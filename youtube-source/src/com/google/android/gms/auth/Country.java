// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth:
//            b

public class Country
    implements SafeParcelable
{

    public static final b CREATOR = new b();
    final int jE;
    public String mCode;
    public String mName;

    public Country()
    {
        jE = 1;
    }

    Country(int i, String s, String s1)
    {
        jE = i;
        mName = s;
        mCode = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return jE;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel);
    }

}
