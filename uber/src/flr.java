// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.signup.SignupActivity;
import com.ubercab.rider.realtime.response.BootstrapRider;

public final class flr
    implements ide
{

    final SignupActivity a;
    private final boolean b;

    public flr(SignupActivity signupactivity, boolean flag)
    {
        a = signupactivity;
        super();
        b = flag;
    }

    private void a(BootstrapRider bootstraprider)
    {
        if (bootstraprider.getClient() != null)
        {
            a.j.c(new fnc());
            if (b)
            {
                SignupActivity.a(a);
            }
            return;
        } else
        {
            a.u();
            return;
        }
    }

    public final void call(Object obj)
    {
        a((BootstrapRider)obj);
    }
}
