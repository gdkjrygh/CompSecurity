// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.v7.app.AlertDialog;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ListMenuPresenter, MenuItemImpl, a

public class MenuDialogHelper
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnKeyListener, MenuPresenter.Callback
{

    private AlertDialog mDialog;
    private a mMenu;
    ListMenuPresenter mPresenter;
    private MenuPresenter.Callback mPresenterCallback;

    public MenuDialogHelper(a a1)
    {
        mMenu = a1;
    }

    public void dismiss()
    {
        if (mDialog != null)
        {
            mDialog.dismiss();
        }
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        mMenu.a((MenuItemImpl)mPresenter.getAdapter().getItem(i), 0);
    }

    public void onCloseMenu(a a1, boolean flag)
    {
        if (flag || a1 == mMenu)
        {
            dismiss();
        }
        if (mPresenterCallback != null)
        {
            mPresenterCallback.onCloseMenu(a1, flag);
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        mPresenter.onCloseMenu(mMenu, true);
    }

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 82 || i == 4)
        {
            if (keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
            {
                dialoginterface = mDialog.getWindow();
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
                Object obj = mDialog.getWindow();
                if (obj != null)
                {
                    obj = ((Window) (obj)).getDecorView();
                    if (obj != null)
                    {
                        obj = ((View) (obj)).getKeyDispatcherState();
                        if (obj != null && ((android.view.KeyEvent.DispatcherState) (obj)).isTracking(keyevent))
                        {
                            mMenu.b(true);
                            dialoginterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return mMenu.performShortcut(i, keyevent, 0);
    }

    public boolean onOpenSubMenu(a a1)
    {
        if (mPresenterCallback != null)
        {
            return mPresenterCallback.onOpenSubMenu(a1);
        } else
        {
            return false;
        }
    }

    public void setPresenterCallback(MenuPresenter.Callback callback)
    {
        mPresenterCallback = callback;
    }

    public void show(IBinder ibinder)
    {
        Object obj = mMenu;
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(((a) (obj)).f());
        mPresenter = new ListMenuPresenter(builder.getContext(), android.support.v7.appcompat.R.layout.abc_list_menu_item_layout);
        mPresenter.setCallback(this);
        mMenu.a(mPresenter);
        builder.setAdapter(mPresenter.getAdapter(), this);
        View view = ((a) (obj)).p();
        if (view != null)
        {
            builder.setCustomTitle(view);
        } else
        {
            builder.setIcon(((a) (obj)).o()).setTitle(((a) (obj)).n());
        }
        builder.setOnKeyListener(this);
        mDialog = builder.create();
        mDialog.setOnDismissListener(this);
        obj = mDialog.getWindow().getAttributes();
        obj.type = 1003;
        if (ibinder != null)
        {
            obj.token = ibinder;
        }
        obj.flags = ((android.view.WindowManager.LayoutParams) (obj)).flags | 0x20000;
        mDialog.show();
    }
}
