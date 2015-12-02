// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;
import android.view.WindowInsets;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayoutImpl

class DrawerLayoutCompatApi21
{

    public static void applyMarginInsets(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i)
    {
        int j;
        j = SearchViewCompatIcs.MySearchView.a;
        obj = (WindowInsets)obj;
        if (i != 3) goto _L2; else goto _L1
_L1:
        obj = ((WindowInsets) (obj)).replaceSystemWindowInsets(((WindowInsets) (obj)).getSystemWindowInsetLeft(), ((WindowInsets) (obj)).getSystemWindowInsetTop(), 0, ((WindowInsets) (obj)).getSystemWindowInsetBottom());
        if (j == 0) goto _L4; else goto _L3
_L3:
        Object obj1;
        boolean flag;
        if (android.support.v4.app.RemoteInputCompatBase.RemoteInput.a)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        android.support.v4.app.RemoteInputCompatBase.RemoteInput.a = flag;
_L2:
        obj1 = obj;
        if (i == 5)
        {
            obj1 = ((WindowInsets) (obj)).replaceSystemWindowInsets(0, ((WindowInsets) (obj)).getSystemWindowInsetTop(), ((WindowInsets) (obj)).getSystemWindowInsetRight(), ((WindowInsets) (obj)).getSystemWindowInsetBottom());
        }
_L6:
        marginlayoutparams.leftMargin = ((WindowInsets) (obj1)).getSystemWindowInsetLeft();
        marginlayoutparams.topMargin = ((WindowInsets) (obj1)).getSystemWindowInsetTop();
        marginlayoutparams.rightMargin = ((WindowInsets) (obj1)).getSystemWindowInsetRight();
        marginlayoutparams.bottomMargin = ((WindowInsets) (obj1)).getSystemWindowInsetBottom();
        return;
_L4:
        obj1 = obj;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void configureApplyInsets(View view)
    {
        if (view instanceof DrawerLayoutImpl)
        {
            view.setOnApplyWindowInsetsListener(new InsetsListener());
            view.setSystemUiVisibility(1280);
        }
    }

    public static void dispatchChildInsets(View view, Object obj, int i)
    {
        int j;
label0:
        {
            j = SearchViewCompatIcs.MySearchView.a;
            WindowInsets windowinsets = (WindowInsets)obj;
            if (i == 3)
            {
                windowinsets = windowinsets.replaceSystemWindowInsets(windowinsets.getSystemWindowInsetLeft(), windowinsets.getSystemWindowInsetTop(), 0, windowinsets.getSystemWindowInsetBottom());
                obj = windowinsets;
                if (j == 0)
                {
                    break label0;
                }
            }
            obj = windowinsets;
            if (i == 5)
            {
                obj = windowinsets.replaceSystemWindowInsets(0, windowinsets.getSystemWindowInsetTop(), windowinsets.getSystemWindowInsetRight(), windowinsets.getSystemWindowInsetBottom());
            }
        }
        view.dispatchApplyWindowInsets(((WindowInsets) (obj)));
        if (android.support.v4.app.RemoteInputCompatBase.RemoteInput.a)
        {
            SearchViewCompatIcs.MySearchView.a = j + 1;
        }
    }

    public static int getTopInset(Object obj)
    {
        if (obj != null)
        {
            return ((WindowInsets)obj).getSystemWindowInsetTop();
        } else
        {
            return 0;
        }
    }

    private class InsetsListener
        implements android.view.View.OnApplyWindowInsetsListener
    {

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
        {
            view = (DrawerLayoutImpl)view;
            boolean flag;
            if (windowinsets.getSystemWindowInsetTop() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setChildInsets(windowinsets, flag);
            return windowinsets.consumeSystemWindowInsets();
        }

        InsetsListener()
        {
        }
    }

}
