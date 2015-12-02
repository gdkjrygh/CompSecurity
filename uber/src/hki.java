// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.client.NotifierApi;
import com.ubercab.rider.realtime.request.body.DeviceTokensBody;

public final class hki
{

    private final hjo a;

    private hki(hjo hjo1)
    {
        a = hjo1;
    }

    public static hki a(hjo hjo1)
    {
        return new hki(hjo1);
    }

    public final ica a(String s)
    {
        return a.a().a().a(com/ubercab/rider/realtime/client/NotifierApi).a(new _cls2(s)).a();
    }

    public final ica a(String s, String s1, String s2)
    {
        s = DeviceTokensBody.create().setCertificate(s).setDeviceTokenType(s1).setDeviceToken(s2);
        return a.a().a().a(com/ubercab/rider/realtime/client/NotifierApi).a(new _cls1(s)).a();
    }

    public final ica b(String s, String s1, String s2)
    {
        return a.a().a().a(com/ubercab/rider/realtime/client/NotifierApi).a(new _cls3(s, s1, s2)).a();
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls3 {}

}
