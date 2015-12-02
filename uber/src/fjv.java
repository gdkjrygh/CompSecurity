// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.signin.SignInFragment;
import com.ubercab.rider.realtime.response.ThirdParty;

public final class fjv
    implements icg
{

    final SignInFragment a;

    private fjv(SignInFragment signinfragment)
    {
        a = signinfragment;
        super();
    }

    public fjv(SignInFragment signinfragment, byte byte0)
    {
        this(signinfragment);
    }

    private void a(ThirdParty thirdparty)
    {
        SignInFragment.a(a, true, new fke(false, thirdparty.getUuid(), thirdparty.getToken()));
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((ThirdParty)obj);
    }

    public final void a(Throwable throwable)
    {
        SignInFragment.a(a, false, null);
    }
}
