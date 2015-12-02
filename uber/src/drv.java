// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public abstract class drv extends AnimatorListenerAdapter
{

    private boolean a;

    public drv()
    {
    }

    public final boolean a()
    {
        return a;
    }

    public void onAnimationCancel(Animator animator)
    {
        a = true;
    }

    public void onAnimationEnd(Animator animator)
    {
    }
}
