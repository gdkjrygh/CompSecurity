// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            a

public class AccountNameCheckRequest
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    AppDescription callingAppDescription;
    String lR;
    String lS;
    String lT;
    CaptchaSolution lU;
    final int version;

    public AccountNameCheckRequest()
    {
        version = 1;
    }

    AccountNameCheckRequest(int i, String s, String s1, String s2, AppDescription appdescription, CaptchaSolution captchasolution)
    {
        version = i;
        lR = s;
        lS = s1;
        lT = s2;
        callingAppDescription = appdescription;
        lU = captchasolution;
    }

    public AccountNameCheckRequest(String s)
    {
        version = 1;
        lR = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountNameToCheck()
    {
        return lR;
    }

    public AppDescription getCallingAppDescription()
    {
        return callingAppDescription;
    }

    public CaptchaSolution getCaptchaSolution()
    {
        return lU;
    }

    public String getFirstName()
    {
        return lS;
    }

    public String getLastName()
    {
        return lT;
    }

    public AccountNameCheckRequest setAccountNameToCheck(String s)
    {
        lR = s;
        return this;
    }

    public AccountNameCheckRequest setCallingAppDescription(AppDescription appdescription)
    {
        callingAppDescription = appdescription;
        return this;
    }

    public AccountNameCheckRequest setCaptchaSolution(CaptchaSolution captchasolution)
    {
        lU = captchasolution;
        return this;
    }

    public AccountNameCheckRequest setFirstName(String s)
    {
        lS = s;
        return this;
    }

    public AccountNameCheckRequest setLastName(String s)
    {
        lT = s;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
