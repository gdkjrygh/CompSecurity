// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ar;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location:
//            h

public final class LocationRequest
    implements SafeParcelable
{

    public static final h CREATOR = new h();
    int a;
    long b;
    long c;
    boolean d;
    long e;
    int f;
    float g;
    long h;
    private final int i;

    public LocationRequest()
    {
        i = 1;
        a = 102;
        b = 0x36ee80L;
        c = 0x927c0L;
        d = false;
        e = 0x7fffffffffffffffL;
        f = 0x7fffffff;
        g = 0.0F;
        h = 0L;
    }

    LocationRequest(int j, int k, long l, long l1, boolean flag, 
            long l2, int i1, float f1, long l3)
    {
        i = j;
        a = k;
        b = l;
        c = l1;
        d = flag;
        e = l2;
        f = i1;
        g = f1;
        h = l3;
    }

    public static LocationRequest a()
    {
        return new LocationRequest();
    }

    public static String b(int j)
    {
        switch (j)
        {
        case 101: // 'e'
        case 103: // 'g'
        default:
            return "???";

        case 100: // 'd'
            return "PRIORITY_HIGH_ACCURACY";

        case 102: // 'f'
            return "PRIORITY_BALANCED_POWER_ACCURACY";

        case 104: // 'h'
            return "PRIORITY_LOW_POWER";

        case 105: // 'i'
            return "PRIORITY_NO_POWER";
        }
    }

    private static void c(int j)
    {
        switch (j)
        {
        case 101: // 'e'
        case 103: // 'g'
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("invalid quality: ").append(j).toString());

        case 100: // 'd'
        case 102: // 'f'
        case 104: // 'h'
        case 105: // 'i'
            return;
        }
    }

    private static void c(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid interval: ").append(l).toString());
        } else
        {
            return;
        }
    }

    public LocationRequest a(int j)
    {
        c(j);
        a = j;
        return this;
    }

    public LocationRequest a(long l)
    {
        c(l);
        b = l;
        if (!d)
        {
            c = (long)((double)b / 6D);
        }
        return this;
    }

    int b()
    {
        return i;
    }

    public LocationRequest b(long l)
    {
        c(l);
        d = true;
        c = l;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LocationRequest))
            {
                return false;
            }
            obj = (LocationRequest)obj;
            if (a != ((LocationRequest) (obj)).a || b != ((LocationRequest) (obj)).b || c != ((LocationRequest) (obj)).c || d != ((LocationRequest) (obj)).d || e != ((LocationRequest) (obj)).e || f != ((LocationRequest) (obj)).f || g != ((LocationRequest) (obj)).g)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ar.a(new Object[] {
            Integer.valueOf(a), Long.valueOf(b), Long.valueOf(c), Boolean.valueOf(d), Long.valueOf(e), Integer.valueOf(f), Float.valueOf(g)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Request[").append(b(a));
        if (a != 105)
        {
            stringbuilder.append(" requested=");
            stringbuilder.append((new StringBuilder()).append(b).append("ms").toString());
        }
        stringbuilder.append(" fastest=");
        stringbuilder.append((new StringBuilder()).append(c).append("ms").toString());
        if (h > b)
        {
            stringbuilder.append(" maxWait=");
            stringbuilder.append((new StringBuilder()).append(h).append("ms").toString());
        }
        if (e != 0x7fffffffffffffffL)
        {
            long l = e;
            long l1 = SystemClock.elapsedRealtime();
            stringbuilder.append(" expireIn=");
            stringbuilder.append((new StringBuilder()).append(l - l1).append("ms").toString());
        }
        if (f != 0x7fffffff)
        {
            stringbuilder.append(" num=").append(f);
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        com.google.android.gms.location.h.a(this, parcel, j);
    }

}
