// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.music.MusicProviderChooserActivity;

public final class eis
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;
    private final hzb d;

    private eis(hsr hsr1, hzb hzb1, hzb hzb2)
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
        } else
        {
            d = hzb2;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2)
    {
        return new eis(hsr1, hzb1, hzb2);
    }

    private void a(MusicProviderChooserActivity musicproviderchooseractivity)
    {
        if (musicproviderchooseractivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(musicproviderchooseractivity);
            musicproviderchooseractivity.h = (chp)c.a();
            musicproviderchooseractivity.i = (gmg)d.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((MusicProviderChooserActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!eis.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
