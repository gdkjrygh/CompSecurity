// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.rider.realtime.request.param.UpdateProfile;

public final class eza
{

    final eyy a;
    private UpdateProfile b;

    private eza(eyy eyy1, Profile profile)
    {
        a = eyy1;
        super();
        b = UpdateProfile.create(profile);
    }

    eza(eyy eyy1, Profile profile, byte byte0)
    {
        this(eyy1, profile);
    }

    public final eza a(String s)
    {
        b.setDefaultPaymentProfileUuid(s);
        return this;
    }

    public final void a()
    {
        eyy.a(a, b);
    }

    public final eza b(String s)
    {
        b.setEmail(s);
        return this;
    }
}
