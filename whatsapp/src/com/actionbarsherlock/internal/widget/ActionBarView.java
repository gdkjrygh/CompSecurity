// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.internal.ActionBarSherlockCompat;
import com.actionbarsherlock.internal.ResourcesCompat;
import com.actionbarsherlock.internal.view.menu.ActionMenuItem;
import com.actionbarsherlock.internal.view.menu.ActionMenuPresenter;
import com.actionbarsherlock.internal.view.menu.ActionMenuView;
import com.actionbarsherlock.internal.view.menu.MenuBuilder;
import com.actionbarsherlock.internal.view.menu.MenuItemImpl;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            AbsActionBarView, IcsSpinner, IcsProgressBar, ScrollingTabContainerView, 
//            ActionBarContextView, IcsLinearLayout, ActionBarContainer

public class ActionBarView extends AbsActionBarView
{

    private static final String z[];
    private com.actionbarsherlock.app.ActionBar.OnNavigationListener mCallback;
    private ActionBarContextView mContextView;
    private View mCustomNavView;
    private int mDisplayOptions;
    View mExpandedActionView;
    private final android.view.View.OnClickListener mExpandedActionViewUpListener;
    private HomeView mExpandedHomeLayout;
    private ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    private HomeView mHomeLayout;
    private Drawable mIcon;
    private boolean mIncludeTabs;
    private int mIndeterminateProgressStyle;
    private IcsProgressBar mIndeterminateProgressView;
    private boolean mIsCollapsable;
    private boolean mIsCollapsed;
    private int mItemPadding;
    private IcsLinearLayout mListNavLayout;
    private Drawable mLogo;
    private ActionMenuItem mLogoNavItem;
    private final IcsAdapterView.OnItemSelectedListener mNavItemSelectedListener;
    private int mNavigationMode;
    private MenuBuilder mOptionsMenu;
    private int mProgressBarPadding;
    private int mProgressStyle;
    private IcsProgressBar mProgressView;
    private IcsSpinner mSpinner;
    private SpinnerAdapter mSpinnerAdapter;
    private CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private TextView mSubtitleView;
    private ScrollingTabContainerView mTabScrollView;
    private CharSequence mTitle;
    private LinearLayout mTitleLayout;
    private int mTitleStyleRes;
    private View mTitleUpView;
    private TextView mTitleView;
    private final android.view.View.OnClickListener mUpClickListener;
    private boolean mUserTitle;
    com.actionbarsherlock.view.Window.Callback mWindowCallback;

