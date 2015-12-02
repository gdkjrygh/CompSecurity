// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.promo.v3;

import com.ubercab.mvc.app.MvcActivity;
import fbh;
import fbi;
import gpz;

// Referenced classes of package com.ubercab.client.feature.promo.v3:
//            PromoController

public class DisplayPromoActivity extends MvcActivity
{

    private PromoController a;

    public DisplayPromoActivity()
    {
    }

    protected final gpz c()
    {
        setContentView(0x7f030051);
        a = new PromoController(this, fbh.a().a());
        return a;
    }
}
