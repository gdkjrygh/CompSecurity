// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.ApiResponse;
import com.ubercab.client.core.model.Ping;
import java.util.Map;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dlg extends dlj
{

    private String a;
    private String b;
    private String c;

    public dlg(Ping ping, Response response)
    {
        super(ping, response);
        ping = ping.getApiResponse().getData();
        if (ping != null && ping.get("error_obj") != null)
        {
            ping = (Map)ping.get("error_obj");
            if (ping.containsKey("confirmation_message") && ping.containsKey("confirmation_confirm_copy") && ping.containsKey("confirmation_cancel_copy"))
            {
                a = (String)ping.get("confirmation_message");
                b = (String)ping.get("confirmation_confirm_copy");
                c = (String)ping.get("confirmation_cancel_copy");
            }
        }
    }

    public dlg(RetrofitError retrofiterror)
    {
        super(retrofiterror);
    }

    public final boolean a()
    {
        return a != null;
    }

    public final String b()
    {
        return a;
    }

    public final String c()
    {
        return b;
    }

    public final String d()
    {
        return c;
    }
}
