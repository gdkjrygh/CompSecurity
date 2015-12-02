// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.animation.ValueAnimator;

// Referenced classes of package com.whatsapp.util:
//            FloatingChildLayout

class n
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    final FloatingChildLayout a;

    n(FloatingChildLayout floatingchildlayout)
    {
        a = floatingchildlayout;
        super();
    }

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        int i = ((Integer)valueanimator.getAnimatedValue()).intValue();
        a.setBackgroundColorAlpha(i);
    }
}
