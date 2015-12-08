// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.params;

import java.util.Set;

// Referenced classes of package ch.boye.httpclientandroidlib.params:
//            HttpParams, HttpParamsNames

public abstract class AbstractHttpParams
    implements HttpParams, HttpParamsNames
{

    protected AbstractHttpParams()
    {
    }

    public boolean getBooleanParameter(String s, boolean flag)
    {
        s = ((String) (getParameter(s)));
        if (s == null)
        {
            return flag;
        } else
        {
            return ((Boolean)s).booleanValue();
        }
    }

    public double getDoubleParameter(String s, double d)
    {
        s = ((String) (getParameter(s)));
        if (s == null)
        {
            return d;
        } else
        {
            return ((Double)s).doubleValue();
        }
    }

    public int getIntParameter(String s, int i)
    {
        s = ((String) (getParameter(s)));
        if (s == null)
        {
            return i;
        } else
        {
            return ((Integer)s).intValue();
        }
    }

    public long getLongParameter(String s, long l)
    {
        s = ((String) (getParameter(s)));
        if (s == null)
        {
            return l;
        } else
        {
            return ((Long)s).longValue();
        }
    }

    public Set getNames()
    {
        throw new UnsupportedOperationException();
    }

    public boolean isParameterFalse(String s)
    {
        boolean flag = false;
        if (!getBooleanParameter(s, false))
        {
            flag = true;
        }
        return flag;
    }

    public boolean isParameterTrue(String s)
    {
        return getBooleanParameter(s, false);
    }

    public HttpParams setBooleanParameter(String s, boolean flag)
    {
        Boolean boolean1;
        if (flag)
        {
            boolean1 = Boolean.TRUE;
        } else
        {
            boolean1 = Boolean.FALSE;
        }
        setParameter(s, boolean1);
        return this;
    }

    public HttpParams setDoubleParameter(String s, double d)
    {
        setParameter(s, new Double(d));
        return this;
    }

    public HttpParams setIntParameter(String s, int i)
    {
        setParameter(s, new Integer(i));
        return this;
    }

    public HttpParams setLongParameter(String s, long l)
    {
        setParameter(s, new Long(l));
        return this;
    }
}
