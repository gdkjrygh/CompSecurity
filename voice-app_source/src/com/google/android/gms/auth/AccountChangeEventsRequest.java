// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth:
//            zzb

public class AccountChangeEventsRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    final int mVersion;
    Account zzMY;
    String zzOx;
    int zzOz;

    public AccountChangeEventsRequest()
    {
        mVersion = 1;
    }

    AccountChangeEventsRequest(int i, int j, String s, Account account)
    {
        mVersion = i;
        zzOz = j;
        zzOx = s;
        if (account == null && !TextUtils.isEmpty(s))
        {
            zzMY = new Account(s, "com.google");
            return;
        } else
        {
            zzMY = account;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public Account getAccount()
    {
        return zzMY;
    }

    public String getAccountName()
    {
        return zzOx;
    }

    public int getEventIndex()
    {
        return zzOz;
    }

    public AccountChangeEventsRequest setAccount(Account account)
    {
        zzMY = account;
        return this;
    }

    public AccountChangeEventsRequest setAccountName(String s)
    {
        zzOx = s;
        return this;
    }

    public AccountChangeEventsRequest setEventIndex(int i)
    {
        zzOz = i;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

}
