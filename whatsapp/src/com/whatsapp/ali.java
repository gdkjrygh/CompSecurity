// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

// Referenced classes of package com.whatsapp:
//            iz, jc, a1g, App

public class ali extends PopupWindow
{

    public ali(Activity activity)
    {
        super(activity);
        FrameLayout framelayout = new FrameLayout(activity);
        framelayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        iz.a(activity.getLayoutInflater(), 0x7f030020, framelayout, true);
        framelayout.getChildAt(0).setVisibility(0);
        setContentView(framelayout);
        framelayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(-2, 0), android.view.View.MeasureSpec.makeMeasureSpec(-2, 0));
        setBackgroundDrawable(new BitmapDrawable());
        setWidth(framelayout.getMeasuredWidth());
        setHeight(framelayout.getMeasuredHeight());
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        setTouchInterceptor(new jc(this, framelayout, activity));
    }

    public void a(View view)
    {
label0:
        {
            int i = (int)(a1g.a().g * 8F);
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                showAsDropDown(view, 0, -i, 0x800035);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            showAsDropDown(view, 0, -i);
        }
    }
}
