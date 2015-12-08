// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            ao, DocumentId

public class w
    implements SafeParcelable
{

    public static final ao CREATOR = new ao();
    final int jE;
    final String jz;
    final DocumentId kI[];
    final int kJ;

    w(int i, String s, DocumentId adocumentid[], int j)
    {
        jE = i;
        jz = s;
        kI = adocumentid;
        kJ = j;
    }

    w(String s, DocumentId adocumentid[], int i)
    {
        this(1, s, adocumentid, i);
    }

    public int describeContents()
    {
        ao ao1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ao ao1 = CREATOR;
        ao.a(this, parcel, i);
    }

}
