// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.e;

import android.app.Activity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.wf.wellsfargomobile.a.a;

// Referenced classes of package com.wf.wellsfargomobile.e:
//            e

public class d
{

    public static void a(Activity activity, LinearLayout linearlayout)
    {
        Object obj = (Button)linearlayout.findViewById(0x7f0f0078);
        linearlayout = (RelativeLayout)((Button) (obj)).getParent();
        linearlayout.removeView(((android.view.View) (obj)));
        obj = new ImageButton(activity);
        ((ImageButton) (obj)).setId(0x7f0f0078);
        String s = com.wf.wellsfargomobile.a.a.h();
        android.widget.RelativeLayout.LayoutParams layoutparams;
        if ("Google Play Store".equals(s))
        {
            ((ImageButton) (obj)).setImageResource(0x7f0200f5);
            ((ImageButton) (obj)).setContentDescription(activity.getString(0x7f0800fd));
        } else
        {
            ((ImageButton) (obj)).setImageResource(0x7f020041);
            ((ImageButton) (obj)).setContentDescription(activity.getString(0x7f0800fc));
        }
        ((ImageButton) (obj)).setPadding(0, 0, 0, 0);
        ((ImageButton) (obj)).setBackgroundResource(0);
        layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutparams.addRule(11);
        layoutparams.setMargins(0, 7, 0, 4);
        ((ImageButton) (obj)).setLayoutParams(layoutparams);
        linearlayout.addView(((android.view.View) (obj)));
        ((ImageButton) (obj)).setOnClickListener(new e(activity, s));
    }
}
