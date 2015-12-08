// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            d

public class AccountRecoveryDataRequest
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    private static final String mi = (new StringBuilder("[")).append(com/google/android/gms/auth/firstparty/dataservice/AccountRecoveryDataRequest.getSimpleName()).append("]").toString();
    public final String accountName;
    public final AppDescription callingAppDescription;
    public final boolean isClearUpdateSuggested;
    public final String requestDescription;
    final int version;

    AccountRecoveryDataRequest(int i, String s, boolean flag, AppDescription appdescription, String s1)
    {
        gi.a(s, (new StringBuilder()).append(mi).append(" accountName cannot be empty or null!").toString());
        gi.a(s1, (new StringBuilder()).append(mi).append(" requestDescription cannot be empty or null!").toString());
        version = i;
        accountName = gi.a(s);
        isClearUpdateSuggested = flag;
        callingAppDescription = (AppDescription)gi.a(appdescription);
        requestDescription = s1;
    }

    public AccountRecoveryDataRequest(String s, boolean flag, AppDescription appdescription, String s1)
    {
        this(0, s, flag, appdescription, s1);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
