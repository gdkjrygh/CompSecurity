// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            GetRecentContextCall, zzf

public static class <init>
    implements SafeParcelable
{

    public static final zzf CREATOR = new zzf();
    final int zzCY;
    public final Account zzNj;
    public final boolean zzNk;
    public final boolean zzNl;
    public final boolean zzNm;

    public int describeContents()
    {
        zzf zzf1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf zzf1 = CREATOR;
        zzf.zza(this, parcel, i);
    }


    public ()
    {
        this(null, false, false, false);
    }

    <init>(int i, Account account, boolean flag, boolean flag1, boolean flag2)
    {
        zzCY = i;
        zzNj = account;
        zzNk = flag;
        zzNl = flag1;
        zzNm = flag2;
    }

    public zzNm(Account account, boolean flag, boolean flag1, boolean flag2)
    {
        this(1, account, flag, flag1, flag2);
    }
}
