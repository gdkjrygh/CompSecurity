// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view;

import android.view.View;
import android.view.animation.Animation;
import com.walmart.android.app.item.ItemPriceView;

// Referenced classes of package com.walmart.android.app.item.view:
//            OnlineView

class val.in
    implements android.view.animation.mationListener
{

    final OnlineView this$0;
    final Animation val$in;
    final String val$price;

    public void onAnimationEnd(Animation animation)
    {
        OnlineView.access$200(OnlineView.this, val$price, val$in);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        OnlineView.access$000(OnlineView.this).setVisibility(0);
        OnlineView.access$100(OnlineView.this).setVisibility(0);
    }

    ner()
    {
        this$0 = final_onlineview;
        val$price = s;
        val$in = Animation.this;
        super();
    }
}
