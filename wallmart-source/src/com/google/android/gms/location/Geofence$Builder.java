// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.location.internal.ParcelableGeofence;

// Referenced classes of package com.google.android.gms.location:
//            Geofence

public static final class zzaBH
{

    private String zzBm;
    private int zzaBA;
    private long zzaBB;
    private short zzaBC;
    private double zzaBD;
    private double zzaBE;
    private float zzaBF;
    private int zzaBG;
    private int zzaBH;

    public Geofence build()
    {
        if (zzBm == null)
        {
            throw new IllegalArgumentException("Request ID not set.");
        }
        if (zzaBA == 0)
        {
            throw new IllegalArgumentException("Transitions types not set.");
        }
        if ((zzaBA & 4) != 0 && zzaBH < 0)
        {
            throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
        }
        if (zzaBB == 0x8000000000000000L)
        {
            throw new IllegalArgumentException("Expiration not set.");
        }
        if (zzaBC == -1)
        {
            throw new IllegalArgumentException("Geofence region not set.");
        }
        if (zzaBG < 0)
        {
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        } else
        {
            return new ParcelableGeofence(zzBm, zzaBA, (short)1, zzaBD, zzaBE, zzaBF, zzaBB, zzaBG, zzaBH);
        }
    }

    public zzaBH setCircularRegion(double d, double d1, float f)
    {
        zzaBC = 1;
        zzaBD = d;
        zzaBE = d1;
        zzaBF = f;
        return this;
    }

    public zzaBF setExpirationDuration(long l)
    {
        if (l < 0L)
        {
            zzaBB = -1L;
            return this;
        } else
        {
            zzaBB = SystemClock.elapsedRealtime() + l;
            return this;
        }
    }

    public zzaBB setLoiteringDelay(int i)
    {
        zzaBH = i;
        return this;
    }

    public zzaBH setNotificationResponsiveness(int i)
    {
        zzaBG = i;
        return this;
    }

    public zzaBG setRequestId(String s)
    {
        zzBm = s;
        return this;
    }

    public zzBm setTransitionTypes(int i)
    {
        zzaBA = i;
        return this;
    }

    public leGeofence()
    {
        zzBm = null;
        zzaBA = 0;
        zzaBB = 0x8000000000000000L;
        zzaBC = -1;
        zzaBG = 0;
        zzaBH = -1;
    }
}
