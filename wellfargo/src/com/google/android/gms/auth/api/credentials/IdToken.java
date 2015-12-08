// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            h

public final class IdToken
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    final int a;
    private final String b;
    private final String c;

    IdToken(int i, String s, String s1)
    {
        a = i;
        b = s;
        c = s1;
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        h.a(this, parcel, i);
    }

}
