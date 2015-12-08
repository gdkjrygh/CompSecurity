// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            g

public class AccountRecoveryUpdateRequest
    implements SafeParcelable
{

    public static final g CREATOR = new g();
    public final String accountName;
    public final AppDescription callingAppDescription;
    public final boolean isBroadUse;
    public final String phoneCountryCode;
    public final String phoneNumber;
    public final String secondaryEmail;
    final int version;

    AccountRecoveryUpdateRequest(int i, String s, String s1, String s2, String s3, boolean flag, AppDescription appdescription)
    {
        version = i;
        accountName = s;
        secondaryEmail = s1;
        phoneNumber = s2;
        phoneCountryCode = s3;
        isBroadUse = flag;
        callingAppDescription = appdescription;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel, i);
    }

}
