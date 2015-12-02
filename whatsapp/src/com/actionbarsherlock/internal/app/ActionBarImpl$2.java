// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.app;

import com.actionbarsherlock.internal.nineoldandroids.animation.Animator;
import com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorListenerAdapter;
import com.actionbarsherlock.internal.widget.ActionBarContainer;

// Referenced classes of package com.actionbarsherlock.internal.app:
//            ActionBarImpl

class ation.AnimatorListenerAdapter extends AnimatorListenerAdapter
{

    final ActionBarImpl this$0;

    public void onAnimationEnd(Animator animator)
    {
        ActionBarImpl.access$402(ActionBarImpl.this, null);
        ActionBarImpl.access$100(ActionBarImpl.this).requestLayout();
    }

    ation.Animator()
    {
        this$0 = ActionBarImpl.this;
        super();
    }
}
