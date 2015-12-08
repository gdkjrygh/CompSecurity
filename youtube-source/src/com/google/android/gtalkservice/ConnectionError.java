// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gtalkservice;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.gtalkservice:
//            a

public final class ConnectionError
    implements Parcelable
{

    public static final int AUTHENTICATION_EXPIRED = 5;
    public static final int AUTHENTICATION_FAILED = 4;
    public static final int CONNECTION_FAILED = 2;
    public static final android.os.Parcelable.Creator CREATOR = new a();
    public static final int HEART_BEAT_TIMED_OUT = 6;
    public static final int NONE = 0;
    public static final int NO_NETWORK = 1;
    public static final int SERVER_ERROR = 7;
    public static final int SERVER_REJECT_RATE_LIMITING = 8;
    public static final int SERVICE_DISABLED = 11;
    public static final int SESSION_TERMINATED = 9;
    public static final int UNKNOWN = 10;
    public static final int UNKNOWN_HOST = 3;
    public static final String UNKNOWN_HOST_ERROR_STR = "host-unknown";
    private int mError;

    public ConnectionError(int i)
    {
        setError(i);
    }

    public ConnectionError(Parcel parcel)
    {
        mError = parcel.readInt();
    }

    public static boolean isAuthenticationError(int i)
    {
        return i == 4;
    }

    public static boolean isNetworkError(int i)
    {
        return i == 1 || i == 2 || i == 3 || i == 10;
    }

    public static final String toString(int i)
    {
        switch (i)
        {
        case 9: // '\t'
        default:
            return "NO ERROR";

        case 1: // '\001'
            return "NO NETWORK";

        case 2: // '\002'
            return "CONNECTION FAILED";

        case 3: // '\003'
            return "UNKNOWN HOST";

        case 4: // '\004'
            return "AUTH FAILED";

        case 5: // '\005'
            return "AUTH EXPIRED";

        case 6: // '\006'
            return "HEARTBEAT TIMEOUT";

        case 7: // '\007'
            return "SERVER FAILED";

        case 8: // '\b'
            return "SERVER REJECT - RATE LIMIT";

        case 10: // '\n'
            return "UNKNOWN";
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getError()
    {
        return mError;
    }

    public final boolean isAuthenticationError()
    {
        return mError == 4;
    }

    public final boolean isAuthenticationExpired()
    {
        return mError == 5;
    }

    public final boolean isNetworkError()
    {
        return isNetworkError(mError);
    }

    public final boolean isNoError()
    {
        return mError == 0;
    }

    public final void setError(int i)
    {
        mError = i;
    }

    public final String toString()
    {
        return toString(mError);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mError);
    }

}
