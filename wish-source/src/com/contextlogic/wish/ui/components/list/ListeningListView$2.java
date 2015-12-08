// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.list;

import android.view.MotionEvent;
import android.view.ViewGroup;

// Referenced classes of package com.contextlogic.wish.ui.components.list:
//            ListeningListView

class val.event
    implements Runnable
{

    final ListeningListView this$0;
    final MotionEvent val$event;
    final ViewGroup val$parent;

    public void run()
    {
        val$parent.dispatchTouchEvent(val$event);
    }

    ()
    {
        this$0 = final_listeninglistview;
        val$parent = viewgroup;
        val$event = MotionEvent.this;
        super();
    }
}
