// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

// Referenced classes of package com.google.android.gms.location:
//            LocationRequestCreator

public final class LocationRequest
    implements SafeParcelable
{

    public static final LocationRequestCreator CREATOR = new LocationRequestCreator();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    int mPriority;
    private final int mVersionCode;
    long zzaBB;
    long zzaBW;
    long zzaBX;
    int zzaBY;
    float zzaBZ;
    long zzaCa;
    boolean zzaqs;

    public LocationRequest()
    {
        mVersionCode = 1;
        mPriority = 102;
        zzaBW = 0x36ee80L;
        zzaBX = 0x927c0L;
        zzaqs = false;
        zzaBB = 0x7fffffffffffffffL;
        zzaBY = 0x7fffffff;
        zzaBZ = 0.0F;
        zzaCa = 0L;
    }

    LocationRequest(int i, int j, long l, long l1, boolean flag, 
            long l2, int k, float f, long l3)
    {
        mVersionCode = i;
        mPriority = j;
        zzaBW = l;
        zzaBX = l1;
        zzaqs = flag;
        zzaBB = l2;
        zzaBY = k;
        zzaBZ = f;
        zzaCa = l3;
    }

    public static LocationRequest create()
    {
        return new LocationRequest();
    }

    private static void zzK(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid interval: ").append(l).toString());
        } else
        {
            return;
        }
    }

    private static void zzd(float f)
    {
        if (f < 0.0F)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid displacement: ").append(f).toString());
        } else
        {
            return;
        }
    }

    private static void zzgG(int i)
    {
        switch (i)
        {
        case 101: // 'e'
        case 103: // 'g'
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("invalid quality: ").append(i).toString());

        case 100: // 'd'
        case 102: // 'f'
        case 104: // 'h'
        case 105: // 'i'
            return;
        }
    }

    public static String zzgH(int i)
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
            if (mPriority != ((LocationRequest) (obj)).mPriority || zzaBW != ((LocationRequest) (obj)).zzaBW || zzaBX != ((LocationRequest) (obj)).zzaBX || zzaqs != ((LocationRequest) (obj)).zzaqs || zzaBB != ((LocationRequest) (obj)).zzaBB || zzaBY != ((LocationRequest) (obj)).zzaBY || zzaBZ != ((LocationRequest) (obj)).zzaBZ)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return zzaBB;
    }

    public long getFastestInterval()
    {
        return zzaBX;
    }

    public long getInterval()
    {
        return zzaBW;
    }

    public long getMaxWaitTime()
    {
        long l1 = zzaCa;
        long l = l1;
        if (l1 < zzaBW)
        {
            l = zzaBW;
        }
        return l;
    }

    public int getNumUpdates()
    {
        return zzaBY;
    }

    public int getPriority()
    {
        return mPriority;
    }

    public float getSmallestDisplacement()
    {
        return zzaBZ;
    }

    int getVersionCode()
    {
        return mVersionCode;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Integer.valueOf(mPriority), Long.valueOf(zzaBW), Long.valueOf(zzaBX), Boolean.valueOf(zzaqs), Long.valueOf(zzaBB), Integer.valueOf(zzaBY), Float.valueOf(zzaBZ)
        });
    }

    public LocationRequest setExpirationDuration(long l)
    {
        long l1 = SystemClock.elapsedRealtime();
        if (l > 0x7fffffffffffffffL - l1)
        {
            zzaBB = 0x7fffffffffffffffL;
        } else
        {
            zzaBB = l1 + l;
        }
        if (zzaBB < 0L)
        {
            zzaBB = 0L;
        }
        return this;
    }

    public LocationRequest setExpirationTime(long l)
    {
        zzaBB = l;
        if (zzaBB < 0L)
        {
            zzaBB = 0L;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long l)
    {
        zzK(l);
        zzaqs = true;
        zzaBX = l;
        return this;
    }

    public LocationRequest setInterval(long l)
    {
        zzK(l);
        zzaBW = l;
        if (!zzaqs)
        {
            zzaBX = (long)((double)zzaBW / 6D);
        }
        return this;
    }

    public LocationRequest setMaxWaitTime(long l)
    {
        zzK(l);
        zzaCa = l;
        return this;
    }

    public LocationRequest setNumUpdates(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid numUpdates: ").append(i).toString());
        } else
        {
            zzaBY = i;
            return this;
        }
    }

    public LocationRequest setPriority(int i)
    {
        zzgG(i);
        mPriority = i;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f)
    {
        zzd(f);
        zzaBZ = f;
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Request[").append(zzgH(mPriority));
        if (mPriority != 105)
        {
            stringbuilder.append(" requested=");
            stringbuilder.append((new StringBuilder()).append(zzaBW).append("ms").toString());
        }
        stringbuilder.append(" fastest=");
        stringbuilder.append((new StringBuilder()).append(zzaBX).append("ms").toString());
        if (zzaCa > zzaBW)
        {
            stringbuilder.append(" maxWait=");
            stringbuilder.append((new StringBuilder()).append(zzaCa).append("ms").toString());
        }
        if (zzaBB != 0x7fffffffffffffffL)
        {
            long l = zzaBB;
            long l1 = SystemClock.elapsedRealtime();
            stringbuilder.append(" expireIn=");
            stringbuilder.append((new StringBuilder()).append(l - l1).append("ms").toString());
        }
        if (zzaBY != 0x7fffffff)
        {
            stringbuilder.append(" num=").append(zzaBY);
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LocationRequestCreator.zza(this, parcel, i);
    }

}
