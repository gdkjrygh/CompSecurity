// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.common.api:
//            Result, StatusCreator, CommonStatusCodes

public final class Status
    implements Result, SafeParcelable
{

    public static final StatusCreator CREATOR = new StatusCreator();
    public static final Status zzQU = new Status(0);
    public static final Status zzQV = new Status(14);
    public static final Status zzQW = new Status(8);
    public static final Status zzQX = new Status(15);
    public static final Status zzQY = new Status(16);
    private final PendingIntent mPendingIntent;
    private final int zzOJ;
    private final String zzQZ;
    private final int zzzH;

    public Status(int i)
    {
        this(i, null);
    }

    Status(int i, int j, String s, PendingIntent pendingintent)
    {
        zzzH = i;
        zzOJ = j;
        zzQZ = s;
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

    private String zzku()
    {
        if (zzQZ != null)
        {
            return zzQZ;
        } else
        {
            return CommonStatusCodes.getStatusCodeString(zzOJ);
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
            if (zzzH == ((Status) (obj = (Status)obj)).zzzH && zzOJ == ((Status) (obj)).zzOJ && zzu.equal(zzQZ, ((Status) (obj)).zzQZ) && zzu.equal(mPendingIntent, ((Status) (obj)).mPendingIntent))
            {
                return true;
            }
        }
        return false;
    }

    public Status getStatus()
    {
        return this;
    }

    public int getStatusCode()
    {
        return zzOJ;
    }

    public String getStatusMessage()
    {
        return zzQZ;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Integer.valueOf(zzzH), Integer.valueOf(zzOJ), zzQZ, mPendingIntent
        });
    }

    public boolean isSuccess()
    {
        return zzOJ <= 0;
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("statusCode", zzku()).zzg("resolution", mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        StatusCreator.zza(this, parcel, i);
    }

    PendingIntent zzle()
    {
        return mPendingIntent;
    }

}
