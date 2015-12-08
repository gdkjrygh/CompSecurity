// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.accounts.api;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;

// Referenced classes of package com.google.android.gms.identity.accounts.api:
//            a

public final class AccountData
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    public static final int VERSION_CODE = 1;
    private final String BX;
    private final int jE;
    private final String lr;

    public AccountData(int i, String s, String s1)
    {
        gi.a(s, "Account name must not be empty.");
        jE = i;
        lr = s;
        BX = s1;
    }

    private AccountData(String s, String s1)
    {
        this(1, s, s1);
    }

    public static AccountData forAccount(String s)
    {
        gi.a(s, "Account name must not be empty.");
        return new AccountData(s, null);
    }

    public static AccountData forPlusPage(String s, String s1)
    {
        gi.a(s, "Account name must not be empty.");
        gi.a(s1, "+Page ID must not be empty.");
        return new AccountData(s, s1);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getAccountName()
    {
        return lr;
    }

    public final String getPlusPageId()
    {
        return BX;
    }

    public final int getVersionCode()
    {
        return jE;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel);
    }

}
