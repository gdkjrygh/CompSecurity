// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            hi

public class hf
    implements SafeParcelable
{

    public static final hi CREATOR = new hi();
    private final long CN;
    private final String Ch;
    private final int Ci;
    private final short Ck;
    private final double Cl;
    private final double Cm;
    private final float Cn;
    private final int Co;
    private final int Cp;
    private final int jE;

    public hf(int j, String s, int k, short word0, double d, double d1, float f, long l, int i1, int j1)
    {
        aA(s);
        b(f);
        a(d, d1);
        k = cp(k);
        jE = j;
        Ck = word0;
        Ch = s;
        Cl = d;
        Cm = d1;
        Cn = f;
        CN = l;
        Ci = k;
        Co = i1;
        Cp = j1;
    }

    public hf(String s, int j, short word0, double d, double d1, 
            float f, long l, int k, int i1)
    {
        this(1, s, j, word0, d, d1, f, l, k, i1);
    }

    private static void a(double d, double d1)
    {
        if (d > 90D || d < -90D)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid latitude: ")).append(d).toString());
        }
        if (d1 > 180D || d1 < -180D)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid longitude: ")).append(d1).toString());
        } else
        {
            return;
        }
    }

    private static void aA(String s)
    {
        if (s == null || s.length() > 100)
        {
            throw new IllegalArgumentException((new StringBuilder("requestId is null or too long: ")).append(s).toString());
        } else
        {
            return;
        }
    }

    private static void b(float f)
    {
        if (f <= 0.0F)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid radius: ")).append(f).toString());
        } else
        {
            return;
        }
    }

    private static int cp(int j)
    {
        int k = j & 7;
        if (k == 0)
        {
            throw new IllegalArgumentException((new StringBuilder("No supported transition specified: ")).append(j).toString());
        } else
        {
            return k;
        }
    }

    private static String cq(int j)
    {
        switch (j)
        {
        default:
            return null;

        case 1: // '\001'
            return "CIRCLE";
        }
    }

    public static hf i(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = CREATOR;
        abyte0 = hi.a(parcel);
        parcel.recycle();
        return abyte0;
    }

    public short dG()
    {
        return Ck;
    }

    public float dH()
    {
        return Cn;
    }

    public int dI()
    {
        return Ci;
    }

    public int dJ()
    {
        return Cp;
    }

    public int describeContents()
    {
        hi hi1 = CREATOR;
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
            if (!(obj instanceof hf))
            {
                return false;
            }
            obj = (hf)obj;
            if (Cn != ((hf) (obj)).Cn)
            {
                return false;
            }
            if (Cl != ((hf) (obj)).Cl)
            {
                return false;
            }
            if (Cm != ((hf) (obj)).Cm)
            {
                return false;
            }
            if (Ck != ((hf) (obj)).Ck)
            {
                return false;
            }
        }
        return true;
    }

    public long getExpirationTime()
    {
        return CN;
    }

    public double getLatitude()
    {
        return Cl;
    }

    public double getLongitude()
    {
        return Cm;
    }

    public int getNotificationResponsiveness()
    {
        return Co;
    }

    public String getRequestId()
    {
        return Ch;
    }

    public int getVersionCode()
    {
        return jE;
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(Cl);
        int j = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(Cm);
        return ((((j + 31) * 31 + (int)(l ^ l >>> 32)) * 31 + Float.floatToIntBits(Cn)) * 31 + Ck) * 31 + Ci;
    }

    public String toString()
    {
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] {
            cq(Ck), Ch, Integer.valueOf(Ci), Double.valueOf(Cl), Double.valueOf(Cm), Float.valueOf(Cn), Integer.valueOf(Co / 1000), Integer.valueOf(Cp), Long.valueOf(CN)
        });
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        hi hi1 = CREATOR;
        hi.a(this, parcel);
    }

}
