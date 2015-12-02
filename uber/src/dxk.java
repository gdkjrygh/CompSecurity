// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.about.AboutFragment;
import com.ubercab.rider.realtime.model.Client;

public final class dxk
    implements ide
{

    final AboutFragment a;

    private dxk(AboutFragment aboutfragment)
    {
        a = aboutfragment;
        super();
    }

    public dxk(AboutFragment aboutfragment, byte byte0)
    {
        this(aboutfragment);
    }

    private void a(Client client)
    {
        boolean flag;
        if (client.getIsAdmin() && AboutFragment.b(a) || a.e.f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (AboutFragment.c(a).isEmpty() || AboutFragment.d(a) != flag)
        {
            AboutFragment.a(a, flag);
            AboutFragment.e(a);
            AboutFragment.f(a);
        }
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
