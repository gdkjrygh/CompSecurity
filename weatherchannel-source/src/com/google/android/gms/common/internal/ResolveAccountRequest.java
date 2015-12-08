// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzv

public class ResolveAccountRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzv();
    final int zzCY;
    private final Account zzMY;
    private final int zzabc;

    ResolveAccountRequest(int i, Account account, int j)
    {
        zzCY = i;
        zzMY = account;
        zzabc = j;
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
        return zzMY;
    }

    public int getSessionId()
    {
        return zzabc;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzv.zza(this, parcel, i);
    }

}
