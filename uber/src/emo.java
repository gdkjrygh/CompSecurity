// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.passwordreset.PasswordResetAccountInputFragment;

public final class emo
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;
    private final hzb d;
    private final hzb e;
    private final hzb f;

    private emo(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4)
    {
        if (!a && hsr1 == null)
        {
            throw new AssertionError();
        }
        b = hsr1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        }
        d = hzb2;
        if (!a && hzb3 == null)
        {
            throw new AssertionError();
        }
        e = hzb3;
        if (!a && hzb4 == null)
        {
            throw new AssertionError();
        } else
        {
            f = hzb4;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4)
    {
        return new emo(hsr1, hzb1, hzb2, hzb3, hzb4);
    }

    private void a(PasswordResetAccountInputFragment passwordresetaccountinputfragment)
    {
        if (passwordresetaccountinputfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(passwordresetaccountinputfragment);
            passwordresetaccountinputfragment.c = (chp)c.a();
            passwordresetaccountinputfragment.d = (dce)d.a();
            passwordresetaccountinputfragment.e = (dkf)e.a();
            passwordresetaccountinputfragment.f = (emu)f.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((PasswordResetAccountInputFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!emo.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
