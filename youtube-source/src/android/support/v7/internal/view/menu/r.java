// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.IBinder;
import android.support.v7.a.h;
import android.support.v7.a.j;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ae, o, m, s

public class r
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnKeyListener, ae
{

    private o a;
    m b;
    private AlertDialog c;
    private ae d;

    public r(o o1)
    {
        a = o1;
    }

    public final void a()
    {
        if (c != null)
        {
            c.dismiss();
        }
    }

    public final void a(IBinder ibinder)
    {
        ibinder = a;
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(ibinder.d());
        b = new m(h.o, j.b);
        b.a(this);
        a.a(b);
        builder.setAdapter(b.a(), this);
        View view = ibinder.p();
        if (view != null)
        {
            builder.setCustomTitle(view);
        } else
        {
            builder.setIcon(ibinder.o()).setTitle(ibinder.n());
        }
        builder.setOnKeyListener(this);
        c = builder.create();
        c.setOnDismissListener(this);
        ibinder = c.getWindow().getAttributes();
        ibinder.type = 1003;
        ibinder.flags = ((android.view.WindowManager.LayoutParams) (ibinder)).flags | 0x20000;
        c.show();
    }

    public final void a(o o1, boolean flag)
    {
        if (flag || o1 == a)
        {
            a();
        }
        if (d != null)
        {
            d.a(o1, flag);
        }
    }

    public final boolean b(o o1)
    {
        if (d != null)
        {
            return d.b(o1);
        } else
        {
            return false;
        }
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.a((s)b.a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        b.a(a, true);
    }

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 82 || i == 4)
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
                            a.a(true);
                            dialoginterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return a.performShortcut(i, keyevent, 0);
    }
}
