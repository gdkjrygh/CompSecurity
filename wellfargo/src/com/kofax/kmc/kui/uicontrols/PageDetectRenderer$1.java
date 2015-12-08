// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.os.Handler;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            PageDetectRenderer

class a
    implements Runnable
{

    final PageDetectRenderer a;

    public void run()
    {
        a.invalidate();
        PageDetectRenderer.a(a).postDelayed(this, 100L);
    }

    (PageDetectRenderer pagedetectrenderer)
    {
        a = pagedetectrenderer;
        super();
    }
}
