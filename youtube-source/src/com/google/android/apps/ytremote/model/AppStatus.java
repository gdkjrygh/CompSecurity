// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.apps.ytremote.model:
//            a, b, ScreenId

public class AppStatus
    implements Parcelable
{

    public static final int APP_STATUS_INSTALLABLE = 0;
    public static final int APP_STATUS_NOT_FOUND = -1;
    public static final int APP_STATUS_RUNNING = 1;
    public static final int APP_STATUS_STOPPED = 2;
    public static final int APP_STATUS_UNKNOWN = -2;
    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final Uri installUrl;
    private final boolean isStopAllowed;
    private final String runningPathSegment;
    private final ScreenId screenId;
    private final int status;

    public AppStatus(int i)
    {
        this(i, null, null, null, true);
    }

    private AppStatus(int i, Uri uri, String s, ScreenId screenid, boolean flag)
    {
        status = i;
        installUrl = uri;
        runningPathSegment = s;
        screenId = screenid;
        isStopAllowed = flag;
    }

    public AppStatus(b b1)
    {
        status = b.a(b1);
        installUrl = b.b(b1);
        runningPathSegment = b.c(b1);
        screenId = b.d(b1);
        isStopAllowed = b.e(b1);
    }

    public boolean appInfoEquals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (AppStatus)obj;
        if (screenId != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((AppStatus) (obj)).screenId == null) goto _L1; else goto _L3
_L3:
        return false;
        if (screenId.equals(((AppStatus) (obj)).screenId)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AppStatus)obj;
            if (installUrl == null)
            {
                if (((AppStatus) (obj)).installUrl != null)
                {
                    return false;
                }
            } else
            if (!installUrl.equals(((AppStatus) (obj)).installUrl))
            {
                return false;
            }
            if (runningPathSegment == null)
            {
                if (((AppStatus) (obj)).runningPathSegment != null)
                {
                    return false;
                }
            } else
            if (!runningPathSegment.equals(((AppStatus) (obj)).runningPathSegment))
            {
                return false;
            }
            if (screenId == null)
            {
                if (((AppStatus) (obj)).screenId != null)
                {
                    return false;
                }
            } else
            if (!screenId.equals(((AppStatus) (obj)).screenId))
            {
                return false;
            }
            if (status != ((AppStatus) (obj)).status)
            {
                return false;
            }
            if (isStopAllowed != ((AppStatus) (obj)).isStopAllowed)
            {
                return false;
            }
        }
        return true;
    }

    public Uri getInstallUrl()
    {
        return installUrl;
    }

    public String getRunningPathSegment()
    {
        return runningPathSegment;
    }

    public ScreenId getScreenId()
    {
        return screenId;
    }

    public int getStatus()
    {
        return status;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        int i1;
        if (installUrl == null)
        {
            i = 0;
        } else
        {
            i = installUrl.hashCode();
        }
        if (runningPathSegment == null)
        {
            j = 0;
        } else
        {
            j = runningPathSegment.hashCode();
        }
        if (screenId == null)
        {
            k = 0;
        } else
        {
            k = screenId.hashCode();
        }
        i1 = status;
        if (isStopAllowed)
        {
            l = 1;
        }
        return ((k + (j + (i + 31) * 31) * 31) * 31 + i1) * 31 + l;
    }

    public boolean isStopAllowed()
    {
        return isStopAllowed;
    }

    public String toString()
    {
        return (new StringBuilder("AppStatus [runningPathSegment=")).append(runningPathSegment).append(", screenId=").append(screenId).append(", status=").append(status).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(status);
        parcel.writeParcelable(installUrl, i);
        parcel.writeString(runningPathSegment);
        parcel.writeSerializable(screenId);
        if (isStopAllowed)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }






}
