// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dnv extends dmx
{

    private final Map a;
    private final Map b;
    private boolean c;

    public dnv(Map map, Response response)
    {
        boolean flag1 = false;
        super(map, response);
        int j;
        boolean flag;
        if (h() != null)
        {
            j = h().getStatus();
        } else
        {
            j = 0;
        }
        flag = flag1;
        if (super.i())
        {
            flag = flag1;
            if (j != 400)
            {
                flag = flag1;
                if (j != 401)
                {
                    flag = flag1;
                    if (j != 406)
                    {
                        flag = true;
                    }
                }
            }
        }
        c = flag;
        if (c)
        {
            response = map;
        } else
        {
            response = new HashMap();
        }
        a = response;
        if (c)
        {
            map = new HashMap();
        }
        b = map;
    }

    public dnv(RetrofitError retrofiterror)
    {
        super(retrofiterror);
        a = new HashMap();
        if (retrofiterror.getResponse() == null || retrofiterror.getResponse().getStatus() >= 500) goto _L2; else goto _L1
_L1:
        Map map = (Map)retrofiterror.getBodyAs((new bmj() {

            final dnv a;

            
            {
                a = dnv.this;
                super();
            }
        }).getType());
        retrofiterror = map;
_L4:
        b = retrofiterror;
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        if (retrofiterror.getResponse() == null)
        {
            retrofiterror = "null";
        } else
        {
            retrofiterror = String.valueOf(retrofiterror.getResponse().getStatus());
        }
        ijg.d(runtimeexception, "Can't parse network error in signup validate response. Status: %s", new Object[] {
            retrofiterror
        });
_L2:
        retrofiterror = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Map a()
    {
        return b;
    }

    public final Map b()
    {
        return a;
    }

    public final boolean i()
    {
        return c;
    }
}
