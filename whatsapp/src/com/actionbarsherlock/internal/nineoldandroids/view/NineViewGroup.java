// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.internal.nineoldandroids.view.animation.AnimatorProxy;

public abstract class NineViewGroup extends ViewGroup
{

    public static int a;
    private final AnimatorProxy mProxy;

    public NineViewGroup(Context context)
    {
        super(context);
        if (AnimatorProxy.NEEDS_PROXY)
        {
            context = AnimatorProxy.wrap(this);
        } else
        {
            context = null;
        }
        mProxy = context;
    }

    public NineViewGroup(Context context, AttributeSet attributeset)
    {
        int i = a;
        super(context, attributeset);
        if (AnimatorProxy.NEEDS_PROXY)
        {
            context = AnimatorProxy.wrap(this);
        } else
        {
            context = null;
        }
        mProxy = context;
        if (SherlockActivity.a)
        {
            a = i + 1;
        }
    }

    public NineViewGroup(Context context, AttributeSet attributeset, int i)
    {
        int j = a;
        super(context, attributeset, i);
        if (AnimatorProxy.NEEDS_PROXY)
        {
            context = AnimatorProxy.wrap(this);
        } else
        {
            context = null;
        }
        mProxy = context;
        if (j != 0)
        {
            boolean flag;
            if (SherlockActivity.a)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            SherlockActivity.a = flag;
        }
    }

    public float getAlpha()
    {
        if (AnimatorProxy.NEEDS_PROXY)
        {
            return mProxy.getAlpha();
        } else
        {
            return super.getAlpha();
        }
    }

    public float getTranslationX()
    {
        if (AnimatorProxy.NEEDS_PROXY)
        {
            return mProxy.getTranslationX();
        } else
        {
            return super.getTranslationX();
        }
    }

    public float getTranslationY()
    {
        if (AnimatorProxy.NEEDS_PROXY)
        {
            return mProxy.getTranslationY();
        } else
        {
            return super.getTranslationY();
        }
    }

    public void setAlpha(float f)
    {
label0:
        {
            if (AnimatorProxy.NEEDS_PROXY)
            {
                mProxy.setAlpha(f);
                if (a == 0)
                {
                    break label0;
                }
            }
            super.setAlpha(f);
        }
    }

    public void setTranslationX(float f)
    {
label0:
        {
            if (AnimatorProxy.NEEDS_PROXY)
            {
                mProxy.setTranslationX(f);
                if (a == 0)
                {
                    break label0;
                }
            }
            super.setTranslationX(f);
        }
    }

    public void setTranslationY(float f)
    {
label0:
        {
            if (AnimatorProxy.NEEDS_PROXY)
            {
                mProxy.setTranslationY(f);
                if (a == 0)
                {
                    break label0;
                }
            }
            super.setTranslationY(f);
        }
    }

    public void setVisibility(int i)
    {
label0:
        {
            if (mProxy == null)
            {
                break label0;
            }
            if (i == 8)
            {
                clearAnimation();
                if (a == 0)
                {
                    break label0;
                }
            }
            if (i == 0)
            {
                setAnimation(mProxy);
            }
        }
        super.setVisibility(i);
    }
}
