// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.music.MusicProviderOfferFragment;

public final class eiy
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;
    private final hzb d;
    private final hzb e;

    private eiy(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3)
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
        } else
        {
            e = hzb3;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        return new eiy(hsr1, hzb1, hzb2, hzb3);
    }

    private void a(MusicProviderOfferFragment musicproviderofferfragment)
    {
        if (musicproviderofferfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(musicproviderofferfragment);
            musicproviderofferfragment.c = (cev)c.a();
            musicproviderofferfragment.d = (hkr)d.a();
            musicproviderofferfragment.e = (dkv)e.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((MusicProviderOfferFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!eiy.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
