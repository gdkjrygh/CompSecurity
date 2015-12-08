// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.service;

import com.jiubang.commerce.ad.e.ao;
import com.jiubang.commerce.utils.AdTimer;

// Referenced classes of package com.jiubang.commerce.service:
//            IntelligentPreloadService

class a
    implements ao
{

    final IntelligentPreloadService a;

    a(IntelligentPreloadService intelligentpreloadservice)
    {
        a = intelligentpreloadservice;
        super();
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            IntelligentPreloadService.a(a, new AdTimer(a.getApplicationContext(), "com.jiubang.commerce.customeraction_timer_intelligentpreload"));
            IntelligentPreloadService.b(a).a(System.currentTimeMillis() + IntelligentPreloadService.a(a), a);
        }
    }
}
