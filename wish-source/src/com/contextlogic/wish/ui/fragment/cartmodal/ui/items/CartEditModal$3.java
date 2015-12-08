// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.items;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.items:
//            CartEditModal

class this._cls0
    implements android.view.animation.ionListener
{

    final CartEditModal this$0;

    public void onAnimationEnd(Animation animation)
    {
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        CartEditModal.access$200(CartEditModal.this).setVisibility(0);
    }

    ()
    {
        this$0 = CartEditModal.this;
        super();
    }
}
