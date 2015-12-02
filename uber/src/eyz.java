// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import com.ubercab.rider.realtime.response.ProfilesResponse;

final class eyz
    implements icg
{

    final eyy a;

    private eyz(eyy eyy1)
    {
        a = eyy1;
        super();
    }

    eyz(eyy eyy1, byte byte0)
    {
        this(eyy1);
    }

    private void a(ProfilesResponse profilesresponse)
    {
        eyy.a(a, profilesresponse.getProfiles());
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((ProfilesResponse)obj);
    }

    public final void a(Throwable throwable)
    {
        throwable = ((Error)throwable).getRealtimeError();
        if (throwable != null)
        {
            throwable = throwable.getMessage();
        } else
        {
            throwable = null;
        }
        eyy.a(a).c(new ezo(throwable));
    }
}
