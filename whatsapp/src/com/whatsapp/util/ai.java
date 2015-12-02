// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.text.SpannableString;
import android.text.TextPaint;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.whatsapp.util:
//            b6

public class ai
{

    public static void a(CharSequence charsequence, View view, TextView textview, Display display)
    {
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            return;
        } else
        {
            view.measure(display.getWidth(), display.getHeight());
            int j = view.getMeasuredHeight();
            int i = view.getMeasuredWidth();
            float f = textview.getPaint().getFontSpacing();
            j = Math.round((float)j / f);
            charsequence = new SpannableString(charsequence);
            charsequence.setSpan(new b6(j, i, view), 0, charsequence.length(), 33);
            textview.setText(charsequence);
            charsequence = ((android.widget.RelativeLayout.LayoutParams)textview.getLayoutParams()).getRules();
            charsequence[1] = 0;
            charsequence[0] = 0;
            return;
        }
    }
}
