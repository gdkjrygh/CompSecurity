// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.mobileapptracker.MobileAppTracker;

final class ng.Object
    implements hst
{

    final fkp a;
    final fko b;

    private MobileAppTracker b()
    {
        MobileAppTracker mobileapptracker = fkp.a(a).S();
        if (mobileapptracker == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return mobileapptracker;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(fko fko1, fkp fkp1)
    {
        b = fko1;
        a = fkp1;
        super();
    }
}
