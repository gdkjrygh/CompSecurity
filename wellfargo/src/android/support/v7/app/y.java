// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.internal.view.j;
import android.support.v7.internal.view.menu.i;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            v

class y extends j
{

    final v a;

    y(v v1, android.view.Window.Callback callback)
    {
        a = v1;
        super(callback);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (a.a(keyevent))
        {
            return true;
        } else
        {
            return super.dispatchKeyEvent(keyevent);
        }
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
    {
        if (a.a(keyevent.getKeyCode(), keyevent))
        {
            return true;
        } else
        {
            return super.dispatchKeyShortcutEvent(keyevent);
        }
    }

    public void onContentChanged()
    {
    }

    public boolean onCreatePanelMenu(int k, Menu menu)
    {
        if (k == 0 && !(menu instanceof i))
        {
            return false;
        } else
        {
            return super.onCreatePanelMenu(k, menu);
        }
    }

    public boolean onMenuOpened(int k, Menu menu)
    {
        if (a.b(k, menu))
        {
            return true;
        } else
        {
            return super.onMenuOpened(k, menu);
        }
    }

    public void onPanelClosed(int k, Menu menu)
    {
        if (a.a(k, menu))
        {
            return;
        } else
        {
            super.onPanelClosed(k, menu);
            return;
        }
    }

    public boolean onPreparePanel(int k, View view, Menu menu)
    {
        i l;
        boolean flag;
        if (menu instanceof i)
        {
            l = (i)menu;
        } else
        {
            l = null;
        }
        if (k == 0 && l == null)
        {
            flag = false;
        } else
        {
            if (l != null)
            {
                l.c(true);
            }
            boolean flag1 = super.onPreparePanel(k, view, menu);
            flag = flag1;
            if (l != null)
            {
                l.c(false);
                return flag1;
            }
        }
        return flag;
    }
}
