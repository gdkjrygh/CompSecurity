// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompat, ViewPropertyAnimatorListener, ViewPropertyAnimatorUpdateListener

static interface 
{

    public abstract void alpha(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void alphaBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void cancel(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view);

    public abstract long getDuration(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view);

    public abstract Interpolator getInterpolator(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view);

    public abstract long getStartDelay(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view);

    public abstract void rotation(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void rotationBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void rotationX(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void rotationXBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void rotationY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void rotationYBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void scaleX(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void scaleXBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void scaleY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void scaleYBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void setDuration(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, long l);

    public abstract void setInterpolator(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Interpolator interpolator);

    public abstract void setListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener);

    public abstract void setStartDelay(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, long l);

    public abstract void setUpdateListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener);

    public abstract void start(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view);

    public abstract void translationX(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void translationXBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void translationY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void translationYBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void withEndAction(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable);

    public abstract void withLayer(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view);

    public abstract void withStartAction(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable);

    public abstract void x(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void xBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void y(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void yBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);
}
