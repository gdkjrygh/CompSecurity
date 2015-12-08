// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.walmart.android.utils:
//            CrossfadeAnimationHandler

class this._cls0
    implements android.view.animation.._cls2
{

    final CrossfadeAnimationHandler this$0;

    public void onAnimationEnd(Animation animation)
    {
        CrossfadeAnimationHandler.access$100(CrossfadeAnimationHandler.this).setVisibility(0);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ()
    {
        this$0 = CrossfadeAnimationHandler.this;
        super();
    }
}
