// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.ubercab.ui.TextView;

// Referenced classes of package com.ubercab.client.core.ui:
//            ToggleButton

final class <init> extends AnimatorListenerAdapter
{

    final ToggleButton a;

    public final void onAnimationEnd(Animator animator)
    {
        a.mFootnote.setVisibility(8);
    }

    (ToggleButton togglebutton)
    {
        a = togglebutton;
        super();
    }
}
