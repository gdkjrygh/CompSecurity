// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.walmart.android.utils:
//            CrossfadeAnimationHandler

class this._cls0
    implements Runnable
{

    final CrossfadeAnimationHandler this$0;

    public void run()
    {
        if (!CrossfadeAnimationHandler.access$200(CrossfadeAnimationHandler.this).hasEnded())
        {
            CrossfadeAnimationHandler.access$000(CrossfadeAnimationHandler.this).setVisibility(8);
            CrossfadeAnimationHandler.access$200(CrossfadeAnimationHandler.this).cancel();
        }
    }

    ()
    {
        this$0 = CrossfadeAnimationHandler.this;
        super();
    }
}
