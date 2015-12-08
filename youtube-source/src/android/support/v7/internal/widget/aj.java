// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.internal.widget:
//            ListPopupWindow, ae

final class aj
    implements Runnable
{

    final ListPopupWindow a;

    private aj(ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
        super();
    }

    aj(ListPopupWindow listpopupwindow, byte byte0)
    {
        this(listpopupwindow);
    }

    public final void run()
    {
        if (ListPopupWindow.a(a) != null && ListPopupWindow.a(a).getCount() > ListPopupWindow.a(a).getChildCount() && ListPopupWindow.a(a).getChildCount() <= a.a)
        {
            ListPopupWindow.b(a).setInputMethodMode(2);
            a.c();
        }
    }
}
