// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            f

public class AccountRecoveryGuidanceRequest
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    public final String accountName;
    final int version;

    AccountRecoveryGuidanceRequest(int i, String s)
    {
        version = i;
        accountName = s;
    }

    public AccountRecoveryGuidanceRequest(String s)
    {
        this(0, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel);
    }

}