    public ActionBarView(Context context, AttributeSet attributeset)
    {
        Object obj;
        PackageManager packagemanager;
        int i;
        i = AbsActionBarView.b;
        super(context, attributeset);
        mDisplayOptions = -1;
        mNavItemSelectedListener = new _cls1();
        mExpandedActionViewUpListener = new _cls2();
        mUpClickListener = new _cls3();
        setBackgroundResource(0);
        attributeset = context.obtainStyledAttributes(attributeset, com.actionbarsherlock.R.styleable.SherlockActionBar, com.actionbarsherlock.R.attr.actionBarStyle, 0);
        obj = context.getApplicationInfo();
        packagemanager = context.getPackageManager();
        int j;
        mNavigationMode = attributeset.getInt(com.actionbarsherlock.R.styleable.SherlockActionBar_navigationMode, 0);
        mTitle = attributeset.getText(com.actionbarsherlock.R.styleable.SherlockActionBar_title);
        mSubtitle = attributeset.getText(com.actionbarsherlock.R.styleable.SherlockActionBar_subtitle);
        mLogo = attributeset.getDrawable(com.actionbarsherlock.R.styleable.SherlockActionBar_logo);
        if (mLogo != null)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        j = android.os.Build.VERSION.SDK_INT;
        if (j < 11)
        {
            Drawable drawable;
            int k;
            boolean flag;
            try
            {
                flag = context instanceof Activity;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_232;
            }
            k = loadLogoFromManifest((Activity)context);
            if (k != 0)
            {
                try
                {
                    mLogo = context.getResources().getDrawable(k);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    throw context;
                }
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_232;
            }
        }
        flag = context instanceof Activity;
        if (flag)
        {
            try
            {
                mLogo = packagemanager.getActivityLogo(((Activity)context).getComponentName());
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                Log.e(z[3], z[2], namenotfoundexception);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        try
        {
            if (mLogo == null)
            {
                mLogo = ((ApplicationInfo) (obj)).loadLogo(packagemanager);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        mIcon = attributeset.getDrawable(com.actionbarsherlock.R.styleable.SherlockActionBar_icon);
        drawable = mIcon;
        if (drawable != null)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        flag = context instanceof Activity;
        if (flag)
        {
            try
            {
                mIcon = packagemanager.getActivityIcon(((Activity)context).getComponentName());
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception1)
            {
                Log.e(z[0], z[1], namenotfoundexception1);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        try
        {
            if (mIcon == null)
            {
                mIcon = ((ApplicationInfo) (obj)).loadIcon(packagemanager);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        obj = LayoutInflater.from(context);
        k = attributeset.getResourceId(com.actionbarsherlock.R.styleable.SherlockActionBar_homeLayout, com.actionbarsherlock.R.layout.abs__action_bar_home);
        mHomeLayout = (HomeView)((LayoutInflater) (obj)).inflate(k, this, false);
        mExpandedHomeLayout = (HomeView)((LayoutInflater) (obj)).inflate(k, this, false);
        mExpandedHomeLayout.setUp(true);
        mExpandedHomeLayout.setOnClickListener(mExpandedActionViewUpListener);
        mExpandedHomeLayout.setContentDescription(getResources().getText(com.actionbarsherlock.R.string.abs__action_bar_up_description));
        mTitleStyleRes = attributeset.getResourceId(com.actionbarsherlock.R.styleable.SherlockActionBar_titleTextStyle, 0);
        mSubtitleStyleRes = attributeset.getResourceId(com.actionbarsherlock.R.styleable.SherlockActionBar_subtitleTextStyle, 0);
        mProgressStyle = attributeset.getResourceId(com.actionbarsherlock.R.styleable.SherlockActionBar_progressBarStyle, 0);
        mIndeterminateProgressStyle = attributeset.getResourceId(com.actionbarsherlock.R.styleable.SherlockActionBar_indeterminateProgressStyle, 0);
        mProgressBarPadding = attributeset.getDimensionPixelOffset(com.actionbarsherlock.R.styleable.SherlockActionBar_progressBarPadding, 0);
        mItemPadding = attributeset.getDimensionPixelOffset(com.actionbarsherlock.R.styleable.SherlockActionBar_itemPadding, 0);
        setDisplayOptions(attributeset.getInt(com.actionbarsherlock.R.styleable.SherlockActionBar_displayOptions, 0));
        k = attributeset.getResourceId(com.actionbarsherlock.R.styleable.SherlockActionBar_customNavigationLayout, 0);
        if (k != 0)
        {
            try
            {
                mCustomNavView = ((LayoutInflater) (obj)).inflate(k, this, false);
                mNavigationMode = 0;
                setDisplayOptions(mDisplayOptions | 0x10);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        try
        {
            mContentHeight = attributeset.getLayoutDimension(com.actionbarsherlock.R.styleable.SherlockActionBar_height, 0);
            attributeset.recycle();
            mLogoNavItem = new ActionMenuItem(context, 0, 0x102002c, 0, 0, mTitle);
            mHomeLayout.setOnClickListener(mUpClickListener);
            mHomeLayout.setClickable(true);
            mHomeLayout.setFocusable(true);
            if (SherlockActivity.a)
            {
                AbsActionBarView.b = i + 1;
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        context;
        throw context;
        context;
        throw context;
        context;
        throw context;
    }

    private void configPresenters(MenuBuilder menubuilder)
    {
        if (menubuilder == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        menubuilder.addMenuPresenter(mActionMenuPresenter);
        menubuilder.addMenuPresenter(mExpandedMenuPresenter);
        if (AbsActionBarView.b == 0)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        mActionMenuPresenter.initForMenu(mContext, null);
        mExpandedMenuPresenter.initForMenu(mContext, null);
        mActionMenuPresenter.updateMenuView(true);
        mExpandedMenuPresenter.updateMenuView(true);
        return;
        menubuilder;
        throw menubuilder;
    }

    private void initTitle()
    {
        byte byte0 = 8;
        boolean flag2 = true;
        if (mTitleLayout == null)
        {
            Object obj = LayoutInflater.from(getContext());
            int i;
            boolean flag;
            int j;
            boolean flag1;
            try
            {
                mTitleLayout = (LinearLayout)((LayoutInflater) (obj)).inflate(com.actionbarsherlock.R.layout.abs__action_bar_title_item, this, false);
                mTitleView = (TextView)mTitleLayout.findViewById(com.actionbarsherlock.R.id.abs__action_bar_title);
                mSubtitleView = (TextView)mTitleLayout.findViewById(com.actionbarsherlock.R.id.abs__action_bar_subtitle);
                mTitleUpView = mTitleLayout.findViewById(com.actionbarsherlock.R.id.abs__up);
                if (ActionBarSherlock.isRtl)
                {
                    ((ImageView)mTitleUpView).setImageResource(com.actionbarsherlock.R.drawable.abs__ic_ab_back_rtl_holo_dark);
                }
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            try
            {
                mTitleLayout.setOnClickListener(mUpClickListener);
                if (mTitleStyleRes != 0)
                {
                    mTitleView.setTextAppearance(mContext, mTitleStyleRes);
                }
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
            try
            {
                if (mTitle != null)
                {
                    mTitleView.setText(mTitle);
                }
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
            try
            {
                if (mSubtitleStyleRes != 0)
                {
                    mSubtitleView.setTextAppearance(mContext, mSubtitleStyleRes);
                }
            }
            catch (IllegalStateException illegalstateexception3)
            {
                throw illegalstateexception3;
            }
            try
            {
                if (mSubtitle != null)
                {
                    mSubtitleView.setText(mSubtitle);
                    mSubtitleView.setVisibility(0);
                }
            }
            catch (IllegalStateException illegalstateexception4)
            {
                throw illegalstateexception4;
            }
            try
            {
                i = mDisplayOptions;
            }
            catch (IllegalStateException illegalstateexception5)
            {
                throw illegalstateexception5;
            }
            if ((i & 4) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            try
            {
                j = mDisplayOptions;
            }
            catch (IllegalStateException illegalstateexception6)
            {
                throw illegalstateexception6;
            }
            if ((j & 2) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            try
            {
                obj = mTitleUpView;
            }
            catch (IllegalStateException illegalstateexception7)
            {
                try
                {
                    throw illegalstateexception7;
                }
                catch (IllegalStateException illegalstateexception8)
                {
                    throw illegalstateexception8;
                }
            }
            if (!flag1)
            {
                if (flag)
                {
                    byte0 = 0;
                } else
                {
                    byte0 = 4;
                }
            }
            try
            {
                ((View) (obj)).setVisibility(byte0);
                obj = mTitleLayout;
            }
            catch (IllegalStateException illegalstateexception9)
            {
                try
                {
                    throw illegalstateexception9;
                }
                catch (IllegalStateException illegalstateexception10)
                {
                    throw illegalstateexception10;
                }
            }
            if (!flag || flag1)
            {
                flag2 = false;
            }
            ((LinearLayout) (obj)).setEnabled(flag2);
        }
        addView(mTitleLayout);
        obj = mExpandedActionView;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        IllegalStateException illegalstateexception11;
        try
        {
            flag2 = TextUtils.isEmpty(mTitle);
        }
        catch (IllegalStateException illegalstateexception12)
        {
            try
            {
                throw illegalstateexception12;
            }
            catch (IllegalStateException illegalstateexception13)
            {
                throw illegalstateexception13;
            }
        }
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        if (!TextUtils.isEmpty(mSubtitle))
        {
            break MISSING_BLOCK_LABEL_323;
        }
        mTitleLayout.setVisibility(8);
        return;
        illegalstateexception11;
        throw illegalstateexception11;
    }

    private static int loadLogoFromManifest(Activity activity)
    {
        int i;
        int j;
        int j1;
        j1 = AbsActionBarView.b;
        j = 0;
        i = j;
        String s1 = activity.getClass().getName();
        i = j;
        String s2 = activity.getApplicationInfo().packageName;
        i = j;
        XmlResourceParser xmlresourceparser = activity.createPackageContext(s2, 0).getAssets().openXmlResourceParser(z[5]);
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
        if (!z[6].equals(activity)) goto _L4; else goto _L3
_L3:
        k = i;
        j = xmlresourceparser.getAttributeCount();
        k = j - 1;
        j = i;
_L27:
        if (k < 0)
        {
            break MISSING_BLOCK_LABEL_578;
        }
        i = j;
        if (!z[8].equals(xmlresourceparser.getAttributeName(k))) goto _L6; else goto _L5
_L5:
        i = j;
        j = xmlresourceparser.getAttributeResourceValue(k, 0);
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
        boolean flag = z[7].equals(activity);
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
        if (!z[4].equals(s3)) goto _L15; else goto _L14
_L14:
        i = j;
        i1 = xmlresourceparser.getAttributeResourceValue(l, 0);
        Activity activity1;
        activity = Integer.valueOf(i1);
        activity1 = activity;
        if (j1 == 0) goto _L16; else goto _L15
_L15:
        flag = z[9].equals(s3);
        activity1 = activity;
        if (!flag) goto _L16; else goto _L17
_L17:
        i = j;
        s = ActionBarSherlockCompat.cleanActivityName(s2, xmlresourceparser.getAttributeValue(l));
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
            break MISSING_BLOCK_LABEL_440;
        }
        i = j;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_440;
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

    private void setTitleImpl(CharSequence charsequence)
    {
        boolean flag = false;
        Object obj;
        mTitle = charsequence;
        obj = mTitleView;
        if (obj == null) goto _L2; else goto _L1
_L1:
        mTitleView.setText(charsequence);
        obj = mExpandedActionView;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        int i = mDisplayOptions;
        if ((i & 8) == 0)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        boolean flag1 = TextUtils.isEmpty(mTitle);
        if (flag1)
        {
            LinearLayout linearlayout;
            boolean flag2;
            try
            {
                flag2 = TextUtils.isEmpty(mSubtitle);
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                throw charsequence;
            }
            if (flag2)
            {
                break MISSING_BLOCK_LABEL_125;
            }
        }
        i = 1;
_L3:
        try
        {
            linearlayout = mTitleLayout;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        linearlayout.setVisibility(i);
_L2:
        try
        {
            if (mLogoNavItem != null)
            {
                mLogoNavItem.setTitle(charsequence);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
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
        i = 0;
          goto _L3
    }

    public void collapseActionView()
    {
        Object obj;
        try
        {
            obj = mExpandedMenuPresenter;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = mExpandedMenuPresenter.mCurrentExpandedItem;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        ((MenuItemImpl) (obj)).collapseActionView();
        return;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new com.actionbarsherlock.app.ActionBar.LayoutParams(19);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new com.actionbarsherlock.app.ActionBar.LayoutParams(getContext(), attributeset);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        android.view.ViewGroup.LayoutParams layoutparams1 = layoutparams;
        if (layoutparams == null)
        {
            layoutparams1 = generateDefaultLayoutParams();
        }
        return layoutparams1;
    }

    public int getDisplayOptions()
    {
        return mDisplayOptions;
    }

    public int getDropdownSelectedPosition()
    {
        return mSpinner.getSelectedItemPosition();
    }

    public int getNavigationMode()
    {
        return mNavigationMode;
    }

    public CharSequence getTitle()
    {
        return mTitle;
    }

    public boolean hasEmbeddedTabs()
    {
        return mIncludeTabs;
    }

    public boolean hasExpandedActionView()
    {
        ExpandedActionViewMenuPresenter expandedactionviewmenupresenter;
        try
        {
            expandedactionviewmenupresenter = mExpandedMenuPresenter;
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
        if (expandedactionviewmenupresenter == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        if (mExpandedMenuPresenter.mCurrentExpandedItem != null)
        {
            return true;
        }
        return false;
    }

    public void initIndeterminateProgress()
    {
        mIndeterminateProgressView = new IcsProgressBar(mContext, null, 0, mIndeterminateProgressStyle);
        mIndeterminateProgressView.setId(com.actionbarsherlock.R.id.abs__progress_circular);
        addView(mIndeterminateProgressView);
    }

    public void initProgress()
    {
        mProgressView = new IcsProgressBar(mContext, null, 0, mProgressStyle);
        mProgressView.setId(com.actionbarsherlock.R.id.abs__progress_horizontal);
        mProgressView.setMax(10000);
        addView(mProgressView);
    }

    public boolean isCollapsed()
    {
        return mIsCollapsed;
    }

    public boolean isSplitActionBar()
    {
        return mSplitActionBar;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        mTitleView = null;
        mSubtitleView = null;
        mTitleUpView = null;
        configuration = mTitleLayout;
label0:
        {
            boolean flag;
            if (configuration != null)
            {
                try
                {
                    if (mTitleLayout.getParent() == this)
                    {
                        removeView(mTitleLayout);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Configuration configuration)
                {
                    throw configuration;
                }
            }
            try
            {
                mTitleLayout = null;
                if ((mDisplayOptions & 8) != 0)
                {
                    initTitle();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Configuration configuration)
            {
                throw configuration;
            }
            try
            {
                if (mTabScrollView == null)
                {
                    break label0;
                }
                flag = mIncludeTabs;
            }
            // Misplaced declaration of an exception variable
            catch (Configuration configuration)
            {
                throw configuration;
            }
            if (flag)
            {
                configuration = mTabScrollView.getLayoutParams();
                if (configuration != null)
                {
                    try
                    {
                        configuration.width = -2;
                        configuration.height = -1;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Configuration configuration)
                    {
                        throw configuration;
                    }
                }
                mTabScrollView.setAllowCollapse(true);
            }
        }
        return;
        configuration;
        throw configuration;
    }

    public void onDetachedFromWindow()
    {
        try
        {
            super.onDetachedFromWindow();
            if (mActionMenuPresenter != null)
            {
                mActionMenuPresenter.hideOverflowMenu();
                mActionMenuPresenter.hideSubMenus();
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    protected void onFinishInflate()
    {
label0:
        {
            int i;
            try
            {
                super.onFinishInflate();
                addView(mHomeLayout);
                if (mCustomNavView == null)
                {
                    break label0;
                }
                i = mDisplayOptions;
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            if ((i & 0x10) != 0)
            {
                android.view.ViewParent viewparent = mCustomNavView.getParent();
                if (viewparent != this)
                {
                    try
                    {
                        if (viewparent instanceof ViewGroup)
                        {
                            ((ViewGroup)viewparent).removeView(mCustomNavView);
                        }
                    }
                    catch (IllegalStateException illegalstateexception1)
                    {
                        throw illegalstateexception1;
                    }
                    addView(mCustomNavView);
                }
            }
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int l1;
        int k2;
        k2 = AbsActionBarView.b;
        l1 = l - j - getPaddingTop() - getPaddingBottom();
        if (l1 > 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        Object obj1;
        int i1;
        int j1;
        int k1;
        int i2;
        boolean flag1;
        flag1 = isLayoutRtl();
        if (flag1)
        {
            k1 = 1;
        } else
        {
            k1 = -1;
        }
        if (flag1)
        {
            try
            {
                l = getPaddingLeft();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            l = k - i - getPaddingRight();
        }
        if (flag1)
        {
            int j2;
            try
            {
                j = getPaddingRight();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            i = k - i - j;
        } else
        {
            i = getPaddingLeft();
        }
        i2 = getPaddingTop();
        if (mExpandedActionView == null) goto _L4; else goto _L3
_L3:
        obj = mExpandedHomeLayout;
_L29:
        if (((HomeView) (obj)).getVisibility() != 8)
        {
            j = ((HomeView) (obj)).getLeftOffset();
            j = next(positionChild(((View) (obj)), next(i, j, flag1), i2, l1, flag1) + i, j, flag1);
            j1 = j;
        } else
        {
            j1 = 0;
            j = i;
        }
        obj = mExpandedActionView;
        k = j;
        if (obj != null) goto _L6; else goto _L5
_L5:
        obj = mTitleLayout;
        if (obj == null) goto _L8; else goto _L7
_L7:
        i = mTitleLayout.getVisibility();
        if (i == 8) goto _L8; else goto _L9
_L9:
        try
        {
            i = mDisplayOptions;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if ((i & 8) == 0) goto _L8; else goto _L10
_L10:
        i1 = 1;
_L30:
        i = j;
        if (i1 != 0)
        {
            i = j + positionChild(mTitleLayout, j, i2, l1, flag1);
        }
        j = mNavigationMode;
        j;
        JVM INSTR tableswitch 0 2: default 244
    //                   0 929
    //                   1 937
    //                   2 1423;
           goto _L11 _L12 _L13 _L14
_L14:
        break MISSING_BLOCK_LABEL_1423;
_L11:
        k = i;
_L6:
        j = 0;
        i = k;
        k = j;
_L33:
        obj = mMenuView;
        i1 = l;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_331;
        }
        obj = mMenuView.getParent();
        i1 = l;
        if (obj == this)
        {
            try
            {
                obj = mMenuView;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (!flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            positionChild(((View) (obj)), l, i2, l1, flag);
            i1 = l + mMenuView.getMeasuredWidth() * k1;
        }
        obj = mIndeterminateProgressView;
        j = i1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_405;
        }
        l = mIndeterminateProgressView.getVisibility();
        j = i1;
        if (l != 8)
        {
            try
            {
                obj = mIndeterminateProgressView;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (!flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            positionChild(((View) (obj)), i1, i2, l1, flag);
            j = i1 + mIndeterminateProgressView.getMeasuredWidth() * k1;
        }
        if (mExpandedActionView == null) goto _L16; else goto _L15
_L15:
        obj = mExpandedActionView;
_L37:
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = ((View) (obj)).getLayoutParams();
        if (!(obj1 instanceof com.actionbarsherlock.app.ActionBar.LayoutParams)) goto _L18; else goto _L17
_L17:
        obj1 = (com.actionbarsherlock.app.ActionBar.LayoutParams)obj1;
_L38:
label0:
        {
label1:
            {
label2:
                {
label3:
                    {
label4:
                        {
                            int l2;
                            if (obj1 != null)
                            {
                                try
                                {
                                    l1 = ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).gravity;
                                }
                                // Misplaced declaration of an exception variable
                                catch (Object obj)
                                {
                                    throw obj;
                                }
                            } else
                            {
                                l1 = 19;
                            }
                            l2 = ((View) (obj)).getMeasuredWidth();
                            if (obj1 != null)
                            {
                                if (flag1)
                                {
                                    try
                                    {
                                        l = ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).rightMargin;
                                    }
                                    // Misplaced declaration of an exception variable
                                    catch (Object obj)
                                    {
                                        throw obj;
                                    }
                                } else
                                {
                                    l = ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).leftMargin;
                                }
                                l = next(i, l, flag1);
                                if (flag1)
                                {
                                    try
                                    {
                                        i = ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).leftMargin;
                                    }
                                    // Misplaced declaration of an exception variable
                                    catch (Object obj)
                                    {
                                        throw obj;
                                    }
                                } else
                                {
                                    i = ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).rightMargin;
                                }
                                i2 = ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).topMargin;
                                i1 = ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).bottomMargin;
                                i = j + i * k1;
                                k1 = i1;
                                i1 = i;
                            } else
                            {
                                k1 = 0;
                                i2 = 0;
                                i1 = j;
                                l = i;
                            }
                            i = 0x800007 & l1;
                            j = i;
                            if (i != 1)
                            {
                                break label1;
                            }
                            j2 = (getRight() - getLeft() - l2) / 2;
                            j = i;
                            if (!flag1)
                            {
                                break label3;
                            }
                            if (j2 + l2 > l)
                            {
                                i = 5;
                                j = i;
                                if (k2 == 0)
                                {
                                    break label4;
                                }
                            }
                            j = i;
                            if (j2 < i1)
                            {
                                j = 3;
                            }
                        }
                        i = j;
                        if (k2 == 0)
                        {
                            break label2;
                        }
                    }
                    i = j;
                    if (j2 < l)
                    {
                        j = 3;
                        i = j;
                        if (k2 == 0)
                        {
                            break label2;
                        }
                        i = j;
                    }
                    if (j2 + l2 > i1)
                    {
                        i = 5;
                    }
                }
                j = i;
                if (k2 == 0)
                {
                    break label0;
                }
                j = i;
            }
            if (l1 == 0)
            {
                j = 0x800003;
            }
        }
        j2 = 0;
        i = j2;
        j;
        JVM INSTR tableswitch 1 5: default 696
    //                   1 1247
    //                   2 699
    //                   3 1267
    //                   4 699
    //                   5 1280;
           goto _L19 _L20 _L21 _L22 _L21 _L23
_L19:
        i = j2;
_L21:
        j = i;
_L39:
        if (l1 == 0)
        {
            i = 16;
        } else
        {
            i = l1 & 0x70;
        }
        i1 = 0;
        i;
        JVM INSTR lookupswitch 3: default 748
    //                   16: 1311
    //                   48: 1346
    //                   80: 1359;
           goto _L24 _L25 _L26 _L27
_L24:
        i = i1;
_L40:
        i1 = ((View) (obj)).getMeasuredWidth();
        ((View) (obj)).layout(j, i, j + i1, ((View) (obj)).getMeasuredHeight() + i);
        Math.min(k, Math.max(j - j1, 0));
        next(l, i1, flag1);
        if (mProgressView == null) goto _L1; else goto _L28
_L28:
        mProgressView.bringToFront();
        i = mProgressView.getMeasuredHeight() / 2;
        mProgressView.layout(mProgressBarPadding, -i, mProgressBarPadding + mProgressView.getMeasuredWidth(), i);
        return;
        obj;
        throw obj;
_L4:
        obj = mHomeLayout;
          goto _L29
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
        throw obj;
_L8:
        i1 = 0;
          goto _L30
_L12:
        k = i;
        if (k2 == 0) goto _L6; else goto _L13
_L13:
        try
        {
            obj = mListNavLayout;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        k = i;
        if (obj == null) goto _L6; else goto _L31
_L31:
        j = i;
        if (i1 != 0)
        {
            j = next(i, mItemPadding, flag1);
        }
        k = Math.min(0, Math.max(j - j1, 0));
        i = next(positionChild(mListNavLayout, j, i2, l1, flag1) + j, mItemPadding, flag1);
        if (k2 == 0) goto _L33; else goto _L32
_L32:
        j = k;
_L41:
        try
        {
            obj = mTabScrollView;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (obj != null)
        {
            k = i;
            if (i1 != 0)
            {
                k = next(i, mItemPadding, flag1);
            }
            i = Math.min(j, Math.max(k - j1, 0));
            j = next(positionChild(mTabScrollView, k, i2, l1, flag1) + k, mItemPadding, flag1);
            k = i;
            i = j;
        } else
        {
            k = j;
        }
          goto _L33
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
_L16:
        if ((mDisplayOptions & 0x10) == 0) goto _L35; else goto _L34
_L34:
        obj = mCustomNavView;
        if (obj == null) goto _L35; else goto _L36
_L36:
        obj = mCustomNavView;
          goto _L37
        obj;
        throw obj;
        obj;
        throw obj;
_L18:
        obj1 = null;
          goto _L38
_L20:
        i = (getRight() - getLeft() - l2) / 2;
        if (k2 == 0) goto _L21; else goto _L22
_L22:
        if (flag1)
        {
            i = i1;
        } else
        {
            i = l;
        }
        if (k2 == 0) goto _L21; else goto _L23
_L23:
        if (flag1)
        {
            i = l - l2;
        } else
        {
            i = i1 - l2;
        }
        j = i;
          goto _L39
_L25:
        i = getPaddingTop();
        i = (getBottom() - getTop() - getPaddingBottom() - i - ((View) (obj)).getMeasuredHeight()) / 2;
        if (k2 == 0) goto _L40; else goto _L26
_L26:
        i = getPaddingTop() + i2;
        if (k2 == 0) goto _L40; else goto _L27
_L27:
        i = getHeight() - getPaddingBottom() - ((View) (obj)).getMeasuredHeight() - k1;
          goto _L40
_L35:
        obj = null;
          goto _L37
        j = 0;
          goto _L41
    }

    protected void onMeasure(int i, int j)
    {
        int j2;
        int k2;
        j2 = AbsActionBarView.b;
        k2 = getChildCount();
        if (!mIsCollapsable) goto _L2; else goto _L1
_L1:
        int k;
        int i1;
        k = 0;
        i1 = 0;
_L4:
        Object obj;
        int l;
        l = k;
        if (i1 >= k2)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = getChildAt(i1);
        int j1 = ((View) (obj)).getVisibility();
        l = k;
        if (j1 == 8)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        Object obj1 = mMenuView;
        if (obj == obj1)
        {
            IllegalStateException illegalstateexception;
            try
            {
                j1 = mMenuView.getChildCount();
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
            l = k;
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_95;
            }
        }
        l = k + 1;
        i1++;
        k = l;
        if (j2 == 0) goto _L4; else goto _L3
_L3:
        if (l != 0) goto _L2; else goto _L5
_L5:
        setMeasuredDimension(0, 0);
        mIsCollapsed = true;
_L42:
        return;
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
        IllegalStateException illegalstateexception2;
        illegalstateexception2;
        throw illegalstateexception2;
_L2:
        int l2;
        mIsCollapsed = false;
        if (android.view.View.MeasureSpec.getMode(i) != 0x40000000)
        {
            try
            {
                throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(z[10]).append(z[11]).toString());
            }
            catch (IllegalStateException illegalstateexception3)
            {
                throw illegalstateexception3;
            }
        }
        if (android.view.View.MeasureSpec.getMode(j) != 0x80000000)
        {
            try
            {
                throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(z[13]).append(z[12]).toString());
            }
            catch (IllegalStateException illegalstateexception4)
            {
                throw illegalstateexception4;
            }
        }
        l2 = android.view.View.MeasureSpec.getSize(i);
        if (mContentHeight <= 0) goto _L7; else goto _L6
_L6:
        int k1 = mContentHeight;
_L44:
        int i2;
        int i3;
        i3 = getPaddingTop() + getPaddingBottom();
        i = getPaddingLeft();
        j = getPaddingRight();
        i2 = k1 - i3;
        l = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x80000000);
        j = l2 - i - j;
        k = j / 2;
        if (mExpandedActionView == null) goto _L9; else goto _L8
_L8:
        illegalstateexception4 = mExpandedHomeLayout;
_L45:
label0:
        {
            if (illegalstateexception4.getVisibility() == 8)
            {
                break MISSING_BLOCK_LABEL_1548;
            }
            obj1 = illegalstateexception4.getLayoutParams();
            if (((android.view.ViewGroup.LayoutParams) (obj1)).width < 0)
            {
                i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000);
                if (j2 == 0)
                {
                    break label0;
                }
            }
            i = android.view.View.MeasureSpec.makeMeasureSpec(((android.view.ViewGroup.LayoutParams) (obj1)).width, 0x40000000);
        }
        illegalstateexception4.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000));
        i = illegalstateexception4.getMeasuredWidth();
        i = illegalstateexception4.getLeftOffset() + i;
        j = Math.max(0, j - i);
        i = Math.max(0, j - i);
_L64:
        int l1;
        boolean flag;
label1:
        {
            android.view.ViewGroup.LayoutParams layoutparams;
            int j3;
            try
            {
                if (mMenuView == null)
                {
                    break label1;
                }
                illegalstateexception4 = mMenuView.getParent();
            }
            // Misplaced declaration of an exception variable
            catch (IllegalStateException illegalstateexception4)
            {
                throw illegalstateexception4;
            }
            if (illegalstateexception4 == this)
            {
                j = measureChildView(mMenuView, j, l, 0);
                k = Math.max(0, k - mMenuView.getMeasuredWidth());
            }
        }
        if (mIndeterminateProgressView == null) goto _L11; else goto _L10
_L10:
        i1 = mIndeterminateProgressView.getVisibility();
        if (i1 == 8) goto _L11; else goto _L12
_L12:
        j = measureChildView(mIndeterminateProgressView, j, l, 0);
        l1 = Math.max(0, k - mIndeterminateProgressView.getMeasuredWidth());
_L63:
        illegalstateexception4 = mTitleLayout;
        if (illegalstateexception4 == null) goto _L14; else goto _L13
_L13:
        k = mTitleLayout.getVisibility();
        if (k == 8) goto _L14; else goto _L15
_L15:
        try
        {
            k = mDisplayOptions;
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception4)
        {
            throw illegalstateexception4;
        }
        if ((k & 8) == 0) goto _L14; else goto _L16
_L16:
        flag = true;
_L46:
        try
        {
            illegalstateexception4 = mExpandedActionView;
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception4)
        {
            try
            {
                throw illegalstateexception4;
            }
            // Misplaced declaration of an exception variable
            catch (IllegalStateException illegalstateexception4) { }
            try
            {
                throw illegalstateexception4;
            }
            // Misplaced declaration of an exception variable
            catch (IllegalStateException illegalstateexception4) { }
            try
            {
                throw illegalstateexception4;
            }
            // Misplaced declaration of an exception variable
            catch (IllegalStateException illegalstateexception4)
            {
                throw illegalstateexception4;
            }
        }
        i1 = i;
        j1 = j;
        if (illegalstateexception4 != null) goto _L18; else goto _L17
_L17:
        i1 = mNavigationMode;
        k = i;
        l = j;
        i1;
        JVM INSTR tableswitch 1 2: default 628
    //                   1 1161
    //                   2 1273;
           goto _L19 _L20 _L21
_L19:
        j1 = j;
        i1 = i;
_L18:
        i = j1;
        j = i1;
_L51:
        if (mExpandedActionView == null) goto _L23; else goto _L22
_L22:
        illegalstateexception4 = mExpandedActionView;
_L57:
        k = i;
        if (illegalstateexception4 == null) goto _L25; else goto _L24
_L24:
        layoutparams = generateLayoutParams(illegalstateexception4.getLayoutParams());
        if (!(layoutparams instanceof com.actionbarsherlock.app.ActionBar.LayoutParams)) goto _L27; else goto _L26
_L26:
        obj1 = (com.actionbarsherlock.app.ActionBar.LayoutParams)layoutparams;
_L58:
        l = 0;
        i1 = 0;
        if (obj1 != null)
        {
            k = ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).leftMargin;
            l = ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).rightMargin + k;
            i1 = ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).topMargin + ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).bottomMargin;
        }
        if (mContentHeight > 0 || j2 != 0)
        {
            try
            {
                k = layoutparams.height;
            }
            // Misplaced declaration of an exception variable
            catch (IllegalStateException illegalstateexception4)
            {
                throw illegalstateexception4;
            }
            if (k != -2)
            {
                k = 0x40000000;
            } else
            {
                k = 0x80000000;
            }
        } else
        {
            k = 0x80000000;
        }
        if (layoutparams.height < 0) goto _L29; else goto _L28
_L28:
        j1 = Math.min(layoutparams.height, i2);
_L59:
        j3 = Math.max(0, j1 - i1);
        try
        {
            i1 = layoutparams.width;
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception4)
        {
            throw illegalstateexception4;
        }
        if (i1 != -2)
        {
            i1 = 0x40000000;
        } else
        {
            i1 = 0x80000000;
        }
        if (layoutparams.width < 0) goto _L31; else goto _L30
_L30:
        j1 = Math.min(layoutparams.width, i);
_L60:
        i2 = Math.max(0, j1 - l);
        if (obj1 != null)
        {
            try
            {
                j1 = ((com.actionbarsherlock.app.ActionBar.LayoutParams) (obj1)).gravity;
            }
            // Misplaced declaration of an exception variable
            catch (IllegalStateException illegalstateexception4)
            {
                throw illegalstateexception4;
            }
        } else
        {
            j1 = 19;
        }
        if ((j1 & 7) != 1) goto _L33; else goto _L32
_L32:
        try
        {
            j1 = layoutparams.width;
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception4)
        {
            throw illegalstateexception4;
        }
        if (j1 != -1) goto _L33; else goto _L34
_L34:
        j1 = Math.min(j, l1) * 2;
_L62:
        illegalstateexception4.measure(android.view.View.MeasureSpec.makeMeasureSpec(j1, i1), android.view.View.MeasureSpec.makeMeasureSpec(j3, k));
        k = i - (illegalstateexception4.getMeasuredWidth() + l);
_L25:
        try
        {
            illegalstateexception4 = mExpandedActionView;
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception4)
        {
            throw illegalstateexception4;
        }
        if (illegalstateexception4 == null && flag)
        {
            measureChildView(mTitleLayout, k, android.view.View.MeasureSpec.makeMeasureSpec(mContentHeight, 0x40000000), 0);
            Math.max(0, j - mTitleLayout.getMeasuredWidth());
        }
        if (mContentHeight > 0) goto _L36; else goto _L35
_L35:
        k = 0;
        i = 0;
_L61:
        j = i;
        if (k >= k2) goto _L38; else goto _L37
_L37:
        l = getChildAt(k).getMeasuredHeight() + i3;
        j = i;
        if (l > i)
        {
            j = l;
        }
        if (j2 == 0) goto _L39; else goto _L38
_L38:
        try
        {
            setMeasuredDimension(l2, j);
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception4)
        {
            throw illegalstateexception4;
        }
        if (j2 == 0) goto _L40; else goto _L36
_L36:
        setMeasuredDimension(l2, k1);
_L40:
        try
        {
            if (mContextView != null)
            {
                mContextView.setContentHeight(getMeasuredHeight());
            }
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception4)
        {
            throw illegalstateexception4;
        }
        try
        {
            illegalstateexception4 = mProgressView;
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception4)
        {
            try
            {
                throw illegalstateexception4;
            }
            // Misplaced declaration of an exception variable
            catch (IllegalStateException illegalstateexception4)
            {
                throw illegalstateexception4;
            }
        }
        if (illegalstateexception4 == null) goto _L42; else goto _L41
_L41:
        if (mProgressView.getVisibility() == 8) goto _L42; else goto _L43
_L43:
        mProgressView.measure(android.view.View.MeasureSpec.makeMeasureSpec(l2 - mProgressBarPadding * 2, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x80000000));
        return;
        illegalstateexception4;
        throw illegalstateexception4;
_L7:
        k1 = android.view.View.MeasureSpec.getSize(j);
          goto _L44
        illegalstateexception4;
        throw illegalstateexception4;
_L9:
        illegalstateexception4 = mHomeLayout;
          goto _L45
        illegalstateexception4;
        throw illegalstateexception4;
        illegalstateexception4;
        try
        {
            throw illegalstateexception4;
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception4) { }
        throw illegalstateexception4;
_L14:
        flag = false;
          goto _L46
_L20:
        illegalstateexception4 = mListNavLayout;
        i1 = i;
        j1 = j;
        if (illegalstateexception4 == null) goto _L18; else goto _L47
_L47:
        if (!flag) goto _L49; else goto _L48
_L48:
        k = mItemPadding;
        k *= 2;
_L53:
        j = Math.max(0, j - k);
        k = Math.max(0, i - k);
        mListNavLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000));
        l = mListNavLayout.getMeasuredWidth();
        i = Math.max(0, j - l);
        j = Math.max(0, k - l);
        if (j2 == 0) goto _L51; else goto _L50
_L50:
        l = i;
        k = j;
_L21:
        illegalstateexception4 = mTabScrollView;
        i1 = k;
        j1 = l;
        if (illegalstateexception4 == null) goto _L18; else goto _L52
_L52:
        if (flag)
        {
            try
            {
                i = mItemPadding;
            }
            // Misplaced declaration of an exception variable
            catch (IllegalStateException illegalstateexception4)
            {
                throw illegalstateexception4;
            }
            i *= 2;
        } else
        {
            i = mItemPadding;
        }
        j = Math.max(0, l - i);
        k = Math.max(0, k - i);
        mTabScrollView.measure(android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000));
        l = mTabScrollView.getMeasuredWidth();
        i = Math.max(0, j - l);
        j = Math.max(0, k - l);
          goto _L51
_L49:
        k = mItemPadding;
          goto _L53
        illegalstateexception4;
        throw illegalstateexception4;
_L23:
        if ((mDisplayOptions & 0x10) == 0) goto _L55; else goto _L54
_L54:
        illegalstateexception4 = mCustomNavView;
        if (illegalstateexception4 == null) goto _L55; else goto _L56
_L56:
        illegalstateexception4 = mCustomNavView;
          goto _L57
        illegalstateexception4;
        throw illegalstateexception4;
        illegalstateexception4;
        throw illegalstateexception4;
_L27:
        obj1 = null;
          goto _L58
        illegalstateexception4;
        throw illegalstateexception4;
_L29:
        j1 = i2;
          goto _L59
        illegalstateexception4;
        throw illegalstateexception4;
_L31:
        j1 = i;
          goto _L60
_L39:
        k++;
        i = j;
          goto _L61
_L33:
        j1 = i2;
          goto _L62
_L55:
        illegalstateexception4 = null;
          goto _L57
_L11:
        l1 = k;
          goto _L63
        i = k;
          goto _L64
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        Object obj;
        int i;
        try
        {
            super.onRestoreInstanceState(parcelable.getSuperState());
            i = ((SavedState) (parcelable)).expandedMenuItemId;
        }
        // Misplaced declaration of an exception variable
        catch (Parcelable parcelable)
        {
            try
            {
                throw parcelable;
            }
            // Misplaced declaration of an exception variable
            catch (Parcelable parcelable)
            {
                throw parcelable;
            }
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        if (mExpandedMenuPresenter == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        obj = mOptionsMenu;
        if (obj != null)
        {
            obj = mOptionsMenu.findItem(((SavedState) (parcelable)).expandedMenuItemId);
            if (obj != null)
            {
                try
                {
                    ((MenuItem) (obj)).expandActionView();
                }
                // Misplaced declaration of an exception variable
                catch (Parcelable parcelable)
                {
                    throw parcelable;
                }
            }
        }
        try
        {
            if (((SavedState) (parcelable)).isOverflowOpen)
            {
                postShowOverflowMenu();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcelable parcelable)
        {
            throw parcelable;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        ExpandedActionViewMenuPresenter expandedactionviewmenupresenter = mExpandedMenuPresenter;
        IllegalStateException illegalstateexception;
        if (expandedactionviewmenupresenter != null)
        {
            try
            {
                if (mExpandedMenuPresenter.mCurrentExpandedItem != null)
                {
                    savedstate.expandedMenuItemId = mExpandedMenuPresenter.mCurrentExpandedItem.getItemId();
                }
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        savedstate.isOverflowOpen = isOverflowMenuShowing();
        return savedstate;
        illegalstateexception;
        throw illegalstateexception;
    }

    public void setCollapsable(boolean flag)
    {
        mIsCollapsable = flag;
    }

    public void setContextView(ActionBarContextView actionbarcontextview)
    {
        mContextView = actionbarcontextview;
    }

    public void setCustomNavigationView(View view)
    {
        View view1;
        int i;
        try
        {
            i = mDisplayOptions;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if ((i & 0x10) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        view1 = mCustomNavView;
        if (view1 != null && i)
        {
            try
            {
                removeView(mCustomNavView);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
        }
        try
        {
            mCustomNavView = view;
            view = mCustomNavView;
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
        if (view == null || !i)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        addView(mCustomNavView);
        return;
        view;
        throw view;
    }

    public void setDisplayOptions(int i)
    {
        Object obj;
        int j;
        boolean flag;
        boolean flag2;
        byte byte0 = 8;
        int k = -1;
        boolean flag3 = true;
        int l = AbsActionBarView.b;
        HomeView homeview;
        try
        {
            j = mDisplayOptions;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (j != -1)
        {
            k = mDisplayOptions ^ i;
        }
        try
        {
            mDisplayOptions = i;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if ((k & 0x1f) == 0) goto _L2; else goto _L1
_L1:
        if ((i & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        try
        {
            obj = mExpandedActionView;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (obj != null) goto _L4; else goto _L5
_L5:
        j = 0;
_L11:
        try
        {
            mHomeLayout.setVisibility(j);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if ((k & 4) == 0)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        if ((i & 4) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        try
        {
            mHomeLayout.setUp(flag2);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        setHomeButtonEnabled(true);
        if ((k & 1) == 0) goto _L7; else goto _L6
_L6:
        try
        {
            obj = mLogo;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (obj != null && (i & 1) != 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        try
        {
            homeview = mHomeLayout;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (j == 0) goto _L9; else goto _L8
_L8:
        obj = mLogo;
_L12:
        homeview.setIcon(((Drawable) (obj)));
_L7:
        if ((k & 8) == 0)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        if ((i & 8) != 0)
        {
            try
            {
                initTitle();
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            if (l == 0)
            {
                break MISSING_BLOCK_LABEL_187;
            }
        }
        removeView(mTitleLayout);
        obj = mTitleLayout;
        if (obj != null && (k & 6) != 0)
        {
            IllegalStateException illegalstateexception1;
            boolean flag1;
            try
            {
                j = mDisplayOptions;
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
            if ((j & 4) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            try
            {
                obj = mTitleUpView;
            }
            catch (IllegalStateException illegalstateexception3)
            {
                try
                {
                    throw illegalstateexception3;
                }
                catch (IllegalStateException illegalstateexception4)
                {
                    throw illegalstateexception4;
                }
            }
            j = byte0;
            if (!flag)
            {
                if (flag1)
                {
                    j = 0;
                } else
                {
                    j = 4;
                }
            }
            try
            {
                ((View) (obj)).setVisibility(j);
                obj = mTitleLayout;
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
                flag2 = flag3;
            } else
            {
                flag2 = false;
            }
            ((LinearLayout) (obj)).setEnabled(flag2);
        }
        if ((k & 0x10) == 0)
        {
            break MISSING_BLOCK_LABEL_318;
        }
        obj = mCustomNavView;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_318;
        }
        if ((i & 0x10) != 0)
        {
            IllegalStateException illegalstateexception7;
            try
            {
                addView(mCustomNavView);
            }
            catch (IllegalStateException illegalstateexception8)
            {
                throw illegalstateexception8;
            }
            if (l == 0)
            {
                break MISSING_BLOCK_LABEL_318;
            }
        }
        removeView(mCustomNavView);
        try
        {
            requestLayout();
        }
        catch (IllegalStateException illegalstateexception9)
        {
            throw illegalstateexception9;
        }
        if (l == 0) goto _L10; else goto _L2
_L2:
        invalidate();
_L10:
        flag2 = mHomeLayout.isEnabled();
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        mHomeLayout.setContentDescription(null);
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_409;
        }
        if ((i & 4) != 0)
        {
            IllegalStateException illegalstateexception10;
            try
            {
                mHomeLayout.setContentDescription(mContext.getResources().getText(com.actionbarsherlock.R.string.abs__action_bar_up_description));
            }
            catch (IllegalStateException illegalstateexception11)
            {
                throw illegalstateexception11;
            }
            if (l == 0)
            {
                break MISSING_BLOCK_LABEL_409;
            }
        }
        mHomeLayout.setContentDescription(mContext.getResources().getText(com.actionbarsherlock.R.string.abs__action_bar_home_description));
        return;
_L4:
        j = 8;
          goto _L11
_L9:
        obj = mIcon;
          goto _L12
        illegalstateexception1;
        throw illegalstateexception1;
        illegalstateexception1;
        throw illegalstateexception1;
        illegalstateexception7;
        throw illegalstateexception7;
        illegalstateexception7;
        throw illegalstateexception7;
        illegalstateexception10;
        throw illegalstateexception10;
        illegalstateexception10;
        throw illegalstateexception10;
        illegalstateexception10;
        throw illegalstateexception10;
          goto _L11
    }

    public void setDropdownSelectedPosition(int i)
    {
        mSpinner.setSelection(i);
    }

    public void setEmbeddedTabView(ScrollingTabContainerView scrollingtabcontainerview)
    {
label0:
        {
            int i;
            boolean flag;
            try
            {
                if (mTabScrollView != null)
                {
                    removeView(mTabScrollView);
                }
            }
            // Misplaced declaration of an exception variable
            catch (ScrollingTabContainerView scrollingtabcontainerview)
            {
                throw scrollingtabcontainerview;
            }
            try
            {
                mTabScrollView = scrollingtabcontainerview;
            }
            // Misplaced declaration of an exception variable
            catch (ScrollingTabContainerView scrollingtabcontainerview)
            {
                throw scrollingtabcontainerview;
            }
            if (scrollingtabcontainerview != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            try
            {
                mIncludeTabs = flag;
                if (!mIncludeTabs)
                {
                    break label0;
                }
                i = mNavigationMode;
            }
            // Misplaced declaration of an exception variable
            catch (ScrollingTabContainerView scrollingtabcontainerview)
            {
                throw scrollingtabcontainerview;
            }
            if (i == 2)
            {
                addView(mTabScrollView);
                android.view.ViewGroup.LayoutParams layoutparams = mTabScrollView.getLayoutParams();
                layoutparams.width = -2;
                layoutparams.height = -1;
                scrollingtabcontainerview.setAllowCollapse(true);
            }
        }
    }

    public void setHomeButtonEnabled(boolean flag)
    {
        int i = AbsActionBarView.b;
        mHomeLayout.setEnabled(flag);
        mHomeLayout.setFocusable(flag);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        mHomeLayout.setContentDescription(null);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        int j = mDisplayOptions;
        if ((j & 4) != 0)
        {
            IllegalStateException illegalstateexception;
            try
            {
                mHomeLayout.setContentDescription(mContext.getResources().getText(com.actionbarsherlock.R.string.abs__action_bar_up_description));
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_93;
            }
        }
        mHomeLayout.setContentDescription(mContext.getResources().getText(com.actionbarsherlock.R.string.abs__action_bar_home_description));
        return;
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
    }

    public void setIcon(int i)
    {
        setIcon(mContext.getResources().getDrawable(i));
    }

    public void setIcon(Drawable drawable)
    {
        int i;
        try
        {
            mIcon = drawable;
        }
        // Misplaced declaration of an exception variable
        catch (Drawable drawable)
        {
            try
            {
                throw drawable;
            }
            // Misplaced declaration of an exception variable
            catch (Drawable drawable) { }
            try
            {
                throw drawable;
            }
            // Misplaced declaration of an exception variable
            catch (Drawable drawable)
            {
                throw drawable;
            }
        }
        if (drawable == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        i = mDisplayOptions;
        if ((i & 1) == 0)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        if (mLogo != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        mHomeLayout.setIcon(drawable);
    }

    public void setMenu(Menu menu, com.actionbarsherlock.internal.view.menu.MenuPresenter.Callback callback)
    {
        int i = AbsActionBarView.b;
        MenuBuilder menubuilder;
        try
        {
            menubuilder = mOptionsMenu;
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
        if (menu == menubuilder)
        {
            return;
        }
        try
        {
            if (mOptionsMenu != null)
            {
                mOptionsMenu.removeMenuPresenter(mActionMenuPresenter);
                mOptionsMenu.removeMenuPresenter(mExpandedMenuPresenter);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
        menubuilder = (MenuBuilder)menu;
        mOptionsMenu = menubuilder;
        if (mMenuView != null)
        {
            menu = (ViewGroup)mMenuView.getParent();
            android.view.ViewGroup.LayoutParams layoutparams;
            if (menu != null)
            {
                try
                {
                    menu.removeView(mMenuView);
                }
                // Misplaced declaration of an exception variable
                catch (Menu menu)
                {
                    throw menu;
                }
            }
        }
        try
        {
            if (mActionMenuPresenter == null)
            {
                mActionMenuPresenter = new ActionMenuPresenter(mContext);
                mActionMenuPresenter.setCallback(callback);
                mActionMenuPresenter.setId(com.actionbarsherlock.R.id.abs__action_menu_presenter);
                mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter(null);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
        layoutparams = new android.view.ViewGroup.LayoutParams(-2, -1);
        if (!mSplitActionBar)
        {
            mActionMenuPresenter.setExpandedActionViewsExclusive(ResourcesCompat.getResources_getBoolean(getContext(), com.actionbarsherlock.R.bool.abs__action_bar_expanded_action_views_exclusive));
            configPresenters(menubuilder);
            menu = (ActionMenuView)mActionMenuPresenter.getMenuView(this);
            callback = (ViewGroup)menu.getParent();
            if (callback != null && callback != this)
            {
                try
                {
                    callback.removeView(menu);
                }
                // Misplaced declaration of an exception variable
                catch (Menu menu)
                {
                    throw menu;
                }
            }
            addView(menu, layoutparams);
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_355;
            }
        }
        mActionMenuPresenter.setExpandedActionViewsExclusive(false);
        mActionMenuPresenter.setWidthLimit(getContext().getResources().getDisplayMetrics().widthPixels, true);
        mActionMenuPresenter.setItemLimit(0x7fffffff);
        layoutparams.width = -1;
        configPresenters(menubuilder);
        callback = (ActionMenuView)mActionMenuPresenter.getMenuView(this);
        if (mSplitView != null)
        {
            menu = (ViewGroup)callback.getParent();
            if (menu != null)
            {
                try
                {
                    if (menu != mSplitView)
                    {
                        menu.removeView(callback);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Menu menu)
                {
                    throw menu;
                }
            }
            try
            {
                callback.setVisibility(getAnimatedVisibility());
                mSplitView.addView(callback, layoutparams);
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
            menu = callback;
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_355;
            }
        }
        callback.setLayoutParams(layoutparams);
        menu = callback;
        mMenuView = menu;
        return;
    }

    public void setNavigationMode(int i)
    {
        int j;
        int k;
        j = AbsActionBarView.b;
        k = mNavigationMode;
        if (i == k) goto _L2; else goto _L1
_L1:
        k;
        JVM INSTR tableswitch 1 2: default 40
    //                   1 74
    //                   2 95;
           goto _L3 _L4 _L5
_L3:
        i;
        JVM INSTR tableswitch 1 2: default 64
    //                   1 134
    //                   2 260;
           goto _L6 _L7 _L8
_L6:
        mNavigationMode = i;
        requestLayout();
_L2:
        return;
_L4:
        Object obj = mListNavLayout;
        if (obj == null) goto _L3; else goto _L9
_L9:
        removeView(mListNavLayout);
        if (j == 0) goto _L3; else goto _L5
_L5:
        IllegalStateException illegalstateexception;
        try
        {
            obj = mTabScrollView;
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
        if (obj == null) goto _L3; else goto _L10
_L10:
        if (!mIncludeTabs) goto _L3; else goto _L11
_L11:
        removeView(mTabScrollView);
          goto _L3
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
_L7:
        Object obj1;
        try
        {
            obj1 = mSpinner;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        if (obj1 == null)
        {
            mSpinner = new IcsSpinner(mContext, null, com.actionbarsherlock.R.attr.actionDropDownStyle);
            mListNavLayout = (IcsLinearLayout)LayoutInflater.from(mContext).inflate(com.actionbarsherlock.R.layout.abs__action_bar_tab_bar_view, null);
            obj1 = new android.widget.LinearLayout.LayoutParams(-2, -1);
            obj1.gravity = 17;
            mListNavLayout.addView(mSpinner, ((android.view.ViewGroup.LayoutParams) (obj1)));
        }
        try
        {
            if (mSpinner.getAdapter() != mSpinnerAdapter)
            {
                mSpinner.setAdapter(mSpinnerAdapter);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        mSpinner.setOnItemSelectedListener(mNavItemSelectedListener);
        addView(mListNavLayout);
        if (j == 0) goto _L6; else goto _L8
_L8:
        obj1 = mTabScrollView;
        if (obj1 == null) goto _L6; else goto _L12
_L12:
        if (!mIncludeTabs) goto _L6; else goto _L13
_L13:
        addView(mTabScrollView);
          goto _L6
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
          goto _L3
    }

    public void setSplitActionBar(boolean flag)
    {
        Object obj;
        try
        {
            if (mSplitActionBar == flag)
            {
                break MISSING_BLOCK_LABEL_108;
            }
            obj = mMenuView;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        obj = (ViewGroup)mMenuView.getParent();
        if (obj != null)
        {
            try
            {
                ((ViewGroup) (obj)).removeView(mMenuView);
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        try
        {
            obj = mSplitView;
        }
        catch (IllegalStateException illegalstateexception2)
        {
            try
            {
                throw illegalstateexception2;
            }
            catch (IllegalStateException illegalstateexception3)
            {
                throw illegalstateexception3;
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        mSplitView.addView(mMenuView);
        if (AbsActionBarView.b == 0)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        addView(mMenuView);
        obj = mSplitView;
        if (obj != null)
        {
            IllegalStateException illegalstateexception4;
            int i;
            try
            {
                obj = mSplitView;
            }
            catch (IllegalStateException illegalstateexception5)
            {
                throw illegalstateexception5;
            }
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((ActionBarContainer) (obj)).setVisibility(i);
        }
        super.setSplitActionBar(flag);
        return;
        illegalstateexception4;
        throw illegalstateexception4;
    }

    public void setSubtitle(CharSequence charsequence)
    {
        boolean flag = false;
        TextView textview;
        mSubtitle = charsequence;
        textview = mSubtitleView;
        if (textview == null) goto _L2; else goto _L1
_L1:
        int i;
        TextView textview1;
        boolean flag1;
        try
        {
            mSubtitleView.setText(charsequence);
            textview1 = mSubtitleView;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        if (charsequence != null)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview1.setVisibility(i);
        charsequence = mExpandedActionView;
        if (charsequence != null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        i = mDisplayOptions;
        if ((i & 8) == 0)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        flag1 = TextUtils.isEmpty(mTitle);
        if (flag1)
        {
            try
            {
                flag1 = TextUtils.isEmpty(mSubtitle);
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                throw charsequence;
            }
            if (flag1)
            {
                break MISSING_BLOCK_LABEL_134;
            }
        }
        i = 1;
_L3:
        try
        {
            charsequence = mTitleLayout;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        charsequence.setVisibility(i);
_L2:
        return;
        charsequence;
        throw charsequence;
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
        throw charsequence;
        i = 0;
          goto _L3
    }

    public void setTitle(CharSequence charsequence)
    {
        mUserTitle = true;
        setTitleImpl(charsequence);
    }

    public void setWindowCallback(com.actionbarsherlock.view.Window.Callback callback)
    {
        mWindowCallback = callback;
    }

    public void setWindowTitle(CharSequence charsequence)
    {
        try
        {
            if (!mUserTitle)
            {
                setTitleImpl(charsequence);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[14];
        obj = "n]>G+A|+\\\022F[=";
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
                obj = "n]>G2FJ3\016'@S:A*JP>\016*NS/\016*@JjH+ZP.\017";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "n]>G2FJ3\016'@S:A*JP>\016*NS/\016*@JjH+ZP.\017";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "n]>G+A|+\\\022F[=";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "CQ-A";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "nP.\\+FZ\007O*FX/]0\001F'B";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "NN:B-L_>G+A";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "N]>G2FJ3";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "CQ-A";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "A_'K";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\017]+@d@P&WdM[j[7JZj";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "XW>FdNP.\\+FZpB%VQ?Z\033XW.Z,\022\034'O0LV\025^%][$Zf\017\026%\\dIW&B\033__8K*[\027";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "XW>FdNP.\\+FZpB%VQ?Z\033G[#I,[\003hY6NN\025M+AJ/@0\r";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\017]+@d@P&WdM[j[7JZj";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 388
    //                   0 411
    //                   1 418
    //                   2 425
    //                   3 432;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_432;
_L3:
        byte byte1 = 68;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 47;
          goto _L9
_L5:
        byte1 = 62;
          goto _L9
_L6:
        byte1 = 74;
          goto _L9
        byte1 = 46;
          goto _L9
    }














    private class _cls1
        implements IcsAdapterView.OnItemSelectedListener
    {

        final ActionBarView this$0;

        public void onItemSelected(IcsAdapterView icsadapterview, View view, int i, long l)
        {
            if (mCallback != null)
            {
                mCallback.onNavigationItemSelected(i, l);
            }
        }

        public void onNothingSelected(IcsAdapterView icsadapterview)
        {
        }

        _cls1()
        {
            this$0 = ActionBarView.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final ActionBarView this$0;

        public void onClick(View view)
        {
            view = mExpandedMenuPresenter.mCurrentExpandedItem;
            if (view != null)
            {
                view.collapseActionView();
            }
        }

        _cls2()
        {
            this$0 = ActionBarView.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final ActionBarView this$0;

        public void onClick(View view)
        {
            mWindowCallback.onMenuItemSelected(0, mLogoNavItem);
        }

        _cls3()
        {
            this$0 = ActionBarView.this;
            super();
        }
    }


    private class HomeView extends FrameLayout
    {

        private ImageView mIconView;
        private View mUpView;
        private int mUpWidth;

        public boolean dispatchHoverEvent(MotionEvent motionevent)
        {
            return onHoverEvent(motionevent);
        }

        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
            onPopulateAccessibilityEvent(accessibilityevent);
            return true;
        }

        public int getLeftOffset()
        {
            if (mUpView.getVisibility() == 8)
            {
                return mUpWidth;
            } else
            {
                return 0;
            }
        }

        protected void onFinishInflate()
        {
            mUpView = findViewById(com.actionbarsherlock.R.id.abs__up);
            if (ActionBarSherlock.isRtl)
            {
                ((ImageView)mUpView).setImageResource(com.actionbarsherlock.R.drawable.abs__ic_ab_back_rtl_holo_dark);
            }
            mIconView = (ImageView)findViewById(com.actionbarsherlock.R.id.abs__home);
        }

        protected void onLayout(boolean flag, int i, int j, int k, int l)
        {
            int i1;
            int j1;
            int l1;
            int i2;
            int j2;
            int k2;
            l1 = AbsActionBarView.b;
            i2 = (l - j) / 2;
            flag = AbsActionBarView.isLayoutRtl();
            i1 = getWidth();
            if (mUpView.getVisibility() == 8)
            {
                break MISSING_BLOCK_LABEL_301;
            }
            android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)mUpView.getLayoutParams();
            j2 = mUpView.getMeasuredHeight();
            l = mUpView.getMeasuredWidth();
            j1 = layoutparams.leftMargin + l + layoutparams.rightMargin;
            k2 = i2 - j2 / 2;
            j = k;
            if (!flag) goto _L2; else goto _L1
_L1:
            int k1;
            k1 = i1 - l;
            j = k - j1;
            if (l1 == 0) goto _L3; else goto _L2
_L2:
            k = 0;
            i += j1;
_L8:
            mUpView.layout(k, k2, l, j2 + k2);
            l = j1;
            k = j;
            j = l;
_L9:
            android.widget.FrameLayout.LayoutParams layoutparams1 = (android.widget.FrameLayout.LayoutParams)mIconView.getLayoutParams();
            l = mIconView.getMeasuredHeight();
            j1 = mIconView.getMeasuredWidth();
            k1 = (k - i) / 2;
            k = Math.max(layoutparams1.topMargin, i2 - l / 2);
            if (flag)
            {
                i = layoutparams1.rightMargin;
            } else
            {
                i = layoutparams1.leftMargin;
            }
            k1 = Math.max(i, k1 - j1 / 2);
            if (!flag) goto _L5; else goto _L4
_L4:
            i = i1 - j - k1;
            if (l1 == 0) goto _L6; else goto _L5
_L5:
            j += k1;
            i = j + j1;
_L7:
            mIconView.layout(j, k, i, l + k);
            return;
_L6:
            j = i - j1;
            if (true) goto _L7; else goto _L3
_L3:
            l = i1;
            k = k1;
              goto _L8
            j = 0;
              goto _L9
        }

        protected void onMeasure(int i, int j)
        {
            int k;
            int l;
            int i1;
            int j1;
            int k1;
            k1 = AbsActionBarView.b;
            measureChildWithMargins(mUpView, i, 0, j, 0);
            android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)mUpView.getLayoutParams();
            mUpWidth = layoutparams.leftMargin + mUpView.getMeasuredWidth() + layoutparams.rightMargin;
            int l1;
            int i2;
            if (mUpView.getVisibility() == 8)
            {
                k = 0;
            } else
            {
                k = mUpWidth;
            }
            l = layoutparams.topMargin;
            i1 = mUpView.getMeasuredHeight();
            j1 = layoutparams.bottomMargin;
            measureChildWithMargins(mIconView, i, k, j, 0);
            layoutparams = (android.widget.FrameLayout.LayoutParams)mIconView.getLayoutParams();
            k = layoutparams.leftMargin + mIconView.getMeasuredWidth() + layoutparams.rightMargin + k;
            l1 = layoutparams.topMargin;
            i2 = mIconView.getMeasuredHeight();
            l = Math.max(l + i1 + j1, layoutparams.bottomMargin + (l1 + i2));
            i2 = android.view.View.MeasureSpec.getMode(i);
            l1 = android.view.View.MeasureSpec.getMode(j);
            j1 = android.view.View.MeasureSpec.getSize(i);
            i1 = android.view.View.MeasureSpec.getSize(j);
            i2;
            JVM INSTR lookupswitch 2: default 220
        //                       -2147483648: 271
        //                       1073741824: 284;
               goto _L1 _L2 _L3
_L1:
            i = k;
_L7:
            l1;
            JVM INSTR lookupswitch 2: default 252
        //                       -2147483648: 290
        //                       1073741824: 303;
               goto _L4 _L5 _L6
_L4:
            j = l;
_L8:
            setMeasuredDimension(i, j);
            return;
_L2:
            i = Math.min(k, j1);
            if (k1 == 0) goto _L7; else goto _L3
_L3:
            i = j1;
              goto _L7
_L5:
            j = Math.min(l, i1);
            if (k1 == 0) goto _L8; else goto _L6
_L6:
            j = i1;
              goto _L8
        }

        public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                super.onPopulateAccessibilityEvent(accessibilityevent);
            }
            CharSequence charsequence = getContentDescription();
            if (!TextUtils.isEmpty(charsequence))
            {
                accessibilityevent.getText().add(charsequence);
            }
        }

        public void setIcon(Drawable drawable)
        {
            mIconView.setImageDrawable(drawable);
        }

        public void setUp(boolean flag)
        {
            View view = mUpView;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
        }

        public HomeView(Context context)
        {
            this(context, null);
        }

        public HomeView(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }
    }


    private class ExpandedActionViewMenuPresenter
        implements MenuPresenter
    {

        MenuItemImpl mCurrentExpandedItem;
        MenuBuilder mMenu;
        final ActionBarView this$0;

        public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
        {
label0:
            {
                if (mExpandedActionView instanceof CollapsibleActionView)
                {
                    ((CollapsibleActionView)mExpandedActionView).onActionViewCollapsed();
                }
                removeView(mExpandedActionView);
                removeView(mExpandedHomeLayout);
                mExpandedActionView = null;
                if ((mDisplayOptions & 2) != 0)
                {
                    mHomeLayout.setVisibility(0);
                }
                if ((mDisplayOptions & 8) == 0)
                {
                    break label0;
                }
                if (mTitleLayout == null)
                {
                    initTitle();
                    if (AbsActionBarView.b == 0)
                    {
                        break label0;
                    }
                }
                mTitleLayout.setVisibility(0);
            }
            if (mTabScrollView != null && mNavigationMode == 2)
            {
                mTabScrollView.setVisibility(0);
            }
            if (mSpinner != null && mNavigationMode == 1)
            {
                mSpinner.setVisibility(0);
            }
            if (mCustomNavView != null && (mDisplayOptions & 0x10) != 0)
            {
                mCustomNavView.setVisibility(0);
            }
            mExpandedHomeLayout.setIcon(null);
            mCurrentExpandedItem = null;
            requestLayout();
            menuitemimpl.setActionViewExpanded(false);
            return true;
        }

        public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
        {
            mExpandedActionView = menuitemimpl.getActionView();
            mExpandedHomeLayout.setIcon(mIcon.getConstantState().newDrawable());
            mCurrentExpandedItem = menuitemimpl;
            if (mExpandedActionView.getParent() != ActionBarView.this)
            {
                addView(mExpandedActionView);
            }
            if (mExpandedHomeLayout.getParent() != ActionBarView.this)
            {
                addView(mExpandedHomeLayout);
            }
            mHomeLayout.setVisibility(8);
            if (mTitleLayout != null)
            {
                mTitleLayout.setVisibility(8);
            }
            if (mTabScrollView != null)
            {
                mTabScrollView.setVisibility(8);
            }
            if (mSpinner != null)
            {
                mSpinner.setVisibility(8);
            }
            if (mCustomNavView != null)
            {
                mCustomNavView.setVisibility(8);
            }
            requestLayout();
            menuitemimpl.setActionViewExpanded(true);
            if (mExpandedActionView instanceof CollapsibleActionView)
            {
                ((CollapsibleActionView)mExpandedActionView).onActionViewExpanded();
            }
            return true;
        }

        public boolean flagActionItems()
        {
            return false;
        }

        public void initForMenu(Context context, MenuBuilder menubuilder)
        {
            if (mMenu != null && mCurrentExpandedItem != null)
            {
                mMenu.collapseItemActionView(mCurrentExpandedItem);
            }
            mMenu = menubuilder;
        }

        public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
        }

        public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
        {
            return false;
        }

        public void updateMenuView(boolean flag)
        {
            boolean flag1 = false;
            boolean flag2 = false;
            int j = AbsActionBarView.b;
            if (mCurrentExpandedItem != null)
            {
                if (mMenu != null)
                {
                    int k = mMenu.size();
                    int i = 0;
                    do
                    {
                        flag1 = flag2;
                        if (i >= k)
                        {
                            break;
                        }
                        flag1 = flag2;
                        if (mMenu.getItem(i) == mCurrentExpandedItem)
                        {
                            flag1 = true;
                            flag2 = true;
                            if (j == 0)
                            {
                                break;
                            }
                            flag1 = flag2;
                        }
                        i++;
                        flag2 = flag1;
                    } while (j == 0);
                }
                if (!flag1)
                {
                    collapseItemActionView(mMenu, mCurrentExpandedItem);
                }
            }
        }

        private ExpandedActionViewMenuPresenter()
        {
            this$0 = ActionBarView.this;
            super();
        }

        ExpandedActionViewMenuPresenter(_cls1 _pcls1)
        {
            this();
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        int expandedMenuItemId;
        boolean isOverflowOpen;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(expandedMenuItemId);
            if (isOverflowOpen)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            expandedMenuItemId = parcel.readInt();
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            isOverflowOpen = flag;
        }

        SavedState(Parcel parcel, _cls1 _pcls1)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }

        class _cls1
            implements android.os.Parcelable.Creator
        {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, null);
            }

            public Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public Object[] newArray(int i)
            {
                return newArray(i);
            }

                _cls1()
                {
                }
        }

    }

}
