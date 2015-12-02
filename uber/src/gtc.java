// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public abstract class gtc
    implements Callback
{

    private final Activity a;
    private final Class b;

    public gtc(Activity activity, Class class1)
    {
        a = activity;
        b = (Class)gjz.a(class1);
    }

    public gtc(Class class1)
    {
        this(null, class1);
    }

    private Object b(RetrofitError retrofiterror)
    {
        try
        {
            retrofiterror = ((RetrofitError) (retrofiterror.getBodyAs(b)));
        }
        // Misplaced declaration of an exception variable
        catch (RetrofitError retrofiterror)
        {
            return null;
        }
        return retrofiterror;
    }

    public void a(Exception exception)
    {
        if (a != null)
        {
            cwm.a(a, gsg.ub__payment_unexpected_error);
        }
    }

    public abstract void a(Object obj);

    public void a(RetrofitError retrofiterror)
    {
        if (a != null)
        {
            cwm.a(a, gsg.ub__payment_network_error);
        }
    }

    public void a(boolean flag)
    {
    }

    public abstract void b(Object obj);

    public final void failure(RetrofitError retrofiterror)
    {
        if (a != null && a.isFinishing())
        {
            return;
        }
        a(false);
        _cls1.a[retrofiterror.getKind().ordinal()];
        JVM INSTR tableswitch 1 2: default 56
    //                   1 62
    //                   2 100;
           goto _L1 _L2 _L3
_L1:
        int i;
        a(retrofiterror);
        return;
_L2:
        Object obj;
        if ((i = retrofiterror.getResponse().getStatus()) >= 400 && i <= 499 && (obj = b(retrofiterror)) != null)
        {
            b(obj);
            return;
        }
          goto _L1
_L3:
        a(retrofiterror);
        return;
    }

    public final void success(Object obj, Response response)
    {
        if (a != null && a.isFinishing())
        {
            return;
        } else
        {
            a(true);
            a(obj);
            return;
        }
    }

    /* member class not found */
    class _cls1 {}

}
