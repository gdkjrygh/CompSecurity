// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            d

public class CaptchaSolution
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    String nD;
    String ne;
    final int version;

    CaptchaSolution(int i, String s, String s1)
    {
        version = i;
        ne = s;
        nD = s1;
    }

    public CaptchaSolution(String s, String s1)
    {
        version = 1;
        ne = s;
        nD = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAnswer()
    {
        return nD;
    }

    public String getToken()
    {
        return ne;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel);
    }

}
