// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.walmart.android.utils:
//            FadeOutAnimationHandler

class this._cls0
    implements android.view.animation.r
{

    final FadeOutAnimationHandler this$0;

    public void onAnimationEnd(Animation animation)
    {
        FadeOutAnimationHandler.access$000(FadeOutAnimationHandler.this).setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    _cls9()
    {
        this$0 = FadeOutAnimationHandler.this;
        super();
    }
}
