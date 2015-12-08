// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.view.animation.Animation;

// Referenced classes of package com.walmart.android.utils:
//            RotationAnimationHandler

class this._cls1
    implements android.view.animation.._cls2
{

    final is._cls0 this$1;

    public void onAnimationEnd(Animation animation)
    {
        if (RotationAnimationHandler.access$400(_fld0) != null)
        {
            RotationAnimationHandler.access$400(_fld0).nimationDone(RotationAnimationHandler.access$200(_fld0));
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
        this$1 = this._cls1.this;
        super();
    }
}
