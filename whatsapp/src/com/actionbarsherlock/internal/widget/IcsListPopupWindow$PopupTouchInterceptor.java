// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            IcsListPopupWindow, AbsActionBarView

class <init>
    implements android.view.ow.PopupTouchInterceptor
{

    final IcsListPopupWindow this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
label0:
        {
            int i = motionevent.getAction();
            int j = (int)motionevent.getX();
            int k = (int)motionevent.getY();
            if (i == 0 && IcsListPopupWindow.access$800(IcsListPopupWindow.this) != null && IcsListPopupWindow.access$800(IcsListPopupWindow.this).isShowing() && j >= 0 && j < IcsListPopupWindow.access$800(IcsListPopupWindow.this).getWidth() && k >= 0 && k < IcsListPopupWindow.access$800(IcsListPopupWindow.this).getHeight())
            {
                IcsListPopupWindow.access$1000(IcsListPopupWindow.this).postDelayed(IcsListPopupWindow.access$900(IcsListPopupWindow.this), 250L);
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            if (i == 1)
            {
                IcsListPopupWindow.access$1000(IcsListPopupWindow.this).removeCallbacks(IcsListPopupWindow.access$900(IcsListPopupWindow.this));
            }
        }
        return false;
    }

    private ()
    {
        this$0 = IcsListPopupWindow.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
