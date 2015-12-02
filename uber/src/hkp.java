// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.client.UsersApi;
import com.ubercab.rider.realtime.request.body.ApplyClientPromotionsBody;
import com.ubercab.rider.realtime.request.body.AuthenticateThirdPartyBody;
import com.ubercab.rider.realtime.request.body.LoginBody;
import com.ubercab.rider.realtime.request.body.TagUserBody;
import com.ubercab.rider.realtime.request.body.ThirdPartyCredentials;
import com.ubercab.rider.realtime.request.body.ThirdPartyIdentitiesBody;
import com.ubercab.rider.realtime.request.body.ValidatePromotionBody;
import com.ubercab.rider.realtime.request.param.DeviceData;

public final class hkp
{

    private final hjo a;

    private hkp(hjo hjo1)
    {
        a = hjo1;
    }

    public static hkp a(hjo hjo1)
    {
        return new hkp(hjo1);
    }

    private ica a(AuthenticateThirdPartyBody authenticatethirdpartybody)
    {
        return a.a().a().a(com/ubercab/rider/realtime/client/UsersApi).a(new _cls2(authenticatethirdpartybody)).b().a();
    }

    public final ica a(String s)
    {
        return a.a().a().a(com/ubercab/rider/realtime/client/UsersApi).a(new _cls4(s)).b().a(new _cls3());
    }

    public final ica a(String s, String s1)
    {
        return a(AuthenticateThirdPartyBody.createGoogleAuthBody(ThirdPartyCredentials.create("google"), s, s1));
    }

    public final ica a(String s, String s1, DeviceData devicedata)
    {
        s = LoginBody.create().setUsername(s).setPassword(s1).setDeviceData(devicedata);
        return a.a().a().a(com/ubercab/rider/realtime/client/UsersApi).a(new _cls5(s)).a();
    }

    public final ica a(String s, boolean flag)
    {
        s = ApplyClientPromotionsBody.create(s, flag);
        return a.a().a().a(com/ubercab/rider/realtime/client/UsersApi).a(new _cls1(s)).a();
    }

    public final ica b(String s)
    {
        s = TagUserBody.create(s);
        return a.a().a().a(com/ubercab/rider/realtime/client/UsersApi).a(new _cls6(s)).a();
    }

    public final ica b(String s, String s1)
    {
        return a(AuthenticateThirdPartyBody.create(ThirdPartyCredentials.create(s).setAccessToken(s1).setRedirectUri(null)));
    }

    public final ica c(String s)
    {
        s = ValidatePromotionBody.create(s, false);
        return a.a().a().a(com/ubercab/rider/realtime/client/UsersApi).a(new _cls9(s)).a();
    }

    public final ica c(String s, String s1)
    {
        s = ThirdPartyIdentitiesBody.create(s).setEpoch(null).setAccessTokenCode(s1).setRedirectUri(null).setRefreshToken(null);
        return a.a().a().a(com/ubercab/rider/realtime/client/UsersApi).a(new _cls8(s)).b().a(new _cls7());
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls9 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls7 {}

}
