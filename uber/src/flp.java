// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.signup.PromoBarFragment;
import com.ubercab.rider.realtime.response.UserPromotion;

public final class flp extends ick
{

    final PromoBarFragment a;

    private flp(PromoBarFragment promobarfragment)
    {
        a = promobarfragment;
        super();
    }

    public flp(PromoBarFragment promobarfragment, byte byte0)
    {
        this(promobarfragment);
    }

    private void a(UserPromotion userpromotion)
    {
        PromoBarFragment.a(a, com.ubercab.client.feature.signup.SignupData.PromoCode.a(PromoBarFragment.b(a), userpromotion));
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((UserPromotion)obj);
    }

    public final void a(Throwable throwable)
    {
        PromoBarFragment.a(a);
    }
}
