// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gtalkservice;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.gtalkservice:
//            b

public final class ConnectionState
    implements Parcelable
{

    public static final int CONNECTING = 2;
    public static final android.os.Parcelable.Creator CREATOR = new b();
    public static final int IDLE = 0;
    public static final int LOGGED_IN = 3;
    public static final int ONLINE = 4;
    public static final int PENDING = 1;
    private volatile int mState;

    public ConnectionState(int i)
    {
        setState(i);
    }

    public ConnectionState(Parcel parcel)
    {
        mState = parcel.readInt();
    }

    public static final String toString(int i)
    {
        switch (i)
        {
        default:
            return "IDLE";

        case 1: // '\001'
            return "RECONNECTION_SCHEDULED";

        case 2: // '\002'
            return "CONNECTING";

        case 3: // '\003'
            return "AUTHENTICATED";

        case 4: // '\004'
            return "ONLINE";
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getState()
    {
        return mState;
    }

    public final boolean isDisconnected()
    {
        return mState == 0 || mState == 1;
    }

    public final boolean isLoggedIn()
    {
        return mState >= 3;
    }

    public final boolean isLoggingIn()
    {
        return mState == 2;
    }

    public final boolean isOnline()
    {
        return mState == 4;
    }

    public final boolean isPendingReconnect()
    {
        return mState == 1;
    }

    public final void setState(int i)
    {
        mState = i;
    }

    public final String toString()
    {
        return toString(mState);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mState);
    }

}
