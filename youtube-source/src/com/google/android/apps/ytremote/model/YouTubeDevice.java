// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.apps.ytremote.model:
//            f, g, SsdpId, AppStatus, 
//            ScreenId

public class YouTubeDevice
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    private final AppStatus appStatus;
    private final Uri appUrl;
    private final String deviceName;
    private final boolean hasDialSupport;
    private final String manufacturer;
    private final String modelName;
    private final SsdpId ssdpId;

    public YouTubeDevice(g g1)
    {
        deviceName = g.a(g1);
        manufacturer = g.b(g1);
        modelName = g.c(g1);
        ssdpId = g.d(g1);
        appUrl = g.e(g1);
        hasDialSupport = g.f(g1);
        appStatus = g.g(g1);
    }

    public YouTubeDevice(String s, String s1, String s2, String s3, String s4, SsdpId ssdpid, Uri uri, 
            boolean flag, AppStatus appstatus, ScreenId screenid)
    {
        deviceName = s;
        manufacturer = s3;
        modelName = s4;
        ssdpId = ssdpid;
        appUrl = uri;
        hasDialSupport = flag;
        appStatus = appstatus;
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
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (YouTubeDevice)obj;
        if (appUrl == null)
        {
            if (((YouTubeDevice) (obj)).appUrl != null)
            {
                return false;
            }
        } else
        if (!appUrl.equals(((YouTubeDevice) (obj)).appUrl))
        {
            return false;
        }
        if (deviceName == null)
        {
            if (((YouTubeDevice) (obj)).deviceName != null)
            {
                return false;
            }
        } else
        if (!deviceName.equals(((YouTubeDevice) (obj)).deviceName))
        {
            return false;
        }
        if (hasDialSupport != ((YouTubeDevice) (obj)).hasDialSupport)
        {
            return false;
        }
        if (manufacturer == null)
        {
            if (((YouTubeDevice) (obj)).manufacturer != null)
            {
                return false;
            }
        } else
        if (!manufacturer.equals(((YouTubeDevice) (obj)).manufacturer))
        {
            return false;
        }
        if (modelName == null)
        {
            if (((YouTubeDevice) (obj)).modelName != null)
            {
                return false;
            }
        } else
        if (!modelName.equals(((YouTubeDevice) (obj)).modelName))
        {
            return false;
        }
        if (ssdpId != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((YouTubeDevice) (obj)).ssdpId == null) goto _L1; else goto _L3
_L3:
        return false;
        if (ssdpId.equals(((YouTubeDevice) (obj)).ssdpId)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public AppStatus getAppStatus()
    {
        return appStatus;
    }

    public Uri getAppUri()
    {
        return appUrl;
    }

    public String getDeviceName()
    {
        return deviceName;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public String getModelName()
    {
        return modelName;
    }

    public SsdpId getSsdpId()
    {
        return ssdpId;
    }

    public boolean hasAppStatus()
    {
        return appStatus != null;
    }

    public boolean hasDialSupport()
    {
        return hasDialSupport;
    }

    public int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        char c;
        int k;
        int l;
        if (appUrl == null)
        {
            i = 0;
        } else
        {
            i = appUrl.hashCode();
        }
        if (deviceName == null)
        {
            j = 0;
        } else
        {
            j = deviceName.hashCode();
        }
        if (hasDialSupport)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (manufacturer == null)
        {
            k = 0;
        } else
        {
            k = manufacturer.hashCode();
        }
        if (modelName == null)
        {
            l = 0;
        } else
        {
            l = modelName.hashCode();
        }
        if (ssdpId != null)
        {
            i1 = ssdpId.hashCode();
        }
        return (l + (k + (c + (j + (i + 31) * 31) * 31) * 31) * 31) * 31 + i1;
    }

    public String toString()
    {
        return (new StringBuilder("YouTubeDevice [deviceName=")).append(deviceName).append(", ssdpId=").append(ssdpId).append("]").toString();
    }

    public YouTubeDevice withAppStatus(AppStatus appstatus)
    {
        return (new g(this)).a(appstatus).a();
    }

    public YouTubeDevice withNewDeviceName(String s)
    {
        if (s == null)
        {
            return this;
        } else
        {
            return (new g(this)).a(s).a();
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(deviceName);
        parcel.writeString(manufacturer);
        parcel.writeString(modelName);
        parcel.writeSerializable(ssdpId);
        parcel.writeParcelable(appUrl, i);
        int j;
        if (hasDialSupport)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeByte((byte)j);
        parcel.writeParcelable(appStatus, i);
    }








}
