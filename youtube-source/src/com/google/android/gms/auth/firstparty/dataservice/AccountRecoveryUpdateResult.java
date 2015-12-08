// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            h

public class AccountRecoveryUpdateResult
    implements SafeParcelable
{

    public static final h CREATOR = new h();
    public final String error;
    final int version;

    AccountRecoveryUpdateResult(int i, String s)
    {
        version = i;
        error = s;
    }

    public AccountRecoveryUpdateResult(String s)
    {
        this(0, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        h.a(this, parcel);
    }

}
