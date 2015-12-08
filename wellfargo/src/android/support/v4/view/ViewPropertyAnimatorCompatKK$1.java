// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorUpdateListener

final class val.view
    implements android.animation.tener
{

    final ViewPropertyAnimatorUpdateListener val$listener;
    final View val$view;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        val$listener.onAnimationUpdate(val$view);
    }

    ner()
    {
        val$listener = viewpropertyanimatorupdatelistener;
        val$view = view1;
        super();
    }
}
