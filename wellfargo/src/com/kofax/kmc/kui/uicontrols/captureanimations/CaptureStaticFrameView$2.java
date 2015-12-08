// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.captureanimations;


// Referenced classes of package com.kofax.kmc.kui.uicontrols.captureanimations:
//            CaptureStaticFrameView

class a
    implements Runnable
{

    final CaptureStaticFrameView a;

    public void run()
    {
        a.invalidate();
    }

    (CaptureStaticFrameView capturestaticframeview)
    {
        a = capturestaticframeview;
        super();
    }
}
