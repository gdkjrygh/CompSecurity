// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.wallet:
//            zzm

public final class NotifyTransactionStatusRequest
    implements SafeParcelable
{
    public final class Builder
    {

        final NotifyTransactionStatusRequest zzaJm;

        public NotifyTransactionStatusRequest build()
        {
            boolean flag1 = true;
            boolean flag;
            if (!TextUtils.isEmpty(zzaJm.zzaHZ))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzv.zzb(flag, "googleTransactionId is required");
            if (zzaJm.status >= 1 && zzaJm.status <= 8)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            zzv.zzb(flag, "status is an unrecognized value");
            return zzaJm;
        }

        public Builder setGoogleTransactionId(String s)
        {
            zzaJm.zzaHZ = s;
            return this;
        }

        public Builder setStatus(int i)
        {
            zzaJm.status = i;
            return this;
        }

        private Builder()
        {
            zzaJm = NotifyTransactionStatusRequest.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new zzm();
    int status;
    String zzaHZ;
    String zzaJl;
    final int zzzH;

    NotifyTransactionStatusRequest()
    {
        zzzH = 1;
    }

    NotifyTransactionStatusRequest(int i, String s, int j, String s1)
    {
        zzzH = i;
        zzaHZ = s;
        status = j;
        zzaJl = s1;
    }

    public static Builder newBuilder()
    {
        NotifyTransactionStatusRequest notifytransactionstatusrequest = new NotifyTransactionStatusRequest();
        notifytransactionstatusrequest.getClass();
        return notifytransactionstatusrequest. new Builder();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm.zza(this, parcel, i);
    }

}
