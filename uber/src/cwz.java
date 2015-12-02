// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

public final class cwz
{

    public static void a(Activity activity)
    {
        if (activity == null || activity.getWindow() == null || activity.getWindow().getDecorView() == null)
        {
            return;
        } else
        {
            b(activity, activity.getWindow().getDecorView());
            return;
        }
    }

    public static void a(Context context)
    {
        ((InputMethodManager)context.getSystemService("input_method")).toggleSoftInput(2, 0);
    }

    public static void a(Context context, View view)
    {
        a(context);
        if (view != null)
        {
            view.requestFocus();
        }
    }

    public static void b(Context context, View view)
    {
        context = (InputMethodManager)context.getSystemService("input_method");
        if (context != null && view != null)
        {
            context.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
