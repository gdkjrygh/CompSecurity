// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.mobileapptracker.MobileAppTracker;

public final class elu
    implements cos
{

    private MobileAppTracker a;

    public elu(MobileAppTracker mobileapptracker)
    {
        a = mobileapptracker;
    }

    public final void a(String s)
    {
        a.measureAction(s);
    }

    public final void b(String s)
    {
        a.setUserId(s);
    }
}
