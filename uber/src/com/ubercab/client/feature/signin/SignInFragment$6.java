// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signin;

import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.NetworkError;
import com.ubercab.realtime.error.RealtimeError;
import com.ubercab.rider.realtime.response.LoginResponse;
import fjw;
import ick;

// Referenced classes of package com.ubercab.client.feature.signin:
//            SignInFragment

final class a extends ick
{

    final SignInFragment a;

    private void a(LoginResponse loginresponse)
    {
        SignInFragment.b(a, "email");
        SignInFragment.d(a).a(loginresponse, SignInFragment.c(a));
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((LoginResponse)obj);
    }

    public final void a(Throwable throwable)
    {
        Object obj;
        Error error;
        obj = null;
        error = (Error)throwable;
        if (error.getNetworkError() == null) goto _L2; else goto _L1
_L1:
        throwable = error.getNetworkError().getMessage();
_L4:
        SignInFragment.a(a, throwable);
        return;
_L2:
        if (error.getRealtimeError() != null)
        {
            throwable = error.getRealtimeError().getMessage();
        } else
        {
            throwable = obj;
            if (error.getUnknownError() != null)
            {
                throwable = error.getUnknownError().getMessage();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    (SignInFragment signinfragment)
    {
        a = signinfragment;
        super();
    }
}
