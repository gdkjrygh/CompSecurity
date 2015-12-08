// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.delegate;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.delegate:
//            d

public class UpdateCredentialsWorkflowRequest
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    String accountName;
    AppDescription callingAppDescription;
    Bundle mI;
    final int version;

    public UpdateCredentialsWorkflowRequest()
    {
        version = 1;
        mI = new Bundle();
    }

    UpdateCredentialsWorkflowRequest(int i, String s, AppDescription appdescription, Bundle bundle)
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

    public UpdateCredentialsWorkflowRequest setAccountName(String s)
    {
        accountName = s;
        return this;
    }

    public UpdateCredentialsWorkflowRequest setCallingAppDescription(AppDescription appdescription)
    {
        callingAppDescription = appdescription;
        return this;
    }

    public UpdateCredentialsWorkflowRequest setOptions(Bundle bundle)
    {
        mI.clear();
        mI.putAll(bundle);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
