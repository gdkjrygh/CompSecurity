// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.widget;

import android.content.Context;
import android.widget.HorizontalScrollView;
import com.actionbarsherlock.internal.nineoldandroids.view.animation.AnimatorProxy;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.widget:
//            NineLinearLayout

public class NineHorizontalScrollView extends HorizontalScrollView
{

    private final AnimatorProxy mProxy;

    public NineHorizontalScrollView(Context context)
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
