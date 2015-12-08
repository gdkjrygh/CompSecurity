// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            gm

public class ex
    implements SafeParcelable
{

    public static final gm CREATOR = new gm();
    final int jE;
    public final String uh;
    public final int ui;

    public ex(int i, String s, int j)
    {
        jE = i;
        uh = s;
        ui = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gm.a(this, parcel);
    }

}
