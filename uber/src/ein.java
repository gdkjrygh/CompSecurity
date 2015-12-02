// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.music.MusicProviderAuthorizationActivity;

public final class ein
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;

    private ein(hsr hsr1, hzb hzb1)
    {
        if (!a && hsr1 == null)
        {
            throw new AssertionError();
        }
        b = hsr1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1)
    {
        return new ein(hsr1, hzb1);
    }

    private void a(MusicProviderAuthorizationActivity musicproviderauthorizationactivity)
    {
        if (musicproviderauthorizationactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(musicproviderauthorizationactivity);
            musicproviderauthorizationactivity.h = (chp)c.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((MusicProviderAuthorizationActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!ein.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
