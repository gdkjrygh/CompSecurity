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
    private final int mVersionCode;
    private final String zzBm;
    private final int zzaBA;
    private final short zzaBC;
    private final double zzaBD;
    private final double zzaBE;
    private final float zzaBF;
    private final int zzaBG;
    private final int zzaBH;
    private final long zzaDd;

    public ParcelableGeofence(int i, String s, int j, short word0, double d, double d1, float f, long l, int k, int i1)
    {
        zzdy(s);
        zze(f);
        zza(d, d1);
        j = zzgT(j);
        mVersionCode = i;
        zzaBC = word0;
        zzBm = s;
        zzaBD = d;
        zzaBE = d1;
        zzaBF = f;
        zzaDd = l;
        zzaBA = j;
        zzaBG = k;
        zzaBH = i1;
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

    private static void zzdy(String s)
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

    private static int zzgT(int i)
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

    private static String zzgU(int i)
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
        abyte0 = CREATOR.zzey(parcel);
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
            if (zzaBF != ((ParcelableGeofence) (obj)).zzaBF)
            {
                return false;
            }
            if (zzaBD != ((ParcelableGeofence) (obj)).zzaBD)
            {
                return false;
            }
            if (zzaBE != ((ParcelableGeofence) (obj)).zzaBE)
            {
                return false;
            }
            if (zzaBC != ((ParcelableGeofence) (obj)).zzaBC)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return zzaDd;
    }

    public double getLatitude()
    {
        return zzaBD;
    }

    public double getLongitude()
    {
        return zzaBE;
    }

    public int getNotificationResponsiveness()
    {
        return zzaBG;
    }

    public String getRequestId()
    {
        return zzBm;
    }

    public int getVersionCode()
    {
        return mVersionCode;
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(zzaBD);
        int i = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(zzaBE);
        return ((((i + 31) * 31 + (int)(l ^ l >>> 32)) * 31 + Float.floatToIntBits(zzaBF)) * 31 + zzaBC) * 31 + zzaBA;
    }

    public String toString()
    {
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] {
            zzgU(zzaBC), zzBm, Integer.valueOf(zzaBA), Double.valueOf(zzaBD), Double.valueOf(zzaBE), Float.valueOf(zzaBF), Integer.valueOf(zzaBG / 1000), Integer.valueOf(zzaBH), Long.valueOf(zzaDd)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm zzm1 = CREATOR;
        zzm.zza(this, parcel, i);
    }

    public short zzvU()
    {
        return zzaBC;
    }

    public float zzvV()
    {
        return zzaBF;
    }

    public int zzvW()
    {
        return zzaBA;
    }

    public int zzvX()
    {
        return zzaBH;
    }

}
