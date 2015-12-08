// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

// Referenced classes of package io.card.payment:
//            k

public final class j
{

    public static void a(Activity activity, TextView textview, String s, String s1, Drawable drawable)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        activity.setTitle((new StringBuilder()).append(s2).append(s).toString());
        if (a())
        {
            s1 = activity.getActionBar();
            s1.setBackgroundDrawable(k.b);
            s1.setTitle(s);
            activity = (TextView)activity.findViewById(Resources.getSystem().getIdentifier("action_bar_title", "id", "android"));
            if (activity != null)
            {
                activity.setTextColor(-1);
            }
            s1.setDisplayHomeAsUpEnabled(false);
            if (drawable != null && android.os.Build.VERSION.SDK_INT >= 14)
            {
                s1.setIcon(drawable);
            } else
            {
                s1.setDisplayShowHomeEnabled(false);
            }
            if (textview != null)
            {
                textview.setVisibility(8);
            }
        } else
        if (textview != null)
        {
            textview.setText(s);
            return;
        }
    }

    public static boolean a()
    {
        return android.os.Build.VERSION.SDK_INT >= 11;
    }

    public static boolean b()
    {
        return android.os.Build.VERSION.SDK_INT >= 11;
    }
}
