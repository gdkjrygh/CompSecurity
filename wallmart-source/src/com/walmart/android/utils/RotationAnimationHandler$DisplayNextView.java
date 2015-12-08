// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.view.ViewGroup;
import android.view.animation.Animation;

// Referenced classes of package com.walmart.android.utils:
//            RotationAnimationHandler

private final class <init>
    implements android.view.animation.ew
{

    private final int mPosition;
    final RotationAnimationHandler this$0;

    public void onAnimationEnd(Animation animation)
    {
        RotationAnimationHandler.access$100(RotationAnimationHandler.this).post(new (RotationAnimationHandler.this, mPosition));
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    private (int i)
    {
        this$0 = RotationAnimationHandler.this;
        super();
        mPosition = i;
    }

    mPosition(int i, mPosition mposition)
    {
        this(i);
    }
}
