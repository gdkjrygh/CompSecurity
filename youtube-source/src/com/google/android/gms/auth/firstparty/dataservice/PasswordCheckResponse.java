// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            r

public class PasswordCheckResponse
    implements SafeParcelable
{

    public static final r CREATOR = new r();
    String lX;
    String mX;
    String mY;
    final int version;

    PasswordCheckResponse(int i, String s, String s1, String s2)
    {
        version = i;
        mX = s;
        mY = s1;
        lX = s2;
    }

    public PasswordCheckResponse(Status status)
    {
        this(status, null, null);
    }

    public PasswordCheckResponse(Status status, String s, String s1)
    {
        version = 1;
        mX = ((Status)gi.a(status)).getWire();
        mY = s;
        lX = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getDetail()
    {
        return lX;
    }

    public String getPasswordStrength()
    {
        return mY;
    }

    public Status getStatus()
    {
        return Status.fromWireCode(mX);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        r.a(this, parcel);
    }

}
