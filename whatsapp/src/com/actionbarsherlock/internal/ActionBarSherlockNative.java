// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal;

import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.internal.app.ActionBarWrapper;
import com.actionbarsherlock.internal.view.menu.MenuWrapper;
import com.actionbarsherlock.view.ActionMode;

public class ActionBarSherlockNative extends ActionBarSherlock
{

    private ActionBarWrapper mActionBar;
    private ActionModeWrapper mActionMode;
    private MenuWrapper mMenu;

    public ActionBarSherlockNative(Activity activity, int i)
    {
        super(activity, i);
    }

    private void initActionBar()
    {
        if (mActionBar != null || mActivity.getActionBar() == null)
        {
            return;
        } else
        {
            mActionBar = new ActionBarWrapper(mActivity);
            return;
        }
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        mActivity.getWindow().addContentView(view, layoutparams);
        initActionBar();
    }

    public boolean dispatchCreateOptionsMenu(Menu menu)
    {
        if (mMenu == null || menu != mMenu.unwrap())
        {
            mMenu = new MenuWrapper(menu);
        }
        return callbackCreateOptionsMenu(mMenu);
    }

    public void dispatchInvalidateOptionsMenu()
    {
        mActivity.getWindow().invalidatePanelMenu(0);
    }

    public boolean dispatchOptionsItemSelected(MenuItem menuitem)
    {
        return callbackOptionsItemSelected(mMenu.findItem(menuitem));
    }

    public boolean dispatchPrepareOptionsMenu(Menu menu)
    {
        return callbackPrepareOptionsMenu(mMenu);
    }

    public ActionBar getActionBar()
    {
        initActionBar();
        return mActionBar;
    }

    protected Context getThemedContext()
    {
        Activity activity = mActivity;
        TypedValue typedvalue = new TypedValue();
        mActivity.getTheme().resolveAttribute(0x1010397, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            return new ContextThemeWrapper(activity, typedvalue.resourceId);
        } else
        {
            return activity;
        }
    }

    public boolean requestFeature(int i)
    {
        return mActivity.getWindow().requestFeature(i);
    }

    public void setContentView(int i)
    {
        mActivity.getWindow().setContentView(i);
        initActionBar();
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        mActivity.getWindow().setContentView(view, layoutparams);
        initActionBar();
    }

    public void setProgressBarIndeterminateVisibility(boolean flag)
    {
        mActivity.setProgressBarIndeterminateVisibility(flag);
    }

    public ActionMode startActionMode(com.actionbarsherlock.view.ActionMode.Callback callback)
    {
        if (mActionMode != null)
        {
            mActionMode.finish();
        }
        if (callback != null)
        {
            callback = new ActionModeCallbackWrapper(callback);
        } else
        {
            callback = null;
        }
        if (mActivity.startActionMode(callback) == null)
        {
            mActionMode = null;
        }
        if ((mActivity instanceof com.actionbarsherlock.ActionBarSherlock.OnActionModeStartedListener) && mActionMode != null)
        {
            ((com.actionbarsherlock.ActionBarSherlock.OnActionModeStartedListener)mActivity).onActionModeStarted(mActionMode);
        }
        return mActionMode;
    }



/*
    static ActionModeWrapper access$002(ActionBarSherlockNative actionbarsherlocknative, ActionModeWrapper actionmodewrapper)
    {
        actionbarsherlocknative.mActionMode = actionmodewrapper;
        return actionmodewrapper;
    }

*/



    private class ActionModeWrapper extends ActionMode
    {

        private final android.view.ActionMode mActionMode;
        private MenuWrapper mMenu;
        final ActionBarSherlockNative this$0;

        public void finish()
        {
            mActionMode.finish();
        }

        public MenuWrapper getMenu()
        {
            if (mMenu == null)
            {
                mMenu = new MenuWrapper(mActionMode.getMenu());
            }
            return mMenu;
        }

        public com.actionbarsherlock.view.Menu getMenu()
        {
            return getMenu();
        }

        public void invalidate()
        {
            mActionMode.invalidate();
        }

        public void setCustomView(View view)
        {
            mActionMode.setCustomView(view);
        }

        public void setTitle(CharSequence charsequence)
        {
            mActionMode.setTitle(charsequence);
        }

        ActionModeWrapper(android.view.ActionMode actionmode)
        {
            this$0 = ActionBarSherlockNative.this;
            super();
            mMenu = null;
            mActionMode = actionmode;
        }
    }


    private class ActionModeCallbackWrapper
        implements android.view.ActionMode.Callback
    {

        private final com.actionbarsherlock.view.ActionMode.Callback mCallback;
        final ActionBarSherlockNative this$0;

        public boolean onActionItemClicked(android.view.ActionMode actionmode, MenuItem menuitem)
        {
            return mCallback.onActionItemClicked(mActionMode, mActionMode.getMenu().findItem(menuitem));
        }

        public boolean onCreateActionMode(android.view.ActionMode actionmode, Menu menu)
        {
            mActionMode = new ActionModeWrapper(actionmode);
            return mCallback.onCreateActionMode(mActionMode, mActionMode.getMenu());
        }

        public void onDestroyActionMode(android.view.ActionMode actionmode)
        {
            mCallback.onDestroyActionMode(mActionMode);
            if (ActionBarSherlockNative.this.ActionBarSherlockNative$ActionModeWrapper instanceof com.actionbarsherlock.ActionBarSherlock.OnActionModeFinishedListener)
            {
                ((com.actionbarsherlock.ActionBarSherlock.OnActionModeFinishedListener)ActionBarSherlockNative.this.ActionBarSherlockNative$ActionModeWrapper).onActionModeFinished(mActionMode);
            }
        }

        public boolean onPrepareActionMode(android.view.ActionMode actionmode, Menu menu)
        {
            return mCallback.onPrepareActionMode(mActionMode, mActionMode.getMenu());
        }

        public ActionModeCallbackWrapper(com.actionbarsherlock.view.ActionMode.Callback callback)
        {
            this$0 = ActionBarSherlockNative.this;
            super();
            mCallback = callback;
        }
    }

}
