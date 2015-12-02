// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.app.ActionBar;
import com.ubercab.core.support.v7.app.CoreActionBarActivity;

public final class cqg
{

    private final CoreActionBarActivity a;

    public cqg(CoreActionBarActivity coreactionbaractivity)
    {
        a = coreactionbaractivity;
    }

    public final void a()
    {
        a(coe.ub__partner_funnel_empty);
        a.b().a(true);
        a.b().a();
    }

    public final void a(int i)
    {
        a(a.getString(i));
    }

    public final void a(String s)
    {
        a.b().a(s.toUpperCase());
        b();
    }

    public final void a(boolean flag)
    {
        a.b().b(flag);
    }

    public final void b()
    {
        a.b().a();
    }
}
