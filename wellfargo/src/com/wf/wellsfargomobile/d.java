// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.view.View;

// Referenced classes of package com.wf.wellsfargomobile:
//            BaseWebViewActivity

class d
    implements Runnable
{

    final BaseWebViewActivity a;

    d(BaseWebViewActivity basewebviewactivity)
    {
        a = basewebviewactivity;
        super();
    }

    public void run()
    {
        if (a.f != null && a.f.getVisibility() == 8 && BaseWebViewActivity.b(a))
        {
            BaseWebViewActivity.c(a);
            return;
        }
        if (BaseWebViewActivity.b(a))
        {
            BaseWebViewActivity.c(a);
            return;
        } else
        {
            BaseWebViewActivity.d(a);
            return;
        }
    }
}
