// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.music.LinkMusicProviderFragment;
import com.ubercab.rider.realtime.model.Client;

public final class ehy
    implements icg
{

    final LinkMusicProviderFragment a;

    private ehy(LinkMusicProviderFragment linkmusicproviderfragment)
    {
        a = linkmusicproviderfragment;
        super();
    }

    public ehy(LinkMusicProviderFragment linkmusicproviderfragment, byte byte0)
    {
        this(linkmusicproviderfragment);
    }

    private void a(Client client)
    {
        LinkMusicProviderFragment.a(a, client);
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((Client)obj);
    }

    public final void a(Throwable throwable)
    {
        LinkMusicProviderFragment.a(a);
    }
}
