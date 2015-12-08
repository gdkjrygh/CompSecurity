// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            z, Feature

public class g
    implements SafeParcelable
{

    public static final z CREATOR = new z();
    final String corpusName;
    final Feature features[];
    final int jE;

    g(int i, String s, Feature afeature[])
    {
        jE = i;
        corpusName = s;
        features = afeature;
    }

    g(String s, Feature afeature[])
    {
        this(1, s, afeature);
    }

    public int describeContents()
    {
        z z1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        z z1 = CREATOR;
        z.a(this, parcel, i);
    }

}
