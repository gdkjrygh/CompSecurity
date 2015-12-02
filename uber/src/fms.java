// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.signup.SignupPromoFragment;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import com.ubercab.rider.realtime.response.UserPromotion;
import com.ubercab.ui.EditText;

public final class fms
    implements icg
{

    final SignupPromoFragment a;

    private fms(SignupPromoFragment signuppromofragment)
    {
        a = signuppromofragment;
        super();
    }

    public fms(SignupPromoFragment signuppromofragment, byte byte0)
    {
        this(signuppromofragment);
    }

    private void a(UserPromotion userpromotion)
    {
        userpromotion = com.ubercab.client.feature.signup.SignupData.PromoCode.a(a.mEditTextPromo.getText().toString(), userpromotion);
        SignupPromoFragment.a(a, userpromotion);
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
            SignupPromoFragment.a(a, throwable.getRealtimeError().getMessage());
            return;
        } else
        {
            SignupPromoFragment.a(a);
            return;
        }
    }
}
