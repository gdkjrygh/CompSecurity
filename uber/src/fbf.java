// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import com.ubercab.rider.realtime.response.UserPromotion;

final class fbf
    implements icg
{

    final fbd a;

    private fbf(fbd fbd1)
    {
        a = fbd1;
        super();
    }

    fbf(fbd fbd1, byte byte0)
    {
        this(fbd1);
    }

    private void a(UserPromotion userpromotion)
    {
        userpromotion = com.ubercab.client.feature.signup.SignupData.PromoCode.a(a.i(), userpromotion);
        fbd.a(a, userpromotion);
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
        throwable = (Error)throwable;
        if (throwable.getRealtimeError() != null)
        {
            fbd.a(a, throwable.getRealtimeError().getMessage());
            return;
        } else
        {
            fbd.a(a);
            return;
        }
    }
}
