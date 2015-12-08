// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            af, PIMEUpdate

public class PIMEUpdateResponse
    implements SafeParcelable
{

    public static final af CREATOR = new af();
    final int jE;
    final String mErrorMessage;
    public final byte nextIterToken[];
    public final PIMEUpdate updates[];

    PIMEUpdateResponse(int i, String s, byte abyte0[], PIMEUpdate apimeupdate[])
    {
        jE = i;
        mErrorMessage = s;
        nextIterToken = abyte0;
        updates = apimeupdate;
    }

    public int describeContents()
    {
        af af1 = CREATOR;
        return 0;
    }

    public String getErrorMessage()
    {
        return mErrorMessage;
    }

    public boolean hasError()
    {
        return mErrorMessage != null;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        af af1 = CREATOR;
        af.a(this, parcel, i);
    }

}
