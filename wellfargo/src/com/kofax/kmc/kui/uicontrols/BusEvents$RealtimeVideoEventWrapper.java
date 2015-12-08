// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;


// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            PreviewCallbackListener, PreviewFrameEvent

public final class  extends 
{

    public void onPreviewImage( )
    {
        try
        {
            ((PreviewCallbackListener)_listener).onPreviewFrame(new PreviewFrameEvent(this, ));
            return;
        }
        // Misplaced declaration of an exception variable
        catch ( )
        {
            logException();
        }
    }

    public (PreviewCallbackListener previewcallbacklistener)
    {
        super(previewcallbacklistener, com/kofax/kmc/kui/uicontrols/PreviewCallbackListener);
    }
}
