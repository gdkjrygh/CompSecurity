// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.captureanimations;


// Referenced classes of package com.kofax.kmc.kui.uicontrols.captureanimations:
//            CheckOverlayFrameView

class a
    implements Runnable
{

    final CheckOverlayFrameView a;

    public void run()
    {
        a.invalidate();
    }

    (CheckOverlayFrameView checkoverlayframeview)
    {
        a = checkoverlayframeview;
        super();
    }
}
