// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;
import retrofit.RetrofitError;
import retrofit.client.Response;

abstract class dmb extends dmx
{

    private Map a;

    dmb(Object obj, Response response)
    {
        super(obj, response);
    }

    dmb(RetrofitError retrofiterror)
    {
        super(retrofiterror);
        a = (Map)retrofiterror.getBodyAs((new bmj() {

            final dmb a;

            
            {
                a = dmb.this;
                super();
            }
        }).getType());
    }

    dmb(Response response)
    {
        super(null, response);
    }

    public String a()
    {
        if (a == null)
        {
            return null;
        } else
        {
            return (String)a.get("error");
        }
    }
}
