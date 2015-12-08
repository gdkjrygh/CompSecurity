// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

// Referenced classes of package com.google.android.gms.common:
//            zzb

public final class ConnectionResult
    implements SafeParcelable
{

    public static final int API_UNAVAILABLE = 16;
    public static final int CANCELED = 13;
    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    public static final int DEVELOPER_ERROR = 10;
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_UPDATING = 18;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 17;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;
    public static final ConnectionResult zzYi = new ConnectionResult(0, null);
    private final PendingIntent mPendingIntent;
    final int mVersionCode;
    private final int zzWu;

    ConnectionResult(int i, int j, PendingIntent pendingintent)
    {
        mVersionCode = i;
        zzWu = j;
        mPendingIntent = pendingintent;
    }

    public ConnectionResult(int i, PendingIntent pendingintent)
    {
        this(1, i, pendingintent);
    }

    static String getStatusString(int i)
    {
        switch (i)
        {
        case 12: // '\f'
        default:
            return (new StringBuilder()).append("UNKNOWN_ERROR_CODE(").append(i).append(")").toString();

        case 0: // '\0'
            return "SUCCESS";

        case 1: // '\001'
            return "SERVICE_MISSING";

        case 2: // '\002'
            return "SERVICE_VERSION_UPDATE_REQUIRED";

        case 3: // '\003'
            return "SERVICE_DISABLED";

        case 4: // '\004'
            return "SIGN_IN_REQUIRED";

        case 5: // '\005'
            return "INVALID_ACCOUNT";

        case 6: // '\006'
            return "RESOLUTION_REQUIRED";

        case 7: // '\007'
            return "NETWORK_ERROR";

        case 8: // '\b'
            return "INTERNAL_ERROR";

        case 9: // '\t'
            return "SERVICE_INVALID";

        case 10: // '\n'
            return "DEVELOPER_ERROR";

        case 11: // '\013'
            return "LICENSE_CHECK_FAILED";

        case 13: // '\r'
            return "CANCELED";

        case 14: // '\016'
            return "TIMEOUT";

        case 15: // '\017'
            return "INTERRUPTED";

        case 16: // '\020'
            return "API_UNAVAILABLE";

        case 17: // '\021'
            return "SIGN_IN_FAILED";

        case 18: // '\022'
            return "SERVICE_UPDATING";
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ConnectionResult))
            {
                return false;
            }
            obj = (ConnectionResult)obj;
            if (zzWu != ((ConnectionResult) (obj)).zzWu || !zzw.equal(mPendingIntent, ((ConnectionResult) (obj)).mPendingIntent))
            {
                return false;
            }
        }
        return true;
    }

    public int getErrorCode()
    {
        return zzWu;
    }

    public PendingIntent getResolution()
    {
        return mPendingIntent;
    }

    public boolean hasResolution()
    {
        return zzWu != 0 && mPendingIntent != null;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Integer.valueOf(zzWu), mPendingIntent
        });
    }

    public boolean isSuccess()
    {
        return zzWu == 0;
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
        return zzw.zzu(this).zzg("statusCode", getStatusString(zzWu)).zzg("resolution", mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

}
