// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.signup.SignupData;
import com.ubercab.client.feature.signup.SignupFragment;
import com.ubercab.rider.realtime.response.ThirdParty;
import java.util.Map;

public final class fma
    implements icg
{

    final SignupFragment a;

    private fma(SignupFragment signupfragment)
    {
        a = signupfragment;
        super();
    }

    public fma(SignupFragment signupfragment, byte byte0)
    {
        this(signupfragment);
    }

    private void a(ThirdParty thirdparty)
    {
        Map map = thirdparty.getSignupAttributes();
        if (map != null && map.isEmpty())
        {
            a.e.c(new fke(false, thirdparty.getUuid(), thirdparty.getToken()));
            return;
        }
        if (map != null)
        {
            SignupFragment.e(a).e((String)map.get("firstName")).f((String)map.get("lastName")).a((String)map.get("email"));
        }
        b();
    }

    private void b()
    {
        a.e.c(new dny(SignupFragment.e(a)));
        a.e();
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
        b();
    }
}
