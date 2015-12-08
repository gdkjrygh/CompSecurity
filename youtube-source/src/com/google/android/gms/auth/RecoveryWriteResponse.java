// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth:
//            f

public class RecoveryWriteResponse
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    final int jE;
    public String mErrorCode;

    public RecoveryWriteResponse()
    {
        jE = 1;
    }

    RecoveryWriteResponse(int i, String s)
    {
        jE = i;
        mErrorCode = s;
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
        f.a(this, parcel);
    }

}
