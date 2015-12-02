// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.ubercab.client.core.network.PasswordResetApi;
import com.ubercab.client.feature.passwordreset.PasswordResetActivity;

public final class emq
{

    private final PasswordResetActivity a;

    public emq(PasswordResetActivity passwordresetactivity)
    {
        a = passwordresetactivity;
    }

    protected static PasswordResetApi a(grs grs1)
    {
        return (PasswordResetApi)grs1.a(com/ubercab/client/core/network/PasswordResetApi);
    }

    protected static dkf a(Application application, cyy cyy, PasswordResetApi passwordresetapi, dak dak, dao dao, gju gju, chp chp)
    {
        return new dkf(application, cyy, passwordresetapi, dak, dao, gju, chp);
    }

    protected static emu a()
    {
        return new emu();
    }
}
