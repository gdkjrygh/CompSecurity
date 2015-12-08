// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.walmart.android.ui:
//            ViewStackLayout

class val.newTopChild
    implements android.view.animation.nListener
{

    final ViewStackLayout this$0;
    final View val$newTopChild;

    public void onAnimationEnd(Animation animation)
    {
    }

    public void onAnimationRepeat(Animation animation)
    {
        ViewStackLayout.access$000(ViewStackLayout.this, val$newTopChild);
        ViewStackLayout.access$500(ViewStackLayout.this).setAnimationListener(null);
    }

    public void onAnimationStart(Animation animation)
    {
    }

    nListener()
    {
        this$0 = final_viewstacklayout;
        val$newTopChild = View.this;
        super();
    }
}
