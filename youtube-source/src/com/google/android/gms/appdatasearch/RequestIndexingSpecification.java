// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            an

public class RequestIndexingSpecification
    implements SafeParcelable
{

    public static final an CREATOR = new an();
    final int jE;

    RequestIndexingSpecification(int i)
    {
        jE = i;
    }

    public int describeContents()
    {
        an an1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        an an1 = CREATOR;
        an.a(this, parcel);
    }

}
