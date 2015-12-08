// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.v7.a.i;
import android.support.v7.app.r;
import android.support.v7.app.s;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.view.menu:
//            y, i, g, m

public class l
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnKeyListener, y
{

    g a;
    private android.support.v7.internal.view.menu.i b;
    private r c;
    private y d;

    public l(android.support.v7.internal.view.menu.i j)
    {
        b = j;
    }

    public void a()
    {
        if (c != null)
        {
            c.dismiss();
        }
    }

    public void a(IBinder ibinder)
    {
        Object obj = b;
        s s1 = new s(((android.support.v7.internal.view.menu.i) (obj)).e());
        a = new g(s1.a(), i.abc_list_menu_item_layout);
        a.a(this);
        b.a(a);
        s1.a(a.a(), this);
        View view = ((android.support.v7.internal.view.menu.i) (obj)).o();
        if (view != null)
        {
            s1.a(view);
        } else
        {
            s1.a(((android.support.v7.internal.view.menu.i) (obj)).n()).a(((android.support.v7.internal.view.menu.i) (obj)).m());
        }
        s1.a(this);
        c = s1.b();
        c.setOnDismissListener(this);
        obj = c.getWindow().getAttributes();
        obj.type = 1003;
        if (ibinder != null)
        {
            obj.token = ibinder;
        }
        obj.flags = ((android.view.WindowManager.LayoutParams) (obj)).flags | 0x20000;
        c.show();
    }

    public void a(android.support.v7.internal.view.menu.i j, boolean flag)
    {
        if (flag || j == b)
        {
            a();
        }
        if (d != null)
        {
            d.a(j, flag);
        }
    }

    public boolean a(android.support.v7.internal.view.menu.i j)
    {
        if (d != null)
        {
            return d.a(j);
        } else
        {
            return false;
        }
    }

    public void onClick(DialogInterface dialoginterface, int j)
    {
        b.a((m)a.a().getItem(j), 0);
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        a.a(b, true);
    }

    public boolean onKey(DialogInterface dialoginterface, int j, KeyEvent keyevent)
    {
        if (j == 82 || j == 4)
        {
            if (keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
            {
                dialoginterface = c.getWindow();
                if (dialoginterface != null)
                {
                    dialoginterface = dialoginterface.getDecorView();
                    if (dialoginterface != null)
                    {
                        dialoginterface = dialoginterface.getKeyDispatcherState();
                        if (dialoginterface != null)
                        {
                            dialoginterface.startTracking(keyevent, this);
                            return true;
                        }
                    }
                }
            } else
            if (keyevent.getAction() == 1 && !keyevent.isCanceled())
            {
                Object obj = c.getWindow();
                if (obj != null)
                {
                    obj = ((Window) (obj)).getDecorView();
                    if (obj != null)
                    {
                        obj = ((View) (obj)).getKeyDispatcherState();
                        if (obj != null && ((android.view.KeyEvent.DispatcherState) (obj)).isTracking(keyevent))
                        {
                            b.a(true);
                            dialoginterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return b.performShortcut(j, keyevent, 0);
    }
}
