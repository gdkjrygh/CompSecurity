// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import android.content.res.Configuration;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.utils.CollectionUtils;
import com.walmart.android.utils.Criteria;
import com.walmartlabs.utils.WLog;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.walmart.android.ui:
//            Presenter, ViewStackLayout, PresenterDisplayedEvent

public class PresenterStack
{
    public static interface Listener
    {

        public abstract boolean onInterceptPresenterPush(Presenter presenter, boolean flag, boolean flag1);

        public abstract void onPresenterPopped(Presenter presenter);

        public abstract void onPresenterPushed(Presenter presenter);

        public abstract void onPresenterTitleUpdated(Presenter presenter);
    }


    private static final String TAG = com/walmart/android/ui/PresenterStack.getSimpleName();
    private boolean mEnableDisplayEvents;
    private Listener mListener;
    private final LinkedList mPresenterList = new LinkedList();
    ViewStackLayout mViewStack;

    public PresenterStack(ViewStackLayout viewstacklayout)
    {
        mViewStack = viewstacklayout;
    }

    private void popToRoot(boolean flag)
    {
        if (mPresenterList.size() > 1)
        {
            Presenter presenter = (Presenter)mPresenterList.getFirst();
            if (!flag)
            {
                presenter.onBeforePoppedTo();
                sendDisplayedEvent(presenter);
            }
            Object obj = new LinkedList();
            Presenter presenter1;
            for (; mPresenterList.size() > 1; ((LinkedList) (obj)).add(presenter1))
            {
                presenter1 = (Presenter)mPresenterList.removeLast();
                presenter1.onPop();
            }

            if (mListener != null && !flag)
            {
                mListener.onPresenterPopped(presenter);
            }
            mViewStack.popToRoot();
            for (obj = ((LinkedList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Presenter)((Iterator) (obj)).next()).onAfterPop()) { }
            WLog.v(TAG, (new StringBuilder()).append("popToRoot(): ").append(presenter.getClass().getSimpleName()).toString());
        }
    }

    private void sendDisplayedEvent(Presenter presenter)
    {
        if (mEnableDisplayEvents)
        {
            MessageBus.getBus().post(new PresenterDisplayedEvent(presenter));
        }
    }

    public void cleanUp()
    {
        clear();
        mViewStack.cleanUp();
        mViewStack = null;
    }

    public void clear()
    {
        popToRoot();
        Presenter presenter = null;
        if (!mPresenterList.isEmpty())
        {
            presenter = (Presenter)mPresenterList.removeLast();
            presenter.onPop();
        }
        mViewStack.removeAllViews();
        if (presenter != null)
        {
            presenter.onAfterPop();
        }
    }

    public void finishCurrentOperation()
    {
        mViewStack.finishCurrentOperation();
    }

    public int getCount()
    {
        return mPresenterList.size();
    }

    protected LinkedList getPresenterList()
    {
        return mPresenterList;
    }

    public boolean isInStack(Criteria criteria)
    {
        return CollectionUtils.containsElementWithCriteria(mPresenterList, criteria);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        for (Iterator iterator = mPresenterList.iterator(); iterator.hasNext(); ((Presenter)iterator.next()).onConfigurationChanged(configuration)) { }
        mViewStack.removeAllViews();
        Presenter presenter;
        for (configuration = mPresenterList.iterator(); configuration.hasNext(); mViewStack.pushViewImmediate(presenter.getView()))
        {
            presenter = (Presenter)configuration.next();
            presenter.onCreateView(mViewStack);
        }

    }

    public Presenter peek()
    {
        Presenter presenter;
        for (Iterator iterator = mPresenterList.iterator(); iterator.hasNext();)
        {
            presenter = (Presenter)iterator.next();
        }

        if (mPresenterList.size() > 0)
        {
            return (Presenter)mPresenterList.getLast();
        } else
        {
            return null;
        }
    }

    public Presenter popIfTopIsType(int i)
    {
        Presenter presenter = peek();
        if (presenter != null && presenter.getType() == i)
        {
            return popPresenter();
        } else
        {
            return null;
        }
    }

    public Presenter popPresenter()
    {
        return popPresenter(true);
    }

    public Presenter popPresenter(boolean flag)
    {
        if (mPresenterList.size() > 1)
        {
            final Presenter presenter = (Presenter)mPresenterList.removeLast();
            presenter.onPop();
            Presenter presenter1 = (Presenter)mPresenterList.getLast();
            presenter1.onBeforePoppedTo();
            sendDisplayedEvent(presenter1);
            WLog.v(TAG, (new StringBuilder()).append("popPresenter() popped to: ").append(presenter.getClass().getSimpleName()).toString());
            if (mListener != null)
            {
                mListener.onPresenterPopped(presenter1);
            }
            if (flag)
            {
                mViewStack.popView(new ViewStackLayout.TransitionListener() {

                    final PresenterStack this$0;
                    final Presenter val$presenter;

                    public void onTransitionDone()
                    {
                        presenter.onAfterPop();
                    }

            
            {
                this$0 = PresenterStack.this;
                presenter = presenter1;
                super();
            }
                });
                return presenter;
            } else
            {
                mViewStack.popViewImmediate();
                presenter.onAfterPop();
                return presenter;
            }
        } else
        {
            WLog.v(TAG, (new StringBuilder()).append("popPresenter() size: ").append(mPresenterList.size()).append(" ").append(this).toString());
            return null;
        }
    }

