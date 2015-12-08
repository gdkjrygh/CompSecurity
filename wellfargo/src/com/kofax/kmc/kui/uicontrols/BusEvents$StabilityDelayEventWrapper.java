// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;


// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            StabilityDelayListener, StabilityDelayEvent

public final class  extends 
{

    public void onStabilityChanged( )
    {
        try
        {
            ((StabilityDelayListener)_listener).onStabilityDelay(new StabilityDelayEvent(this, .lity));
            return;
        }
        // Misplaced declaration of an exception variable
        catch ( )
        {
            logException();
        }
    }

    public (StabilityDelayListener stabilitydelaylistener)
    {
        super(stabilitydelaylistener, com/kofax/kmc/kui/uicontrols/StabilityDelayListener);
    }
}
