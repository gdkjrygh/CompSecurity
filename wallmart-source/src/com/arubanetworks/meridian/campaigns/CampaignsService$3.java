// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.campaigns;


// Referenced classes of package com.arubanetworks.meridian.campaigns:
//            CampaignsService

class a
    implements Runnable
{

    final CampaignsService a;

    public void run()
    {
        CampaignsService.c(a);
    }

    (CampaignsService campaignsservice)
    {
        a = campaignsservice;
        super();
    }
}
