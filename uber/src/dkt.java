// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

final class dkt
    implements Callback
{

    final dkr a;

    dkt(dkr dkr1)
    {
        a = dkr1;
        super();
    }

    private void a(Map map, Response response)
    {
        dkr.a(a).c(new dnv(map, response));
    }

    public final void failure(RetrofitError retrofiterror)
    {
        dkr.a(a).c(new dnv(retrofiterror));
    }

    public final void success(Object obj, Response response)
    {
        a((Map)obj, response);
    }
}
