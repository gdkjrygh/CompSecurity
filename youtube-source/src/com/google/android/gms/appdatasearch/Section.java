// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            aq

public class Section
    implements SafeParcelable
{

    public static final aq CREATOR = new aq();
    final int jE;
    public final String name;
    public final int snippetLength;
    public final boolean snippeted;

    Section(int i, String s, boolean flag, int j)
    {
        jE = i;
        name = s;
        snippeted = flag;
        snippetLength = j;
    }

    public Section(String s)
    {
        this(s, false, 0);
    }

    public Section(String s, boolean flag, int i)
    {
        this(2, s, flag, i);
    }

    public int describeContents()
    {
        aq aq1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        aq aq1 = CREATOR;
        aq.a(this, parcel);
    }

}
