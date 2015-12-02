// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.share.ShareFragment;
import com.ubercab.rider.realtime.model.Client;

public final class fie
    implements ide
{

    final ShareFragment a;

    private fie(ShareFragment sharefragment)
    {
        a = sharefragment;
        super();
    }

    public fie(ShareFragment sharefragment, byte byte0)
    {
        this(sharefragment);
    }

    private void a(Client client)
    {
        ShareFragment.a(a, client.getReferralCode());
        ShareFragment.b(a, client.getPromotion());
        ShareFragment.c(a, client.getReferralUrl());
        com.ubercab.client.feature.share.ShareFragment.HeaderViewHolder.a(ShareFragment.a(a));
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
