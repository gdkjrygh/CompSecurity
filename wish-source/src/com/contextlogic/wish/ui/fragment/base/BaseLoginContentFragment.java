// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.base;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.ui.activity.login.LoginActivity;
import com.contextlogic.wish.ui.components.navigation.NavigationBarImageButton;
import com.contextlogic.wish.ui.components.navigation.WishNavigationBar;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class BaseLoginContentFragment extends Fragment
{

    private FrameLayout contentFragmentBodyLayout;
    private Handler handler;
    private boolean imagesReleased;
    private boolean isModal;
    private boolean isRootFragment;
    private WishNavigationBar navigationBar;
    private boolean pageViewTracked;
    private ArrayList visibleTasks;

    public BaseLoginContentFragment()
    {
        visibleTasks = new ArrayList();
    }

    private void handleDestroyView(final View view, final View monitorView)
    {
        if (monitorView.getAnimation() != null && !monitorView.getAnimation().hasEnded())
        {
            postDelayed(new Runnable() {

                final BaseLoginContentFragment this$0;
                final View val$monitorView;
                final View val$view;

                public void run()
                {
                    try
                    {
                        handleDestroyView(view, monitorView);
                        return;
                    }
                    catch (Throwable throwable)
                    {
                        return;
                    }
                }

            
            {
                this$0 = BaseLoginContentFragment.this;
                view = view1;
                monitorView = view2;
                super();
            }
            }, view.getAnimation().getDuration());
            return;
        } else
        {
            releaseImages();
            unbindDrawables(view);
            return;
        }
    }

    private void handleHide(final View view)
    {
        if (view.getAnimation() != null && !view.getAnimation().hasEnded())
        {
            postDelayed(new Runnable() {

                final BaseLoginContentFragment this$0;
                final View val$view;

                public void run()
                {
                    try
                    {
                        handleHide(view);
                        return;
                    }
                    catch (Throwable throwable)
                    {
                        return;
                    }
                }

            
            {
                this$0 = BaseLoginContentFragment.this;
                view = view1;
                super();
            }
            }, view.getAnimation().getDuration());
        } else
        if (!imagesReleased && !isVisible())
        {
            releaseImages();
            imagesReleased = true;
            return;
        }
    }

    private void handleModalShow(final View view)
    {
        if (view.getAnimation() != null && !view.getAnimation().hasEnded())
        {
            postDelayed(new Runnable() {

                final BaseLoginContentFragment this$0;
                final View val$view;

                public void run()
                {
                    try
                    {
                        handleModalShow(view);
                        return;
                    }
                    catch (Throwable throwable)
                    {
                        return;
                    }
                }

            
            {
                this$0 = BaseLoginContentFragment.this;
                view = view1;
                super();
            }
            }, view.getAnimation().getDuration());
        }
    }

    private void initializeNavigationBar()
    {
        if (isModal)
        {
            navigationBar.setBarColor(com.contextlogic.wish.ui.components.navigation.WishNavigationBar.NavigationBarColor.Modal);
        } else
        {
            navigationBar.setBarColor(com.contextlogic.wish.ui.components.navigation.WishNavigationBar.NavigationBarColor.Main);
        }
        if (isModal && !hideBackButton())
        {
            NavigationBarImageButton navigationbarimagebutton = new NavigationBarImageButton(getActivity());
            navigationbarimagebutton.setButtonMode(com.contextlogic.wish.ui.components.navigation.NavigationBarImageButton.ButtonMode.BackGray);
            navigationBar.setLeftButton(navigationbarimagebutton);
            navigationbarimagebutton.setOnClickListener(new android.view.View.OnClickListener() {

                final BaseLoginContentFragment this$0;

                public void onClick(View view)
                {
                    trackClick(com.contextlogic.wish.analytics.Analytics.EventType.ToolbarBackSelect);
                    handleModalBack();
                }

            
            {
                this$0 = BaseLoginContentFragment.this;
                super();
            }
            });
        }
    }

    private void unbindDrawables(View view)
    {
        if (view != null)
        {
            if (view.getBackground() != null)
            {
                view.getBackground().setCallback(null);
            }
            if (view instanceof ViewGroup)
            {
                view = (ViewGroup)view;
                for (int i = 0; i < view.getChildCount(); i++)
                {
                    unbindDrawables(view.getChildAt(i));
                }

                try
                {
                    view.removeAllViews();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    return;
                }
            }
            if (view instanceof ImageView)
            {
                view = (ImageView)view;
                if (view.getDrawable() != null)
                {
                    view.getDrawable().setCallback(null);
                }
                view.setImageDrawable(null);
                return;
            }
        }
    }

    public void dismissModal()
    {
        if (getActivity() != null)
        {
            ((LoginActivity)getActivity()).dismissModal();
        }
    }

    protected void finishFragment()
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            ((LoginActivity)getActivity()).onBackPressed();
            return;
        }
    }

    protected abstract com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType();

    public long getAnimationTimeRemaining()
    {
        if (getView() != null && getView().getAnimation() != null)
        {
            return getView().getAnimation().getDuration();
        } else
        {
            return -1L;
        }
    }

    protected abstract int getLayoutResourceId();

    public WishNavigationBar getNavigationBar()
    {
        if (getParentFragment() != null)
        {
            return ((BaseLoginContentFragment)getParentFragment()).getNavigationBar();
        } else
        {
            return navigationBar;
        }
    }

    protected WishAnalyticsEvent getWishAnalyticsPageViewType()
    {
        return null;
    }

    protected void handleModalBack()
    {
        finishFragment();
    }

    protected void handleResume()
    {
        if (!isHidden())
        {
            if (imagesReleased)
            {
                restoreImages();
                imagesReleased = false;
            }
            processVisibleTasks();
            View view = getView();
            if (view != null && isModal)
            {
                handleModalShow(view);
                return;
            }
        }
    }

    public boolean hideBackButton()
    {
        return false;
    }

    public void hideNavigationBar()
    {
        navigationBar.setVisibility(8);
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)contentFragmentBodyLayout.getLayoutParams();
        layoutparams.setMargins(0, 0, 0, 0);
        contentFragmentBodyLayout.setLayoutParams(layoutparams);
    }

    protected abstract void initializeUi(View view);

    protected boolean isPageViewTracked()
    {
        return pageViewTracked;
    }

    public boolean isRootFragment()
    {
        return isRootFragment;
    }

    public boolean onBackPressed()
    {
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        handler = new Handler();
        restoreState(bundle);
    }

    public Animation onCreateAnimation(int i, boolean flag, int j)
    {
        if (!LoginActivity.FRAGMENT_ANIMATION_ENABLED)
        {
            Animation animation = new Animation() {

                final BaseLoginContentFragment this$0;

            
            {
                this$0 = BaseLoginContentFragment.this;
                super();
            }
            };
            animation.setDuration(0L);
            return animation;
        } else
        {
            return super.onCreateAnimation(i, flag, j);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = layoutinflater.inflate(0x7f03003f, viewgroup, false);
        contentFragmentBodyLayout = (FrameLayout)bundle.findViewById(0x7f0d016d);
        navigationBar = (WishNavigationBar)bundle.findViewById(0x7f0d016c);
        initializeNavigationBar();
        viewgroup = layoutinflater.inflate(getLayoutResourceId(), contentFragmentBodyLayout, false);
        layoutinflater = viewgroup;
_L2:
        if (layoutinflater == null)
        {
            throw new RuntimeException("Failed to inflate content view");
        }
        break; /* Loop/switch isn't completed */
        viewgroup;
        System.gc();
        Runtime.getRuntime().gc();
        layoutinflater = layoutinflater.inflate(getLayoutResourceId(), contentFragmentBodyLayout, false);
        if (true) goto _L2; else goto _L1
_L1:
        layoutinflater.setLayoutParams(contentFragmentBodyLayout.getLayoutParams());
        viewgroup = (ViewGroup)contentFragmentBodyLayout.getParent();
        int i = viewgroup.indexOfChild(contentFragmentBodyLayout);
        viewgroup.removeView(contentFragmentBodyLayout);
        viewgroup.addView(layoutinflater, i);
        if (useCanvasBackground())
        {
            layoutinflater.setBackgroundColor(getResources().getColor(0x7f0c00e8));
        }
        initializeUi(layoutinflater);
        return bundle;
    }

    public void onDestroy()
    {
        super.onDestroy();
        ApiDataChangeNotificationManager.getInstance().removeListener(this);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        contentFragmentBodyLayout = null;
        final View view = getView();
        Fragment fragment = getParentFragment();
        final View monitorView = null;
        if (fragment != null)
        {
            monitorView = fragment.getView();
        }
        if (monitorView == null)
        {
            monitorView = view;
        }
        postDelayed(new Runnable() {

            final BaseLoginContentFragment this$0;
            final View val$monitorView;
            final View val$view;

            public void run()
            {
                try
                {
                    handleDestroyView(view, monitorView);
                    return;
                }
                catch (Throwable throwable)
                {
                    return;
                }
            }

            
            {
                this$0 = BaseLoginContentFragment.this;
                view = view1;
                monitorView = view2;
                super();
            }
        }, 0L);
    }

    public void onHiddenChanged(boolean flag)
    {
        super.onHiddenChanged(flag);
        if (flag)
        {
            View view = getView();
            if (view != null)
            {
                handleHide(view);
            }
        } else
        if (getActivity() != null)
        {
            handleResume();
            return;
        }
    }

    public void onPause()
    {
        super.onPause();
        if (handler != null)
        {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void onResume()
    {
        super.onPause();
        if (!pageViewTracked)
        {
            pageViewTracked = true;
            Analytics.getInstance().trackPageView(getAnalyticsPageViewType());
            if (getWishAnalyticsPageViewType() != null)
            {
                (new LogService()).requestService(Integer.toString(getWishAnalyticsPageViewType().getValue()), null, null, null);
            }
        }
        if (!isHidden() && getActivity() != null)
        {
            handleResume();
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }

    public void onStop()
    {
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = (ViewGroup)view;
        view.setAnimationCacheEnabled(false);
        view.setDrawingCacheEnabled(false);
        view.setAlwaysDrawnWithCacheEnabled(false);
        view.setWillNotCacheDrawing(true);
        if (view.getChildCount() == 1 && (view.getChildAt(0) instanceof FrameLayout) && (view instanceof FrameLayout))
        {
            bundle = (ViewGroup)view.getChildAt(0);
            if (bundle.getBackground() != null)
            {
                Drawable drawable = bundle.getBackground();
                bundle.setBackgroundDrawable(null);
                view.setBackgroundDrawable(drawable);
            }
            view.removeViewAt(0);
            for (int i = bundle.getChildCount() - 1; i >= 0; i--)
            {
                View view1 = bundle.getChildAt(i);
                bundle.removeViewAt(i);
                view.addView(view1, 0);
            }

        }
    }

    public void postDelayed(Runnable runnable, long l)
    {
        if (l < 0L)
        {
            return;
        }
        if (handler != null)
        {
            handler.postDelayed(runnable, l);
            return;
        } else
        {
            runnable.run();
            return;
        }
    }

    protected void processVisibleTasks()
    {
        for (Iterator iterator = visibleTasks.iterator(); iterator.hasNext();)
        {
            Runnable runnable = (Runnable)iterator.next();
            try
            {
                runnable.run();
            }
            catch (Throwable throwable) { }
        }

        visibleTasks.clear();
    }

    public void queueVisibleTask(Runnable runnable)
    {
        if (isVisible())
        {
            try
            {
                runnable.run();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Runnable runnable)
            {
                return;
            }
        } else
        {
            visibleTasks.add(runnable);
            return;
        }
    }

    protected void releaseImages()
    {
    }

    protected void restoreImages()
    {
    }

    protected void restoreState(Bundle bundle)
    {
    }

    public void setIsModal(boolean flag)
    {
        isModal = flag;
    }

    public void setIsRootFragment(boolean flag)
    {
        isRootFragment = flag;
    }

    public void trackClick(com.contextlogic.wish.analytics.Analytics.EventType eventtype)
    {
        Analytics.getInstance().trackEvent(eventtype, getAnalyticsPageViewType(), com.contextlogic.wish.analytics.Analytics.LabelType.Click);
    }

    public void trackClick(WishAnalyticsEvent wishanalyticsevent)
    {
        trackClick(wishanalyticsevent, null);
    }

    public void trackClick(WishAnalyticsEvent wishanalyticsevent, String s)
    {
        (new LogService()).requestService(Integer.toString(wishanalyticsevent.getValue()), s, null, null);
    }

    public void trackEvent(com.contextlogic.wish.analytics.Analytics.EventType eventtype, com.contextlogic.wish.analytics.Analytics.LabelType labeltype)
    {
        Analytics.getInstance().trackEvent(eventtype, getAnalyticsPageViewType(), labeltype);
    }

    public boolean useCanvasBackground()
    {
        return false;
    }



}
