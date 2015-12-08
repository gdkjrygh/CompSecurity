// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.gf;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.api:
//            d

public final class Status
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    public static final Status rm = new Status(0, null, null);
    public static final Status rn = new Status(14, null, null);
    public static final Status ro = new Status(15, null, null);
    private final int jE;
    private final PendingIntent mPendingIntent;
    private final int qo;
    private final String rp;

    public Status(int i)
    {
        this(1, i, null, null);
    }

    Status(int i, int j, String s, PendingIntent pendingintent)
    {
        jE = i;
        qo = j;
        rp = s;
        mPendingIntent = pendingintent;
    }

    public Status(int i, String s, PendingIntent pendingintent)
    {
        this(1, i, s, pendingintent);
    }

    private String bm()
    {
        if (rp != null)
        {
            return rp;
        }
        int i = qo;
        switch (i)
        {
        default:
            return (new StringBuilder("unknown status code: ")).append(i).toString();

        case -1: 
            return "SUCCESS_CACHE";

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
        }
    }

    final PendingIntent bx()
    {
        return mPendingIntent;
    }

    final String by()
    {
        return rp;
    }

    public final a bz()
    {
        return new a(qo, mPendingIntent);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof Status)
        {
            if (jE == ((Status) (obj = (Status)obj)).jE && qo == ((Status) (obj)).qo && ge.a(rp, ((Status) (obj)).rp) && ge.a(mPendingIntent, ((Status) (obj)).mPendingIntent))
            {
                return true;
            }
        }
        return false;
    }

    public final PendingIntent getResolution()
    {
        return mPendingIntent;
    }

    public final Status getStatus()
    {
        return this;
    }

    public final int getStatusCode()
    {
        return qo;
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final boolean hasResolution()
    {
        return mPendingIntent != null;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(jE), Integer.valueOf(qo), rp, mPendingIntent
        });
    }

    public final boolean isInterrupted()
    {
        return qo == 14;
    }

    public final boolean isSuccess()
    {
        return qo <= 0;
    }

    public final void startResolutionForResult(Activity activity, int i)
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

    public final String toString()
    {
        return ge.a(this).a("statusCode", bm()).a("resolution", mPendingIntent).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.common.api.d.a(this, parcel, i);
    }

}
