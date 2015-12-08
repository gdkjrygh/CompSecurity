// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverCelebrationActivity

class this._cls0
    implements android.view.animation.
{

    final SaverCelebrationActivity this$0;

    public void onAnimationEnd(Animation animation)
    {
        if (!isFinishing())
        {
            animation = AnimationUtils.loadAnimation(SaverCelebrationActivity.this, 0x7f05002b);
            findViewById(0x7f100477).startAnimation(animation);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ()
    {
        this$0 = SaverCelebrationActivity.this;
        super();
    }
}
