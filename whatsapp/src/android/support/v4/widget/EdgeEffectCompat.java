// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;

public class EdgeEffectCompat
{

    private static final EdgeEffectImpl IMPL;
    private Object mEdgeEffect;

    public EdgeEffectCompat(Context context)
    {
        mEdgeEffect = IMPL.newEdgeEffect(context);
    }

    public boolean draw(Canvas canvas)
    {
        return IMPL.draw(mEdgeEffect, canvas);
    }

    public void finish()
    {
        IMPL.finish(mEdgeEffect);
    }

    public boolean isFinished()
    {
        return IMPL.isFinished(mEdgeEffect);
    }

    public boolean onPull(float f)
    {
        return IMPL.onPull(mEdgeEffect, f);
    }

    public boolean onRelease()
    {
        return IMPL.onRelease(mEdgeEffect);
    }

    public void setSize(int i, int j)
    {
        IMPL.setSize(mEdgeEffect, i, j);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new EdgeEffectIcsImpl();
        } else
        {
            IMPL = new BaseEdgeEffectImpl();
        }
    }

    private class EdgeEffectImpl
    {

        public abstract boolean draw(Object obj, Canvas canvas);

        public abstract void finish(Object obj);

        public abstract boolean isFinished(Object obj);

        public abstract Object newEdgeEffect(Context context);

        public abstract boolean onPull(Object obj, float f);

        public abstract boolean onRelease(Object obj);

        public abstract void setSize(Object obj, int i, int j);
    }


    private class EdgeEffectIcsImpl
        implements EdgeEffectImpl
    {

        public boolean draw(Object obj, Canvas canvas)
        {
            return EdgeEffectCompatIcs.draw(obj, canvas);
        }

        public void finish(Object obj)
        {
            EdgeEffectCompatIcs.finish(obj);
        }

        public boolean isFinished(Object obj)
        {
            return EdgeEffectCompatIcs.isFinished(obj);
        }

        public Object newEdgeEffect(Context context)
        {
            return EdgeEffectCompatIcs.newEdgeEffect(context);
        }

        public boolean onPull(Object obj, float f)
        {
            return EdgeEffectCompatIcs.onPull(obj, f);
        }

        public boolean onRelease(Object obj)
        {
            return EdgeEffectCompatIcs.onRelease(obj);
        }

        public void setSize(Object obj, int i, int j)
        {
            EdgeEffectCompatIcs.setSize(obj, i, j);
        }

        EdgeEffectIcsImpl()
        {
        }
    }


    private class BaseEdgeEffectImpl
        implements EdgeEffectImpl
    {

        public boolean draw(Object obj, Canvas canvas)
        {
            return false;
        }

        public void finish(Object obj)
        {
        }

        public boolean isFinished(Object obj)
        {
            return true;
        }

        public Object newEdgeEffect(Context context)
        {
            return null;
        }

        public boolean onPull(Object obj, float f)
        {
            return false;
        }

        public boolean onRelease(Object obj)
        {
            return false;
        }

        public void setSize(Object obj, int i, int j)
        {
        }

        BaseEdgeEffectImpl()
        {
        }
    }

}
