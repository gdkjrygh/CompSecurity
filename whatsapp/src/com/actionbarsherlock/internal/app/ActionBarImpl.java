// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.app;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.internal.ResourcesCompat;
import com.actionbarsherlock.internal.nineoldandroids.animation.Animator;
import com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet;
import com.actionbarsherlock.internal.nineoldandroids.animation.ObjectAnimator;
import com.actionbarsherlock.internal.nineoldandroids.widget.NineFrameLayout;
import com.actionbarsherlock.internal.widget.ActionBarContainer;
import com.actionbarsherlock.internal.widget.ActionBarContextView;
import com.actionbarsherlock.internal.widget.ActionBarView;
import com.actionbarsherlock.internal.widget.ScrollingTabContainerView;
import com.actionbarsherlock.view.ActionMode;
import java.util.ArrayList;

public class ActionBarImpl extends ActionBar
{

    public static int a;
    private static final String z[];
    ActionModeImpl mActionMode;
    private ActionBarView mActionView;
    private Activity mActivity;
    private ActionBarContainer mContainerView;
    private NineFrameLayout mContentView;
    private Context mContext;
    private int mContextDisplayMode;
    private ActionBarContextView mContextView;
    private Animator mCurrentModeAnim;
    private Animator mCurrentShowAnim;
    ActionMode mDeferredDestroyActionMode;
    com.actionbarsherlock.view.ActionMode.Callback mDeferredModeDestroyCallback;
    final Handler mHandler;
    private boolean mHasEmbeddedTabs;
    final com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener mHideListener;
    private boolean mLastMenuVisibility;
    private ArrayList mMenuVisibilityListeners;
    private int mSavedTabPosition;
    private TabImpl mSelectedTab;
    private boolean mShowHideAnimationEnabled;
    final com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener mShowListener;
    private ActionBarContainer mSplitView;
    private ScrollingTabContainerView mTabScrollView;
    private ArrayList mTabs;
    private Context mThemedContext;
    boolean mWasHiddenBeforeMode;

