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
    public final Account zzJn;
    public final boolean zzJo;
    public final boolean zzJp;
    public final boolean zzJq;
    final int zzzH;

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
        zzzH = i;
        zzJn = account;
        zzJo = flag;
        zzJp = flag1;
        zzJq = flag2;
    }

    public zzJq(Account account, boolean flag, boolean flag1, boolean flag2)
    {
        this(1, account, flag, flag1, flag2);
    }
}
