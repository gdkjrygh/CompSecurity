// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public abstract class gtb
    implements Callback
{

    private final Activity a;

    public gtb(Activity activity)
    {
        a = activity;
    }

    public void a()
    {
    }

    public abstract void a(Object obj);

    public abstract void a(RetrofitError retrofiterror);

    public void failure(RetrofitError retrofiterror)
    {
        if (a.isFinishing())
        {
            return;
        } else
        {
            a();
            a(retrofiterror);
            return;
        }
    }

    public final void success(Object obj, Response response)
    {
        if (a.isFinishing())
        {
            return;
        } else
        {
            a();
            a(obj);
            return;
        }
    }
}
