// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.graphics.Bitmap;
import android.os.Handler;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            PageDetectRenderer

class <init>
{

    final PageDetectRenderer a;

    public void a(onBusEvent onbusevent)
    {
        PageDetectRenderer.a(a, onbusevent.bound);
        PageDetectRenderer.a(a, onbusevent.image.getWidth());
        PageDetectRenderer.b(a, onbusevent.image.getHeight());
        PageDetectRenderer.a(a, System.currentTimeMillis());
        class _cls1
            implements Runnable
        {

            final PageDetectRenderer.a a;

            public void run()
            {
                a.a.invalidate();
            }

            _cls1()
            {
                a = PageDetectRenderer.a.this;
                super();
            }
        }

        PageDetectRenderer.a(a).post(new _cls1());
    }

    private onBusEvent(PageDetectRenderer pagedetectrenderer)
    {
        a = pagedetectrenderer;
        super();
    }

    a(PageDetectRenderer pagedetectrenderer, a a1)
    {
        this(pagedetectrenderer);
    }
}
