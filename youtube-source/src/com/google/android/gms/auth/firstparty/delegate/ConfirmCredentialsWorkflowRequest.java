// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.delegate;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.delegate:
//            a

public class ConfirmCredentialsWorkflowRequest
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    String accountName;
    AppDescription callingAppDescription;
    Bundle mI;
    final int version;

    public ConfirmCredentialsWorkflowRequest()
    {
        version = 1;
        mI = new Bundle();
    }

    ConfirmCredentialsWorkflowRequest(int i, String s, AppDescription appdescription, Bundle bundle)
    {
        version = i;
        accountName = s;
        callingAppDescription = appdescription;
        mI = bundle;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountName()
    {
        return accountName;
    }

    public AppDescription getCallingAppDescription()
    {
        return callingAppDescription;
    }

    public Bundle getOptions()
    {
        return new Bundle(mI);
    }

    public ConfirmCredentialsWorkflowRequest setAccountName(String s)
    {
        accountName = s;
        return this;
    }

    public ConfirmCredentialsWorkflowRequest setCallingAppDescription(AppDescription appdescription)
    {
        callingAppDescription = appdescription;
        return this;
    }

    public ConfirmCredentialsWorkflowRequest setOptions(Bundle bundle)
    {
        mI.clear();
        mI.putAll(bundle);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
