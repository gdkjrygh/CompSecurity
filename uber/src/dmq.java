// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.Ping;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dmq extends dlk
{

    public dmq(Ping ping, Response response)
    {
        super(ping, response);
    }

    public dmq(RetrofitError retrofiterror)
    {
        super(retrofiterror);
    }

    public final boolean a()
    {
        return g() != null && "error_verify_payment".equals(((Ping)g()).getErrorKey());
    }

    public final boolean b()
    {
        return g() != null && "error_force_cardio".equals(((Ping)g()).getErrorKey());
    }
}
