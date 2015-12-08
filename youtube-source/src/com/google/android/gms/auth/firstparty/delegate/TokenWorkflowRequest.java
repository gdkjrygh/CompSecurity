// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.delegate;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.delegate:
//            c

public class TokenWorkflowRequest
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    volatile String accountName;
    volatile AppDescription callingAppDescription;
    volatile Bundle mI;
    volatile String mZ;
    volatile FACLConfig na;
    volatile PACLConfig nb;
    volatile boolean ns;
    final int version;

    public TokenWorkflowRequest()
    {
        version = 1;
        mI = new Bundle();
    }

    TokenWorkflowRequest(int i, String s, String s1, Bundle bundle, FACLConfig faclconfig, PACLConfig paclconfig, boolean flag, 
            AppDescription appdescription)
    {
        version = i;
        mZ = s;
        accountName = s1;
        mI = bundle;
        na = faclconfig;
        nb = paclconfig;
        ns = flag;
        callingAppDescription = appdescription;
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

    public FACLConfig getFaclData()
    {
        return na;
    }

    public Bundle getOptions()
    {
        return new Bundle(mI);
    }

    public PACLConfig getPaclData()
    {
        return nb;
    }

    public String getService()
    {
        return mZ;
    }

    public boolean isSuppressingProgressUx()
    {
        return ns;
    }

    public TokenWorkflowRequest setAccountName(String s)
    {
        accountName = s;
        return this;
    }

    public TokenWorkflowRequest setCallingAppDescription(AppDescription appdescription)
    {
        callingAppDescription = appdescription;
        return this;
    }

    public TokenWorkflowRequest setFaclData(FACLConfig faclconfig)
    {
        na = faclconfig;
        return this;
    }

    public TokenWorkflowRequest setOptions(Bundle bundle)
    {
        mI.clear();
        mI.putAll(bundle);
        return this;
    }

    public TokenWorkflowRequest setPaclData(PACLConfig paclconfig)
    {
        nb = paclconfig;
        return this;
    }

    public TokenWorkflowRequest setService(String s)
    {
        mZ = s;
        return this;
    }

    public TokenWorkflowRequest setSuppressingProgressUx(boolean flag)
    {
        ns = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
