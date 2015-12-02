// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.feature.signup.SignupGoogleActivity;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import com.ubercab.rider.realtime.response.ThirdParty;

public final class fme
    implements icg
{

    final SignupGoogleActivity a;

    private fme(SignupGoogleActivity signupgoogleactivity)
    {
        a = signupgoogleactivity;
        super();
    }

    public fme(SignupGoogleActivity signupgoogleactivity, byte byte0)
    {
        this(signupgoogleactivity);
    }

    private void a(ThirdParty thirdparty)
    {
        String s = thirdparty.getUuid();
        thirdparty = thirdparty.getToken();
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(thirdparty))
        {
            SignupGoogleActivity.a(a, s, thirdparty);
        }
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
        throwable = ((Error)throwable).getRealtimeError();
        if (throwable == null)
        {
            return;
        }
        if ("rtapi.users.third_party_oauth.invalid_username_or_password".equals(throwable.getCode()))
        {
            SignupGoogleActivity.c(a);
            return;
        } else
        {
            SignupGoogleActivity.c(a, throwable.getMessage());
            return;
        }
    }
}
