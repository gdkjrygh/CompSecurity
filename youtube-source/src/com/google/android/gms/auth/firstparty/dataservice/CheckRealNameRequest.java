// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            j

public class CheckRealNameRequest
    implements SafeParcelable
{

    public static final j CREATOR = new j();
    AppDescription callingAppDescription;
    String mp;
    String mq;
    final int version;

    public CheckRealNameRequest()
    {
        version = 1;
    }

    CheckRealNameRequest(int i, AppDescription appdescription, String s, String s1)
    {
        version = i;
        callingAppDescription = appdescription;
        mp = s;
        mq = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public AppDescription getCallingAppDescription()
    {
        return callingAppDescription;
    }

    public String getFirstName()
    {
        return mp;
    }

    public String getLastName()
    {
        return mq;
    }

    public CheckRealNameRequest setCallingAppDescription(AppDescription appdescription)
    {
        callingAppDescription = appdescription;
        return this;
    }

    public CheckRealNameRequest setFirstName(String s)
    {
        mp = s;
        return this;
    }

    public CheckRealNameRequest setLastName(String s)
    {
        mq = s;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
