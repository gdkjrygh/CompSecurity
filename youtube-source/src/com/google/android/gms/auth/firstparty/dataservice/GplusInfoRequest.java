// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            o

public class GplusInfoRequest
    implements SafeParcelable
{

    public static final o CREATOR = new o();
    String accountName;
    CaptchaSolution lU;
    final int version;

    public GplusInfoRequest()
    {
        version = 1;
    }

    GplusInfoRequest(int i, String s, CaptchaSolution captchasolution)
    {
        version = i;
        accountName = s;
        lU = captchasolution;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountName()
    {
        return accountName;
    }

    public CaptchaSolution getCaptchaSolution()
    {
        return lU;
    }

    public GplusInfoRequest setAccountName(String s)
    {
        accountName = s;
        return this;
    }

    public GplusInfoRequest setCaptchaSolution(CaptchaSolution captchasolution)
    {
        lU = captchasolution;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        o.a(this, parcel, i);
    }

}
