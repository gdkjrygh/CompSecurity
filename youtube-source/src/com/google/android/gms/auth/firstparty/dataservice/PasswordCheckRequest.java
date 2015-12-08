// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            q

public class PasswordCheckRequest
    implements SafeParcelable
{

    public static final q CREATOR = new q();
    String accountName;
    String lS;
    String lT;
    String mV;
    AppDescription mW;
    final int version;

    PasswordCheckRequest(int i, String s, String s1, String s2, String s3, AppDescription appdescription)
    {
        version = i;
        accountName = s;
        mV = s1;
        lS = s2;
        lT = s3;
        mW = appdescription;
    }

    public PasswordCheckRequest(String s, String s1)
    {
        version = 1;
        accountName = s;
        mV = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountName()
    {
        return accountName;
    }

    public AppDescription getCallingAppDescription()
    {
        return mW;
    }

    public String getFirstName()
    {
        return lS;
    }

    public String getLastName()
    {
        return lT;
    }

    public String getPassword()
    {
        return mV;
    }

    public PasswordCheckRequest setCallingAppDescription(AppDescription appdescription)
    {
        mW = appdescription;
        return this;
    }

    public PasswordCheckRequest setFirstName(String s)
    {
        lS = s;
        return this;
    }

    public PasswordCheckRequest setLastName(String s)
    {
        lT = s;
        return this;
    }

    public PasswordCheckRequest setPassword(String s)
    {
        mV = s;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        q.a(this, parcel, i);
    }

}
