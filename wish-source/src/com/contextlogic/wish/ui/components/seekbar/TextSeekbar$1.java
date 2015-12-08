// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.seekbar;

import android.widget.SeekBar;

// Referenced classes of package com.contextlogic.wish.ui.components.seekbar:
//            TextSeekbar

class this._cls0
    implements android.widget.BarChangeListener
{

    final TextSeekbar this$0;

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        updateCurrentText(i);
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
    }

    ()
    {
        this$0 = TextSeekbar.this;
        super();
    }
}
