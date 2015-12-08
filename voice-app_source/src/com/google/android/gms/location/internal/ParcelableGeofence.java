// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzm

public class ParcelableGeofence
    implements SafeParcelable, Geofence
{

    public static final zzm CREATOR = new zzm();
    private final int zzCY;
    private final String zzDK;
    private final short zzaxA;
    private final double zzaxB;
    private final double zzaxC;
    private final float zzaxD;
    private final int zzaxE;
    private final int zzaxF;
    private final int zzaxy;
    private final long zzazj;

    public ParcelableGeofence(int i, String s, int j, short word0, double d, double d1, float f, long l, int k, int i1)
    {
        zzdn(s);
        zze(f);
        zza(d, d1);
        j = zzgG(j);
        zzCY = i;
        zzaxA = word0;
        zzDK = s;
        zzaxB = d;
        zzaxC = d1;
        zzaxD = f;
        zzazj = l;
        zzaxy = j;
        zzaxE = k;
        zzaxF = i1;
    }

    public ParcelableGeofence(String s, int i, short word0, double d, double d1, 
            float f, long l, int j, int k)
    {
        this(1, s, i, word0, d, d1, f, l, j, k);
    }

    private static void zza(double d, double d1)
    {
        if (d > 90D || d < -90D)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid latitude: ").append(d).toString());
        }
        if (d1 > 180D || d1 < -180D)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid longitude: ").append(d1).toString());
        } else
        {
            return;
        }
    }

    private static void zzdn(String s)
    {
        if (s == null || s.length() > 100)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("requestId is null or too long: ").append(s).toString());
        } else
        {
            return;
        }
    }

    private static void zze(float f)
    {
        if (f <= 0.0F)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid radius: ").append(f).toString());
        } else
        {
            return;
        }
    }

    private static int zzgG(int i)
    {
        int j = i & 7;
        if (j == 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No supported transition specified: ").append(i).toString());
        } else
        {
            return j;
        }
    }

    private static String zzgH(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return "CIRCLE";
        }
    }

    public static ParcelableGeofence zzn(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = CREATOR.zzem(parcel);
        parcel.recycle();
        return abyte0;
    }

    public int describeContents()
    {
        zzm zzm1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof ParcelableGeofence))
            {
                return false;
            }
            obj = (ParcelableGeofence)obj;
            if (zzaxD != ((ParcelableGeofence) (obj)).zzaxD)
            {
                return false;
            }
            if (zzaxB != ((ParcelableGeofence) (obj)).zzaxB)
            {
                return false;
            }
            if (zzaxC != ((ParcelableGeofence) (obj)).zzaxC)
            {
                return false;
            }
            if (zzaxA != ((ParcelableGeofence) (obj)).zzaxA)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return zzazj;
    }

    public double getLatitude()
    {
        return zzaxB;
    }

    public double getLongitude()
    {
        return zzaxC;
    }

    public int getNotificationResponsiveness()
    {
        return zzaxE;
    }

    public String getRequestId()
    {
        return zzDK;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(zzaxB);
        int i = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(zzaxC);
        return ((((i + 31) * 31 + (int)(l ^ l >>> 32)) * 31 + Float.floatToIntBits(zzaxD)) * 31 + zzaxA) * 31 + zzaxy;
    }

    public String toString()
    {
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] {
            zzgH(zzaxA), zzDK, Integer.valueOf(zzaxy), Double.valueOf(zzaxB), Double.valueOf(zzaxC), Float.valueOf(zzaxD), Integer.valueOf(zzaxE / 1000), Integer.valueOf(zzaxF), Long.valueOf(zzazj)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm zzm1 = CREATOR;
        zzm.zza(this, parcel, i);
    }

    public short zzuA()
    {
        return zzaxA;
    }

    public float zzuB()
    {
        return zzaxD;
    }

    public int zzuC()
    {
        return zzaxy;
    }

    public int zzuD()
    {
        return zzaxF;
    }

}
