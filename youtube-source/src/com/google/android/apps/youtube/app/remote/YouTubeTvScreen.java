// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.ScreenId;
import com.google.android.apps.ytremote.model.SsdpId;
import com.google.android.apps.ytremote.model.YouTubeDevice;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            bg, bv

public class YouTubeTvScreen
    implements Parcelable, bg
{

    public static final android.os.Parcelable.Creator CREATOR = new bv();
    private final YouTubeDevice device;
    private final CloudScreen screen;

    public YouTubeTvScreen(CloudScreen cloudscreen)
    {
        screen = (CloudScreen)c.a(cloudscreen);
        device = null;
    }

    public YouTubeTvScreen(YouTubeDevice youtubedevice)
    {
        device = (YouTubeDevice)c.a(youtubedevice);
        screen = null;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof YouTubeTvScreen))
        {
            return false;
        }
        obj = (YouTubeTvScreen)obj;
        if (device == null)
        {
            if (((YouTubeTvScreen) (obj)).device != null)
            {
                return false;
            }
        } else
        if (!device.equals(((YouTubeTvScreen) (obj)).device))
        {
            return false;
        }
        if (screen != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((YouTubeTvScreen) (obj)).screen == null) goto _L1; else goto _L3
_L3:
        return false;
        if (screen.equals(((YouTubeTvScreen) (obj)).screen)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public YouTubeDevice getDevice()
    {
        return device;
    }

    public String getId()
    {
        if (hasDevice())
        {
            return device.getSsdpId().toString();
        } else
        {
            return screen.getScreenId().toString();
        }
    }

    public CloudScreen getScreen()
    {
        return screen;
    }

    public String getScreenName()
    {
        if (hasDevice())
        {
            return device.getDeviceName();
        } else
        {
            return screen.getName();
        }
    }

    public boolean hasDevice()
    {
        return device != null;
    }

    public boolean hasScreen()
    {
        return screen != null;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (device == null)
        {
            i = 0;
        } else
        {
            i = device.hashCode();
        }
        if (screen != null)
        {
            j = screen.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public boolean mustShowLockScreenControls()
    {
        return hasDevice();
    }

    public String toString()
    {
        return (new StringBuilder("YouTubeTvScreen [device=")).append(device).append(", cloudScreen=").append(screen).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        int j;
        if (hasDevice())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeByte((byte)j);
        if (hasDevice())
        {
            parcel.writeParcelable(device, i);
            return;
        } else
        {
            parcel.writeParcelable(screen, i);
            return;
        }
    }

}
