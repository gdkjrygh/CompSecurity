// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.internal.app.ActionBarImpl;
import com.actionbarsherlock.internal.view.StandaloneActionMode;
import com.actionbarsherlock.internal.view.menu.ActionMenuPresenter;
import com.actionbarsherlock.internal.view.menu.MenuBuilder;
import com.actionbarsherlock.internal.view.menu.MenuItemImpl;
import com.actionbarsherlock.internal.widget.ActionBarContainer;
import com.actionbarsherlock.internal.widget.ActionBarContextView;
import com.actionbarsherlock.internal.widget.ActionBarView;
import com.actionbarsherlock.internal.widget.IcsProgressBar;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.actionbarsherlock.internal:
//            ResourcesCompat

public class ActionBarSherlockCompat extends ActionBarSherlock
    implements com.actionbarsherlock.internal.view.menu.MenuBuilder.Callback, com.actionbarsherlock.view.Window.Callback, com.actionbarsherlock.internal.view.menu.MenuPresenter.Callback, android.view.MenuItem.OnMenuItemClickListener
{

    private static final String z[];
    private ActionBarImpl aActionBar;
    private ActionMode mActionMode;
    private ActionBarContextView mActionModeView;
    private IcsProgressBar mCircularProgressBar;
    private boolean mClosingActionMenu;
    private ViewGroup mContentParent;
    private ViewGroup mDecor;
    private int mFeatures;
    private IcsProgressBar mHorizontalProgressBar;
    private boolean mIsDestroyed;
    private boolean mIsFloating;
    private boolean mIsTitleReady;
    private MenuBuilder mMenu;
    private Bundle mMenuFrozenActionViewState;
    private boolean mMenuIsPrepared;
    private boolean mMenuRefreshContent;
    protected HashMap mNativeItemMap;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private CharSequence mTitle;
    private TextView mTitleView;
    private int mUiOptions;
    private ActionBarView wActionBar;

    public ActionBarSherlockCompat(Activity activity, int i)
    {
        super(activity, i);
        mReserveOverflowSet = false;
        mIsTitleReady = false;
        mIsDestroyed = false;
        mFeatures = 0;
        mUiOptions = 0;
        mTitle = null;
    }

    public static String cleanActivityName(String s, String s1)
    {
        if (s1.charAt(0) != '.') goto _L2; else goto _L1
_L1:
        String s2 = (new StringBuilder()).append(s).append(s1).toString();
_L4:
        return s2;
        s;
        throw s;
_L2:
        s2 = s1;
        if (s1.indexOf('.', 1) != -1) goto _L4; else goto _L3
_L3:
        s = (new StringBuilder()).append(s).append(".").append(s1).toString();
        return s;
        s;
        throw s;
    }

    private ViewGroup generateLayout()
    {
        Object obj;
        int j;
        j = ResourcesCompat.a;
        obj = mActivity.getTheme().obtainStyledAttributes(com.actionbarsherlock.R.styleable.SherlockTheme);
        try
        {
            mIsFloating = ((TypedArray) (obj)).getBoolean(com.actionbarsherlock.R.styleable.SherlockTheme_android_windowIsFloating, false);
            if (!((TypedArray) (obj)).hasValue(com.actionbarsherlock.R.styleable.SherlockTheme_windowActionBar))
            {
                throw new IllegalStateException(z[15]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        boolean flag = ((TypedArray) (obj)).getBoolean(com.actionbarsherlock.R.styleable.SherlockTheme_windowNoTitle, false);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        requestFeature(1);
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        try
        {
            if (((TypedArray) (obj)).getBoolean(com.actionbarsherlock.R.styleable.SherlockTheme_windowActionBar, false))
            {
                requestFeature(8);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        {
label0:
            {
                int i;
                boolean flag1;
                try
                {
                    if (((TypedArray) (obj)).getBoolean(com.actionbarsherlock.R.styleable.SherlockTheme_windowActionBarOverlay, false))
                    {
                        requestFeature(9);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                try
                {
                    if (((TypedArray) (obj)).getBoolean(com.actionbarsherlock.R.styleable.SherlockTheme_windowActionModeOverlay, false))
                    {
                        requestFeature(10);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                try
                {
                    ((TypedArray) (obj)).recycle();
                    if (hasFeature(1))
                    {
                        break label0;
                    }
                    flag1 = mIsFloating;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                if (flag1)
                {
                    mDecor = (ViewGroup)mDecor.getParent();
                    mDecor.removeAllViews();
                    i = com.actionbarsherlock.R.layout.abs__dialog_title_holo;
                    if (j == 0)
                    {
                        break MISSING_BLOCK_LABEL_256;
                    }
                }
                try
                {
                    flag1 = hasFeature(9);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                if (flag1)
                {
                    i = com.actionbarsherlock.R.layout.abs__screen_action_bar_overlay;
                    if (j == 0)
                    {
                        break MISSING_BLOCK_LABEL_256;
                    }
                }
                i = com.actionbarsherlock.R.layout.abs__screen_action_bar;
                if (j == 0)
                {
                    break MISSING_BLOCK_LABEL_256;
                }
            }
label1:
            {
                try
                {
                    if (!hasFeature(10))
                    {
                        break label1;
                    }
                    flag1 = hasFeature(1);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                if (!flag1)
                {
                    i = com.actionbarsherlock.R.layout.abs__screen_simple_overlay_action_mode;
                    if (j == 0)
                    {
                        break MISSING_BLOCK_LABEL_256;
                    }
                }
            }
            i = com.actionbarsherlock.R.layout.abs__screen_simple;
        }
        obj = mActivity.getLayoutInflater().inflate(i, null);
        mDecor.addView(((View) (obj)), new android.view.ViewGroup.LayoutParams(-1, -1));
        obj = (ViewGroup)mDecor.findViewById(com.actionbarsherlock.R.id.abs__content);
        if (obj == null)
        {
            try
            {
                throw new RuntimeException(z[14]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        break MISSING_BLOCK_LABEL_345;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        mDecor.setId(-1);
        ((ViewGroup) (obj)).setId(0x1020002);
        if (hasFeature(5))
        {
            IcsProgressBar icsprogressbar = getCircularProgressBar(false);
            if (icsprogressbar != null)
            {
                try
                {
                    icsprogressbar.setIndeterminate(true);
                }
                catch (IllegalStateException illegalstateexception)
                {
                    throw illegalstateexception;
                }
            }
        }
        return ((ViewGroup) (obj));
    }

    private IcsProgressBar getCircularProgressBar(boolean flag)
    {
label0:
        {
            IcsProgressBar icsprogressbar;
            try
            {
                if (mCircularProgressBar == null)
                {
                    break label0;
                }
                icsprogressbar = mCircularProgressBar;
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            return icsprogressbar;
        }
        ViewGroup viewgroup = mContentParent;
        IllegalStateException illegalstateexception1;
        if (viewgroup == null && flag)
        {
            try
            {
                installDecor();
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
        }
        try
        {
            mCircularProgressBar = (IcsProgressBar)mDecor.findViewById(com.actionbarsherlock.R.id.abs__progress_circular);
            if (mCircularProgressBar != null)
            {
                mCircularProgressBar.setVisibility(4);
            }
        }
        catch (IllegalStateException illegalstateexception3)
        {
            throw illegalstateexception3;
        }
        return mCircularProgressBar;
        illegalstateexception1;
        throw illegalstateexception1;
    }

    private int getFeatures()
    {
        return mFeatures;
    }

    private IcsProgressBar getHorizontalProgressBar(boolean flag)
    {
label0:
        {
            IcsProgressBar icsprogressbar;
            try
            {
                if (mHorizontalProgressBar == null)
                {
                    break label0;
                }
                icsprogressbar = mHorizontalProgressBar;
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            return icsprogressbar;
        }
        ViewGroup viewgroup = mContentParent;
        IllegalStateException illegalstateexception1;
        if (viewgroup == null && flag)
        {
            try
            {
                installDecor();
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
        }
        try
        {
            mHorizontalProgressBar = (IcsProgressBar)mDecor.findViewById(com.actionbarsherlock.R.id.abs__progress_horizontal);
            if (mHorizontalProgressBar != null)
            {
                mHorizontalProgressBar.setVisibility(4);
            }
        }
        catch (IllegalStateException illegalstateexception3)
        {
            throw illegalstateexception3;
        }
        return mHorizontalProgressBar;
        illegalstateexception1;
        throw illegalstateexception1;
    }

    private void hideProgressBars(IcsProgressBar icsprogressbar, IcsProgressBar icsprogressbar1)
    {
        Animation animation;
        int i;
        i = mFeatures;
        animation = AnimationUtils.loadAnimation(mActivity, 0x10a0001);
        animation.setDuration(1000L);
        if ((i & 0x20) != 0)
        {
            try
            {
                if (icsprogressbar1.getVisibility() == 0)
                {
                    icsprogressbar1.startAnimation(animation);
                    icsprogressbar1.setVisibility(4);
                }
            }
            // Misplaced declaration of an exception variable
            catch (IcsProgressBar icsprogressbar)
            {
                throw icsprogressbar;
            }
        }
        if ((i & 4) == 0)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        if (icsprogressbar.getVisibility() == 0)
        {
            icsprogressbar.startAnimation(animation);
            icsprogressbar.setVisibility(4);
        }
        return;
        icsprogressbar;
        throw icsprogressbar;
        icsprogressbar;
        throw icsprogressbar;
    }

    private void initActionBar()
    {
        ActionBarImpl actionbarimpl;
        boolean flag;
        try
        {
            if (mDecor == null)
            {
                installDecor();
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        actionbarimpl = aActionBar;
        if (actionbarimpl != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        flag = hasFeature(8);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        flag = hasFeature(1);
        if (!flag)
        {
            IllegalStateException illegalstateexception1;
            boolean flag1;
            try
            {
                flag1 = mActivity.isChild();
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
            if (!flag1)
            {
                try
                {
                    aActionBar = new ActionBarImpl(mActivity, mFeatures);
                    if (!mIsDelegate)
                    {
                        wActionBar.setWindowTitle(mActivity.getTitle());
                        return;
                    }
                }
                catch (IllegalStateException illegalstateexception3)
                {
                    throw illegalstateexception3;
                }
            }
        }
        return;
        illegalstateexception1;
        throw illegalstateexception1;
        illegalstateexception1;
        throw illegalstateexception1;
        illegalstateexception1;
        throw illegalstateexception1;
    }

    private boolean initializePanelMenu()
    {
        Object obj = mActivity;
        if (wActionBar != null)
        {
            TypedValue typedvalue = new TypedValue();
            ((Context) (obj)).getTheme().resolveAttribute(com.actionbarsherlock.R.attr.actionBarWidgetTheme, typedvalue, true);
            int i = typedvalue.resourceId;
            if (i != 0)
            {
                obj = new ContextThemeWrapper(((Context) (obj)), i);
            }
        }
        mMenu = new MenuBuilder(((Context) (obj)));
        mMenu.setCallback(this);
        return true;
    }

    private void installDecor()
    {
        Object obj;
        int j = ResourcesCompat.a;
        Object obj1;
        int i;
        int k;
        boolean flag;
        boolean flag2;
        try
        {
            if (mDecor == null)
            {
                mDecor = (ViewGroup)mActivity.getWindow().getDecorView().findViewById(0x1020002);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (mContentParent != null) goto _L2; else goto _L1
_L1:
        if (mDecor.getChildCount() <= 0) goto _L4; else goto _L3
_L3:
label0:
        {
            obj1 = new ArrayList(1);
            k = mDecor.getChildCount();
            i = 0;
            do
            {
                obj = obj1;
                if (i >= k)
                {
                    break label0;
                }
                obj = mDecor.getChildAt(0);
                mDecor.removeView(((View) (obj)));
                ((List) (obj1)).add(obj);
                i++;
            } while (j == 0);
            obj = obj1;
        }
_L12:
        mContentParent = generateLayout();
        if (obj != null)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                obj1 = (View)((Iterator) (obj)).next();
                mContentParent.addView(((View) (obj1)));
            } while (j == 0);
        }
        mTitleView = (TextView)mDecor.findViewById(0x1020016);
        obj = mTitleView;
        if (obj == null) goto _L6; else goto _L5
_L5:
        flag = hasFeature(1);
        if (!flag) goto _L8; else goto _L7
_L7:
        mTitleView.setVisibility(8);
        flag = mContentParent instanceof FrameLayout;
        if (!flag) goto _L2; else goto _L9
_L9:
        ((FrameLayout)mContentParent).setForeground(null);
        if (j == 0) goto _L2; else goto _L8
_L8:
        mTitleView.setText(mTitle);
        if (j == 0) goto _L2; else goto _L6
_L6:
        wActionBar = (ActionBarView)mDecor.findViewById(com.actionbarsherlock.R.id.abs__action_bar);
        obj = wActionBar;
        if (obj == null) goto _L2; else goto _L10
_L10:
label1:
        {
            boolean flag1;
            try
            {
                wActionBar.setWindowCallback(this);
                if (wActionBar.getTitle() == null)
                {
                    wActionBar.setWindowTitle(mActivity.getTitle());
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            try
            {
                if (hasFeature(2))
                {
                    wActionBar.initProgress();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            try
            {
                if (hasFeature(5))
                {
                    wActionBar.initIndeterminateProgress();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            i = loadUiOptionsFromManifest(mActivity);
            if (i != 0)
            {
                try
                {
                    mUiOptions = i;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
            }
            try
            {
                i = mUiOptions;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if ((i & 1) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                flag2 = ResourcesCompat.getResources_getBoolean(mActivity, com.actionbarsherlock.R.bool.abs__split_action_bar_is_narrow);
                if (j == 0)
                {
                    break label1;
                }
            }
            flag2 = mActivity.getTheme().obtainStyledAttributes(com.actionbarsherlock.R.styleable.SherlockTheme).getBoolean(com.actionbarsherlock.R.styleable.SherlockTheme_windowSplitActionBar, false);
        }
        obj = (ActionBarContainer)mDecor.findViewById(com.actionbarsherlock.R.id.abs__split_action_bar);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_515;
        }
        wActionBar.setSplitView(((ActionBarContainer) (obj)));
        wActionBar.setSplitActionBar(flag2);
        wActionBar.setSplitWhenNarrow(flag1);
        mActionModeView = (ActionBarContextView)mDecor.findViewById(com.actionbarsherlock.R.id.abs__action_context_bar);
        mActionModeView.setSplitView(((ActionBarContainer) (obj)));
        mActionModeView.setSplitActionBar(flag2);
        mActionModeView.setSplitWhenNarrow(flag1);
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_536;
        }
        if (flag2)
        {
            try
            {
                Log.e(z[7], z[6]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        mDecor.post(new _cls1());
_L2:
        return;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        obj;
        throw obj;
_L4:
        obj = null;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private boolean isReservingOverflow()
    {
        try
        {
            if (!mReserveOverflowSet)
            {
                mReserveOverflow = ActionMenuPresenter.reserveOverflow(mActivity);
                mReserveOverflowSet = true;
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        return mReserveOverflow;
    }

    private static int loadUiOptionsFromManifest(Activity activity)
    {
        int i;
        int j;
        int j1;
        j1 = ResourcesCompat.a;
        j = 0;
        i = j;
        String s1 = activity.getClass().getName();
        i = j;
        String s2 = activity.getApplicationInfo().packageName;
        i = j;
        XmlResourceParser xmlresourceparser = activity.createPackageContext(s2, 0).getAssets().openXmlResourceParser(z[1]);
        i = j;
        int k = xmlresourceparser.getEventType();
        i = 0;
_L23:
        j = i;
        if (k == 1)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (k != 2) goto _L2; else goto _L1
_L1:
        k = i;
        activity = xmlresourceparser.getName();
        j = i;
        k = i;
        if (!z[4].equals(activity)) goto _L4; else goto _L3
_L3:
        k = i;
        j = xmlresourceparser.getAttributeCount();
        k = j - 1;
        j = i;
_L27:
        if (k < 0)
        {
            break MISSING_BLOCK_LABEL_574;
        }
        i = j;
        if (!z[0].equals(xmlresourceparser.getAttributeName(k))) goto _L6; else goto _L5
_L5:
        i = j;
        j = xmlresourceparser.getAttributeIntValue(k, 0);
        i = j;
        if (j1 == 0) goto _L8; else goto _L7
_L7:
        i = j;
_L28:
        if (j1 == 0) goto _L9; else goto _L8
_L8:
        j = i;
        if (j1 == 0) goto _L2; else goto _L10
_L10:
        j = i;
_L4:
        boolean flag = z[3].equals(activity);
        if (!flag) goto _L2; else goto _L11
_L11:
        i = j;
        int l = xmlresourceparser.getAttributeCount();
        String s;
        k = 0;
        activity = null;
        s = null;
        l--;
_L26:
        int i1;
        i1 = k;
        i = j;
        if (l < 0) goto _L13; else goto _L12
_L12:
        i = j;
        String s3 = xmlresourceparser.getAttributeName(l);
        i = j;
        if (!z[5].equals(s3)) goto _L15; else goto _L14
_L14:
        i = j;
        i1 = xmlresourceparser.getAttributeIntValue(l, 0);
        Activity activity1;
        activity = Integer.valueOf(i1);
        activity1 = activity;
        if (j1 == 0) goto _L16; else goto _L15
_L15:
        flag = z[2].equals(s3);
        activity1 = activity;
        if (!flag) goto _L16; else goto _L17
_L17:
        i = j;
        s = cleanActivityName(s2, xmlresourceparser.getAttributeValue(l));
        flag = s1.equals(s);
        if (flag) goto _L19; else goto _L18
_L18:
        i1 = k;
        i = j;
        if (j1 == 0) goto _L13; else goto _L19
_L19:
        k = 1;
_L25:
        i = j;
        if (activity == null)
        {
            break MISSING_BLOCK_LABEL_436;
        }
        i = j;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_436;
        }
        i = j;
        j = activity.intValue();
        i = j;
        if (j1 == 0) goto _L21; else goto _L20
_L20:
        i1 = k;
_L13:
        j = i;
        if (i1 != 0)
        {
            j = i;
            if (j1 == 0)
            {
                break; /* Loop/switch isn't completed */
            }
            j = i;
        }
_L2:
        k = j;
        i = xmlresourceparser.nextToken();
        k = i;
        i = j;
        if (j1 == 0) goto _L23; else goto _L22
_L22:
        return j;
        activity;
        i = j;
        try
        {
            throw activity;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity) { }
_L24:
        activity.printStackTrace();
        return i;
        activity;
        i = j;
        throw activity;
        activity;
        i = j;
        throw activity;
        activity;
        i = k;
        if (true) goto _L24; else goto _L16
_L16:
        activity = activity1;
          goto _L25
_L21:
        l--;
        j = i;
          goto _L26
_L9:
        k--;
        j = i;
          goto _L27
_L6:
        i = j;
          goto _L28
        i = j;
          goto _L8
    }

    private void onIntChanged(int i, int j)
    {
        if (i != 2 && i != 5)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        updateProgressBars(j);
        return;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
    }

    private boolean preparePanel()
    {
        boolean flag;
        boolean flag2;
        boolean flag3;
        flag2 = false;
        flag3 = false;
        try
        {
            flag = mMenuIsPrepared;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = true;
_L4:
        return flag;
_L2:
        MenuBuilder menubuilder = mMenu;
        if (menubuilder == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        flag = mMenuRefreshContent;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        menubuilder = mMenu;
        if (menubuilder != null)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag4 = initializePanelMenu();
        flag = flag3;
        if (!flag4) goto _L4; else goto _L3
_L3:
        MenuBuilder menubuilder1;
        IllegalStateException illegalstateexception1;
        try
        {
            menubuilder1 = mMenu;
        }
        catch (IllegalStateException illegalstateexception2)
        {
            throw illegalstateexception2;
        }
        flag = flag3;
        if (menubuilder1 == null) goto _L4; else goto _L5
_L5:
        try
        {
            if (wActionBar != null)
            {
                wActionBar.setMenu(mMenu, this);
            }
        }
        catch (IllegalStateException illegalstateexception3)
        {
            throw illegalstateexception3;
        }
        mMenu.stopDispatchingItemsChanged();
        flag = callbackCreateOptionsMenu(mMenu);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        try
        {
            mMenu = null;
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
        flag = flag3;
        if (wActionBar == null) goto _L4; else goto _L6
_L6:
        wActionBar.setMenu(null, this);
        return false;
        illegalstateexception1;
        throw illegalstateexception1;
        illegalstateexception1;
        throw illegalstateexception1;
        illegalstateexception1;
        throw illegalstateexception1;
        illegalstateexception1;
        throw illegalstateexception1;
        IllegalStateException illegalstateexception4;
        illegalstateexception4;
        throw illegalstateexception4;
        mMenuRefreshContent = false;
        try
        {
            mMenu.stopDispatchingItemsChanged();
            if (mMenuFrozenActionViewState != null)
            {
                mMenu.restoreActionViewStates(mMenuFrozenActionViewState);
                mMenuFrozenActionViewState = null;
            }
        }
        catch (IllegalStateException illegalstateexception5)
        {
            throw illegalstateexception5;
        }
        flag = callbackPrepareOptionsMenu(mMenu);
        if (!flag)
        {
            IllegalStateException illegalstateexception6;
            try
            {
                if (wActionBar != null)
                {
                    wActionBar.setMenu(null, this);
                }
            }
            catch (IllegalStateException illegalstateexception7)
            {
                throw illegalstateexception7;
            }
            mMenu.startDispatchingItemsChanged();
            return false;
        }
        break MISSING_BLOCK_LABEL_259;
        illegalstateexception6;
        throw illegalstateexception6;
        KeyCharacterMap keycharactermap = KeyCharacterMap.load(-1);
        MenuBuilder menubuilder2;
        int i;
        boolean flag1;
        try
        {
            menubuilder2 = mMenu;
            i = keycharactermap.getKeyboardType();
        }
        catch (IllegalStateException illegalstateexception8)
        {
            throw illegalstateexception8;
        }
        flag1 = flag2;
        if (i != 1)
        {
            flag1 = true;
        }
        menubuilder2.setQwertyMode(flag1);
        mMenu.startDispatchingItemsChanged();
        mMenuIsPrepared = true;
        return true;
    }

    private void reopenMenu(boolean flag)
    {
        Object obj = wActionBar;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        boolean flag1 = wActionBar.isOverflowReserved();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        flag1 = wActionBar.isOverflowMenuShowing();
        if (flag1 && flag)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        int i = wActionBar.getVisibility();
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        flag = callbackPrepareOptionsMenu(mMenu);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        wActionBar.showOverflowMenu();
        obj = aActionBar;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        IllegalStateException illegalstateexception;
        int j;
        try
        {
            aActionBar.dispatchMenuVisibilityChanged(true);
            j = ResourcesCompat.a;
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
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        wActionBar.hideOverflowMenu();
        if (aActionBar != null)
        {
            aActionBar.dispatchMenuVisibilityChanged(false);
        }
        return;
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
    }

    private void setFeatureInt(int i, int j)
    {
        updateInt(i, j, false);
    }

    private void showProgressBars(IcsProgressBar icsprogressbar, IcsProgressBar icsprogressbar1)
    {
        int i = mFeatures;
        if ((i & 0x20) != 0)
        {
            try
            {
                if (icsprogressbar1.getVisibility() == 4)
                {
                    icsprogressbar1.setVisibility(0);
                }
            }
            // Misplaced declaration of an exception variable
            catch (IcsProgressBar icsprogressbar)
            {
                throw icsprogressbar;
            }
        }
        if ((i & 4) == 0)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (icsprogressbar.getProgress() < 10000)
        {
            icsprogressbar.setVisibility(0);
        }
        return;
        icsprogressbar;
        throw icsprogressbar;
    }

    private void updateInt(int i, int j, boolean flag)
    {
        ViewGroup viewgroup;
        try
        {
            viewgroup = mContentParent;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (viewgroup != null) goto _L2; else goto _L1
_L1:
        int k;
        return;
_L2:
        if ((1 << i & (k = getFeatures())) == 0 && !flag) goto _L1; else goto _L3
_L3:
        onIntChanged(i, j);
        return;
        IllegalStateException illegalstateexception1;
        illegalstateexception1;
        try
        {
            throw illegalstateexception1;
        }
        catch (IllegalStateException illegalstateexception2)
        {
            throw illegalstateexception2;
        }
    }

    private void updateProgressBars(int i)
    {
        boolean flag = false;
        int k = ResourcesCompat.a;
        IcsProgressBar icsprogressbar = getCircularProgressBar(true);
        IcsProgressBar icsprogressbar1 = getHorizontalProgressBar(true);
        int l = mFeatures;
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        if ((l & 4) != 0)
        {
            int i1 = icsprogressbar1.getProgress();
            int j;
            boolean flag1;
            try
            {
                flag1 = icsprogressbar1.isIndeterminate();
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
            j = ((flag) ? 1 : 0);
            if (!flag1)
            {
                if (i1 < 10000)
                {
                    j = ((flag) ? 1 : 0);
                } else
                {
                    j = 4;
                }
            }
            icsprogressbar1.setVisibility(j);
        }
        if ((l & 0x20) == 0)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        icsprogressbar.setVisibility(0);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        if (i != -2)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        IllegalStateException illegalstateexception2;
        if ((l & 4) != 0)
        {
            try
            {
                icsprogressbar1.setVisibility(8);
            }
            catch (IllegalStateException illegalstateexception3)
            {
                throw illegalstateexception3;
            }
        }
        if ((l & 0x20) == 0)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        icsprogressbar.setVisibility(8);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        if (i != -3)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        icsprogressbar1.setIndeterminate(true);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        if (i != -4)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        icsprogressbar1.setIndeterminate(false);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        if (i < 0 || i > 10000)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        icsprogressbar1.setProgress(i + 0);
        if (i >= 10000)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        showProgressBars(icsprogressbar1, icsprogressbar);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        IllegalStateException illegalstateexception4;
        try
        {
            hideProgressBars(icsprogressbar1, icsprogressbar);
        }
        catch (IllegalStateException illegalstateexception5)
        {
            try
            {
                throw illegalstateexception5;
            }
            catch (IllegalStateException illegalstateexception6)
            {
                try
                {
                    throw illegalstateexception6;
                }
                catch (IllegalStateException illegalstateexception7)
                {
                    throw illegalstateexception7;
                }
            }
        }
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        if (20000 > i || i > 30000)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        icsprogressbar1.setSecondaryProgress(i - 20000);
        showProgressBars(icsprogressbar1, icsprogressbar);
        return;
        illegalstateexception2;
        throw illegalstateexception2;
        illegalstateexception2;
        throw illegalstateexception2;
        illegalstateexception4;
        throw illegalstateexception4;
        illegalstateexception4;
        throw illegalstateexception4;
        illegalstateexception4;
        throw illegalstateexception4;
        illegalstateexception4;
        throw illegalstateexception4;
        illegalstateexception4;
        throw illegalstateexception4;
        illegalstateexception4;
        throw illegalstateexception4;
        illegalstateexception4;
        throw illegalstateexception4;
        illegalstateexception4;
        throw illegalstateexception4;
        illegalstateexception4;
        throw illegalstateexception4;
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        try
        {
            if (mContentParent == null)
            {
                installDecor();
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        mContentParent.addView(view, layoutparams);
        initActionBar();
    }

    void checkCloseActionMenu(Menu menu)
    {
        boolean flag;
        try
        {
            flag = mClosingActionMenu;
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
        if (flag)
        {
            return;
        } else
        {
            mClosingActionMenu = true;
            wActionBar.dismissPopupMenus();
            mClosingActionMenu = false;
            return;
        }
    }

    public boolean dispatchCloseOptionsMenu()
    {
        boolean flag;
        try
        {
            flag = isReservingOverflow();
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (wActionBar == null) goto _L1; else goto _L3
_L3:
        flag = wActionBar.hideOverflowMenu();
        return flag;
        IllegalStateException illegalstateexception1;
        illegalstateexception1;
        throw illegalstateexception1;
    }

    public void dispatchConfigurationChanged(Configuration configuration)
    {
        try
        {
            if (aActionBar != null)
            {
                aActionBar.onConfigurationChanged(configuration);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Configuration configuration)
        {
            throw configuration;
        }
    }

    public boolean dispatchCreateOptionsMenu(android.view.Menu menu)
    {
        return true;
    }

    public void dispatchDestroy()
    {
        mIsDestroyed = true;
    }

    public void dispatchInvalidateOptionsMenu()
    {
        if (mMenu != null)
        {
            Bundle bundle = new Bundle();
            try
            {
                mMenu.saveActionViewStates(bundle);
                if (bundle.size() > 0)
                {
                    mMenuFrozenActionViewState = bundle;
                }
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            mMenu.stopDispatchingItemsChanged();
            mMenu.clear();
        }
        try
        {
            mMenuRefreshContent = true;
            if (wActionBar != null)
            {
                mMenuIsPrepared = false;
                preparePanel();
            }
            return;
        }
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        int i;
        boolean flag;
        flag = true;
        if (keyevent.getKeyCode() != 4)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        i = keyevent.getAction();
        keyevent = mActionMode;
        if (keyevent != null)
        {
            if (i == 1)
            {
                try
                {
                    mActionMode.finish();
                }
                // Misplaced declaration of an exception variable
                catch (KeyEvent keyevent)
                {
                    throw keyevent;
                }
                return true;
            }
            break MISSING_BLOCK_LABEL_92;
        }
        break MISSING_BLOCK_LABEL_44;
        keyevent;
        throw keyevent;
        keyevent = wActionBar;
        if (keyevent == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        boolean flag1 = wActionBar.hasExpandedActionView();
        if (flag1)
        {
            if (i == 1)
            {
                try
                {
                    wActionBar.collapseActionView();
                }
                // Misplaced declaration of an exception variable
                catch (KeyEvent keyevent)
                {
                    throw keyevent;
                }
                return true;
            }
            break MISSING_BLOCK_LABEL_92;
        }
        break MISSING_BLOCK_LABEL_90;
        keyevent;
        try
        {
            throw keyevent;
        }
        // Misplaced declaration of an exception variable
        catch (KeyEvent keyevent) { }
        throw keyevent;
        flag = false;
        return flag;
    }

    public boolean dispatchMenuOpened(int i, android.view.Menu menu)
    {
        if (i == 8 || i == 0)
        {
            try
            {
                if (aActionBar != null)
                {
                    aActionBar.dispatchMenuVisibilityChanged(true);
                }
            }
            // Misplaced declaration of an exception variable
            catch (android.view.Menu menu)
            {
                throw menu;
            }
            return true;
        } else
        {
            return false;
        }
    }

    public boolean dispatchOpenOptionsMenu()
    {
        boolean flag;
        try
        {
            flag = isReservingOverflow();
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (!flag)
        {
            return false;
        } else
        {
            return wActionBar.showOverflowMenu();
        }
    }

    public boolean dispatchOptionsItemSelected(MenuItem menuitem)
    {
        throw new IllegalStateException(z[13]);
    }

    public void dispatchPanelClosed(int i, android.view.Menu menu)
    {
        if (i != 8 && i != 0)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (aActionBar != null)
        {
            aActionBar.dispatchMenuVisibilityChanged(false);
        }
        return;
        menu;
        throw menu;
    }

    public void dispatchPause()
    {
        ActionBarView actionbarview = wActionBar;
        IllegalStateException illegalstateexception;
        if (actionbarview != null)
        {
            try
            {
                if (wActionBar.isOverflowMenuShowing())
                {
                    wActionBar.hideOverflowMenu();
                    return;
                }
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        break MISSING_BLOCK_LABEL_34;
        illegalstateexception;
        throw illegalstateexception;
    }

    public void dispatchPostCreate(Bundle bundle)
    {
        try
        {
            if (mIsDelegate)
            {
                mIsTitleReady = true;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            if (mDecor == null)
            {
                initActionBar();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
    }

    public void dispatchPostResume()
    {
        try
        {
            if (aActionBar != null)
            {
                aActionBar.setShowHideAnimationEnabled(true);
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    public boolean dispatchPrepareOptionsMenu(android.view.Menu menu)
    {
        ActionMode actionmode;
        try
        {
            actionmode = mActionMode;
        }
        // Misplaced declaration of an exception variable
        catch (android.view.Menu menu)
        {
            throw menu;
        }
        if (actionmode == null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj;
        boolean flag;
        try
        {
            mMenuIsPrepared = false;
            flag = preparePanel();
        }
        // Misplaced declaration of an exception variable
        catch (android.view.Menu menu)
        {
            throw menu;
        }
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            flag = isReservingOverflow();
        }
        // Misplaced declaration of an exception variable
        catch (android.view.Menu menu)
        {
            throw menu;
        }
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj = mNativeItemMap;
        }
        // Misplaced declaration of an exception variable
        catch (android.view.Menu menu)
        {
            try
            {
                throw menu;
            }
            // Misplaced declaration of an exception variable
            catch (android.view.Menu menu)
            {
                throw menu;
            }
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        mNativeItemMap = new HashMap();
        if (ResourcesCompat.a == 0)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        mNativeItemMap.clear();
        try
        {
            obj = mMenu;
        }
        // Misplaced declaration of an exception variable
        catch (android.view.Menu menu)
        {
            throw menu;
        }
        if (obj != null)
        {
            return mMenu.bindNativeOverflow(menu, this, mNativeItemMap);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void dispatchRestoreInstanceState(Bundle bundle)
    {
        mMenuFrozenActionViewState = (Bundle)bundle.getParcelable(z[12]);
    }

    public void dispatchSaveInstanceState(Bundle bundle)
    {
        try
        {
            if (mMenu != null)
            {
                mMenuFrozenActionViewState = new Bundle();
                mMenu.saveActionViewStates(mMenuFrozenActionViewState);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        bundle.putParcelable(z[11], mMenuFrozenActionViewState);
    }

    public void dispatchStop()
    {
        try
        {
            if (aActionBar != null)
            {
                aActionBar.setShowHideAnimationEnabled(false);
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    public void dispatchTitleChanged(CharSequence charsequence, int i)
    {
        boolean flag = mIsDelegate;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        flag = mIsTitleReady;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        TextView textview = mTitleView;
        if (textview == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        mTitleView.setText(charsequence);
        i = ResourcesCompat.a;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        try
        {
            if (wActionBar != null)
            {
                wActionBar.setWindowTitle(charsequence);
            }
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        mTitle = charsequence;
        return;
        charsequence;
        try
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence) { }
        try
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence) { }
        try
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence) { }
        throw charsequence;
    }

    public ActionBar getActionBar()
    {
        initActionBar();
        return aActionBar;
    }

    protected Context getThemedContext()
    {
        return aActionBar.getThemedContext();
    }

    public boolean hasFeature(int i)
    {
        int j;
        try
        {
            j = mFeatures;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        return (j & 1 << i) != 0;
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        checkCloseActionMenu(menubuilder);
    }

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        MenuItemImpl menuitemimpl;
        menuitemimpl = (MenuItemImpl)mNativeItemMap.get(menuitem);
        if (menuitemimpl == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        menuitemimpl.invoke();
        if (ResourcesCompat.a == 0)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        Log.e(z[9], (new StringBuilder()).append(z[8]).append(menuitem).append(z[10]).toString());
        return true;
        menuitem;
        throw menuitem;
    }

    public boolean onMenuItemSelected(int i, com.actionbarsherlock.view.MenuItem menuitem)
    {
        return callbackOptionsItemSelected(menuitem);
    }

    public boolean onMenuItemSelected(MenuBuilder menubuilder, com.actionbarsherlock.view.MenuItem menuitem)
    {
        return callbackOptionsItemSelected(menuitem);
    }

    public void onMenuModeChange(MenuBuilder menubuilder)
    {
        reopenMenu(true);
    }

    public boolean onOpenSubMenu(MenuBuilder menubuilder)
    {
        return true;
    }

    public boolean requestFeature(int i)
    {
        try
        {
            if (mContentParent != null)
            {
                throw new AndroidRuntimeException(z[16]);
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        switch (i)
        {
        case 3: // '\003'
        case 4: // '\004'
        case 6: // '\006'
        case 7: // '\007'
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 5: // '\005'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
            break;
        }
        try
        {
            mFeatures = mFeatures | 1 << i;
        }
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
        return true;
    }

    public void setContentView(int i)
    {
        int j = ResourcesCompat.a;
        ViewGroup viewgroup = mContentParent;
        if (viewgroup == null)
        {
            android.view.Window.Callback callback;
            IllegalStateException illegalstateexception;
            try
            {
                installDecor();
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_28;
            }
        }
        mContentParent.removeAllViews();
        mActivity.getLayoutInflater().inflate(i, mContentParent);
        callback = mActivity.getWindow().getCallback();
        if (callback != null)
        {
            try
            {
                callback.onContentChanged();
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
        }
        try
        {
            initActionBar();
            if (SherlockActivity.a)
            {
                ResourcesCompat.a = j + 1;
            }
            return;
        }
        catch (IllegalStateException illegalstateexception3)
        {
            throw illegalstateexception3;
        }
        illegalstateexception;
        throw illegalstateexception;
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        ViewGroup viewgroup;
        try
        {
            viewgroup = mContentParent;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
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
        if (viewgroup != null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        installDecor();
        if (ResourcesCompat.a == 0)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        mContentParent.removeAllViews();
        mContentParent.addView(view, layoutparams);
        view = mActivity.getWindow().getCallback();
        if (view != null)
        {
            try
            {
                view.onContentChanged();
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
        }
        initActionBar();
        return;
    }

    public void setProgressBarIndeterminateVisibility(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = -1;
        } else
        {
            byte0 = -2;
        }
        setFeatureInt(5, byte0);
    }

    public ActionMode startActionMode(com.actionbarsherlock.view.ActionMode.Callback callback)
    {
        boolean flag;
        Object obj = null;
        flag = false;
        int i = ResourcesCompat.a;
        ActionModeCallbackWrapper actionmodecallbackwrapper;
        boolean flag1;
        try
        {
            if (mActionMode != null)
            {
                mActionMode.finish();
            }
        }
        // Misplaced declaration of an exception variable
        catch (com.actionbarsherlock.view.ActionMode.Callback callback)
        {
            throw callback;
        }
        actionmodecallbackwrapper = new ActionModeCallbackWrapper(callback);
        initActionBar();
        if (aActionBar != null)
        {
            obj = aActionBar.startActionMode(actionmodecallbackwrapper);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        mActionMode = ((ActionMode) (obj));
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        try
        {
            flag1 = SherlockActivity.a;
        }
        // Misplaced declaration of an exception variable
        catch (com.actionbarsherlock.view.ActionMode.Callback callback)
        {
            throw callback;
        }
        if (!flag1)
        {
            flag = true;
        }
        SherlockActivity.a = flag;
        if (mActionModeView == null)
        {
            obj = (ViewStub)mDecor.findViewById(com.actionbarsherlock.R.id.abs__action_mode_bar_stub);
            if (obj != null)
            {
                try
                {
                    mActionModeView = (ActionBarContextView)((ViewStub) (obj)).inflate();
                }
                // Misplaced declaration of an exception variable
                catch (com.actionbarsherlock.view.ActionMode.Callback callback)
                {
                    throw callback;
                }
            }
        }
        if (mActionModeView == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        mActionModeView.killMode();
        obj = new StandaloneActionMode(mActivity, mActionModeView, actionmodecallbackwrapper, true);
        flag = callback.onCreateActionMode(((ActionMode) (obj)), ((ActionMode) (obj)).getMenu());
        if (flag)
        {
            try
            {
                ((ActionMode) (obj)).invalidate();
                mActionModeView.initForMode(((ActionMode) (obj)));
                mActionModeView.setVisibility(0);
                mActionMode = ((ActionMode) (obj));
                mActionModeView.sendAccessibilityEvent(32);
            }
            // Misplaced declaration of an exception variable
            catch (com.actionbarsherlock.view.ActionMode.Callback callback)
            {
                throw callback;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_213;
            }
        }
        mActionMode = null;
        callback = mActionMode;
        if (callback != null)
        {
            try
            {
                if (mActivity instanceof com.actionbarsherlock.ActionBarSherlock.OnActionModeStartedListener)
                {
                    ((com.actionbarsherlock.ActionBarSherlock.OnActionModeStartedListener)mActivity).onActionModeStarted(mActionMode);
                }
            }
            // Misplaced declaration of an exception variable
            catch (com.actionbarsherlock.view.ActionMode.Callback callback)
            {
                throw callback;
            }
        }
        return mActionMode;
        callback;
        throw callback;
        callback;
        throw callback;
        callback;
        throw callback;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[17];
        obj = "R\035\03524N\033<1";
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
                obj = "f\03260/N\020\037#.N\022714\t\f?.";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "I\025?'";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "F\027&+6N\000+";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "F\004\".)D\025&+/I";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "R\035\03524N\033<1";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "u\021#7%T\0007&`T\004>+4\007\02516)H\032r !UT%+4OT;,#H\031\"#4N\026>'`P\035<&/PT6'#H\006sb\t@\032=0)I\023r0%V\001714\t";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "f\027&+/I630\023O\021 ./D\037";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "h\004&+/I\007r+4B\031r`";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "f\027&+/I630\023O\021 ./D\037";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\005T<-4\007\022=7.CT;,`J\025\"2)I\023";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "T\03470,H\0279x\020F\0327.3";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "T\03470,H\0279x\020F\0327.3";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "i\025&+6BT1#,K\0263!+\007\035<4/L\0216l`d\0067#4BT3b4B\007&b#F\0077b!I\020r0%W\033 6a";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "d\033'.$IS&b&N\0326b#H\032&'.ST1-.S\025;,%UT$+%P";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "~\033'b-R\007&b5T\021r\026(B\0317l\023O\021 ./D\037~b\024O\021?'nt\03470,H\0279l\fN\023:6l\007 :'-BZ\001*%U\030=!+\t8;%(SZ\026#2L516)H\032\020#2\013T=0`FT6'2N\00236)Q\021|";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "U\021#7%T\000\024'!S\001 'h\016T?73ST0'`D\025>.%CT0'&H\0067b!C\020;,'\007\027=,4B\032&";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 456
    //                   0 479
    //                   1 486
    //                   2 493
    //                   3 500;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_500;
_L3:
        byte byte1 = 64;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 39;
          goto _L9
_L5:
        byte1 = 116;
          goto _L9
_L6:
        byte1 = 82;
          goto _L9
        byte1 = 66;
          goto _L9
    }








/*
    static ActionMode access$502(ActionBarSherlockCompat actionbarsherlockcompat, ActionMode actionmode)
    {
        actionbarsherlockcompat.mActionMode = actionmode;
        return actionmode;
    }

*/



}
