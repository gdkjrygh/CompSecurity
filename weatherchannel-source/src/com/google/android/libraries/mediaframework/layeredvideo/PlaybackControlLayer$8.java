// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.layeredvideo;

import android.content.DialogInterface;
import android.widget.ImageButton;
import java.util.List;

// Referenced classes of package com.google.android.libraries.mediaframework.layeredvideo:
//            PlaybackControlLayer

class this._cls0
    implements android.content.Listener
{

    final PlaybackControlLayer this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        ((ImageButton)PlaybackControlLayer.access$1500(PlaybackControlLayer.this).get(i)).performClick();
    }

    ()
    {
        this$0 = PlaybackControlLayer.this;
        super();
    }
}
