// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location:
//            d

public class LocationStatus
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    public static final int STATUS_INVALID_SCAN = 4;
    public static final int STATUS_IN_PROGRESS = 8;
    public static final int STATUS_LOCATION_DISABLED_IN_SETTINGS = 7;
    public static final int STATUS_NO_INFO_IN_DATABASE = 3;
    public static final int STATUS_SCANS_DISABLED_IN_SETTINGS = 6;
    public static final int STATUS_SUCCESSFUL = 0;
    public static final int STATUS_TIMED_OUT_ON_SCAN = 2;
    public static final int STATUS_UNABLE_TO_QUERY_DATABASE = 5;
    public static final int STATUS_UNKNOWN = 1;
    int Cv;
    int Cw;
    long Cx;
    private final int jE;

    LocationStatus(int i, int j, int k, long l)
    {
        jE = i;
        Cv = j;
        Cw = k;
        Cx = l;
    }

    private String cm(int i)
    {
        switch (i)
        {
        case 1: // '\001'
        default:
            return "STATUS_UNKNOWN";

        case 0: // '\0'
            return "STATUS_SUCCESSFUL";

        case 2: // '\002'
            return "STATUS_TIMED_OUT_ON_SCAN";

        case 3: // '\003'
            return "STATUS_NO_INFO_IN_DATABASE";

        case 4: // '\004'
            return "STATUS_INVALID_SCAN";

        case 5: // '\005'
            return "STATUS_UNABLE_TO_QUERY_DATABASE";

        case 6: // '\006'
            return "STATUS_SCANS_DISABLED_IN_SETTINGS";

        case 7: // '\007'
            return "STATUS_LOCATION_DISABLED_IN_SETTINGS";

        case 8: // '\b'
            return "STATUS_IN_PROGRESS";
        }
    }

    public static LocationStatus create(int i, int j, long l)
    {
        return new LocationStatus(1, i, j, l);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof LocationStatus)
        {
            if (Cv == ((LocationStatus) (obj = (LocationStatus)obj)).Cv && Cw == ((LocationStatus) (obj)).Cw && Cx == ((LocationStatus) (obj)).Cx)
            {
                return true;
            }
        }
        return false;
    }

    public int getCellStatus()
    {
        return Cv;
    }

    public long getElapsedRealtimeNs()
    {
        return Cx;
    }

    int getVersionCode()
    {
        return jE;
    }

    public int getWifiStatus()
    {
        return Cw;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(Cv), Integer.valueOf(Cw), Long.valueOf(Cx)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("LocationStatus[cell status: ").append(cm(Cv));
        stringbuilder.append(", wifi status: ").append(cm(Cw));
        stringbuilder.append(", elapsed realtime ns: ").append(Cx);
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel);
    }

}
