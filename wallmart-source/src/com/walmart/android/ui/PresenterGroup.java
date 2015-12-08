// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.view.ViewGroup;

// Referenced classes of package com.walmart.android.ui:
//            Presenter

public abstract class PresenterGroup extends Presenter
{

    private Presenter mChildPresenters[];
    private ViewGroup mContainerView;
    private int mCurrentPresenterIndex;

    public PresenterGroup()
    {
        mCurrentPresenterIndex = -1;
    }

    public abstract Presenter createChildPresenter(int i);

    public abstract int getChildPresenterCount();

    public abstract ViewGroup getContainerView();

    public int getSelectedPresenterPosition()
    {
        return mCurrentPresenterIndex;
    }

    public void onActivityResultAsTop(int i, int j, Intent intent)
    {
        super.onActivityResultAsTop(i, j, intent);
        Presenter apresenter[] = mChildPresenters;
        int l = apresenter.length;
        for (int k = 0; k < l; k++)
        {
            Presenter presenter = apresenter[k];
            if (presenter != null)
            {
                presenter.onActivityResultAsTop(i, j, intent);
            }
        }

    }

    public void onAfterPop()
    {
        super.onAfterPop();
        Presenter apresenter[] = mChildPresenters;
        int j = apresenter.length;
        for (int i = 0; i < j; i++)
        {
            Presenter presenter = apresenter[i];
            if (presenter != null)
            {
                presenter.onAfterPop();
            }
        }

    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        Presenter apresenter[] = mChildPresenters;
        int j = apresenter.length;
        for (int i = 0; i < j; i++)
        {
            Presenter presenter = apresenter[i];
            if (presenter != null)
            {
                presenter.onBeforePoppedTo();
            }
        }

    }

    public void onBeforePush()
    {
        super.onBeforePush();
        mContainerView = getContainerView();
        mChildPresenters = new Presenter[getChildPresenterCount()];
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        Presenter apresenter[] = mChildPresenters;
        int j = apresenter.length;
        for (int i = 0; i < j; i++)
        {
            Presenter presenter = apresenter[i];
            if (presenter != null)
            {
                presenter.onConfigurationChanged(configuration);
            }
        }

    }

    public void onNewIntentAsTop(Intent intent)
    {
        super.onNewIntentAsTop(intent);
        Presenter apresenter[] = mChildPresenters;
        int j = apresenter.length;
        for (int i = 0; i < j; i++)
        {
            Presenter presenter = apresenter[i];
            if (presenter != null)
            {
                presenter.onNewIntentAsTop(intent);
            }
        }

    }

    public void onNewTop()
    {
        super.onNewTop();
        Presenter apresenter[] = mChildPresenters;
        int j = apresenter.length;
        for (int i = 0; i < j; i++)
        {
            Presenter presenter = apresenter[i];
            if (presenter != null)
            {
                presenter.onNewTop();
            }
        }

    }

    public void onPauseAsTop()
    {
        super.onPauseAsTop();
        Presenter apresenter[] = mChildPresenters;
        int j = apresenter.length;
        for (int i = 0; i < j; i++)
        {
            Presenter presenter = apresenter[i];
            if (presenter != null)
            {
                presenter.onPauseAsTop();
            }
        }

    }

    public void onPop()
    {
        super.onPop();
        Presenter apresenter[] = mChildPresenters;
        int j = apresenter.length;
        for (int i = 0; i < j; i++)
        {
            Presenter presenter = apresenter[i];
            if (presenter != null)
            {
                presenter.onPop();
            }
        }

    }

    public void onRestartAsTop()
    {
        super.onRestartAsTop();
        Presenter apresenter[] = mChildPresenters;
        int j = apresenter.length;
        for (int i = 0; i < j; i++)
        {
            Presenter presenter = apresenter[i];
            if (presenter != null)
            {
                presenter.onRestartAsTop();
            }
        }

    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        Presenter apresenter[] = mChildPresenters;
        int j = apresenter.length;
        for (int i = 0; i < j; i++)
        {
            Presenter presenter = apresenter[i];
            if (presenter != null)
            {
                presenter.onResumeAsTop();
            }
        }

    }

    public void onStartAsTop()
    {
        super.onStartAsTop();
        Presenter apresenter[] = mChildPresenters;
        int j = apresenter.length;
        for (int i = 0; i < j; i++)
        {
            Presenter presenter = apresenter[i];
            if (presenter != null)
            {
                presenter.onStartAsTop();
            }
        }

    }

    public void onStopAsTop()
    {
        super.onStopAsTop();
        Presenter apresenter[] = mChildPresenters;
        int j = apresenter.length;
        for (int i = 0; i < j; i++)
        {
            Presenter presenter = apresenter[i];
            if (presenter != null)
            {
                presenter.onStopAsTop();
            }
        }

    }

    public final void switchToPresenter(int i)
    {
        if (mCurrentPresenterIndex != i)
        {
            Presenter presenter1 = mChildPresenters[i];
            Presenter presenter = presenter1;
            if (presenter1 == null)
            {
                presenter = createChildPresenter(i);
                presenter.setPresenterStack(getPresenterStack());
                presenter.onCreateView(mContainerView);
                mChildPresenters[i] = presenter;
                presenter.onBeforePush();
                presenter.onPushed();
            }
            mContainerView.removeAllViews();
            mContainerView.addView(presenter.getView());
            mCurrentPresenterIndex = i;
        }
    }
}
