// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzw

public class ResolveAccountRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzw();
    private final Account zzJc;
    private final int zzUa;
    final int zzzH;

    ResolveAccountRequest(int i, Account account, int j)
    {
        zzzH = i;
        zzJc = account;
        zzUa = j;
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
        return zzJc;
    }

    public int getSessionId()
    {
        return zzUa;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzw.zza(this, parcel, i);
    }

}
