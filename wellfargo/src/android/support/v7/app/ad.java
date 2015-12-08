// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

class ad
    implements OnApplyWindowInsetsListener
{

    final AppCompatDelegateImplV7 a;

    ad(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        a = appcompatdelegateimplv7;
        super();
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
    {
        int i = windowinsetscompat.getSystemWindowInsetTop();
        int j = AppCompatDelegateImplV7.c(a, i);
        WindowInsetsCompat windowinsetscompat1 = windowinsetscompat;
        if (i != j)
        {
            windowinsetscompat1 = windowinsetscompat.replaceSystemWindowInsets(windowinsetscompat.getSystemWindowInsetLeft(), j, windowinsetscompat.getSystemWindowInsetRight(), windowinsetscompat.getSystemWindowInsetBottom());
        }
        return ViewCompat.onApplyWindowInsets(view, windowinsetscompat1);
    }
}
