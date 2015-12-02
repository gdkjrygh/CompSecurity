// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


class dh extends Number
    implements Comparable
{

    private double atZ;
    private long aua;
    private boolean aub;

    private dh(double d)
    {
        atZ = d;
        aub = false;
    }

    private dh(long l)
    {
        aua = l;
        aub = true;
    }

    public static dh a(Double double1)
    {
        return new dh(double1.doubleValue());
    }

    public static dh cY(String s)
    {
        dh dh1;
        try
        {
            dh1 = new dh(Long.parseLong(s));
        }
        catch (NumberFormatException numberformatexception)
        {
            dh dh2;
            try
            {
                dh2 = new dh(Double.parseDouble(s));
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw new NumberFormatException((new StringBuilder()).append(s).append(" is not a valid TypedNumber").toString());
            }
            return dh2;
        }
        return dh1;
    }

    public static dh z(long l)
    {
        return new dh(l);
    }

    public int a(dh dh1)
    {
        boolean flag = qR();
        if (flag)
        {
            try
            {
                if (dh1.qR())
                {
                    return (new Long(aua)).compareTo(Long.valueOf(dh1.aua));
                }
            }
            // Misplaced declaration of an exception variable
            catch (dh dh1)
            {
                throw dh1;
            }
        }
        break MISSING_BLOCK_LABEL_44;
        dh1;
        throw dh1;
        return Double.compare(doubleValue(), dh1.doubleValue());
    }

    public byte byteValue()
    {
        return (byte)(int)longValue();
    }

    public int compareTo(Object obj)
    {
        return a((dh)obj);
    }

    public double doubleValue()
    {
label0:
        {
            long l;
            try
            {
                if (!qR())
                {
                    break label0;
                }
                l = aua;
            }
            catch (NumberFormatException numberformatexception)
            {
                throw numberformatexception;
            }
            return (double)l;
        }
        return atZ;
    }

    public boolean equals(Object obj)
    {
        boolean flag;
        try
        {
            flag = obj instanceof dh;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        if (a((dh)obj) == 0)
        {
            return true;
        }
        return false;
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
        return qT();
    }

    public long longValue()
    {
        return qS();
    }

    public boolean qQ()
    {
        boolean flag;
        try
        {
            flag = qR();
        }
        catch (NumberFormatException numberformatexception)
        {
            throw numberformatexception;
        }
        return !flag;
    }

    public boolean qR()
    {
        return aub;
    }

    public long qS()
    {
label0:
        {
            long l;
            try
            {
                if (!qR())
                {
                    break label0;
                }
                l = aua;
            }
            catch (NumberFormatException numberformatexception)
            {
                throw numberformatexception;
            }
            return l;
        }
        return (long)atZ;
    }

    public int qT()
    {
        return (int)longValue();
    }

    public short qU()
    {
        return (short)(int)longValue();
    }

    public short shortValue()
    {
        return qU();
    }

    public String toString()
    {
label0:
        {
            String s;
            try
            {
                if (!qR())
                {
                    break label0;
                }
                s = Long.toString(aua);
            }
            catch (NumberFormatException numberformatexception)
            {
                throw numberformatexception;
            }
            return s;
        }
        return Double.toString(atZ);
    }
}
