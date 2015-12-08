// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.copresence.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location.copresence.internal:
//            a

public final class CopresenceApiOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    public static final CopresenceApiOptions a = new CopresenceApiOptions(true, null);
    final int b;
    public final boolean c;
    public final String d;

    CopresenceApiOptions(int i, boolean flag, String s)
    {
        b = i;
        c = flag;
        d = s;
    }

    public CopresenceApiOptions(boolean flag, String s)
    {
        this(1, flag, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.copresence.internal.a.a(this, parcel, i);
    }

}
