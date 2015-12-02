// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.core.model.ApiResponse;
import com.ubercab.client.core.model.Ping;
import retrofit.RetrofitError;
import retrofit.client.Response;

public abstract class dlj extends dlk
{

    public dlj(Ping ping, Response response)
    {
        super(ping, response);
    }

    public dlj(RetrofitError retrofiterror)
    {
        super(retrofiterror);
    }

    private boolean a()
    {
        return super.e();
    }

    private boolean b()
    {
        return g() != null && ((Ping)g()).getApiResponse() != null && ((Ping)g()).getApiResponse().isSuccess();
    }

    public final boolean e()
    {
        return a() && b();
    }

    public final String f()
    {
        if (g() != null && ((Ping)g()).getApiResponse() != null)
        {
            String s = ((Ping)g()).getApiResponse().getErrorMessage();
            if (!TextUtils.isEmpty(s))
            {
                return s;
            }
        }
        return super.f();
    }
}