    public void popToRoot()
    {
        popToRoot(false);
    }

    public void popToRootSilent()
    {
        popToRoot(true);
    }

    public void pushAndReplacePresenter(final Presenter presenter, boolean flag)
    {
        android.view.View view;
        boolean flag1 = false;
        if (mListener != null)
        {
            flag1 = mListener.onInterceptPresenterPush(presenter, flag, true);
        }
        if (flag1)
        {
            return;
        }
        presenter.setPresenterStack(this);
        presenter.onCreateView(mViewStack);
        view = presenter.getView();
        if (view == null) goto _L2; else goto _L1
_L1:
        final Presenter replacedToPop;
        replacedToPop = null;
        if (mPresenterList.size() > 0)
        {
            Presenter presenter1 = (Presenter)mPresenterList.removeLast();
            presenter1.onPop();
            replacedToPop = presenter1;
            if (mListener != null)
            {
                mListener.onPresenterPopped(presenter);
                replacedToPop = presenter1;
            }
        }
        presenter.reset();
        mPresenterList.add(presenter);
        presenter.onBeforePush();
        if (!flag) goto _L4; else goto _L3
_L3:
        mViewStack.pushAndReplaceView(view, new ViewStackLayout.TransitionListener() {

            final PresenterStack this$0;
            final Presenter val$presenter;
            final Presenter val$replacedToPop;

            public void onTransitionDone()
            {
                presenter.onPushed();
                sendDisplayedEvent(presenter);
                if (replacedToPop != null)
                {
                    replacedToPop.onAfterPop();
                }
            }

            
            {
                this$0 = PresenterStack.this;
                presenter = presenter1;
                replacedToPop = presenter2;
                super();
            }
        });
_L6:
        if (mListener != null)
        {
            mListener.onPresenterPushed(presenter);
        }
_L2:
        WLog.v(TAG, (new StringBuilder()).append("pushAndReplacePresenter(): ").append(presenter.getClass().getSimpleName()).toString());
        return;
_L4:
        mViewStack.pushAndReplaceViewImmediate(view);
        presenter.onPushed();
        sendDisplayedEvent(presenter);
        if (replacedToPop != null)
        {
            replacedToPop.onAfterPop();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void pushPresenter(final Presenter presenter, boolean flag)
    {
        android.view.View view;
        boolean flag1 = false;
        if (mListener != null)
        {
            flag1 = mListener.onInterceptPresenterPush(presenter, flag, false);
        }
        if (flag1)
        {
            return;
        }
        presenter.setPresenterStack(this);
        presenter.onCreateView(mViewStack);
        view = presenter.getView();
        if (view == null) goto _L2; else goto _L1
_L1:
        final Presenter previousTop;
        if (mPresenterList.isEmpty())
        {
            previousTop = null;
        } else
        {
            previousTop = (Presenter)mPresenterList.getLast();
        }
        presenter.reset();
        mPresenterList.addLast(presenter);
        presenter.onBeforePush();
        if (!flag) goto _L4; else goto _L3
_L3:
        mViewStack.pushView(view, new ViewStackLayout.TransitionListener() {

            final PresenterStack this$0;
            final Presenter val$presenter;
            final Presenter val$previousTop;

            public void onTransitionDone()
            {
                presenter.onPushed();
                sendDisplayedEvent(presenter);
                if (previousTop != null)
                {
                    Presenter presenter1 = peek();
                    if (previousTop != presenter1)
                    {
                        previousTop.onNewTop();
                    }
                }
            }

            
            {
                this$0 = PresenterStack.this;
                presenter = presenter1;
                previousTop = presenter2;
                super();
            }
        });
_L6:
        if (mListener != null)
        {
            mListener.onPresenterPushed(presenter);
        }
_L2:
        WLog.v(TAG, (new StringBuilder()).append("pushPresenter(): ").append(presenter.getClass().getSimpleName()).toString());
        return;
_L4:
        mViewStack.pushViewImmediate(view);
        presenter.onPushed();
        sendDisplayedEvent(presenter);
        if (previousTop != null)
        {
            previousTop.onNewTop();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void setDisplayEventsEnabled(boolean flag)
    {
        mEnableDisplayEvents = flag;
    }

    public void setListener(Listener listener)
    {
        mListener = listener;
    }

    void titleUpdated(Presenter presenter)
    {
        if (mListener != null)
        {
            mListener.onPresenterTitleUpdated(presenter);
        }
    }


}
