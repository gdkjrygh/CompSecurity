// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

class ViewPropertyAnimatorCompatLollipop
{

    ViewPropertyAnimatorCompatLollipop()
    {
    }

    public static void translationZ(View view, float f)
    {
        view.animate().translationZ(f);
    }

    public static void translationZBy(View view, float f)
    {
        view.animate().translationZBy(f);
    }

    public static void z(View view, float f)
    {
        view.animate().z(f);
    }

    public static void zBy(View view, float f)
    {
        view.animate().zBy(f);
    }
}
