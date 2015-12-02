// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import ru;
import wl;
import wm;

public final class ConnectionResult
    implements SafeParcelable
{

    public static final ru CREATOR = new ru();
    public static final ConnectionResult a = new ConnectionResult(0, null);
    public final int b;
    private final int c;
    private final PendingIntent d;

    public ConnectionResult(int i, int j, PendingIntent pendingintent)
    {
        b = i;
        c = j;
        d = pendingintent;
    }

    public ConnectionResult(int i, PendingIntent pendingintent)
    {
        this(1, i, pendingintent);
    }

    private String e()
    {
        switch (c)
        {
        case 12: // '\f'
        default:
            return (new StringBuilder("unknown status code ")).append(c).toString();

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

    public final void a(Activity activity, int i)
    {
        if (!a())
        {
            return;
        } else
        {
            activity.startIntentSenderForResult(d.getIntentSender(), i, null, 0, 0, 0);
            return;
        }
    }

    public final boolean a()
    {
        return c != 0 && d != null;
    }

    public final boolean b()
    {
        return c == 0;
    }

    public final int c()
    {
        return c;
    }

    public final PendingIntent d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ConnectionResult))
            {
                return false;
            }
            obj = (ConnectionResult)obj;
            if (c != ((ConnectionResult) (obj)).c || !wl.a(d, ((ConnectionResult) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return wl.a(new Object[] {
            Integer.valueOf(c), d
        });
    }

    public final String toString()
    {
        return wl.a(this).a("statusCode", e()).a("resolution", d).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ru.a(this, parcel, i);
    }

}
