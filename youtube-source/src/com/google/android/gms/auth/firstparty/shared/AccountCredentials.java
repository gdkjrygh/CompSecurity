// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            a

public class AccountCredentials
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    String lr;
    boolean nt;
    String nu;
    String nv;
    String nw;
    String nx;
    final int version;

    public AccountCredentials()
    {
        version = 1;
    }

    AccountCredentials(int i, boolean flag, String s, String s1, String s2, String s3, String s4)
    {
        version = i;
        nt = flag;
        lr = s;
        nu = s1;
        nv = s2;
        nw = s3;
        nx = s4;
    }

    public AccountCredentials(Parcel parcel)
    {
        boolean flag = true;
        super();
        version = 1;
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        nt = flag;
        nu = parcel.readString();
        lr = parcel.readString();
        nv = parcel.readString();
        nw = parcel.readString();
        nx = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountName()
    {
        return lr;
    }

    public String getAuthorizationCode()
    {
        return nv;
    }

    public String getLongLivedLoginToken()
    {
        return nu;
    }

    public String getPassword()
    {
        return nw;
    }

    public String getVerifier()
    {
        return nx;
    }

    public boolean isBrowserAuthenticationRequired()
    {
        return nt;
    }

    public AccountCredentials setAccountName(String s)
    {
        lr = s;
        return this;
    }

    public AccountCredentials setAuthorizationCode(String s)
    {
        nv = s;
        return this;
    }

    public AccountCredentials setBrowserAuthenticationRequired(boolean flag)
    {
        nt = flag;
        return this;
    }

    public AccountCredentials setLongLivedLoginToken(String s)
    {
        nu = s;
        return this;
    }

    public AccountCredentials setPassword(String s)
    {
        nw = s;
        return this;
    }

    public AccountCredentials setVerifier(String s)
    {
        nx = s;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel);
    }

}
