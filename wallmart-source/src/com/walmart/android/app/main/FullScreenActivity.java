// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.readystatesoftware.systembartint.SystemBarTintManager;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.ui.ViewStackLayout;
import com.walmart.android.wmservice.DialogFactory;

public class FullScreenActivity extends AppCompatActivity
{
    public class NoViewStackFoundException extends RuntimeException
    {

        final FullScreenActivity this$0;

        public NoViewStackFoundException()
        {
            this$0 = FullScreenActivity.this;
            super("Could not find a ViewStackLayout instance with the id R.id.viewstack in the content view.");
        }
    }


    private int mActionBarDrawableResId;
    private PresenterStack mPresenterStack;
    private int mStatusBarColorResId;

    public FullScreenActivity()
    {
    }

    protected PresenterStack getPresenterStack()
    {
        return mPresenterStack;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        Presenter presenter = mPresenterStack.peek();
        if (presenter != null)
        {
            presenter.onActivityResultAsTop(i, j, intent);
        }
    }

    public void onBackPressed()
    {
        for (Presenter presenter = mPresenterStack.peek(); presenter != null && presenter.interceptBack() || mPresenterStack.popPresenter() != null;)
        {
            return;
        }

        super.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (mPresenterStack != null)
        {
            mPresenterStack.onConfigurationChanged(configuration);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView((ViewGroup)getLayoutInflater().inflate(0x7f040061, null));
        ActionBar actionbar;
        int i;
        if (mActionBarDrawableResId == 0)
        {
            i = getResources().getColor(0x7f0f0006);
            bundle = getResources().getDrawable(0x7f02003c);
        } else
        {
            i = getResources().getColor(mStatusBarColorResId);
            bundle = getResources().getDrawable(mActionBarDrawableResId);
        }
        actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setDisplayShowTitleEnabled(true);
        actionbar.setBackgroundDrawable(bundle);
        bundle = new SystemBarTintManager(this);
        bundle.setStatusBarTintEnabled(true);
        bundle.setStatusBarTintColor(i);
        bundle = (ViewStackLayout)findViewById(0x7f10013a);
        if (bundle == null)
        {
            throw new NoViewStackFoundException();
        } else
        {
            mPresenterStack = new PresenterStack(bundle);
            mPresenterStack.setListener(new com.walmart.android.ui.PresenterStack.Listener() {

                final FullScreenActivity this$0;

                public boolean onInterceptPresenterPush(Presenter presenter, boolean flag, boolean flag1)
                {
                    return false;
                }

                public void onPresenterPopped(Presenter presenter)
                {
                    setHeaderText(presenter.getTitleText());
                }

                public void onPresenterPushed(Presenter presenter)
                {
                    setHeaderText(presenter.getTitleText());
                }

                public void onPresenterTitleUpdated(Presenter presenter)
                {
                    setHeaderText(presenter.getTitleText());
                }

            
            {
                this$0 = FullScreenActivity.this;
                super();
            }
            });
            return;
        }
    }

    protected Dialog onCreateDialog(int i)
    {
        Dialog dialog = null;
        if (true)
        {
            dialog = DialogFactory.onCreateDialog(i, this);
        }
        Dialog dialog1 = dialog;
        if (dialog == null)
        {
            dialog1 = super.onCreateDialog(i);
        }
        return dialog1;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        mPresenterStack.cleanUp();
    }

    public void onNewIntent(Intent intent)
    {
        Presenter presenter = mPresenterStack.peek();
        if (presenter != null)
        {
            presenter.onNewIntentAsTop(intent);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            Presenter presenter = mPresenterStack.peek();
            if (presenter != null)
            {
                presenter.onOptionsMenuItemSelected(menuitem, this);
            }
            return true;

        case 16908332: 
            onBackPressed();
            return true;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        menu.clear();
        Presenter presenter = mPresenterStack.peek();
        if (presenter != null)
        {
            return presenter.onCreateMenu(menu, getMenuInflater());
        } else
        {
            return false;
        }
    }

    public void onRestart()
    {
        super.onRestart();
        Presenter presenter = mPresenterStack.peek();
        if (presenter != null)
        {
            presenter.onRestartAsTop();
        }
    }

    protected void onResume()
    {
        super.onResume();
        Presenter presenter = mPresenterStack.peek();
        if (presenter != null)
        {
            presenter.onResumeAsTop();
        }
    }

    public boolean onSearchRequested()
    {
        Presenter presenter = mPresenterStack.peek();
        if (presenter != null)
        {
            return presenter.onSearchRequested();
        } else
        {
            return false;
        }
    }

    protected void onStop()
    {
        super.onStop();
        Presenter presenter = mPresenterStack.peek();
        if (presenter != null)
        {
            presenter.onStopAsTop();
        }
    }

    protected void setActionBarResId(int i, int j)
    {
        mActionBarDrawableResId = i;
        mStatusBarColorResId = j;
    }

    public void setHeaderText(String s)
    {
        getSupportActionBar().setTitle(s);
    }
}
