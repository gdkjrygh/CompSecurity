// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;


// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            LevelnessListener, LevelnessEvent

public final class  extends 
{

    public void onLevelnessChanged( )
    {
        try
        {
            ((LevelnessListener)_listener).onLevelness(new LevelnessEvent(this, (int).h, (int).));
            return;
        }
        // Misplaced declaration of an exception variable
        catch ( )
        {
            logException();
        }
    }

    public (LevelnessListener levelnesslistener)
    {
        super(levelnesslistener, com/kofax/kmc/kui/uicontrols/LevelnessListener);
    }
}
