// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            r

public class SuggestSpecification
    implements SafeParcelable
{

    public static final r CREATOR = new r();
    final int jE;

    public SuggestSpecification()
    {
        this(2);
    }

    SuggestSpecification(int i)
    {
        jE = i;
    }

    public int describeContents()
    {
        r r1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        r r1 = CREATOR;
        r.a(this, parcel);
    }

}
