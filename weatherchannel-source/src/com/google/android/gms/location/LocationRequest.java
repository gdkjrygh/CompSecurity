// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

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
    private final int zzCY;
    boolean zzamB;
    long zzaxU;
    long zzaxV;
    int zzaxW;
    float zzaxX;
    long zzaxY;
    long zzaxz;

    public LocationRequest()
    {
        zzCY = 1;
        mPriority = 102;
        zzaxU = 0x36ee80L;
        zzaxV = 0x927c0L;
        zzamB = false;
        zzaxz = 0x7fffffffffffffffL;
        zzaxW = 0x7fffffff;
        zzaxX = 0.0F;
        zzaxY = 0L;
    }

    LocationRequest(int i, int j, long l, long l1, boolean flag, 
            long l2, int k, float f, long l3)
    {
        zzCY = i;
        mPriority = j;
        zzaxU = l;
        zzaxV = l1;
        zzamB = flag;
        zzaxz = l2;
        zzaxW = k;
        zzaxX = f;
        zzaxY = l3;
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

    private static void zzgu(int i)
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

    public static String zzgv(int i)
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
            if (mPriority != ((LocationRequest) (obj)).mPriority || zzaxU != ((LocationRequest) (obj)).zzaxU || zzaxV != ((LocationRequest) (obj)).zzaxV || zzamB != ((LocationRequest) (obj)).zzamB || zzaxz != ((LocationRequest) (obj)).zzaxz || zzaxW != ((LocationRequest) (obj)).zzaxW || zzaxX != ((LocationRequest) (obj)).zzaxX)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return zzaxz;
    }

    public long getFastestInterval()
    {
        return zzaxV;
    }

    public long getInterval()
    {
        return zzaxU;
    }

    public long getMaxWaitTime()
    {
        long l1 = zzaxY;
        long l = l1;
        if (l1 < zzaxU)
        {
            l = zzaxU;
        }
        return l;
    }

    public int getNumUpdates()
    {
        return zzaxW;
    }

    public int getPriority()
    {
        return mPriority;
    }

    public float getSmallestDisplacement()
    {
        return zzaxX;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Integer.valueOf(mPriority), Long.valueOf(zzaxU), Long.valueOf(zzaxV), Boolean.valueOf(zzamB), Long.valueOf(zzaxz), Integer.valueOf(zzaxW), Float.valueOf(zzaxX)
        });
    }

    public LocationRequest setExpirationDuration(long l)
    {
        long l1 = SystemClock.elapsedRealtime();
        if (l > 0x7fffffffffffffffL - l1)
        {
            zzaxz = 0x7fffffffffffffffL;
        } else
        {
            zzaxz = l1 + l;
        }
        if (zzaxz < 0L)
        {
            zzaxz = 0L;
        }
        return this;
    }

    public LocationRequest setExpirationTime(long l)
    {
        zzaxz = l;
        if (zzaxz < 0L)
        {
            zzaxz = 0L;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long l)
    {
        zzK(l);
        zzamB = true;
        zzaxV = l;
        return this;
    }

    public LocationRequest setInterval(long l)
    {
        zzK(l);
        zzaxU = l;
        if (!zzamB)
        {
            zzaxV = (long)((double)zzaxU / 6D);
        }
        return this;
    }

    public LocationRequest setMaxWaitTime(long l)
    {
        zzK(l);
        zzaxY = l;
        return this;
    }

    public LocationRequest setNumUpdates(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid numUpdates: ").append(i).toString());
        } else
        {
            zzaxW = i;
            return this;
        }
    }

    public LocationRequest setPriority(int i)
    {
        zzgu(i);
        mPriority = i;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f)
    {
        zzd(f);
        zzaxX = f;
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Request[").append(zzgv(mPriority));
        if (mPriority != 105)
        {
            stringbuilder.append(" requested=");
            stringbuilder.append((new StringBuilder()).append(zzaxU).append("ms").toString());
        }
        stringbuilder.append(" fastest=");
        stringbuilder.append((new StringBuilder()).append(zzaxV).append("ms").toString());
        if (zzaxY > zzaxU)
        {
            stringbuilder.append(" maxWait=");
            stringbuilder.append((new StringBuilder()).append(zzaxY).append("ms").toString());
        }
        if (zzaxz != 0x7fffffffffffffffL)
        {
            long l = zzaxz;
            long l1 = SystemClock.elapsedRealtime();
            stringbuilder.append(" expireIn=");
            stringbuilder.append((new StringBuilder()).append(l - l1).append("ms").toString());
        }
        if (zzaxW != 0x7fffffff)
        {
            stringbuilder.append(" num=").append(zzaxW);
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LocationRequestCreator.zza(this, parcel, i);
    }

}
