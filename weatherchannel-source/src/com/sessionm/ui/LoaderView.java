// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ScrollView;

// Referenced classes of package com.sessionm.ui:
//            DefaultLoaderView

public class LoaderView
{
    public static interface Listener
    {

        public abstract void onCancel();

        public abstract void onReloadStarted();
    }

    public static final class LoaderViewStatus extends Enum
    {

        private static final LoaderViewStatus $VALUES[];
        public static final LoaderViewStatus FAILED;
        public static final LoaderViewStatus LOADING;
        public static final LoaderViewStatus UNAVAILABLE;

        public static LoaderViewStatus valueOf(String s)
        {
            return (LoaderViewStatus)Enum.valueOf(com/sessionm/ui/LoaderView$LoaderViewStatus, s);
        }

        public static LoaderViewStatus[] values()
        {
            return (LoaderViewStatus[])$VALUES.clone();
        }

        static 
        {
            LOADING = new LoaderViewStatus("LOADING", 0);
            FAILED = new LoaderViewStatus("FAILED", 1);
            UNAVAILABLE = new LoaderViewStatus("UNAVAILABLE", 2);
            $VALUES = (new LoaderViewStatus[] {
                LOADING, FAILED, UNAVAILABLE
            });
        }

        private LoaderViewStatus(String s, int i)
        {
            super(s, i);
        }
    }


    protected static LoaderView instance;
    protected Activity activity;
    protected ScrollView containerLayout;
    protected Listener listener;
    protected LoaderViewStatus loaderViewStatus;
    protected boolean showCloseButton;
    protected ViewGroup viewParent;

    public LoaderView()
    {
        showCloseButton = true;
        instance = this;
    }

    public static LoaderView getInstance()
    {
        if (instance == null)
        {
            instance = new DefaultLoaderView();
        }
        return instance;
    }

    public void dismiss()
    {
        if (containerLayout == null)
        {
            return;
        } else
        {
            Animation animation = AnimationUtils.loadAnimation(activity, 0x10a0001);
            animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final LoaderView this$0;

                public void onAnimationEnd(Animation animation1)
                {
                    if (containerLayout == null)
                    {
                        return;
                    } else
                    {
                        activity.runOnUiThread(new Runnable() {

                            final _cls1 this$1;

                            public void run()
                            {
                                ViewGroup viewgroup = (ViewGroup)containerLayout.getParent();
                                if (viewgroup != null)
                                {
                                    viewgroup.removeView(containerLayout);
                                }
                                containerLayout.removeAllViews();
                            }

            
            {
                this$1 = _cls1.this;
                super();
            }
                        });
                        return;
                    }
                }

                public void onAnimationRepeat(Animation animation1)
                {
                }

                public void onAnimationStart(Animation animation1)
                {
                }

            
            {
                this$0 = LoaderView.this;
                super();
            }
            });
            containerLayout.startAnimation(animation);
            return;
        }
    }

    public void dismissPortal()
    {
        listener.onCancel();
    }

    public void init(Activity activity1, ViewGroup viewgroup, Listener listener1, boolean flag)
    {
        activity = activity1;
        viewParent = viewgroup;
        listener = listener1;
        showCloseButton = flag;
    }

    public void init(Activity activity1, Listener listener1)
    {
        activity = activity1;
        viewParent = null;
        listener = listener1;
    }

    public boolean isLoadFailed()
    {
        return loaderViewStatus == LoaderViewStatus.FAILED;
    }

    public boolean isPresented()
    {
        return containerLayout != null;
    }

    public void present(LoaderViewStatus loaderviewstatus)
    {
        loaderViewStatus = null;
        containerLayout = new ScrollView(activity);
        containerLayout.setFillViewport(true);
        containerLayout.setBackgroundColor(-1);
        containerLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    public void reloadPortalContent()
    {
        setLoaderViewStatus(LoaderViewStatus.LOADING);
        listener.onReloadStarted();
    }

    public void removeCustomLoader()
    {
        instance = new DefaultLoaderView();
    }

    public void setLoaderViewStatus(LoaderViewStatus loaderviewstatus)
    {
        if (containerLayout == null || loaderviewstatus == loaderViewStatus)
        {
            return;
        } else
        {
            loaderViewStatus = loaderviewstatus;
            updateLoaderViewOnStatusChanged(loaderViewStatus);
            return;
        }
    }

    public void updateLoaderViewOnStatusChanged(LoaderViewStatus loaderviewstatus)
    {
    }
}