    public ActionBarImpl(Activity activity, int i)
    {
        int j = a;
        super();
        mTabs = new ArrayList();
        mSavedTabPosition = -1;
        mMenuVisibilityListeners = new ArrayList();
        mHandler = new Handler();
        mHideListener = new _cls1();
        mShowListener = new _cls2();
        mActivity = activity;
        activity = activity.getWindow().getDecorView();
        boolean flag;
        try
        {
            init(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw activity;
        }
        if ((i & 0x200) != 0)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        mContentView = (NineFrameLayout)activity.findViewById(0x1020002);
        if (j != 0)
        {
            boolean flag1;
            try
            {
                flag = SherlockActivity.a;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                throw activity;
            }
            if (flag)
            {
                flag1 = false;
            } else
            {
                flag1 = true;
            }
            SherlockActivity.a = flag1;
        }
        return;
    }

    private void configureTab(com.actionbarsherlock.app.ActionBar.Tab tab, int i)
    {
        int j = a;
        tab = (TabImpl)tab;
        if (tab.getCallback() == null)
        {
            try
            {
                throw new IllegalStateException(z[0]);
            }
            // Misplaced declaration of an exception variable
            catch (com.actionbarsherlock.app.ActionBar.Tab tab)
            {
                throw tab;
            }
        }
        tab.setPosition(i);
        mTabs.add(i, tab);
        int k = mTabs.size();
        i++;
        do
        {
label0:
            {
                if (i < k)
                {
                    ((TabImpl)mTabs.get(i)).setPosition(i);
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                return;
            }
            i++;
        } while (true);
    }

    private void ensureTabsExist()
    {
        ScrollingTabContainerView scrollingtabcontainerview;
        int i;
        i = 0;
        try
        {
            scrollingtabcontainerview = mTabScrollView;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (scrollingtabcontainerview != null)
        {
            return;
        }
        illegalstateexception = new ScrollingTabContainerView(mContext);
        boolean flag = mHasEmbeddedTabs;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        int j;
        illegalstateexception.setVisibility(0);
        mActionView.setEmbeddedTabView(illegalstateexception);
        j = a;
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        IllegalStateException illegalstateexception1;
        int k;
        try
        {
            k = getNavigationMode();
        }
        catch (IllegalStateException illegalstateexception2)
        {
            throw illegalstateexception2;
        }
        if (k != 2)
        {
            i = 8;
        }
        illegalstateexception.setVisibility(i);
        mContainerView.setTabContainer(illegalstateexception);
        mTabScrollView = illegalstateexception;
        return;
        illegalstateexception1;
        throw illegalstateexception1;
        illegalstateexception1;
        throw illegalstateexception1;
    }

    private void init(View view)
    {
        try
        {
            mContext = view.getContext();
            mActionView = (ActionBarView)view.findViewById(com.actionbarsherlock.R.id.abs__action_bar);
            mContextView = (ActionBarContextView)view.findViewById(com.actionbarsherlock.R.id.abs__action_context_bar);
            mContainerView = (ActionBarContainer)view.findViewById(com.actionbarsherlock.R.id.abs__action_bar_container);
            mSplitView = (ActionBarContainer)view.findViewById(com.actionbarsherlock.R.id.abs__split_action_bar);
            view = mActionView;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            try
            {
                throw view;
            }
            // Misplaced declaration of an exception variable
            catch (View view) { }
            try
            {
                throw view;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
        }
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        view = mContextView;
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        if (mContainerView != null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(z[2]).append(z[1]).toString());
        int i;
        boolean flag;
        try
        {
            mActionView.setContextView(mContextView);
            flag = mActionView.isSplitActionBar();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        try
        {
            mContextDisplayMode = i;
            i = mContext.getApplicationInfo().targetSdkVersion;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (i < 14)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setHomeButtonEnabled(flag);
        setHasEmbeddedTabs(ResourcesCompat.getResources_getBoolean(mContext, com.actionbarsherlock.R.bool.abs__action_bar_embed_tabs));
        return;
    }

    private void setHasEmbeddedTabs(boolean flag)
    {
        boolean flag2 = true;
        Object obj;
        int i;
        try
        {
            mHasEmbeddedTabs = flag;
            flag = mHasEmbeddedTabs;
        }
        catch (IllegalStateException illegalstateexception)
        {
            try
            {
                throw illegalstateexception;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        mActionView.setEmbeddedTabView(null);
        mContainerView.setTabContainer(mTabScrollView);
        if (a == 0)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        mContainerView.setTabContainer(null);
        mActionView.setEmbeddedTabView(mTabScrollView);
        boolean flag1;
        try
        {
            i = getNavigationMode();
        }
        catch (IllegalStateException illegalstateexception2)
        {
            throw illegalstateexception2;
        }
        if (i == 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj = mTabScrollView;
        if (obj != null)
        {
            IllegalStateException illegalstateexception3;
            int j;
            try
            {
                obj = mTabScrollView;
            }
            catch (IllegalStateException illegalstateexception4)
            {
                throw illegalstateexception4;
            }
            if (flag1)
            {
                j = 0;
            } else
            {
                j = 8;
            }
            ((ScrollingTabContainerView) (obj)).setVisibility(j);
        }
        try
        {
            obj = mActionView;
            flag = mHasEmbeddedTabs;
        }
        catch (IllegalStateException illegalstateexception5)
        {
            try
            {
                throw illegalstateexception5;
            }
            catch (IllegalStateException illegalstateexception6)
            {
                throw illegalstateexception6;
            }
        }
        if (!flag && flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        ((ActionBarView) (obj)).setCollapsable(flag);
        return;
        illegalstateexception3;
        throw illegalstateexception3;
    }

    public void addOnMenuVisibilityListener(com.actionbarsherlock.app.ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        mMenuVisibilityListeners.add(onmenuvisibilitylistener);
    }

    public void addTab(com.actionbarsherlock.app.ActionBar.Tab tab)
    {
        addTab(tab, mTabs.isEmpty());
    }

    public void addTab(com.actionbarsherlock.app.ActionBar.Tab tab, boolean flag)
    {
        try
        {
            ensureTabsExist();
            mTabScrollView.addTab(tab, flag);
            configureTab(tab, mTabs.size());
        }
        // Misplaced declaration of an exception variable
        catch (com.actionbarsherlock.app.ActionBar.Tab tab)
        {
            throw tab;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        selectTab(tab);
    }

    void animateToMode(boolean flag)
    {
        int i;
        byte byte0 = 8;
        Object obj;
        boolean flag1;
        if (flag)
        {
            try
            {
                show(false);
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
        }
        try
        {
            if (mCurrentModeAnim != null)
            {
                mCurrentModeAnim.end();
            }
        }
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
        try
        {
            obj = mActionView;
        }
        catch (IllegalStateException illegalstateexception2)
        {
            throw illegalstateexception2;
        }
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        try
        {
            ((ActionBarView) (obj)).animateToVisibility(i);
            obj = mContextView;
        }
        catch (IllegalStateException illegalstateexception3)
        {
            throw illegalstateexception3;
        }
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ActionBarContextView) (obj)).animateToVisibility(i);
        obj = mTabScrollView;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        flag1 = mActionView.hasEmbeddedTabs();
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        flag1 = mActionView.isCollapsed();
        if (flag1)
        {
            IllegalStateException illegalstateexception4;
            try
            {
                obj = mTabScrollView;
            }
            catch (IllegalStateException illegalstateexception5)
            {
                throw illegalstateexception5;
            }
            if (flag)
            {
                i = byte0;
            } else
            {
                i = 0;
            }
            ((ScrollingTabContainerView) (obj)).animateToVisibility(i);
        }
        return;
        illegalstateexception4;
        throw illegalstateexception4;
        illegalstateexception4;
        throw illegalstateexception4;
        illegalstateexception4;
        throw illegalstateexception4;
    }

    void completeDeferredDestroyActionMode()
    {
        try
        {
            if (mDeferredModeDestroyCallback != null)
            {
                mDeferredModeDestroyCallback.onDestroyActionMode(mDeferredDestroyActionMode);
                mDeferredDestroyActionMode = null;
                mDeferredModeDestroyCallback = null;
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    public void dispatchMenuVisibilityChanged(boolean flag)
    {
        int j;
        j = a;
        boolean flag1;
        try
        {
            flag1 = mLastMenuVisibility;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (flag != flag1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        int k;
        mLastMenuVisibility = flag;
        k = mMenuVisibilityListeners.size();
        i = 0;
_L5:
        if (i >= k) goto _L1; else goto _L3
_L3:
        ((com.actionbarsherlock.app.ActionBar.OnMenuVisibilityListener)mMenuVisibilityListeners.get(i)).onMenuVisibilityChanged(flag);
        if (j != 0) goto _L1; else goto _L4
_L4:
        i++;
          goto _L5
    }

    public int getNavigationMode()
    {
        return mActionView.getNavigationMode();
    }

    public int getSelectedNavigationIndex()
    {
        int i;
        try
        {
            i = mActionView.getNavigationMode();
        }
        catch (IllegalStateException illegalstateexception)
        {
            try
            {
                throw illegalstateexception;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        i;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 55
    //                   2 34;
           goto _L1 _L2 _L3
_L1:
        return -1;
_L3:
        if (mSelectedTab == null) goto _L1; else goto _L4
_L4:
        return mSelectedTab.getPosition();
_L2:
        return mActionView.getDropdownSelectedPosition();
    }

    public Context getThemedContext()
    {
        int i;
        if (mThemedContext != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        TypedValue typedvalue = new TypedValue();
        mContext.getTheme().resolveAttribute(com.actionbarsherlock.R.attr.actionBarWidgetTheme, typedvalue, true);
        i = typedvalue.resourceId;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        mThemedContext = new ContextThemeWrapper(mContext, i);
        if (a == 0)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        mThemedContext = mContext;
        return mThemedContext;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
    }

    public void hide()
    {
        int i;
        try
        {
            if (mCurrentShowAnim != null)
            {
                mCurrentShowAnim.end();
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        try
        {
            i = mContainerView.getVisibility();
        }
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
        if (i != 8) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!mShowHideAnimationEnabled)
        {
            break; /* Loop/switch isn't completed */
        }
        mContainerView.setAlpha(1.0F);
        mContainerView.setTransitioning(true);
        AnimatorSet animatorset = new AnimatorSet();
        com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Builder builder = animatorset.play(ObjectAnimator.ofFloat(mContainerView, z[3], new float[] {
            0.0F
        }));
        IllegalStateException illegalstateexception2;
        ActionBarContainer actionbarcontainer;
        try
        {
            if (mContentView != null)
            {
                builder.with(ObjectAnimator.ofFloat(mContentView, z[4], new float[] {
                    0.0F, (float)(-mContainerView.getHeight())
                }));
                builder.with(ObjectAnimator.ofFloat(mContainerView, z[6], new float[] {
                    (float)(-mContainerView.getHeight())
                }));
            }
        }
        catch (IllegalStateException illegalstateexception3)
        {
            throw illegalstateexception3;
        }
        actionbarcontainer = mSplitView;
        IllegalStateException illegalstateexception4;
        if (actionbarcontainer != null)
        {
            try
            {
                if (mSplitView.getVisibility() == 0)
                {
                    mSplitView.setAlpha(1.0F);
                    builder.with(ObjectAnimator.ofFloat(mSplitView, z[5], new float[] {
                        0.0F
                    }));
                }
            }
            catch (IllegalStateException illegalstateexception5)
            {
                throw illegalstateexception5;
            }
        }
        animatorset.addListener(mHideListener);
        mCurrentShowAnim = animatorset;
        animatorset.start();
        if (a == 0) goto _L1; else goto _L3
_L3:
        mHideListener.onAnimationEnd(null);
        return;
        illegalstateexception2;
        throw illegalstateexception2;
        illegalstateexception4;
        throw illegalstateexception4;
    }

    public boolean isShowing()
    {
        int i;
        try
        {
            i = mContainerView.getVisibility();
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        return i == 0;
    }

    public com.actionbarsherlock.app.ActionBar.Tab newTab()
    {
        return new TabImpl();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        int i;
        setHasEmbeddedTabs(ResourcesCompat.getResources_getBoolean(mContext, com.actionbarsherlock.R.bool.abs__action_bar_embed_tabs));
        i = android.os.Build.VERSION.SDK_INT;
        if (i < 8)
        {
            try
            {
                mActionView.onConfigurationChanged(configuration);
                if (mContextView != null)
                {
                    mContextView.onConfigurationChanged(configuration);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Configuration configuration)
            {
                throw configuration;
            }
        }
        break MISSING_BLOCK_LABEL_54;
        configuration;
        throw configuration;
    }

    public void removeOnMenuVisibilityListener(com.actionbarsherlock.app.ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        mMenuVisibilityListeners.remove(onmenuvisibilitylistener);
    }

    public void selectTab(com.actionbarsherlock.app.ActionBar.Tab tab)
    {
        int i = -1;
        int j = getNavigationMode();
        if (j == 2) goto _L2; else goto _L1
_L1:
        if (tab != null)
        {
            try
            {
                i = tab.getPosition();
            }
            // Misplaced declaration of an exception variable
            catch (com.actionbarsherlock.app.ActionBar.Tab tab)
            {
                throw tab;
            }
        } else
        {
            i = -1;
        }
        mSavedTabPosition = i;
_L4:
        return;
        tab;
        throw tab;
_L2:
        FragmentTransaction fragmenttransaction;
        fragmenttransaction = null;
        if (mActivity instanceof FragmentActivity)
        {
            fragmenttransaction = ((FragmentActivity)mActivity).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
        }
        TabImpl tabimpl = mSelectedTab;
        if (tabimpl != tab)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        tabimpl = mSelectedTab;
        if (tabimpl == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        mSelectedTab.getCallback().onTabReselected(mSelectedTab, fragmenttransaction);
        mTabScrollView.animateToTab(tab.getPosition());
        j = a;
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        ScrollingTabContainerView scrollingtabcontainerview;
        try
        {
            scrollingtabcontainerview = mTabScrollView;
        }
        // Misplaced declaration of an exception variable
        catch (com.actionbarsherlock.app.ActionBar.Tab tab)
        {
            throw tab;
        }
        if (tab == null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        i = tab.getPosition();
        try
        {
            scrollingtabcontainerview.setTabSelected(i);
            if (mSelectedTab != null)
            {
                mSelectedTab.getCallback().onTabUnselected(mSelectedTab, fragmenttransaction);
            }
        }
        // Misplaced declaration of an exception variable
        catch (com.actionbarsherlock.app.ActionBar.Tab tab)
        {
            throw tab;
        }
        try
        {
            mSelectedTab = (TabImpl)tab;
            if (mSelectedTab != null)
            {
                mSelectedTab.getCallback().onTabSelected(mSelectedTab, fragmenttransaction);
            }
        }
        // Misplaced declaration of an exception variable
        catch (com.actionbarsherlock.app.ActionBar.Tab tab)
        {
            throw tab;
        }
        if (fragmenttransaction == null) goto _L4; else goto _L3
_L3:
        if (fragmenttransaction.isEmpty()) goto _L4; else goto _L5
_L5:
        fragmenttransaction.commit();
        return;
        tab;
        throw tab;
        tab;
        try
        {
            throw tab;
        }
        // Misplaced declaration of an exception variable
        catch (com.actionbarsherlock.app.ActionBar.Tab tab) { }
        try
        {
            throw tab;
        }
        // Misplaced declaration of an exception variable
        catch (com.actionbarsherlock.app.ActionBar.Tab tab) { }
        throw tab;
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        mContainerView.setPrimaryBackground(drawable);
    }

    public void setCustomView(View view)
    {
        mActionView.setCustomNavigationView(view);
    }

    public void setCustomView(View view, com.actionbarsherlock.app.ActionBar.LayoutParams layoutparams)
    {
        view.setLayoutParams(layoutparams);
        mActionView.setCustomNavigationView(view);
    }

    public void setDisplayHomeAsUpEnabled(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        setDisplayOptions(byte0, 4);
    }

    public void setDisplayOptions(int i)
    {
        mActionView.setDisplayOptions(i);
    }

    public void setDisplayOptions(int i, int j)
    {
        int k = mActionView.getDisplayOptions();
        mActionView.setDisplayOptions(k & ~j | i & j);
    }

    public void setDisplayShowCustomEnabled(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 16;
        } else
        {
            byte0 = 0;
        }
        setDisplayOptions(byte0, 16);
    }

    public void setDisplayShowHomeEnabled(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        setDisplayOptions(byte0, 2);
    }

    public void setDisplayShowTitleEnabled(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        setDisplayOptions(byte0, 8);
    }

    public void setHomeButtonEnabled(boolean flag)
    {
        mActionView.setHomeButtonEnabled(flag);
    }

    public void setIcon(int i)
    {
        mActionView.setIcon(i);
    }

    public void setIcon(Drawable drawable)
    {
        mActionView.setIcon(drawable);
    }

    public void setNavigationMode(int i)
    {
        boolean flag1 = false;
        mActionView.getNavigationMode();
        JVM INSTR tableswitch 2 2: default 28
    //                   2 91;
           goto _L1 _L2
_L1:
        ActionBarView actionbarview;
        try
        {
            mActionView.setNavigationMode(i);
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception)
        {
            try
            {
                throw illegalstateexception;
            }
            // Misplaced declaration of an exception variable
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
        }
        i;
        JVM INSTR tableswitch 2 2: default 56
    //                   2 119;
           goto _L3 _L4
_L3:
        actionbarview = mActionView;
        boolean flag = flag1;
        if (i == 2)
        {
            IllegalStateException illegalstateexception;
            boolean flag2;
            try
            {
                flag2 = mHasEmbeddedTabs;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
            flag = flag1;
            if (!flag2)
            {
                flag = true;
            }
        }
        actionbarview.setCollapsable(flag);
        return;
_L2:
        try
        {
            mSavedTabPosition = getSelectedNavigationIndex();
            selectTab(null);
            mTabScrollView.setVisibility(8);
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
          goto _L1
_L4:
        ensureTabsExist();
        mTabScrollView.setVisibility(0);
        if (mSavedTabPosition != -1)
        {
            setSelectedNavigationItem(mSavedTabPosition);
            mSavedTabPosition = -1;
        }
          goto _L3
        illegalstateexception;
        throw illegalstateexception;
          goto _L1
    }

    public void setSelectedNavigationItem(int i)
    {
        int j = a;
        int k = mActionView.getNavigationMode();
        k;
        JVM INSTR tableswitch 1 2: default 36
    //                   1 72
    //                   2 53;
           goto _L1 _L2 _L3
_L1:
        try
        {
            throw new IllegalStateException(z[11]);
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
_L3:
        selectTab((com.actionbarsherlock.app.ActionBar.Tab)mTabs.get(i));
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        mActionView.setDropdownSelectedPosition(i);
        if (j != 0) goto _L1; else goto _L4
_L4:
        return;
        IllegalStateException illegalstateexception1;
        illegalstateexception1;
        throw illegalstateexception1;
        illegalstateexception1;
        throw illegalstateexception1;
    }

    public void setShowHideAnimationEnabled(boolean flag)
    {
        mShowHideAnimationEnabled = flag;
        IllegalStateException illegalstateexception;
        if (!flag)
        {
            try
            {
                if (mCurrentShowAnim != null)
                {
                    mCurrentShowAnim.end();
                    return;
                }
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        break MISSING_BLOCK_LABEL_30;
        illegalstateexception;
        throw illegalstateexception;
    }

    public void setSubtitle(int i)
    {
        setSubtitle(((CharSequence) (mContext.getString(i))));
    }

    public void setSubtitle(CharSequence charsequence)
    {
        mActionView.setSubtitle(charsequence);
    }

    public void setTitle(int i)
    {
        setTitle(((CharSequence) (mContext.getString(i))));
    }

    public void setTitle(CharSequence charsequence)
    {
        mActionView.setTitle(charsequence);
    }

    public void show()
    {
        show(true);
    }

    void show(boolean flag)
    {
        int i;
        try
        {
            if (mCurrentShowAnim != null)
            {
                mCurrentShowAnim.end();
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        try
        {
            i = mContainerView.getVisibility();
        }
        catch (IllegalStateException illegalstateexception1)
        {
            try
            {
                throw illegalstateexception1;
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        mWasHiddenBeforeMode = false;
_L4:
        return;
_L2:
        mContainerView.setVisibility(0);
        if (!mShowHideAnimationEnabled)
        {
            break; /* Loop/switch isn't completed */
        }
        mContainerView.setAlpha(0.0F);
        AnimatorSet animatorset = new AnimatorSet();
        com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Builder builder = animatorset.play(ObjectAnimator.ofFloat(mContainerView, z[9], new float[] {
            1.0F
        }));
        IllegalStateException illegalstateexception3;
        ActionBarContainer actionbarcontainer;
        try
        {
            if (mContentView != null)
            {
                builder.with(ObjectAnimator.ofFloat(mContentView, z[8], new float[] {
                    (float)(-mContainerView.getHeight()), 0.0F
                }));
                mContainerView.setTranslationY(-mContainerView.getHeight());
                builder.with(ObjectAnimator.ofFloat(mContainerView, z[10], new float[] {
                    0.0F
                }));
            }
        }
        catch (IllegalStateException illegalstateexception4)
        {
            throw illegalstateexception4;
        }
        actionbarcontainer = mSplitView;
        IllegalStateException illegalstateexception5;
        if (actionbarcontainer != null)
        {
            try
            {
                if (mContextDisplayMode == 1)
                {
                    mSplitView.setAlpha(0.0F);
                    mSplitView.setVisibility(0);
                    builder.with(ObjectAnimator.ofFloat(mSplitView, z[7], new float[] {
                        1.0F
                    }));
                }
            }
            catch (IllegalStateException illegalstateexception6)
            {
                throw illegalstateexception6;
            }
        }
        animatorset.addListener(mShowListener);
        mCurrentShowAnim = animatorset;
        animatorset.start();
        if (a == 0) goto _L4; else goto _L3
_L3:
        mContainerView.setAlpha(1.0F);
        mContainerView.setTranslationY(0.0F);
        mShowListener.onAnimationEnd(null);
        return;
        illegalstateexception3;
        throw illegalstateexception3;
        illegalstateexception5;
        throw illegalstateexception5;
    }

    public ActionMode startActionMode(com.actionbarsherlock.view.ActionMode.Callback callback)
    {
        boolean flag1 = false;
        ActionBarContainer actionbarcontainer;
        boolean flag;
        boolean flag2;
        if (mActionMode != null)
        {
            flag = mWasHiddenBeforeMode;
            mActionMode.finish();
        } else
        {
            flag = false;
        }
        mContextView.killMode();
        callback = new ActionModeImpl(callback);
        try
        {
            flag2 = callback.dispatchOnCreate();
        }
        // Misplaced declaration of an exception variable
        catch (com.actionbarsherlock.view.ActionMode.Callback callback)
        {
            try
            {
                throw callback;
            }
            // Misplaced declaration of an exception variable
            catch (com.actionbarsherlock.view.ActionMode.Callback callback) { }
            try
            {
                throw callback;
            }
            // Misplaced declaration of an exception variable
            catch (com.actionbarsherlock.view.ActionMode.Callback callback)
            {
                throw callback;
            }
        }
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        flag2 = isShowing();
        if (!flag2 || flag)
        {
            flag1 = true;
        }
        mWasHiddenBeforeMode = flag1;
        callback.invalidate();
        mContextView.initForMode(callback);
        animateToMode(true);
        actionbarcontainer = mSplitView;
        if (actionbarcontainer != null)
        {
            try
            {
                if (mContextDisplayMode == 1)
                {
                    mSplitView.setVisibility(0);
                }
            }
            // Misplaced declaration of an exception variable
            catch (com.actionbarsherlock.view.ActionMode.Callback callback)
            {
                throw callback;
            }
        }
        mContextView.sendAccessibilityEvent(32);
        mActionMode = callback;
        return callback;
        callback;
        throw callback;
        return null;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[12];
        obj = "x-~\034<WnH\024!\031\032k\027sT;y\001sQ/|\020sXnI\024?U,k\0268";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "N'~\035sXni\032>I/~\0341U+*\002:W*e\002s]+i\032!\031\"k\f<L:";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\031-k\033sV f\fs[+*\000 \\**";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "X\"z\0352";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "M<k\033 U/~\034<W\027";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "X\"z\0352";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "M<k\033 U/~\034<W\027";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "X\"z\0352";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "M<k\033 U/~\034<W\027";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "X\"z\0352";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                obj = "M<k\033 U/~\034<W\027";
                byte0 = 9;
                i = 10;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "J+~&6U+i\0016]\000k\003:^/~\034<W\007d\0216And\032'\0318k\031:]nl\032!\031-\177\007!\\ ~U=X8c\0222M'e\033sT!n\020";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 344
    //                   0 367
    //                   1 374
    //                   2 381
    //                   3 388;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_388;
_L3:
        byte byte1 = 83;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 57;
          goto _L9
_L5:
        byte1 = 78;
          goto _L9
_L6:
        byte1 = 10;
          goto _L9
        byte1 = 117;
          goto _L9
    }






/*
    static Animator access$402(ActionBarImpl actionbarimpl, Animator animator)
    {
        actionbarimpl.mCurrentShowAnim = animator;
        return animator;
    }

*/





    private class _cls1 extends AnimatorListenerAdapter
    {

        final ActionBarImpl this$0;

        public void onAnimationEnd(Animator animator)
        {
            if (mContentView != null)
            {
                mContentView.setTranslationY(0.0F);
                mContainerView.setTranslationY(0.0F);
            }
            if (mSplitView != null && mContextDisplayMode == 1)
            {
                mSplitView.setVisibility(8);
            }
            mContainerView.setVisibility(8);
            mContainerView.setTransitioning(false);
            mCurrentShowAnim = null;
            completeDeferredDestroyActionMode();
        }

        _cls1()
        {
            this$0 = ActionBarImpl.this;
            super();
        }
    }


    private class _cls2 extends AnimatorListenerAdapter
    {

        final ActionBarImpl this$0;

        public void onAnimationEnd(Animator animator)
        {
            mCurrentShowAnim = null;
            mContainerView.requestLayout();
        }

        _cls2()
        {
            this$0 = ActionBarImpl.this;
            super();
        }
    }


    private class TabImpl extends com.actionbarsherlock.app.ActionBar.Tab
    {

        private com.actionbarsherlock.app.ActionBar.TabListener mCallback;
        private CharSequence mContentDesc;
        private View mCustomView;
        private Drawable mIcon;
        private int mPosition;
        private CharSequence mText;
        final ActionBarImpl this$0;

        public com.actionbarsherlock.app.ActionBar.TabListener getCallback()
        {
            return mCallback;
        }

        public CharSequence getContentDescription()
        {
            return mContentDesc;
        }

        public View getCustomView()
        {
            return mCustomView;
        }

        public Drawable getIcon()
        {
            return mIcon;
        }

        public int getPosition()
        {
            return mPosition;
        }

        public CharSequence getText()
        {
            return mText;
        }

        public void select()
        {
            selectTab(this);
        }

        public com.actionbarsherlock.app.ActionBar.Tab setIcon(int i)
        {
            return setIcon(mContext.getResources().getDrawable(i));
        }

        public com.actionbarsherlock.app.ActionBar.Tab setIcon(Drawable drawable)
        {
            mIcon = drawable;
            if (mPosition >= 0)
            {
                mTabScrollView.updateTab(mPosition);
            }
            return this;
        }

        public void setPosition(int i)
        {
            mPosition = i;
        }

        public com.actionbarsherlock.app.ActionBar.Tab setTabListener(com.actionbarsherlock.app.ActionBar.TabListener tablistener)
        {
            mCallback = tablistener;
            return this;
        }

        public TabImpl()
        {
            this$0 = ActionBarImpl.this;
            super();
            mPosition = -1;
        }
    }


    private class ActionModeImpl extends ActionMode
        implements com.actionbarsherlock.internal.view.menu.MenuBuilder.Callback
    {

        private com.actionbarsherlock.view.ActionMode.Callback mCallback;
        private WeakReference mCustomView;
        private MenuBuilder mMenu;
        final ActionBarImpl this$0;

        public boolean dispatchOnCreate()
        {
            mMenu.stopDispatchingItemsChanged();
            boolean flag = mCallback.onCreateActionMode(this, mMenu);
            mMenu.startDispatchingItemsChanged();
            return flag;
            Exception exception;
            exception;
            mMenu.startDispatchingItemsChanged();
            throw exception;
        }

        public void finish()
        {
            if (mActionMode == this) goto _L2; else goto _L1
_L1:
            return;
_L2:
label0:
            {
                if (mWasHiddenBeforeMode)
                {
                    mDeferredDestroyActionMode = this;
                    mDeferredModeDestroyCallback = mCallback;
                    if (ActionBarImpl.a == 0)
                    {
                        break label0;
                    }
                }
                mCallback.onDestroyActionMode(this);
            }
            mCallback = null;
            animateToMode(false);
            mContextView.closeMode();
            mActionView.sendAccessibilityEvent(32);
            mActionMode = null;
            if (mWasHiddenBeforeMode)
            {
                hide();
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        public Menu getMenu()
        {
            return mMenu;
        }

        public void invalidate()
        {
            mMenu.stopDispatchingItemsChanged();
            mCallback.onPrepareActionMode(this, mMenu);
            mMenu.startDispatchingItemsChanged();
            return;
            Exception exception;
            exception;
            mMenu.startDispatchingItemsChanged();
            throw exception;
        }

        public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
        {
            if (mCallback != null)
            {
                return mCallback.onActionItemClicked(this, menuitem);
            } else
            {
                return false;
            }
        }

        public void onMenuModeChange(MenuBuilder menubuilder)
        {
            if (mCallback == null)
            {
                return;
            } else
            {
                invalidate();
                mContextView.showOverflowMenu();
                return;
            }
        }

        public void setCustomView(View view)
        {
            mContextView.setCustomView(view);
            mCustomView = new WeakReference(view);
        }

        public void setTitle(CharSequence charsequence)
        {
            mContextView.setTitle(charsequence);
        }

        public ActionModeImpl(com.actionbarsherlock.view.ActionMode.Callback callback)
        {
            this$0 = ActionBarImpl.this;
            super();
            mCallback = callback;
            mMenu = (new MenuBuilder(getThemedContext())).setDefaultShowAsAction(1);
            mMenu.setCallback(this);
        }
    }

}
