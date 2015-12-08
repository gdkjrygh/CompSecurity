// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorListener

final class val.view extends AnimatorListenerAdapter
{

    final ViewPropertyAnimatorListener val$listener;
    final View val$view;

    public void onAnimationCancel(Animator animator)
    {
        val$listener.onAnimationCancel(val$view);
    }

    public void onAnimationEnd(Animator animator)
    {
        val$listener.onAnimationEnd(val$view);
    }

    public void onAnimationStart(Animator animator)
    {
        val$listener.onAnimationStart(val$view);
    }

    ()
    {
        val$listener = viewpropertyanimatorlistener;
        val$view = view1;
        super();
    }
}
