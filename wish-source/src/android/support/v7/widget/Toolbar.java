// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MarginLayoutParamsCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.internal.view.SupportMenuInflater;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.support.v7.internal.view.menu.MenuPresenter;
import android.support.v7.internal.view.menu.MenuView;
import android.support.v7.internal.view.menu.SubMenuBuilder;
import android.support.v7.internal.widget.DecorToolbar;
import android.support.v7.internal.widget.RtlSpacingHelper;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintTypedArray;
import android.support.v7.internal.widget.ToolbarWidgetWrapper;
import android.support.v7.internal.widget.ViewUtils;
import android.support.v7.view.CollapsibleActionView;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuView, ActionMenuPresenter

public class Toolbar extends ViewGroup
{
    private class ExpandedActionViewMenuPresenter
        implements MenuPresenter
    {

        MenuItemImpl mCurrentExpandedItem;
        MenuBuilder mMenu;
        final Toolbar this$0;

        public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
        {
            if (mExpandedActionView instanceof CollapsibleActionView)
            {
                ((CollapsibleActionView)mExpandedActionView).onActionViewCollapsed();
            }
            removeView(mExpandedActionView);
            removeView(mCollapseButtonView);
            mExpandedActionView = null;
            setChildVisibilityForExpandedActionView(false);
            mCurrentExpandedItem = null;
            requestLayout();
            menuitemimpl.setActionViewExpanded(false);
            return true;
        }

        public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
        {
            ensureCollapseButtonView();
            if (mCollapseButtonView.getParent() != Toolbar.this)
            {
                addView(mCollapseButtonView);
            }
            mExpandedActionView = menuitemimpl.getActionView();
            mCurrentExpandedItem = menuitemimpl;
            if (mExpandedActionView.getParent() != Toolbar.this)
            {
                menubuilder = generateDefaultLayoutParams();
                menubuilder.gravity = 0x800003 | mButtonGravity & 0x70;
                menubuilder.mViewType = 2;
                mExpandedActionView.setLayoutParams(menubuilder);
                addView(mExpandedActionView);
            }
            setChildVisibilityForExpandedActionView(true);
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

        public int getId()
        {
            return 0;
        }

        public MenuView getMenuView(ViewGroup viewgroup)
        {
            return null;
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

        public void onRestoreInstanceState(Parcelable parcelable)
        {
        }

        public Parcelable onSaveInstanceState()
        {
            return null;
        }

        public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
        {
            return false;
        }

        public void setCallback(android.support.v7.internal.view.menu.MenuPresenter.Callback callback)
        {
        }

        public void updateMenuView(boolean flag)
        {
            if (mCurrentExpandedItem == null) goto _L2; else goto _L1
_L1:
            boolean flag1;
            boolean flag2;
            flag2 = false;
            flag1 = flag2;
            if (mMenu == null) goto _L4; else goto _L3
_L3:
            int i;
            int j;
            j = mMenu.size();
            i = 0;
_L9:
            flag1 = flag2;
            if (i >= j) goto _L4; else goto _L5
_L5:
            if (mMenu.getItem(i) != mCurrentExpandedItem) goto _L7; else goto _L6
_L6:
            flag1 = true;
_L4:
            if (!flag1)
            {
                collapseItemActionView(mMenu, mCurrentExpandedItem);
            }
_L2:
            return;
_L7:
            i++;
            if (true) goto _L9; else goto _L8
_L8:
        }

        private ExpandedActionViewMenuPresenter()
        {
            this$0 = Toolbar.this;
            super();
        }

    }

    public static class LayoutParams extends android.support.v7.app.ActionBar.LayoutParams
    {

        static final int CUSTOM = 0;
        static final int EXPANDED = 2;
        static final int SYSTEM = 1;
        int mViewType;

        void copyMarginsFromCompat(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            leftMargin = marginlayoutparams.leftMargin;
            topMargin = marginlayoutparams.topMargin;
            rightMargin = marginlayoutparams.rightMargin;
            bottomMargin = marginlayoutparams.bottomMargin;
        }

        public LayoutParams(int i)
        {
            this(-2, -1, i);
        }

        public LayoutParams(int i, int j)
        {
            super(i, j);
            mViewType = 0;
            gravity = 0x800013;
        }

        public LayoutParams(int i, int j, int k)
        {
            super(i, j);
            mViewType = 0;
            gravity = k;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            mViewType = 0;
        }

        public LayoutParams(android.support.v7.app.ActionBar.LayoutParams layoutparams)
        {
            super(layoutparams);
            mViewType = 0;
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            mViewType = 0;
            mViewType = layoutparams.mViewType;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            mViewType = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            mViewType = 0;
            copyMarginsFromCompat(marginlayoutparams);
        }
    }

    public static interface OnMenuItemClickListener
    {

        public abstract boolean onMenuItemClick(MenuItem menuitem);
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public int expandedMenuItemId;
        public boolean isOverflowOpen;

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


        public SavedState(Parcel parcel)
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

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }


    private static final String TAG = "Toolbar";
    private android.support.v7.internal.view.menu.MenuPresenter.Callback mActionMenuPresenterCallback;
    private int mButtonGravity;
    private ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private final RtlSpacingHelper mContentInsets;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    private int mGravity;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    private android.support.v7.internal.view.menu.MenuBuilder.Callback mMenuBuilderCallback;
    private ActionMenuView mMenuView;
    private final ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener;
    private int mMinHeight;
    private ImageButton mNavButtonView;
    private OnMenuItemClickListener mOnMenuItemClickListener;
    private ActionMenuPresenter mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private int mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int mTempMargins[];
    private final ArrayList mTempViews;
    private final TintManager mTintManager;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private int mTitleTextColor;
    private TextView mTitleTextView;
    private ToolbarWidgetWrapper mWrapper;

    public Toolbar(Context context)
    {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeset, int i)
    {
        super(themifyContext(context, attributeset, i), attributeset, i);
        mContentInsets = new RtlSpacingHelper();
        mGravity = 0x800013;
        mTempViews = new ArrayList();
        mTempMargins = new int[2];
        mMenuViewItemClickListener = new ActionMenuView.OnMenuItemClickListener() {

            final Toolbar this$0;

            public boolean onMenuItemClick(MenuItem menuitem)
            {
                if (mOnMenuItemClickListener != null)
                {
                    return mOnMenuItemClickListener.onMenuItemClick(menuitem);
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = Toolbar.this;
                super();
            }
        };
        mShowOverflowMenuRunnable = new Runnable() {

            final Toolbar this$0;

            public void run()
            {
                showOverflowMenu();
            }

            
            {
                this$0 = Toolbar.this;
                super();
            }
        };
        context = TintTypedArray.obtainStyledAttributes(getContext(), attributeset, android.support.v7.appcompat.R.styleable.Toolbar, i, 0);
        mTitleTextAppearance = context.getResourceId(android.support.v7.appcompat.R.styleable.Toolbar_titleTextAppearance, 0);
        mSubtitleTextAppearance = context.getResourceId(android.support.v7.appcompat.R.styleable.Toolbar_subtitleTextAppearance, 0);
        mGravity = context.getInteger(android.support.v7.appcompat.R.styleable.Toolbar_android_gravity, mGravity);
        mButtonGravity = 48;
        i = context.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMargins, 0);
        mTitleMarginBottom = i;
        mTitleMarginTop = i;
        mTitleMarginEnd = i;
        mTitleMarginStart = i;
        i = context.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMarginStart, -1);
        if (i >= 0)
        {
            mTitleMarginStart = i;
        }
        i = context.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMarginEnd, -1);
        if (i >= 0)
        {
            mTitleMarginEnd = i;
        }
        i = context.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMarginTop, -1);
        if (i >= 0)
        {
            mTitleMarginTop = i;
        }
        i = context.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMarginBottom, -1);
        if (i >= 0)
        {
            mTitleMarginBottom = i;
        }
        mMaxButtonHeight = context.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.Toolbar_maxButtonHeight, -1);
        i = context.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetStart, 0x80000000);
        int j = context.getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetEnd, 0x80000000);
        int k = context.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetLeft, 0);
        int l = context.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetRight, 0);
        mContentInsets.setAbsolute(k, l);
        if (i != 0x80000000 || j != 0x80000000)
        {
            mContentInsets.setRelative(i, j);
        }
        mCollapseIcon = context.getDrawable(android.support.v7.appcompat.R.styleable.Toolbar_collapseIcon);
        mCollapseDescription = context.getText(android.support.v7.appcompat.R.styleable.Toolbar_collapseContentDescription);
        attributeset = context.getText(android.support.v7.appcompat.R.styleable.Toolbar_title);
        if (!TextUtils.isEmpty(attributeset))
        {
            setTitle(attributeset);
        }
        attributeset = context.getText(android.support.v7.appcompat.R.styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(attributeset))
        {
            setSubtitle(attributeset);
        }
        mPopupContext = getContext();
        setPopupTheme(context.getResourceId(android.support.v7.appcompat.R.styleable.Toolbar_popupTheme, 0));
        attributeset = context.getDrawable(android.support.v7.appcompat.R.styleable.Toolbar_navigationIcon);
        if (attributeset != null)
        {
            setNavigationIcon(attributeset);
        }
        attributeset = context.getText(android.support.v7.appcompat.R.styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(attributeset))
        {
            setNavigationContentDescription(attributeset);
        }
        mMinHeight = context.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.Toolbar_android_minHeight, 0);
        context.recycle();
        mTintManager = context.getTintManager();
    }

    private void addCustomViewsWithGravity(List list, int i)
    {
        boolean flag = true;
        int j;
        int k;
        if (ViewCompat.getLayoutDirection(this) != 1)
        {
            flag = false;
        }
        k = getChildCount();
        j = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this));
        list.clear();
        if (flag)
        {
            for (i = k - 1; i >= 0; i--)
            {
                View view = getChildAt(i);
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (layoutparams.mViewType == 0 && shouldLayout(view) && getChildHorizontalGravity(layoutparams.gravity) == j)
                {
                    list.add(view);
                }
            }

        } else
        {
            for (i = 0; i < k; i++)
            {
                View view1 = getChildAt(i);
                LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
                if (layoutparams1.mViewType == 0 && shouldLayout(view1) && getChildHorizontalGravity(layoutparams1.gravity) == j)
                {
                    list.add(view1);
                }
            }

        }
    }

    private void addSystemView(View view)
    {
        Object obj = view.getLayoutParams();
        if (obj == null)
        {
            obj = generateDefaultLayoutParams();
        } else
        if (!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
        {
            obj = generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        {
            obj = (LayoutParams)obj;
        }
        obj.mViewType = 1;
        addView(view, ((android.view.ViewGroup.LayoutParams) (obj)));
    }

    private void ensureCollapseButtonView()
    {
        if (mCollapseButtonView == null)
        {
            mCollapseButtonView = new ImageButton(getContext(), null, android.support.v7.appcompat.R.attr.toolbarNavigationButtonStyle);
            mCollapseButtonView.setImageDrawable(mCollapseIcon);
            mCollapseButtonView.setContentDescription(mCollapseDescription);
            LayoutParams layoutparams = generateDefaultLayoutParams();
            layoutparams.gravity = 0x800003 | mButtonGravity & 0x70;
            layoutparams.mViewType = 2;
            mCollapseButtonView.setLayoutParams(layoutparams);
            mCollapseButtonView.setOnClickListener(new android.view.View.OnClickListener() {

                final Toolbar this$0;

                public void onClick(View view)
                {
                    collapseActionView();
                }

            
            {
                this$0 = Toolbar.this;
                super();
            }
            });
        }
    }

    private void ensureLogoView()
    {
        if (mLogoView == null)
        {
            mLogoView = new ImageView(getContext());
        }
    }

    private void ensureMenu()
    {
        ensureMenuView();
        if (mMenuView.peekMenu() == null)
        {
            MenuBuilder menubuilder = (MenuBuilder)mMenuView.getMenu();
            if (mExpandedMenuPresenter == null)
            {
                mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
            }
            mMenuView.setExpandedActionViewsExclusive(true);
            menubuilder.addMenuPresenter(mExpandedMenuPresenter, mPopupContext);
        }
    }

    private void ensureMenuView()
    {
        if (mMenuView == null)
        {
            mMenuView = new ActionMenuView(getContext());
            mMenuView.setPopupTheme(mPopupTheme);
            mMenuView.setOnMenuItemClickListener(mMenuViewItemClickListener);
            mMenuView.setMenuCallbacks(mActionMenuPresenterCallback, mMenuBuilderCallback);
            LayoutParams layoutparams = generateDefaultLayoutParams();
            layoutparams.gravity = 0x800005 | mButtonGravity & 0x70;
            mMenuView.setLayoutParams(layoutparams);
            addSystemView(mMenuView);
        }
    }

    private void ensureNavButtonView()
    {
        if (mNavButtonView == null)
        {
            mNavButtonView = new ImageButton(getContext(), null, android.support.v7.appcompat.R.attr.toolbarNavigationButtonStyle);
            LayoutParams layoutparams = generateDefaultLayoutParams();
            layoutparams.gravity = 0x800003 | mButtonGravity & 0x70;
            mNavButtonView.setLayoutParams(layoutparams);
        }
    }

    private int getChildHorizontalGravity(int i)
    {
        int k = ViewCompat.getLayoutDirection(this);
        int j = GravityCompat.getAbsoluteGravity(i, k) & 7;
        i = j;
        switch (j)
        {
        case 2: // '\002'
        case 4: // '\004'
        default:
            if (k == 1)
            {
                i = 5;
            } else
            {
                i = 3;
            }
            break;

        case 1: // '\001'
        case 3: // '\003'
        case 5: // '\005'
            break;
        }
        return i;
    }

    private int getChildTop(View view, int i)
    {
        LayoutParams layoutparams;
        int j;
        int k;
        int l;
        int i1;
        layoutparams = (LayoutParams)view.getLayoutParams();
        k = view.getMeasuredHeight();
        if (i > 0)
        {
            i = (k - i) / 2;
        } else
        {
            i = 0;
        }
        getChildVerticalGravity(layoutparams.gravity);
        JVM INSTR lookupswitch 2: default 60
    //                   48: 115
    //                   80: 122;
           goto _L1 _L2 _L3
_L1:
        l = getPaddingTop();
        i = getPaddingBottom();
        i1 = getHeight();
        j = (i1 - l - i - k) / 2;
        if (j >= layoutparams.topMargin) goto _L5; else goto _L4
_L4:
        i = layoutparams.topMargin;
_L7:
        return l + i;
_L2:
        return getPaddingTop() - i;
_L3:
        return getHeight() - getPaddingBottom() - k - layoutparams.bottomMargin - i;
_L5:
        k = i1 - i - k - j - l;
        i = j;
        if (k < layoutparams.bottomMargin)
        {
            i = Math.max(0, j - (layoutparams.bottomMargin - k));
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private int getChildVerticalGravity(int i)
    {
        int j = i & 0x70;
        i = j;
        switch (j)
        {
        default:
            i = mGravity & 0x70;
            // fall through

        case 16: // '\020'
        case 48: // '0'
        case 80: // 'P'
            return i;
        }
    }

    private int getHorizontalMargins(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        return MarginLayoutParamsCompat.getMarginStart(view) + MarginLayoutParamsCompat.getMarginEnd(view);
    }

    private MenuInflater getMenuInflater()
    {
        return new SupportMenuInflater(getContext());
    }

    private int getMinimumHeightCompat()
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return ViewCompat.getMinimumHeight(this);
        } else
        {
            return mMinHeight;
        }
    }

    private int getVerticalMargins(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        return ((android.view.ViewGroup.MarginLayoutParams) (view)).topMargin + ((android.view.ViewGroup.MarginLayoutParams) (view)).bottomMargin;
    }

    private int getViewListMeasuredWidth(List list, int ai[])
    {
        int l = ai[0];
        int k = ai[1];
        int j = 0;
        int i1 = list.size();
        for (int i = 0; i < i1; i++)
        {
            ai = (View)list.get(i);
            LayoutParams layoutparams = (LayoutParams)ai.getLayoutParams();
            l = layoutparams.leftMargin - l;
            k = layoutparams.rightMargin - k;
            int j1 = Math.max(0, l);
            int k1 = Math.max(0, k);
            l = Math.max(0, -l);
            k = Math.max(0, -k);
            j += ai.getMeasuredWidth() + j1 + k1;
        }

        return j;
    }

    private static boolean isCustomView(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).mViewType == 0;
    }

    private int layoutChildLeft(View view, int i, int ai[], int j)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int k = layoutparams.leftMargin - ai[0];
        i += Math.max(0, k);
        ai[0] = Math.max(0, -k);
        j = getChildTop(view, j);
        k = view.getMeasuredWidth();
        view.layout(i, j, i + k, view.getMeasuredHeight() + j);
        return i + (layoutparams.rightMargin + k);
    }

    private int layoutChildRight(View view, int i, int ai[], int j)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int k = layoutparams.rightMargin - ai[1];
        i -= Math.max(0, k);
        ai[1] = Math.max(0, -k);
        j = getChildTop(view, j);
        k = view.getMeasuredWidth();
        view.layout(i - k, j, i, view.getMeasuredHeight() + j);
        return i - (layoutparams.leftMargin + k);
    }

    private int measureChildCollapseMargins(View view, int i, int j, int k, int l, int ai[])
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i1 = marginlayoutparams.leftMargin - ai[0];
        int j1 = marginlayoutparams.rightMargin - ai[1];
        int k1 = Math.max(0, i1) + Math.max(0, j1);
        ai[0] = Math.max(0, -i1);
        ai[1] = Math.max(0, -j1);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + k1 + j, marginlayoutparams.width), getChildMeasureSpec(k, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin + l, marginlayoutparams.height));
        return view.getMeasuredWidth() + k1;
    }

    private void measureChildConstrained(View view, int i, int j, int k, int l, int i1)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int j1 = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j, marginlayoutparams.width);
        j = getChildMeasureSpec(k, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin + l, marginlayoutparams.height);
        k = android.view.View.MeasureSpec.getMode(j);
        i = j;
        if (k != 0x40000000)
        {
            i = j;
            if (i1 >= 0)
            {
                if (k != 0)
                {
                    i = Math.min(android.view.View.MeasureSpec.getSize(j), i1);
                } else
                {
                    i = i1;
                }
                i = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
            }
        }
        view.measure(j1, i);
    }

    private void postShowOverflowMenu()
    {
        removeCallbacks(mShowOverflowMenuRunnable);
        post(mShowOverflowMenuRunnable);
    }

    private void setChildVisibilityForExpandedActionView(boolean flag)
    {
        int j = getChildCount();
        int i = 0;
        while (i < j) 
        {
            View view = getChildAt(i);
            if (((LayoutParams)view.getLayoutParams()).mViewType != 2 && view != mMenuView)
            {
                byte byte0;
                if (flag)
                {
                    byte0 = 8;
                } else
                {
                    byte0 = 0;
                }
                view.setVisibility(byte0);
            }
            i++;
        }
    }

    private boolean shouldCollapse()
    {
        if (mCollapsible) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = getChildCount();
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                View view = getChildAt(i);
                if (shouldLayout(view) && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0)
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private boolean shouldLayout(View view)
    {
        return view != null && view.getParent() == this && view.getVisibility() != 8;
    }

    private static Context themifyContext(Context context, AttributeSet attributeset, int i)
    {
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.Toolbar, i, 0);
        i = typedarray.getResourceId(android.support.v7.appcompat.R.styleable.Toolbar_theme, 0);
        attributeset = context;
        if (i != 0)
        {
            attributeset = new ContextThemeWrapper(context, i);
        }
        typedarray.recycle();
        return attributeset;
    }

    private void updateChildVisibilityForExpandedActionView(View view)
    {
        if (((LayoutParams)view.getLayoutParams()).mViewType != 2 && view != mMenuView)
        {
            byte byte0;
            if (mExpandedActionView != null)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            view.setVisibility(byte0);
        }
    }

    public boolean canShowOverflowMenu()
    {
        return getVisibility() == 0 && mMenuView != null && mMenuView.isOverflowReserved();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return super.checkLayoutParams(layoutparams) && (layoutparams instanceof LayoutParams);
    }

    public void collapseActionView()
    {
        MenuItemImpl menuitemimpl;
        if (mExpandedMenuPresenter == null)
        {
            menuitemimpl = null;
        } else
        {
            menuitemimpl = mExpandedMenuPresenter.mCurrentExpandedItem;
        }
        if (menuitemimpl != null)
        {
            menuitemimpl.collapseActionView();
        }
    }

    public void dismissPopupMenus()
    {
        if (mMenuView != null)
        {
            mMenuView.dismissPopupMenus();
        }
    }

    protected LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams(-2, -2);
    }

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof LayoutParams)
        {
            return new LayoutParams((LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.support.v7.app.ActionBar.LayoutParams)
        {
            return new LayoutParams((android.support.v7.app.ActionBar.LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return generateLayoutParams(attributeset);
    }

    protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateLayoutParams(layoutparams);
    }

    public int getContentInsetEnd()
    {
        return mContentInsets.getEnd();
    }

    public int getContentInsetLeft()
    {
        return mContentInsets.getLeft();
    }

    public int getContentInsetRight()
    {
        return mContentInsets.getRight();
    }

    public int getContentInsetStart()
    {
        return mContentInsets.getStart();
    }

    public Drawable getLogo()
    {
        if (mLogoView != null)
        {
            return mLogoView.getDrawable();
        } else
        {
            return null;
        }
    }

    public CharSequence getLogoDescription()
    {
        if (mLogoView != null)
        {
            return mLogoView.getContentDescription();
        } else
        {
            return null;
        }
    }

    public Menu getMenu()
    {
        ensureMenu();
        return mMenuView.getMenu();
    }

    public CharSequence getNavigationContentDescription()
    {
        if (mNavButtonView != null)
        {
            return mNavButtonView.getContentDescription();
        } else
        {
            return null;
        }
    }

    public Drawable getNavigationIcon()
    {
        if (mNavButtonView != null)
        {
            return mNavButtonView.getDrawable();
        } else
        {
            return null;
        }
    }

    public int getPopupTheme()
    {
        return mPopupTheme;
    }

    public CharSequence getSubtitle()
    {
        return mSubtitleText;
    }

    public CharSequence getTitle()
    {
        return mTitleText;
    }

    public DecorToolbar getWrapper()
    {
        if (mWrapper == null)
        {
            mWrapper = new ToolbarWidgetWrapper(this, true);
        }
        return mWrapper;
    }

    public boolean hasExpandedActionView()
    {
        return mExpandedMenuPresenter != null && mExpandedMenuPresenter.mCurrentExpandedItem != null;
    }

    public boolean hideOverflowMenu()
    {
        return mMenuView != null && mMenuView.hideOverflowMenu();
    }

    public void inflateMenu(int i)
    {
        getMenuInflater().inflate(i, getMenu());
    }

    public boolean isOverflowMenuShowPending()
    {
        return mMenuView != null && mMenuView.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing()
    {
        return mMenuView != null && mMenuView.isOverflowMenuShowing();
    }

    public boolean isTitleTruncated()
    {
        if (mTitleTextView != null) goto _L2; else goto _L1
_L1:
        Layout layout;
        return false;
_L2:
        if ((layout = mTitleTextView.getLayout()) != null)
        {
            int j = layout.getLineCount();
            int i = 0;
            while (i < j) 
            {
                if (layout.getEllipsisCount(i) > 0)
                {
                    return true;
                }
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(mShowOverflowMenuRunnable);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        Object obj;
        Object obj1;
        int ai[];
        boolean flag1;
        int l1;
        int j2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        boolean flag2;
        int j1;
        if (ViewCompat.getLayoutDirection(this) == 1)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        j3 = getWidth();
        l3 = getHeight();
        l2 = getPaddingLeft();
        k3 = getPaddingRight();
        j2 = getPaddingTop();
        i4 = getPaddingBottom();
        k = l2;
        l = j3 - k3;
        ai = mTempMargins;
        ai[1] = 0;
        ai[0] = 0;
        i3 = getMinimumHeightCompat();
        i = k;
        j = l;
        if (shouldLayout(mNavButtonView))
        {
            if (j1 != 0)
            {
                j = layoutChildRight(mNavButtonView, l, ai, i3);
                i = k;
            } else
            {
                i = layoutChildLeft(mNavButtonView, k, ai, i3);
                j = l;
            }
        }
        k = i;
        l = j;
        if (shouldLayout(mCollapseButtonView))
        {
            if (j1 != 0)
            {
                l = layoutChildRight(mCollapseButtonView, j, ai, i3);
                k = i;
            } else
            {
                k = layoutChildLeft(mCollapseButtonView, i, ai, i3);
                l = j;
            }
        }
        j = k;
        i = l;
        if (shouldLayout(mMenuView))
        {
            if (j1 != 0)
            {
                j = layoutChildLeft(mMenuView, k, ai, i3);
                i = l;
            } else
            {
                i = layoutChildRight(mMenuView, l, ai, i3);
                j = k;
            }
        }
        ai[0] = Math.max(0, getContentInsetLeft() - j);
        ai[1] = Math.max(0, getContentInsetRight() - (j3 - k3 - i));
        k = Math.max(j, getContentInsetLeft());
        l = Math.min(i, j3 - k3 - getContentInsetRight());
        i = k;
        j = l;
        if (shouldLayout(mExpandedActionView))
        {
            if (j1 != 0)
            {
                j = layoutChildRight(mExpandedActionView, l, ai, i3);
                i = k;
            } else
            {
                i = layoutChildLeft(mExpandedActionView, k, ai, i3);
                j = l;
            }
        }
        k = i;
        l = j;
        if (shouldLayout(mLogoView))
        {
            if (j1 != 0)
            {
                l = layoutChildRight(mLogoView, j, ai, i3);
                k = i;
            } else
            {
                k = layoutChildLeft(mLogoView, i, ai, i3);
                l = j;
            }
        }
        flag = shouldLayout(mTitleTextView);
        flag2 = shouldLayout(mSubtitleTextView);
        i = 0;
        if (flag)
        {
            LayoutParams layoutparams = (LayoutParams)mTitleTextView.getLayoutParams();
            i = 0 + (layoutparams.topMargin + mTitleTextView.getMeasuredHeight() + layoutparams.bottomMargin);
        }
        l1 = i;
        if (flag2)
        {
            LayoutParams layoutparams1 = (LayoutParams)mSubtitleTextView.getLayoutParams();
            l1 = i + (layoutparams1.topMargin + mSubtitleTextView.getMeasuredHeight() + layoutparams1.bottomMargin);
        }
        if (flag) goto _L2; else goto _L1
_L1:
        j = k;
        i = l;
        if (!flag2) goto _L3; else goto _L2
_L2:
        if (flag)
        {
            obj = mTitleTextView;
        } else
        {
            obj = mSubtitleTextView;
        }
        if (flag2)
        {
            obj1 = mSubtitleTextView;
        } else
        {
            obj1 = mTitleTextView;
        }
        obj = (LayoutParams)((View) (obj)).getLayoutParams();
        obj1 = (LayoutParams)((View) (obj1)).getLayoutParams();
        if (flag && mTitleTextView.getMeasuredWidth() > 0 || flag2 && mSubtitleTextView.getMeasuredWidth() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mGravity & 0x70;
        JVM INSTR lookupswitch 2: default 564
    //                   48: 1030
    //                   80: 1104;
           goto _L4 _L5 _L6
_L4:
        j = (l3 - j2 - i4 - l1) / 2;
        if (j < ((LayoutParams) (obj)).topMargin + mTitleMarginTop)
        {
            i = ((LayoutParams) (obj)).topMargin + mTitleMarginTop;
        } else
        {
            l1 = l3 - i4 - l1 - j - j2;
            i = j;
            if (l1 < ((LayoutParams) (obj)).bottomMargin + mTitleMarginBottom)
            {
                i = Math.max(0, j - ((((LayoutParams) (obj1)).bottomMargin + mTitleMarginBottom) - l1));
            }
        }
        i = j2 + i;
_L13:
        if (j1 != 0)
        {
            if (flag1)
            {
                j = mTitleMarginStart;
            } else
            {
                j = 0;
            }
            j -= ai[1];
            l -= Math.max(0, j);
            ai[1] = Math.max(0, -j);
            l1 = l;
            j = l;
            j1 = l1;
            j2 = i;
            if (flag)
            {
                obj = (LayoutParams)mTitleTextView.getLayoutParams();
                j1 = l1 - mTitleTextView.getMeasuredWidth();
                j2 = i + mTitleTextView.getMeasuredHeight();
                mTitleTextView.layout(j1, i, l1, j2);
                j1 -= mTitleMarginEnd;
                j2 += ((LayoutParams) (obj)).bottomMargin;
            }
            l1 = j;
            if (flag2)
            {
                obj = (LayoutParams)mSubtitleTextView.getLayoutParams();
                i = j2 + ((LayoutParams) (obj)).topMargin;
                l1 = mSubtitleTextView.getMeasuredWidth();
                j2 = i + mSubtitleTextView.getMeasuredHeight();
                mSubtitleTextView.layout(j - l1, i, j, j2);
                l1 = j - mTitleMarginEnd;
                i = ((LayoutParams) (obj)).bottomMargin;
            }
            j = k;
            i = l;
            if (flag1)
            {
                i = Math.min(j1, l1);
                j = k;
            }
        } else
        {
            int k1;
            int i2;
            int k2;
            if (flag1)
            {
                j = mTitleMarginStart;
            } else
            {
                j = 0;
            }
            k1 = j - ai[0];
            j = k + Math.max(0, k1);
            ai[0] = Math.max(0, -k1);
            i2 = j;
            k = j;
            k1 = i2;
            k2 = i;
            if (flag)
            {
                LayoutParams layoutparams2 = (LayoutParams)mTitleTextView.getLayoutParams();
                k1 = i2 + mTitleTextView.getMeasuredWidth();
                k2 = i + mTitleTextView.getMeasuredHeight();
                mTitleTextView.layout(i2, i, k1, k2);
                k1 += mTitleMarginEnd;
                k2 += layoutparams2.bottomMargin;
            }
            i2 = k;
            if (flag2)
            {
                LayoutParams layoutparams3 = (LayoutParams)mSubtitleTextView.getLayoutParams();
                i = k2 + layoutparams3.topMargin;
                i2 = k + mSubtitleTextView.getMeasuredWidth();
                k2 = i + mSubtitleTextView.getMeasuredHeight();
                mSubtitleTextView.layout(k, i, i2, k2);
                i2 += mTitleMarginEnd;
                i = layoutparams3.bottomMargin;
            }
            i = l;
            if (flag1)
            {
                j = Math.max(k1, i2);
                i = l;
            }
        }
_L3:
        int i1;
        addCustomViewsWithGravity(mTempViews, 3);
        l = mTempViews.size();
        for (k = 0; k < l; k++)
        {
            j = layoutChildLeft((View)mTempViews.get(k), j, ai, i3);
        }

        addCustomViewsWithGravity(mTempViews, 5);
        i1 = mTempViews.size();
        l = 0;
        k = i;
        for (i = l; i < i1; i++)
        {
            k = layoutChildRight((View)mTempViews.get(i), k, ai, i3);
        }

        addCustomViewsWithGravity(mTempViews, 1);
        i = getViewListMeasuredWidth(mTempViews, ai);
        l = (l2 + (j3 - l2 - k3) / 2) - i / 2;
        i1 = l + i;
          goto _L7
_L5:
        i = getPaddingTop() + ((LayoutParams) (obj)).topMargin + mTitleMarginTop;
        continue; /* Loop/switch isn't completed */
_L6:
        i = l3 - i4 - ((LayoutParams) (obj1)).bottomMargin - mTitleMarginBottom - l1;
        continue; /* Loop/switch isn't completed */
_L7:
        if (l >= j) goto _L9; else goto _L8
_L8:
        i = j;
_L11:
        k = mTempViews.size();
        for (j = 0; j < k; j++)
        {
            i = layoutChildLeft((View)mTempViews.get(j), i, ai, i3);
        }

        break; /* Loop/switch isn't completed */
_L9:
        i = l;
        if (i1 > k)
        {
            i = l - (i1 - k);
        }
        if (true) goto _L11; else goto _L10
_L10:
        mTempViews.clear();
        return;
        if (true) goto _L13; else goto _L12
_L12:
    }

    protected void onMeasure(int i, int j)
    {
        int j1 = 0;
        int i1 = 0;
        int ai[] = mTempMargins;
        int k;
        int l;
        int k1;
        int l1;
        int i2;
        int j2;
        if (ViewUtils.isLayoutRtl(this))
        {
            i2 = 1;
            l1 = 0;
        } else
        {
            i2 = 0;
            l1 = 1;
        }
        k1 = 0;
        if (shouldLayout(mNavButtonView))
        {
            measureChildConstrained(mNavButtonView, i, 0, j, 0, mMaxButtonHeight);
            k1 = mNavButtonView.getMeasuredWidth() + getHorizontalMargins(mNavButtonView);
            j1 = Math.max(0, mNavButtonView.getMeasuredHeight() + getVerticalMargins(mNavButtonView));
            i1 = ViewUtils.combineMeasuredStates(0, ViewCompat.getMeasuredState(mNavButtonView));
        }
        k = i1;
        l = j1;
        if (shouldLayout(mCollapseButtonView))
        {
            measureChildConstrained(mCollapseButtonView, i, 0, j, 0, mMaxButtonHeight);
            k1 = mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(mCollapseButtonView);
            l = Math.max(j1, mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(mCollapseButtonView));
            k = ViewUtils.combineMeasuredStates(i1, ViewCompat.getMeasuredState(mCollapseButtonView));
        }
        i1 = getContentInsetStart();
        j2 = 0 + Math.max(i1, k1);
        ai[i2] = Math.max(0, i1 - k1);
        k1 = 0;
        i1 = k;
        j1 = l;
        if (shouldLayout(mMenuView))
        {
            measureChildConstrained(mMenuView, i, j2, j, 0, mMaxButtonHeight);
            k1 = mMenuView.getMeasuredWidth() + getHorizontalMargins(mMenuView);
            j1 = Math.max(l, mMenuView.getMeasuredHeight() + getVerticalMargins(mMenuView));
            i1 = ViewUtils.combineMeasuredStates(k, ViewCompat.getMeasuredState(mMenuView));
        }
        k = getContentInsetEnd();
        i2 = j2 + Math.max(k, k1);
        ai[l1] = Math.max(0, k - k1);
        l1 = i2;
        k = i1;
        l = j1;
        if (shouldLayout(mExpandedActionView))
        {
            l1 = i2 + measureChildCollapseMargins(mExpandedActionView, i, i2, j, 0, ai);
            l = Math.max(j1, mExpandedActionView.getMeasuredHeight() + getVerticalMargins(mExpandedActionView));
            k = ViewUtils.combineMeasuredStates(i1, ViewCompat.getMeasuredState(mExpandedActionView));
        }
        i1 = l1;
        j1 = k;
        k1 = l;
        if (shouldLayout(mLogoView))
        {
            i1 = l1 + measureChildCollapseMargins(mLogoView, i, l1, j, 0, ai);
            k1 = Math.max(l, mLogoView.getMeasuredHeight() + getVerticalMargins(mLogoView));
            j1 = ViewUtils.combineMeasuredStates(k, ViewCompat.getMeasuredState(mLogoView));
        }
        j2 = getChildCount();
        l = 0;
        l1 = k1;
        k = j1;
        k1 = i1;
        while (l < j2) 
        {
            View view = getChildAt(l);
            i1 = k1;
            j1 = k;
            i2 = l1;
            if (((LayoutParams)view.getLayoutParams()).mViewType == 0)
            {
                if (!shouldLayout(view))
                {
                    i2 = l1;
                    j1 = k;
                    i1 = k1;
                } else
                {
                    i1 = k1 + measureChildCollapseMargins(view, i, k1, j, 0, ai);
                    i2 = Math.max(l1, view.getMeasuredHeight() + getVerticalMargins(view));
                    j1 = ViewUtils.combineMeasuredStates(k, ViewCompat.getMeasuredState(view));
                }
            }
            l++;
            k1 = i1;
            k = j1;
            l1 = i2;
        }
        j1 = 0;
        i1 = 0;
        int k2 = mTitleMarginTop + mTitleMarginBottom;
        int l2 = mTitleMarginStart + mTitleMarginEnd;
        l = k;
        if (shouldLayout(mTitleTextView))
        {
            measureChildCollapseMargins(mTitleTextView, i, k1 + l2, j, k2, ai);
            j1 = mTitleTextView.getMeasuredWidth() + getHorizontalMargins(mTitleTextView);
            i1 = mTitleTextView.getMeasuredHeight() + getVerticalMargins(mTitleTextView);
            l = ViewUtils.combineMeasuredStates(k, ViewCompat.getMeasuredState(mTitleTextView));
        }
        i2 = l;
        j2 = i1;
        k = j1;
        if (shouldLayout(mSubtitleTextView))
        {
            k = Math.max(j1, measureChildCollapseMargins(mSubtitleTextView, i, k1 + l2, j, i1 + k2, ai));
            j2 = i1 + (mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(mSubtitleTextView));
            i2 = ViewUtils.combineMeasuredStates(l, ViewCompat.getMeasuredState(mSubtitleTextView));
        }
        l = Math.max(l1, j2);
        l1 = getPaddingLeft();
        j2 = getPaddingRight();
        i1 = getPaddingTop();
        j1 = getPaddingBottom();
        k = ViewCompat.resolveSizeAndState(Math.max(k1 + k + (l1 + j2), getSuggestedMinimumWidth()), i, 0xff000000 & i2);
        i = ViewCompat.resolveSizeAndState(Math.max(l + (i1 + j1), getSuggestedMinimumHeight()), j, i2 << 16);
        if (shouldCollapse())
        {
            i = 0;
        }
        setMeasuredDimension(k, i);
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        SavedState savedstate = (SavedState)parcelable;
        super.onRestoreInstanceState(savedstate.getSuperState());
        if (mMenuView != null)
        {
            parcelable = mMenuView.peekMenu();
        } else
        {
            parcelable = null;
        }
        if (savedstate.expandedMenuItemId != 0 && mExpandedMenuPresenter != null && parcelable != null)
        {
            parcelable = parcelable.findItem(savedstate.expandedMenuItemId);
            if (parcelable != null)
            {
                MenuItemCompat.expandActionView(parcelable);
            }
        }
        if (savedstate.isOverflowOpen)
        {
            postShowOverflowMenu();
        }
    }

    public void onRtlPropertiesChanged(int i)
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            super.onRtlPropertiesChanged(i);
        }
        RtlSpacingHelper rtlspacinghelper = mContentInsets;
        if (i != 1)
        {
            flag = false;
        }
        rtlspacinghelper.setDirection(flag);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (mExpandedMenuPresenter != null && mExpandedMenuPresenter.mCurrentExpandedItem != null)
        {
            savedstate.expandedMenuItemId = mExpandedMenuPresenter.mCurrentExpandedItem.getItemId();
        }
        savedstate.isOverflowOpen = isOverflowMenuShowing();
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i = MotionEventCompat.getActionMasked(motionevent);
        if (i == 0)
        {
            mEatingTouch = false;
        }
        if (!mEatingTouch)
        {
            boolean flag = super.onTouchEvent(motionevent);
            if (i == 0 && !flag)
            {
                mEatingTouch = true;
            }
        }
        if (i == 1 || i == 3)
        {
            mEatingTouch = false;
        }
        return true;
    }

    public void setCollapsible(boolean flag)
    {
        mCollapsible = flag;
        requestLayout();
    }

    public void setContentInsetsAbsolute(int i, int j)
    {
        mContentInsets.setAbsolute(i, j);
    }

    public void setContentInsetsRelative(int i, int j)
    {
        mContentInsets.setRelative(i, j);
    }

    public void setLogo(int i)
    {
        setLogo(mTintManager.getDrawable(i));
    }

    public void setLogo(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        ensureLogoView();
        if (mLogoView.getParent() == null)
        {
            addSystemView(mLogoView);
            updateChildVisibilityForExpandedActionView(mLogoView);
        }
_L4:
        if (mLogoView != null)
        {
            mLogoView.setImageDrawable(drawable);
        }
        return;
_L2:
        if (mLogoView != null && mLogoView.getParent() != null)
        {
            removeView(mLogoView);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setLogoDescription(int i)
    {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            ensureLogoView();
        }
        if (mLogoView != null)
        {
            mLogoView.setContentDescription(charsequence);
        }
    }

    public void setMenu(MenuBuilder menubuilder, ActionMenuPresenter actionmenupresenter)
    {
        if (menubuilder != null || mMenuView != null)
        {
            ensureMenuView();
            MenuBuilder menubuilder1 = mMenuView.peekMenu();
            if (menubuilder1 != menubuilder)
            {
                if (menubuilder1 != null)
                {
                    menubuilder1.removeMenuPresenter(mOuterActionMenuPresenter);
                    menubuilder1.removeMenuPresenter(mExpandedMenuPresenter);
                }
                if (mExpandedMenuPresenter == null)
                {
                    mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
                }
                actionmenupresenter.setExpandedActionViewsExclusive(true);
                if (menubuilder != null)
                {
                    menubuilder.addMenuPresenter(actionmenupresenter, mPopupContext);
                    menubuilder.addMenuPresenter(mExpandedMenuPresenter, mPopupContext);
                } else
                {
                    actionmenupresenter.initForMenu(mPopupContext, null);
                    mExpandedMenuPresenter.initForMenu(mPopupContext, null);
                    actionmenupresenter.updateMenuView(true);
                    mExpandedMenuPresenter.updateMenuView(true);
                }
                mMenuView.setPopupTheme(mPopupTheme);
                mMenuView.setPresenter(actionmenupresenter);
                mOuterActionMenuPresenter = actionmenupresenter;
                return;
            }
        }
    }

    public void setMenuCallbacks(android.support.v7.internal.view.menu.MenuPresenter.Callback callback, android.support.v7.internal.view.menu.MenuBuilder.Callback callback1)
    {
        mActionMenuPresenterCallback = callback;
        mMenuBuilderCallback = callback1;
    }

    public void setMinimumHeight(int i)
    {
        mMinHeight = i;
        super.setMinimumHeight(i);
    }

    public void setNavigationContentDescription(int i)
    {
        CharSequence charsequence;
        if (i != 0)
        {
            charsequence = getContext().getText(i);
        } else
        {
            charsequence = null;
        }
        setNavigationContentDescription(charsequence);
    }

    public void setNavigationContentDescription(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            ensureNavButtonView();
        }
        if (mNavButtonView != null)
        {
            mNavButtonView.setContentDescription(charsequence);
        }
    }

    public void setNavigationIcon(int i)
    {
        setNavigationIcon(mTintManager.getDrawable(i));
    }

    public void setNavigationIcon(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        ensureNavButtonView();
        if (mNavButtonView.getParent() == null)
        {
            addSystemView(mNavButtonView);
            updateChildVisibilityForExpandedActionView(mNavButtonView);
        }
_L4:
        if (mNavButtonView != null)
        {
            mNavButtonView.setImageDrawable(drawable);
        }
        return;
_L2:
        if (mNavButtonView != null && mNavButtonView.getParent() != null)
        {
            removeView(mNavButtonView);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        ensureNavButtonView();
        mNavButtonView.setOnClickListener(onclicklistener);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onmenuitemclicklistener)
    {
        mOnMenuItemClickListener = onmenuitemclicklistener;
    }

    public void setPopupTheme(int i)
    {
label0:
        {
            if (mPopupTheme != i)
            {
                mPopupTheme = i;
                if (i != 0)
                {
                    break label0;
                }
                mPopupContext = getContext();
            }
            return;
        }
        mPopupContext = new ContextThemeWrapper(getContext(), i);
    }

    public void setSubtitle(int i)
    {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        if (mSubtitleTextView == null)
        {
            Context context = getContext();
            mSubtitleTextView = new TextView(context);
            mSubtitleTextView.setSingleLine();
            mSubtitleTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            if (mSubtitleTextAppearance != 0)
            {
                mSubtitleTextView.setTextAppearance(context, mSubtitleTextAppearance);
            }
            if (mSubtitleTextColor != 0)
            {
                mSubtitleTextView.setTextColor(mSubtitleTextColor);
            }
        }
        if (mSubtitleTextView.getParent() == null)
        {
            addSystemView(mSubtitleTextView);
            updateChildVisibilityForExpandedActionView(mSubtitleTextView);
        }
_L4:
        if (mSubtitleTextView != null)
        {
            mSubtitleTextView.setText(charsequence);
        }
        mSubtitleText = charsequence;
        return;
_L2:
        if (mSubtitleTextView != null && mSubtitleTextView.getParent() != null)
        {
            removeView(mSubtitleTextView);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setSubtitleTextAppearance(Context context, int i)
    {
        mSubtitleTextAppearance = i;
        if (mSubtitleTextView != null)
        {
            mSubtitleTextView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(int i)
    {
        mSubtitleTextColor = i;
        if (mSubtitleTextView != null)
        {
            mSubtitleTextView.setTextColor(i);
        }
    }

    public void setTitle(int i)
    {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        if (mTitleTextView == null)
        {
            Context context = getContext();
            mTitleTextView = new TextView(context);
            mTitleTextView.setSingleLine();
            mTitleTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            if (mTitleTextAppearance != 0)
            {
                mTitleTextView.setTextAppearance(context, mTitleTextAppearance);
            }
            if (mTitleTextColor != 0)
            {
                mTitleTextView.setTextColor(mTitleTextColor);
            }
        }
        if (mTitleTextView.getParent() == null)
        {
            addSystemView(mTitleTextView);
            updateChildVisibilityForExpandedActionView(mTitleTextView);
        }
_L4:
        if (mTitleTextView != null)
        {
            mTitleTextView.setText(charsequence);
        }
        mTitleText = charsequence;
        return;
_L2:
        if (mTitleTextView != null && mTitleTextView.getParent() != null)
        {
            removeView(mTitleTextView);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setTitleTextAppearance(Context context, int i)
    {
        mTitleTextAppearance = i;
        if (mTitleTextView != null)
        {
            mTitleTextView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i)
    {
        mTitleTextColor = i;
        if (mTitleTextView != null)
        {
            mTitleTextView.setTextColor(i);
        }
    }

    public boolean showOverflowMenu()
    {
        return mMenuView != null && mMenuView.showOverflowMenu();
    }





}
