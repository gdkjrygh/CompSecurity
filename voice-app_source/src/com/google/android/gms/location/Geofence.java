// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.location.internal.ParcelableGeofence;

public interface Geofence
{
    public static final class Builder
    {

        private String zzDK;
        private short zzaxA;
        private double zzaxB;
        private double zzaxC;
        private float zzaxD;
        private int zzaxE;
        private int zzaxF;
        private int zzaxy;
        private long zzaxz;

        public Geofence build()
        {
            if (zzDK == null)
            {
                throw new IllegalArgumentException("Request ID not set.");
            }
            if (zzaxy == 0)
            {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((zzaxy & 4) != 0 && zzaxF < 0)
            {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            }
            if (zzaxz == 0x8000000000000000L)
            {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (zzaxA == -1)
            {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            if (zzaxE < 0)
            {
                throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
            } else
            {
                return new ParcelableGeofence(zzDK, zzaxy, (short)1, zzaxB, zzaxC, zzaxD, zzaxz, zzaxE, zzaxF);
            }
        }

        public Builder setCircularRegion(double d, double d1, float f)
        {
            zzaxA = 1;
            zzaxB = d;
            zzaxC = d1;
            zzaxD = f;
            return this;
        }

        public Builder setExpirationDuration(long l)
        {
            if (l < 0L)
            {
                zzaxz = -1L;
                return this;
            } else
            {
                zzaxz = SystemClock.elapsedRealtime() + l;
                return this;
            }
        }

        public Builder setLoiteringDelay(int i)
        {
            zzaxF = i;
            return this;
        }

        public Builder setNotificationResponsiveness(int i)
        {
            zzaxE = i;
            return this;
        }

        public Builder setRequestId(String s)
        {
            zzDK = s;
            return this;
        }

        public Builder setTransitionTypes(int i)
        {
            zzaxy = i;
            return this;
        }

        public Builder()
        {
            zzDK = null;
            zzaxy = 0;
            zzaxz = 0x8000000000000000L;
            zzaxA = -1;
            zzaxE = 0;
            zzaxF = -1;
        }
    }


    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1L;

    public abstract String getRequestId();
}
