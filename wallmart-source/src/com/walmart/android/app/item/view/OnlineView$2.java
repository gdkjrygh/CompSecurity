// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view;

import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;

// Referenced classes of package com.walmart.android.app.item.view:
//            OnlineView

class val.in
    implements android.view.animation.mationListener
{

    final OnlineView this$0;
    final Animation val$in;

    public void onAnimationEnd(Animation animation)
    {
        OnlineView.access$300(OnlineView.this).setVisibility(0);
        OnlineView.access$400(OnlineView.this).setVisibility(8);
        OnlineView.access$500(OnlineView.this).startAnimation(val$in);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ner()
    {
        this$0 = final_onlineview;
        val$in = Animation.this;
        super();
    }
}
