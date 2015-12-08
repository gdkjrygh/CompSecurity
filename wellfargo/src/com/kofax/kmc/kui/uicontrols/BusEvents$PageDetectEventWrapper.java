// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;


// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            PageDetectionListener, PageDetectionEvent

public final class  extends 
{

    public void onPageDetected( )
    {
        try
        {
            ((PageDetectionListener)_listener).pageDetected(new PageDetectionEvent(this, .mage, .ound));
            return;
        }
        // Misplaced declaration of an exception variable
        catch ( )
        {
            logException();
        }
    }

    public (PageDetectionListener pagedetectionlistener)
    {
        super(pagedetectionlistener, com/kofax/kmc/kui/uicontrols/PageDetectionListener);
    }
}
