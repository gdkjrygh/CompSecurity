// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location:
//            c

public final class LocationRequest
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    long Cj;
    long Cq;
    long Cr;
    boolean Cs;
    int Ct;
    float Cu;
    private final int jE;
    int mPriority;

    public LocationRequest()
    {
        jE = 1;
        mPriority = 102;
        Cq = 0x36ee80L;
        Cr = 0x927c0L;
        Cs = false;
        Cj = 0x7fffffffffffffffL;
        Ct = 0x7fffffff;
        Cu = 0.0F;
    }

    LocationRequest(int i, int j, long l, long l1, boolean flag, 
            long l2, int k, float f)
    {
        jE = i;
        mPriority = j;
        Cq = l;
        Cr = l1;
        Cs = flag;
        Cj = l2;
        Ct = k;
        Cu = f;
    }

    private static void a(float f)
    {
        if (f < 0.0F)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid displacement: ")).append(f).toString());
        } else
        {
            return;
        }
    }

    private static void ck(int i)
    {
        switch (i)
        {
        case 101: // 'e'
        case 103: // 'g'
        default:
            throw new IllegalArgumentException((new StringBuilder("invalid quality: ")).append(i).toString());

        case 100: // 'd'
        case 102: // 'f'
        case 104: // 'h'
        case 105: // 'i'
            return;
        }
    }

    public static String cl(int i)
    {
        switch (i)
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

    public static LocationRequest create()
    {
        return new LocationRequest();
    }

    private static void m(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid interval: ")).append(l).toString());
        } else
        {
            return;
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LocationRequest))
            {
                return false;
            }
            obj = (LocationRequest)obj;
            if (mPriority != ((LocationRequest) (obj)).mPriority || Cq != ((LocationRequest) (obj)).Cq || Cr != ((LocationRequest) (obj)).Cr || Cs != ((LocationRequest) (obj)).Cs || Cj != ((LocationRequest) (obj)).Cj || Ct != ((LocationRequest) (obj)).Ct || Cu != ((LocationRequest) (obj)).Cu)
            {
                return false;
            }
        }
        return true;
    }

    public final long getExpirationTime()
    {
        return Cj;
    }

    public final long getFastestInterval()
    {
        return Cr;
    }

    public final long getInterval()
    {
        return Cq;
    }

    public final int getNumUpdates()
    {
        return Ct;
    }

    public final int getPriority()
    {
        return mPriority;
    }

    public final float getSmallestDisplacement()
    {
        return Cu;
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(mPriority), Long.valueOf(Cq), Long.valueOf(Cr), Boolean.valueOf(Cs), Long.valueOf(Cj), Integer.valueOf(Ct), Float.valueOf(Cu)
        });
    }

    public final LocationRequest setExpirationDuration(long l)
    {
        long l1 = SystemClock.elapsedRealtime();
        if (l > 0x7fffffffffffffffL - l1)
        {
            Cj = 0x7fffffffffffffffL;
        } else
        {
            Cj = l1 + l;
        }
        if (Cj < 0L)
        {
            Cj = 0L;
        }
        return this;
    }

    public final LocationRequest setExpirationTime(long l)
    {
        Cj = l;
        if (Cj < 0L)
        {
            Cj = 0L;
        }
        return this;
    }

    public final LocationRequest setFastestInterval(long l)
    {
        m(l);
        Cs = true;
        Cr = l;
        return this;
    }

    public final LocationRequest setInterval(long l)
    {
        m(l);
        Cq = l;
        if (!Cs)
        {
            Cr = (long)((double)Cq / 6D);
        }
        return this;
    }

    public final LocationRequest setNumUpdates(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid numUpdates: ")).append(i).toString());
        } else
        {
            Ct = i;
            return this;
        }
    }

    public final LocationRequest setPriority(int i)
    {
        ck(i);
        mPriority = i;
        return this;
    }

    public final LocationRequest setSmallestDisplacement(float f)
    {
        a(f);
        Cu = f;
        return this;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Request[").append(cl(mPriority));
        if (mPriority != 105)
        {
            stringbuilder.append(" requested=");
            stringbuilder.append((new StringBuilder()).append(Cq).append("ms").toString());
        }
        stringbuilder.append(" fastest=");
        stringbuilder.append((new StringBuilder()).append(Cr).append("ms").toString());
        if (Cj != 0x7fffffffffffffffL)
        {
            long l = Cj;
            long l1 = SystemClock.elapsedRealtime();
            stringbuilder.append(" expireIn=");
            stringbuilder.append((new StringBuilder()).append(l - l1).append("ms").toString());
        }
        if (Ct != 0x7fffffff)
        {
            stringbuilder.append(" num=").append(Ct);
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel);
    }

}
