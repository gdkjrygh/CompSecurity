// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.common.fromguava.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.legacy.a.a;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            ax, ay

public class TrackingPingAuthenticationSettings
    implements Parcelable, a
{

    public static final android.os.Parcelable.Creator CREATOR = new ax();
    public static final TrackingPingAuthenticationSettings NO_TRACKING_AUTH_SETTINGS = new TrackingPingAuthenticationSettings("^invalidurl$", false, false);
    private final boolean shouldAddUserAuth;
    private final boolean shouldAddVisitorId;
    private final Pattern urlMatchPattern;

    public TrackingPingAuthenticationSettings(Parcel parcel)
    {
        boolean flag1 = true;
        String s = parcel.readString();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (parcel.readInt() != 1)
        {
            flag1 = false;
        }
        this(s, flag, flag1);
    }

    public TrackingPingAuthenticationSettings(String s, boolean flag, boolean flag1)
    {
        urlMatchPattern = Pattern.compile((String)c.a(s, "urlMatchRegex cannot be null"));
        shouldAddUserAuth = flag1;
        shouldAddVisitorId = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && getClass().equals(obj.getClass()))
        {
            obj = (TrackingPingAuthenticationSettings)obj;
            if (b.a(getUrlMatchPattern().pattern(), ((TrackingPingAuthenticationSettings) (obj)).getUrlMatchPattern().pattern()) && b.a(Boolean.valueOf(shouldAddVisitorId()), Boolean.valueOf(((TrackingPingAuthenticationSettings) (obj)).shouldAddVisitorId())) && b.a(Boolean.valueOf(shouldAddUserAuth()), Boolean.valueOf(((TrackingPingAuthenticationSettings) (obj)).shouldAddUserAuth())))
            {
                return true;
            }
        }
        return false;
    }

    public volatile com.google.android.apps.youtube.datalib.legacy.a.b getConverter()
    {
        return getConverter();
    }

    public ay getConverter()
    {
        return new ay(this);
    }

    public Pattern getUrlMatchPattern()
    {
        return urlMatchPattern;
    }

    public boolean shouldAddUserAuth()
    {
        return shouldAddUserAuth;
    }

    public boolean shouldAddVisitorId()
    {
        return shouldAddVisitorId;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeString(getUrlMatchPattern().pattern());
        if (shouldAddVisitorId())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (shouldAddUserAuth())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
