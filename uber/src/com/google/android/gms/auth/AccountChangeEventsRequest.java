// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import rn;

public class AccountChangeEventsRequest
    implements SafeParcelable
{

    public static final rn CREATOR = new rn();
    public final int a;
    public int b;
    public String c;
    public Account d;

    public AccountChangeEventsRequest()
    {
        a = 1;
    }

    public AccountChangeEventsRequest(int i, int j, String s, Account account)
    {
        a = i;
        b = j;
        c = s;
        if (account == null && !TextUtils.isEmpty(s))
        {
            d = new Account(s, "com.google");
            return;
        } else
        {
            d = account;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        rn.a(this, parcel, i);
    }

}
