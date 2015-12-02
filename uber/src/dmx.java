// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import retrofit.RetrofitError;
import retrofit.client.Response;

public abstract class dmx
{

    private Object a;
    private Response b;
    private RetrofitError c;

    public dmx(Object obj, Response response)
    {
        a = obj;
        b = response;
    }

    public dmx(RetrofitError retrofiterror)
    {
        c = retrofiterror;
    }

    public final Object g()
    {
        return a;
    }

    public final Response h()
    {
        return b;
    }

    public boolean i()
    {
        return c == null;
    }

    public final Exception j()
    {
        return c;
    }

    public final boolean k()
    {
        return c != null;
    }

    public final String l()
    {
        if (c != null)
        {
            return c.getMessage();
        } else
        {
            return "";
        }
    }

    public final String m()
    {
        if (c != null)
        {
            return c.getUrl();
        }
        if (b != null)
        {
            return b.getUrl();
        } else
        {
            return null;
        }
    }

    public final int n()
    {
        if (c != null && c.getResponse() != null)
        {
            return c.getResponse().getStatus();
        }
        if (b != null)
        {
            return b.getStatus();
        } else
        {
            return 0;
        }
    }
}
