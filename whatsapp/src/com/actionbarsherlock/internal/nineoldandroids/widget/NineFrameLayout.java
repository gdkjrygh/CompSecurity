// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.internal.nineoldandroids.view.animation.AnimatorProxy;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.widget:
//            NineLinearLayout

public class NineFrameLayout extends FrameLayout
{

    private final AnimatorProxy mProxy;

    public NineFrameLayout(Context context, AttributeSet attributeset)
    {
        boolean flag = NineLinearLayout.a;
        super(context, attributeset);
        if (AnimatorProxy.NEEDS_PROXY)
        {
            context = AnimatorProxy.wrap(this);
        } else
        {
            context = null;
        }
        mProxy = context;
        if (flag)
        {
            boolean flag1;
            if (SherlockActivity.a)
            {
                flag1 = false;
            } else
            {
                flag1 = true;
            }
            SherlockActivity.a = flag1;
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
                if (!NineLinearLayout.a)
                {
                    break label0;
                }
            }
            super.setAlpha(f);
        }
    }

    public void setTranslationY(float f)
    {
label0:
        {
            if (AnimatorProxy.NEEDS_PROXY)
            {
                mProxy.setTranslationY(f);
                if (!NineLinearLayout.a)
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
                if (!NineLinearLayout.a)
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
