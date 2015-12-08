// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.ar;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Comparator;

// Referenced classes of package com.google.android.gms.location:
//            b, c

public class DetectedActivity
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    public static final Comparator a = new b();
    int b;
    int c;
    private final int d;

    public DetectedActivity(int i, int j, int k)
    {
        d = i;
        b = j;
        c = k;
    }

    public static String a(int i)
    {
        switch (i)
        {
        case 6: // '\006'
        default:
            return Integer.toString(i);

        case 0: // '\0'
            return "IN_VEHICLE";

        case 1: // '\001'
            return "ON_BICYCLE";

        case 2: // '\002'
            return "ON_FOOT";

        case 3: // '\003'
            return "STILL";

        case 4: // '\004'
            return "UNKNOWN";

        case 5: // '\005'
            return "TILTING";

        case 7: // '\007'
            return "WALKING";

        case 8: // '\b'
            return "RUNNING";
        }
    }

    private int b(int i)
    {
        int j = i;
        if (i > 15)
        {
            j = 4;
        }
        return j;
    }

    public int a()
    {
        return b(b);
    }

    public int b()
    {
        return c;
    }

    public int c()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (DetectedActivity)obj;
            if (b != ((DetectedActivity) (obj)).b || c != ((DetectedActivity) (obj)).c)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ar.a(new Object[] {
            Integer.valueOf(b), Integer.valueOf(c)
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("DetectedActivity [type=").append(a(a())).append(", confidence=").append(c).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.c.a(this, parcel, i);
    }

}
