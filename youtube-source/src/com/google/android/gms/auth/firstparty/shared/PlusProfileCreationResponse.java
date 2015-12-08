// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            h, Status

public class PlusProfileCreationResponse
    implements SafeParcelable
{

    public static final h CREATOR = new h();
    String nM;
    final int version;

    PlusProfileCreationResponse(int i, String s)
    {
        version = i;
        nM = s;
    }

    public PlusProfileCreationResponse(Status status)
    {
        version = 1;
        nM = ((Status)gi.a(status)).getWire();
    }

    public int describeContents()
    {
        return 0;
    }

    public Status getStatus()
    {
        return Status.fromWireCode(nM);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        h.a(this, parcel);
    }

}
