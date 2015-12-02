// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.internal.nineoldandroids.view.animation.AnimatorProxy;

public class NineLinearLayout extends LinearLayout
{

    public static boolean a;
    private final AnimatorProxy mProxy;

    public NineLinearLayout(Context context, AttributeSet attributeset)
    {
        boolean flag = a;
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
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            a = flag;
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

    public void setAlpha(float f)
    {
label0:
        {
            if (AnimatorProxy.NEEDS_PROXY)
            {
                mProxy.setAlpha(f);
                if (!a)
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
                if (!a)
                {
                    break label0;
                }
            }
            super.setTranslationX(f);
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
                if (!a)
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
