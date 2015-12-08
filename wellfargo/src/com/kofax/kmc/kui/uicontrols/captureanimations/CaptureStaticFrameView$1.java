// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.graphics.Paint;

// Referenced classes of package com.kofax.kmc.kui.uicontrols.captureanimations:
//            CaptureStaticFrameView

class a
    implements Runnable
{

    final boolean a;
    final CaptureStaticFrameView b;

    public void run()
    {
        if (a)
        {
            CaptureStaticFrameView.b(b).setColor(CaptureStaticFrameView.a(b));
        } else
        {
            CaptureStaticFrameView.b(b).setColor(CaptureStaticFrameView.c(b));
        }
        b.invalidate();
    }

    (CaptureStaticFrameView capturestaticframeview, boolean flag)
    {
        b = capturestaticframeview;
        a = flag;
        super();
    }
}
