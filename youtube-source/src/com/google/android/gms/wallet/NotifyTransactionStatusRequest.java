// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            q, f

public final class NotifyTransactionStatusRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new q();
    String Oq;
    String Pc;
    final int jE;
    int status;

    NotifyTransactionStatusRequest()
    {
        jE = 1;
    }

    NotifyTransactionStatusRequest(int i, String s, int j, String s1)
    {
        jE = i;
        Oq = s;
        status = j;
        Pc = s1;
    }

    public static f newBuilder()
    {
        NotifyTransactionStatusRequest notifytransactionstatusrequest = new NotifyTransactionStatusRequest();
        notifytransactionstatusrequest.getClass();
        return new f(notifytransactionstatusrequest, (byte)0);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getDetailedReason()
    {
        return Pc;
    }

    public final String getGoogleTransactionId()
    {
        return Oq;
    }

    public final int getStatus()
    {
        return status;
    }

    public final int getVersionCode()
    {
        return jE;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        q.a(this, parcel);
    }

}
