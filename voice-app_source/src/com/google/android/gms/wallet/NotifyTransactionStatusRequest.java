// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.wallet:
//            zzm

public final class NotifyTransactionStatusRequest
    implements SafeParcelable
{
    public final class Builder
    {

        final NotifyTransactionStatusRequest zzaRx;

        public NotifyTransactionStatusRequest build()
        {
            boolean flag1 = true;
            boolean flag;
            if (!TextUtils.isEmpty(zzaRx.zzaQm))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "googleTransactionId is required");
            if (zzaRx.status >= 1 && zzaRx.status <= 8)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "status is an unrecognized value");
            return zzaRx;
        }

        public Builder setDetailedReason(String s)
        {
            zzaRx.zzaRw = s;
            return this;
        }

        public Builder setGoogleTransactionId(String s)
        {
            zzaRx.zzaQm = s;
            return this;
        }

        public Builder setStatus(int i)
        {
            zzaRx.status = i;
            return this;
        }

        private Builder()
        {
            zzaRx = NotifyTransactionStatusRequest.this;
            super();
        }

    }

    public static interface Status
    {

        public static final int SUCCESS = 1;
    }

    public static interface Status.Error
    {

        public static final int AVS_DECLINE = 7;
        public static final int BAD_CARD = 4;
        public static final int BAD_CVC = 3;
        public static final int DECLINED = 5;
        public static final int FRAUD_DECLINE = 8;
        public static final int OTHER = 6;
        public static final int UNKNOWN = 2;
    }


    public static final android.os.Parcelable.Creator CREATOR = new zzm();
    int status;
    final int zzCY;
    String zzaQm;
    String zzaRw;

    NotifyTransactionStatusRequest()
    {
        zzCY = 1;
    }

    NotifyTransactionStatusRequest(int i, String s, int j, String s1)
    {
        zzCY = i;
        zzaQm = s;
        status = j;
        zzaRw = s1;
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

    public String getDetailedReason()
    {
        return zzaRw;
    }

    public String getGoogleTransactionId()
    {
        return zzaQm;
    }

    public int getStatus()
    {
        return status;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm.zza(this, parcel, i);
    }

}
