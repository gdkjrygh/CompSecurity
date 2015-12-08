// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            k

public class CheckRealNameResponse
    implements SafeParcelable
{

    public static final k CREATOR = new k();
    String lV;
    final int version;

    CheckRealNameResponse(int i, String s)
    {
        version = i;
        lV = s;
    }

    public CheckRealNameResponse(Status status)
    {
        version = 1;
        lV = ((Status)gi.a(status)).getWire();
    }

    public int describeContents()
    {
        return 0;
    }

    public Status getStatus()
    {
        return Status.fromWireCode(lV);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel);
    }

}
