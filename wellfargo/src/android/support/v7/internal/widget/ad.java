// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.support.v7.a.l;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v7.internal.widget:
//            bf, ae

public class ad extends PopupWindow
{

    private final boolean a;

    public ad(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = bf.a(context, attributeset, l.PopupWindow, i, 0);
        a = context.a(l.PopupWindow_overlapAnchor, false);
        setBackgroundDrawable(context.a(l.PopupWindow_android_popupBackground));
        context.b();
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            a(this);
        }
    }

    private static void a(PopupWindow popupwindow)
    {
        try
        {
            Field field = android/widget/PopupWindow.getDeclaredField("mAnchor");
            field.setAccessible(true);
            Field field1 = android/widget/PopupWindow.getDeclaredField("mOnScrollChangedListener");
            field1.setAccessible(true);
            field1.set(popupwindow, new ae(field, popupwindow, (android.view.ViewTreeObserver.OnScrollChangedListener)field1.get(popupwindow)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PopupWindow popupwindow)
        {
            Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", popupwindow);
        }
    }

    public void showAsDropDown(View view, int i, int j)
    {
        int k = j;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            k = j;
            if (a)
            {
                k = j - view.getHeight();
            }
        }
        super.showAsDropDown(view, i, k);
    }

    public void showAsDropDown(View view, int i, int j, int k)
    {
        int i1 = j;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            i1 = j;
            if (a)
            {
                i1 = j - view.getHeight();
            }
        }
        super.showAsDropDown(view, i, i1, k);
    }

    public void update(View view, int i, int j, int k, int i1)
    {
        if (android.os.Build.VERSION.SDK_INT < 21 && a)
        {
            j -= view.getHeight();
        }
        super.update(view, i, j, k, i1);
    }
}
