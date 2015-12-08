// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzy

public class ResolveAccountRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzy();
    final int mVersionCode;
    private final Account zzOY;
    private final int zzaem;

    ResolveAccountRequest(int i, Account account, int j)
    {
        mVersionCode = i;
        zzOY = account;
        zzaem = j;
    }

    public ResolveAccountRequest(Account account, int i)
    {
        this(1, account, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public Account getAccount()
    {
        return zzOY;
    }

    public int getSessionId()
    {
        return zzaem;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzy.zza(this, parcel, i);
    }

}
