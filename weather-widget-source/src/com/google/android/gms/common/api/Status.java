// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

// Referenced classes of package com.google.android.gms.common.api:
//            Result, zzn, CommonStatusCodes

public final class Status
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzn();
    public static final Status zzaaD = new Status(0);
    public static final Status zzaaE = new Status(14);
    public static final Status zzaaF = new Status(8);
    public static final Status zzaaG = new Status(15);
    public static final Status zzaaH = new Status(16);
    private final PendingIntent mPendingIntent;
    private final int mVersionCode;
    private final int zzWu;
    private final String zzaaI;

    public Status(int i)
    {
        this(i, null);
    }

    Status(int i, int j, String s, PendingIntent pendingintent)
    {
        mVersionCode = i;
        zzWu = j;
        zzaaI = s;
        mPendingIntent = pendingintent;
    }

    public Status(int i, String s)
    {
        this(1, i, s, null);
    }

    public Status(int i, String s, PendingIntent pendingintent)
    {
        this(1, i, s, pendingintent);
    }

    private String zznI()
    {
        if (zzaaI != null)
        {
            return zzaaI;
        } else
        {
            return CommonStatusCodes.getStatusCodeString(zzWu);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Status)
        {
            if (mVersionCode == ((Status) (obj = (Status)obj)).mVersionCode && zzWu == ((Status) (obj)).zzWu && zzw.equal(zzaaI, ((Status) (obj)).zzaaI) && zzw.equal(mPendingIntent, ((Status) (obj)).mPendingIntent))
            {
                return true;
            }
        }
        return false;
    }

    public PendingIntent getResolution()
    {
        return mPendingIntent;
    }

    public Status getStatus()
    {
        return this;
    }

    public int getStatusCode()
    {
        return zzWu;
    }

    public String getStatusMessage()
    {
        return zzaaI;
    }

    int getVersionCode()
    {
        return mVersionCode;
    }

    public boolean hasResolution()
    {
        return mPendingIntent != null;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Integer.valueOf(mVersionCode), Integer.valueOf(zzWu), zzaaI, mPendingIntent
        });
    }

    public boolean isCanceled()
    {
        return zzWu == 16;
    }

    public boolean isInterrupted()
    {
        return zzWu == 14;
    }

    public boolean isSuccess()
    {
        return zzWu <= 0;
    }

    public void startResolutionForResult(Activity activity, int i)
        throws android.content.IntentSender.SendIntentException
    {
        if (!hasResolution())
        {
            return;
        } else
        {
            activity.startIntentSenderForResult(mPendingIntent.getIntentSender(), i, null, 0, 0, 0);
            return;
        }
    }

    public String toString()
    {
        return zzw.zzu(this).zzg("statusCode", zznI()).zzg("resolution", mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzn.zza(this, parcel, i);
    }

    PendingIntent zznH()
    {
        return mPendingIntent;
    }

}
