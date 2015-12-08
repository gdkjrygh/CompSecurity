// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.y;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7, ac

final class ag
    implements y
{

    final AppCompatDelegateImplV7 a;

    private ag(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        a = appcompatdelegateimplv7;
        super();
    }

    ag(AppCompatDelegateImplV7 appcompatdelegateimplv7, ac ac)
    {
        this(appcompatdelegateimplv7);
    }

    public void a(i i, boolean flag)
    {
        AppCompatDelegateImplV7.a(a, i);
    }

    public boolean a(i i)
    {
        android.view.Window.Callback callback = a.m();
        if (callback != null)
        {
            callback.onMenuOpened(8, i);
        }
        return true;
    }
}
