// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.pla.internal;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewConfiguration;

// Referenced classes of package com.jiubang.pla.internal:
//            PLA_AbsListView

final class c
    implements Runnable
{

    final PLA_AbsListView a;

    c(PLA_AbsListView pla_abslistview)
    {
        a = pla_abslistview;
        super();
    }

    public void run()
    {
label0:
        {
label1:
            {
                if (a.t == 0)
                {
                    a.t = 1;
                    View view = a.getChildAt(a.o - a.B);
                    if (view != null && !view.hasFocusable())
                    {
                        a.a = 0;
                        if (a.L)
                        {
                            break label0;
                        }
                        a.d();
                        view.setPressed(true);
                        a.a(view);
                        a.setPressed(true);
                        int i = ViewConfiguration.getLongPressTimeout();
                        boolean flag = a.isLongClickable();
                        if (a.e != null)
                        {
                            Drawable drawable = a.e.getCurrent();
                            if (drawable != null && (drawable instanceof TransitionDrawable))
                            {
                                if (flag)
                                {
                                    ((TransitionDrawable)drawable).startTransition(i);
                                } else
                                {
                                    ((TransitionDrawable)drawable).resetTransition();
                                }
                            }
                        }
                        if (!flag)
                        {
                            break label1;
                        }
                    }
                }
                return;
            }
            a.t = 2;
            return;
        }
        a.t = 2;
    }
}
