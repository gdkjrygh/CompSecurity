// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth:
//            d

public class RecoveryReadResponse
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    final int jE;
    public String mAction;
    public String mAllowedOptions;
    public List mCountryList;
    public String mError;
    public String mPhoneCountryCode;
    public String mPhoneNumber;
    public String mSecondaryEmail;

    public RecoveryReadResponse()
    {
        jE = 1;
    }

    RecoveryReadResponse(int i, String s, String s1, String s2, List list, String s3, String s4, 
            String s5)
    {
        jE = i;
        mSecondaryEmail = s;
        mPhoneNumber = s1;
        mPhoneCountryCode = s2;
        mCountryList = list;
        mError = s3;
        mAction = s4;
        mAllowedOptions = s5;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return jE;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel);
    }

}
