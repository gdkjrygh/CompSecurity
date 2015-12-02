// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view;

import android.content.Context;
import android.view.View;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.internal.view.menu.MenuBuilder;
import com.actionbarsherlock.internal.widget.ActionBarContextView;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import java.lang.ref.WeakReference;

public class StandaloneActionMode extends ActionMode
    implements com.actionbarsherlock.internal.view.menu.MenuBuilder.Callback
{

    public static boolean b;
    private com.actionbarsherlock.view.ActionMode.Callback mCallback;
    private Context mContext;
    private ActionBarContextView mContextView;
    private WeakReference mCustomView;
    private boolean mFinished;
    private boolean mFocusable;
    private MenuBuilder mMenu;

    public StandaloneActionMode(Context context, ActionBarContextView actionbarcontextview, com.actionbarsherlock.view.ActionMode.Callback callback, boolean flag)
    {
        boolean flag1 = true;
        boolean flag2 = b;
        super();
        mContext = context;
        mContextView = actionbarcontextview;
        mCallback = callback;
        mMenu = (new MenuBuilder(context)).setDefaultShowAsAction(1);
        mMenu.setCallback(this);
        mFocusable = flag;
        if (flag2)
        {
            flag = flag1;
            if (SherlockActivity.a)
            {
                flag = false;
            }
            SherlockActivity.a = flag;
        }
    }

    public void finish()
    {
        if (mFinished)
        {
            return;
        } else
        {
            mFinished = true;
            mContextView.sendAccessibilityEvent(32);
            mCallback.onDestroyActionMode(this);
            return;
        }
    }

    public Menu getMenu()
    {
        return mMenu;
    }

    public void invalidate()
    {
        mCallback.onPrepareActionMode(this, mMenu);
    }

    public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
        return mCallback.onActionItemClicked(this, menuitem);
    }

    public void onMenuModeChange(MenuBuilder menubuilder)
    {
        invalidate();
        mContextView.showOverflowMenu();
    }

    public void setCustomView(View view)
    {
        boolean flag = b;
        mContextView.setCustomView(view);
        if (view != null)
        {
            view = new WeakReference(view);
        } else
        {
            view = null;
        }
        mCustomView = view;
        if (SherlockActivity.a)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            b = flag;
        }
    }

    public void setTitle(CharSequence charsequence)
    {
        mContextView.setTitle(charsequence);
    }
}
