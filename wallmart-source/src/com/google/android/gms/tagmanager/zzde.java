// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


class zzde extends Number
    implements Comparable
{

    private double zzaSK;
    private long zzaSL;
    private boolean zzaSM;

    private zzde(double d)
    {
        zzaSK = d;
        zzaSM = false;
    }

    private zzde(long l)
    {
        zzaSL = l;
        zzaSM = true;
    }

    public static zzde zzT(long l)
    {
        return new zzde(l);
    }

    public static zzde zza(Double double1)
    {
        return new zzde(double1.doubleValue());
    }

    public static zzde zzeX(String s)
        throws NumberFormatException
    {
        zzde zzde1;
        try
        {
            zzde1 = new zzde(Long.parseLong(s));
        }
        catch (NumberFormatException numberformatexception)
        {
            zzde zzde2;
            try
            {
                zzde2 = new zzde(Double.parseDouble(s));
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw new NumberFormatException((new StringBuilder()).append(s).append(" is not a valid TypedNumber").toString());
            }
            return zzde2;
        }
        return zzde1;
    }

    public byte byteValue()
    {
        return (byte)(int)longValue();
    }

    public int compareTo(Object obj)
    {
        return zza((zzde)obj);
    }

    public double doubleValue()
    {
        if (zzAW())
        {
            return (double)zzaSL;
        } else
        {
            return zzaSK;
        }
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof zzde) && zza((zzde)obj) == 0;
    }

    public float floatValue()
    {
        return (float)doubleValue();
    }

    public int hashCode()
    {
        return (new Long(longValue())).hashCode();
    }

    public int intValue()
    {
        return zzAY();
    }

    public long longValue()
    {
        return zzAX();
    }

    public short shortValue()
    {
        return zzAZ();
    }

    public String toString()
    {
        if (zzAW())
        {
            return Long.toString(zzaSL);
        } else
        {
            return Double.toString(zzaSK);
        }
    }

    public boolean zzAV()
    {
        return !zzAW();
    }

    public boolean zzAW()
    {
        return zzaSM;
    }

    public long zzAX()
    {
        if (zzAW())
        {
            return zzaSL;
        } else
        {
            return (long)zzaSK;
        }
    }

    public int zzAY()
    {
        return (int)longValue();
    }

    public short zzAZ()
    {
        return (short)(int)longValue();
    }

    public int zza(zzde zzde1)
    {
        if (zzAW() && zzde1.zzAW())
        {
            return (new Long(zzaSL)).compareTo(Long.valueOf(zzde1.zzaSL));
        } else
        {
            return Double.compare(doubleValue(), zzde1.doubleValue());
        }
    }
}
