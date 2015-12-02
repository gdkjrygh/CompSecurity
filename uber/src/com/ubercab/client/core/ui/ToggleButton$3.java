// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.animation.ValueAnimator;

// Referenced classes of package com.ubercab.client.core.ui:
//            ToggleButton, ToggleButtonItem

final class a
    implements android.animation.nimatorUpdateListener
{

    final ToggleButton a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        a.mLeftItem.b(((Integer)valueanimator.getAnimatedValue()).intValue());
    }

    m(ToggleButton togglebutton)
    {
        a = togglebutton;
        super();
    }
}
