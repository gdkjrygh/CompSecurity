// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import retrofit.RetrofitError;
import retrofit.client.Response;

public abstract class dlk
{

    private gqj a;
    private Response b;
    private RetrofitError c;

    public dlk(gqj gqj1, Response response)
    {
        a = gqj1;
        b = response;
    }

    public dlk(RetrofitError retrofiterror)
    {
        c = retrofiterror;
    }

    public final String a(Context context)
    {
        String s = f();
        if (!TextUtils.isEmpty(s))
        {
            return s;
        } else
        {
            return context.getString(0x7f070631);
        }
    }

    public boolean e()
    {
        return c == null && a != null && "OK".equals(a.getMessageType());
    }

    public String f()
    {
        if (c != null)
        {
            return c.getMessage();
        }
        if (a != null && "Error".equals(a.getMessageType()))
        {
            return a.getDescription();
        } else
        {
            return null;
        }
    }

    public final gqj g()
    {
        return a;
    }

    public final Exception h()
    {
        return c;
    }

    public final boolean i()
    {
        return c != null;
    }

    public final int j()
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
