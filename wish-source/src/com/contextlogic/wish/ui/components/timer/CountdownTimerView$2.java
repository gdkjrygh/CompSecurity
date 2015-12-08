// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.timer;

import java.util.TimerTask;

// Referenced classes of package com.contextlogic.wish.ui.components.timer:
//            CountdownTimerView

class this._cls0 extends TimerTask
{

    final CountdownTimerView this$0;

    public void run()
    {
        if (!CountdownTimerView.access$100(CountdownTimerView.this) && getWindowVisibility() != 8)
        {
            CountdownTimerView.access$102(CountdownTimerView.this, post(CountdownTimerView.access$200(CountdownTimerView.this)));
        }
    }

    ()
    {
        this$0 = CountdownTimerView.this;
        super();
    }
}
