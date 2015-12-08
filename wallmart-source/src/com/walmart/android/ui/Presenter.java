// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.walmart.android.utils.ViewUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.walmart.android.ui:
//            PresenterStack

public abstract class Presenter
{

    private static final long RECENTLY_PUSHED_TIMEOUT_MS = 1000L;
    private static final String TAG = com/walmart/android/ui/Presenter.getSimpleName();
    private Bundle mDialogArguments;
    private boolean mIsPopped;
    private final HashMap mManagedDialogs = new HashMap();
    private PresenterStack mPresenterStack;
    private long mPushedAtTime;
    private long mSingleClickFlag;
    private String mTitleText;

    public Presenter()
    {
    }

    public void clearSingleClickFlag()
    {
        mSingleClickFlag = 0L;
    }

    protected void dismissDialog(int i)
    {
        dismissDialog(i, false);
    }

    protected void dismissDialog(int i, boolean flag)
    {
        Dialog dialog = (Dialog)mManagedDialogs.get(Integer.valueOf(i));
        if (dialog != null && dialog.isShowing())
        {
            try
            {
                dialog.dismiss();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        if (flag)
        {
            mManagedDialogs.remove(Integer.valueOf(i));
        }
    }

    protected Bundle getDialogArguments()
    {
        return mDialogArguments;
    }

    public PresenterStack getPresenterStack()
    {
        return mPresenterStack;
    }

    public String getScreenName()
    {
        return null;
    }

    public String getTitleText()
    {
        return mTitleText;
    }

    public int getType()
    {
        return 0;
    }

    public abstract View getView();

    public boolean interceptBack()
    {
        return false;
    }

    public boolean isPopped()
    {
        return mIsPopped;
    }

    protected boolean isSingleClickFlagSet()
    {
        return SystemClock.uptimeMillis() - mSingleClickFlag < 400L;
    }

    public boolean isTop()
    {
        return mPresenterStack != null && mPresenterStack.peek() == this;
    }

    public void notifyTitleUpdated()
    {
        if (mPresenterStack != null)
        {
            mPresenterStack.titleUpdated(this);
        }
    }

    public void onActivityResultAsTop(int i, int j, Intent intent)
    {
    }

    public void onAfterPop()
    {
    }

    public void onBeforePoppedTo()
    {
        clearSingleClickFlag();
        onPageView();
    }

    public void onBeforePush()
    {
        onPageView();
        if (getView() != null)
        {
            ViewUtil.hideKeyboard(getView());
        }
        mPushedAtTime = SystemClock.elapsedRealtime();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        return false;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
    }

    protected Dialog onCreateDialog(int i)
    {
        return null;
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        return false;
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
    }

    public void onNewIntentAsTop(Intent intent)
    {
    }

    public void onNewTop()
    {
        if (getView() != null)
        {
            ViewUtil.hideKeyboard(getView());
        }
    }

    public boolean onOptionsMenuItemSelected(MenuItem menuitem, Activity activity)
    {
        return false;
    }

    protected void onPageView()
    {
    }

    public void onPauseAsTop()
    {
        if (getView() != null)
        {
            ViewUtil.hideKeyboard(getView());
        }
    }

    public void onPop()
    {
        mIsPopped = true;
        if (getView() != null)
        {
            ViewUtil.hideKeyboard(getView());
        }
        Iterator iterator = mManagedDialogs.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Dialog dialog = (Dialog)iterator.next();
            if (dialog.isShowing())
            {
                dialog.dismiss();
            }
        } while (true);
        mManagedDialogs.clear();
    }

    public void onPushed()
    {
    }

    public void onRestartAsTop()
    {
        clearSingleClickFlag();
        onPageView();
    }

    public void onResumeAsTop()
    {
        clearSingleClickFlag();
    }

    public boolean onSearchRequested()
    {
        return false;
    }

    public void onStartAsTop()
    {
        clearSingleClickFlag();
    }

    public void onStopAsTop()
    {
    }

    protected final void pop()
    {
        if (mPresenterStack != null)
        {
            mPresenterStack.popPresenter();
            return;
        } else
        {
            Log.w(TAG, "pop(): presenterStack is null");
            return;
        }
    }

    protected final void popToRoot()
    {
        if (mPresenterStack != null)
        {
            mPresenterStack.popToRoot();
            return;
        } else
        {
            Log.e(TAG, "popToRoot(): presenterStack is null");
            return;
        }
    }

    protected final void pushAndReplacePresenter(Presenter presenter)
    {
        pushAndReplacePresenter(presenter, true);
    }

    protected final void pushAndReplacePresenter(Presenter presenter, boolean flag)
    {
        if (mPresenterStack != null)
        {
            mPresenterStack.pushAndReplacePresenter(presenter, flag);
            return;
        } else
        {
            Log.e(TAG, (new StringBuilder()).append("pushAndReplacePresenter(): Tried to push presenter: ").append(presenter.getTitleText()).append(" but presenterStack is null").toString());
            return;
        }
    }

    protected final void pushPresenter(Presenter presenter)
    {
        pushPresenter(presenter, true);
    }

    protected final void pushPresenter(Presenter presenter, boolean flag)
    {
        if (mPresenterStack != null)
        {
            mPresenterStack.pushPresenter(presenter, flag);
            return;
        } else
        {
            Log.e(TAG, (new StringBuilder()).append("pushPresenter(): Tried to push presenter: ").append(presenter.getTitleText()).append(" but presenterStack is null").toString());
            return;
        }
    }

    protected boolean recentlyPushed()
    {
        return SystemClock.elapsedRealtime() - mPushedAtTime < 1000L;
    }

    public void reloadData()
    {
    }

    void reset()
    {
        mIsPopped = false;
        mSingleClickFlag = 0L;
        mPushedAtTime = 0L;
    }

    public void scrollToTop()
    {
    }

    final void setPresenterStack(PresenterStack presenterstack)
    {
        mPresenterStack = presenterstack;
    }

    protected void setSingleClickFlag(boolean flag)
    {
        long l;
        if (flag)
        {
            l = SystemClock.uptimeMillis();
        } else
        {
            l = 0L;
        }
        mSingleClickFlag = l;
    }

    public void setTitleText(String s)
    {
        mTitleText = s;
    }

    protected void showDialog(int i)
    {
        Dialog dialog;
        Dialog dialog1 = (Dialog)mManagedDialogs.get(Integer.valueOf(i));
        dialog = dialog1;
        if (dialog1 == null)
        {
            dialog = onCreateDialog(i);
        }
        if (dialog == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        mManagedDialogs.put(Integer.valueOf(i), dialog);
        dialog.show();
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        return;
    }

    protected void showDialog(int i, Bundle bundle)
    {
        mDialogArguments = bundle;
        dismissDialog(i, true);
        showDialog(i);
        mDialogArguments = null;
    }

}
