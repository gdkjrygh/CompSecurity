// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.actionbarsherlock.internal.nineoldandroids.animation.Animator;
import com.actionbarsherlock.internal.nineoldandroids.animation.ObjectAnimator;
import com.actionbarsherlock.internal.nineoldandroids.widget.NineHorizontalScrollView;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            IcsSpinner, IcsLinearLayout, AbsActionBarView, IcsAdapterView

public class ScrollingTabContainerView extends NineHorizontalScrollView
    implements IcsAdapterView.OnItemSelectedListener
{

    private static final Interpolator sAlphaInterpolator;
    private static final String z[];
    private boolean mAllowCollapse;
    private int mContentHeight;
    private LayoutInflater mInflater;
    int mMaxTabWidth;
    private int mSelectedTabIndex;
    private TabClickListener mTabClickListener;
    private IcsLinearLayout mTabLayout;
    Runnable mTabSelector;
    private IcsSpinner mTabSpinner;
    protected final VisibilityAnimListener mVisAnimListener = new VisibilityAnimListener();
    protected Animator mVisibilityAnim;

    public ScrollingTabContainerView(Context context)
    {
        super(context);
        setHorizontalScrollBarEnabled(false);
        TypedArray typedarray = getContext().obtainStyledAttributes(null, com.actionbarsherlock.R.styleable.SherlockActionBar, com.actionbarsherlock.R.attr.actionBarStyle, 0);
        setContentHeight(typedarray.getLayoutDimension(com.actionbarsherlock.R.styleable.SherlockActionBar_height, 0));
        typedarray.recycle();
        mInflater = LayoutInflater.from(context);
        mTabLayout = createTabLayout();
        addView(mTabLayout, new android.view.ViewGroup.LayoutParams(-2, -1));
    }

    private IcsSpinner createSpinner()
    {
        IcsSpinner icsspinner = new IcsSpinner(getContext(), null, com.actionbarsherlock.R.attr.actionDropDownStyle);
        icsspinner.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -1));
        icsspinner.setOnItemSelectedListener(this);
        return icsspinner;
    }

    private IcsLinearLayout createTabLayout()
    {
        IcsLinearLayout icslinearlayout = (IcsLinearLayout)LayoutInflater.from(getContext()).inflate(com.actionbarsherlock.R.layout.abs__action_bar_tab_bar_view, null);
        icslinearlayout.setMeasureWithLargestChildEnabled(true);
        icslinearlayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -1));
        return icslinearlayout;
    }

    private TabView createTabView(com.actionbarsherlock.app.ActionBar.Tab tab, boolean flag)
    {
        TabView tabview;
label0:
        {
            tabview = (TabView)mInflater.inflate(com.actionbarsherlock.R.layout.abs__action_bar_tab, null);
            tabview.init(this, tab, flag);
            if (flag)
            {
                tabview.setBackgroundDrawable(null);
                tabview.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, mContentHeight));
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            tabview.setFocusable(true);
            if (mTabClickListener == null)
            {
                mTabClickListener = new TabClickListener(null);
            }
            tabview.setOnClickListener(mTabClickListener);
        }
        return tabview;
    }

    private boolean isCollapsed()
    {
        return mTabSpinner != null && mTabSpinner.getParent() == this;
    }

    private void performCollapse()
    {
        if (isCollapsed())
        {
            return;
        }
        if (mTabSpinner == null)
        {
            mTabSpinner = createSpinner();
        }
        removeView(mTabLayout);
        addView(mTabSpinner, new android.view.ViewGroup.LayoutParams(-2, -1));
        if (mTabSpinner.getAdapter() == null)
        {
            mTabSpinner.setAdapter(new TabAdapter(null));
        }
        if (mTabSelector != null)
        {
            removeCallbacks(mTabSelector);
            mTabSelector = null;
        }
        mTabSpinner.setSelection(mSelectedTabIndex);
    }

    private boolean performExpand()
    {
        if (!isCollapsed())
        {
            return false;
        } else
        {
            removeView(mTabSpinner);
            addView(mTabLayout, new android.view.ViewGroup.LayoutParams(-2, -1));
            setTabSelected(mTabSpinner.getSelectedItemPosition());
            return false;
        }
    }

    public void addTab(com.actionbarsherlock.app.ActionBar.Tab tab, boolean flag)
    {
        tab = createTabView(tab, false);
        mTabLayout.addView(tab, new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F));
        if (mTabSpinner != null)
        {
            ((TabAdapter)mTabSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (flag)
        {
            tab.setSelected(true);
        }
        if (mAllowCollapse)
        {
            requestLayout();
        }
    }

    public void animateToTab(int i)
    {
        final View tabView = mTabLayout.getChildAt(i);
        if (mTabSelector != null)
        {
            removeCallbacks(mTabSelector);
        }
        mTabSelector = new _cls1();
        post(mTabSelector);
    }

    public void animateToVisibility(int i)
    {
label0:
        {
            if (mVisibilityAnim != null)
            {
                mVisibilityAnim.cancel();
            }
            if (i == 0)
            {
                if (getVisibility() != 0)
                {
                    setAlpha(0.0F);
                }
                ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, z[1], new float[] {
                    1.0F
                });
                objectanimator.setDuration(200L);
                objectanimator.setInterpolator(sAlphaInterpolator);
                objectanimator.addListener(mVisAnimListener.withFinalVisibility(i));
                objectanimator.start();
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(this, z[0], new float[] {
                0.0F
            });
            objectanimator1.setDuration(200L);
            objectanimator1.setInterpolator(sAlphaInterpolator);
            objectanimator1.addListener(mVisAnimListener.withFinalVisibility(i));
            objectanimator1.start();
        }
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (mTabSelector != null)
        {
            post(mTabSelector);
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        configuration = getContext().obtainStyledAttributes(null, com.actionbarsherlock.R.styleable.SherlockActionBar, com.actionbarsherlock.R.attr.actionBarStyle, 0);
        setContentHeight(configuration.getLayoutDimension(com.actionbarsherlock.R.styleable.SherlockActionBar_height, 0));
        configuration.recycle();
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (mTabSelector != null)
        {
            removeCallbacks(mTabSelector);
        }
    }

    public void onItemSelected(IcsAdapterView icsadapterview, View view, int i, long l)
    {
        ((TabView)view).getTab().select();
    }

    public void onMeasure(int i, int j)
    {
label0:
        {
            j = 1;
            int k = AbsActionBarView.b;
            int l = android.view.View.MeasureSpec.getMode(i);
            int i1;
            boolean flag;
            if (l == 0x40000000)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            setFillViewport(flag);
            i1 = mTabLayout.getChildCount();
            if (i1 > 1 && (l == 0x40000000 || l == 0x80000000))
            {
                if (i1 > 2)
                {
                    mMaxTabWidth = (int)((float)android.view.View.MeasureSpec.getSize(i) * 0.4F);
                    if (k == 0)
                    {
                        break label0;
                    }
                }
                mMaxTabWidth = android.view.View.MeasureSpec.getSize(i) / 2;
                if (k == 0)
                {
                    break label0;
                }
            }
            mMaxTabWidth = -1;
        }
label1:
        {
            l = android.view.View.MeasureSpec.makeMeasureSpec(mContentHeight, 0x40000000);
            if (flag || !mAllowCollapse)
            {
                j = 0;
            }
            if (j != 0)
            {
                mTabLayout.measure(0, l);
                if (mTabLayout.getMeasuredWidth() > android.view.View.MeasureSpec.getSize(i))
                {
                    performCollapse();
                    if (k == 0)
                    {
                        break label1;
                    }
                }
                performExpand();
                if (k == 0)
                {
                    break label1;
                }
            }
            performExpand();
        }
        j = getMeasuredWidth();
        super.onMeasure(i, l);
        i = getMeasuredWidth();
        if (flag && j != i)
        {
            setTabSelected(mSelectedTabIndex);
        }
    }

    public void onNothingSelected(IcsAdapterView icsadapterview)
    {
    }

    public void setAllowCollapse(boolean flag)
    {
        mAllowCollapse = flag;
    }

    public void setContentHeight(int i)
    {
        mContentHeight = i;
        requestLayout();
    }

    public void setTabSelected(int i)
    {
        int k = AbsActionBarView.b;
        mSelectedTabIndex = i;
        int l = mTabLayout.getChildCount();
        int j = 0;
        do
        {
label0:
            {
                if (j < l)
                {
                    View view = mTabLayout.getChildAt(j);
                    boolean flag;
                    if (j == i)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    view.setSelected(flag);
                    if (flag)
                    {
                        animateToTab(i);
                    }
                    if (k == 0)
                    {
                        break label0;
                    }
                }
                return;
            }
            j++;
        } while (true);
    }

    public void updateTab(int i)
    {
        ((TabView)mTabLayout.getChildAt(i)).update();
        if (mTabSpinner != null)
        {
            ((TabAdapter)mTabSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (mAllowCollapse)
        {
            requestLayout();
        }
    }

    static 
    {
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        Object obj;
        int j;
        int k;
        as1 = as;
        obj = "b\016\031r$".toCharArray();
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                sAlphaInterpolator = new DecelerateInterpolator();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 140
    //                   0 161
    //                   1 166
    //                   2 172
    //                   3 178;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_178;
_L3:
        byte byte0 = 69;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 3;
          goto _L9
_L5:
        byte0 = 98;
          goto _L9
_L6:
        byte0 = 105;
          goto _L9
        byte0 = 26;
          goto _L9
    }



    private class VisibilityAnimListener
        implements com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener
    {

        private boolean mCanceled;
        private int mFinalVisibility;
        final ScrollingTabContainerView this$0;

        public void onAnimationCancel(Animator animator)
        {
            mCanceled = true;
        }

        public void onAnimationEnd(Animator animator)
        {
            if (mCanceled)
            {
                return;
            } else
            {
                mVisibilityAnim = null;
                setVisibility(mFinalVisibility);
                return;
            }
        }

        public void onAnimationRepeat(Animator animator)
        {
        }

        public void onAnimationStart(Animator animator)
        {
            setVisibility(0);
            mVisibilityAnim = animator;
            mCanceled = false;
        }

        public VisibilityAnimListener withFinalVisibility(int i)
        {
            mFinalVisibility = i;
            return this;
        }

        protected VisibilityAnimListener()
        {
            this$0 = ScrollingTabContainerView.this;
            super();
            mCanceled = false;
        }
    }


    private class TabView extends LinearLayout
    {

        private View mCustomView;
        private ImageView mIconView;
        private ScrollingTabContainerView mParent;
        private com.actionbarsherlock.app.ActionBar.Tab mTab;
        private CapitalizingTextView mTextView;

        public void bindTab(com.actionbarsherlock.app.ActionBar.Tab tab)
        {
            mTab = tab;
            update();
        }

        public com.actionbarsherlock.app.ActionBar.Tab getTab()
        {
            return mTab;
        }

        public void init(ScrollingTabContainerView scrollingtabcontainerview, com.actionbarsherlock.app.ActionBar.Tab tab, boolean flag)
        {
            mParent = scrollingtabcontainerview;
            mTab = tab;
            if (flag)
            {
                setGravity(19);
            }
            update();
        }

        public void onMeasure(int i, int j)
        {
            super.onMeasure(i, j);
            if (mParent.mMaxTabWidth > 0 && getMeasuredWidth() > mParent.mMaxTabWidth)
            {
                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(mParent.mMaxTabWidth, 0x40000000), j);
            }
        }

        public void update()
        {
label0:
            {
                com.actionbarsherlock.app.ActionBar.Tab tab;
                Object obj;
                int i;
label1:
                {
                    i = AbsActionBarView.b;
                    tab = mTab;
                    obj = tab.getCustomView();
                    if (obj != null)
                    {
                        android.view.ViewParent viewparent = ((View) (obj)).getParent();
                        if (viewparent != this)
                        {
                            if (viewparent != null)
                            {
                                ((ViewGroup)viewparent).removeView(((View) (obj)));
                            }
                            addView(((View) (obj)));
                        }
                        mCustomView = ((View) (obj));
                        if (mTextView != null)
                        {
                            mTextView.setVisibility(8);
                        }
                        if (mIconView != null)
                        {
                            mIconView.setVisibility(8);
                            mIconView.setImageDrawable(null);
                        }
                        if (i == 0)
                        {
                            break label0;
                        }
                    }
                    if (mCustomView != null)
                    {
                        removeView(mCustomView);
                        mCustomView = null;
                    }
                    android.graphics.drawable.Drawable drawable = tab.getIcon();
                    obj = tab.getText();
                    if (drawable != null)
                    {
                        if (mIconView == null)
                        {
                            ImageView imageview = new ImageView(getContext());
                            android.widget.LinearLayout.LayoutParams layoutparams1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                            layoutparams1.gravity = 16;
                            imageview.setLayoutParams(layoutparams1);
                            addView(imageview, 0);
                            mIconView = imageview;
                        }
                        mIconView.setImageDrawable(drawable);
                        mIconView.setVisibility(0);
                        if (i == 0)
                        {
                            break label1;
                        }
                    }
                    if (mIconView != null)
                    {
                        mIconView.setVisibility(8);
                        mIconView.setImageDrawable(null);
                    }
                }
label2:
                {
                    if (obj != null)
                    {
                        if (mTextView == null)
                        {
                            CapitalizingTextView capitalizingtextview = new CapitalizingTextView(getContext(), null, com.actionbarsherlock.R.attr.actionBarTabTextStyle);
                            capitalizingtextview.setEllipsize(android.text.TextUtils.TruncateAt.END);
                            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                            layoutparams.gravity = 16;
                            capitalizingtextview.setLayoutParams(layoutparams);
                            addView(capitalizingtextview);
                            mTextView = capitalizingtextview;
                        }
                        mTextView.setTextCompat(((CharSequence) (obj)));
                        mTextView.setVisibility(0);
                        if (i == 0)
                        {
                            break label2;
                        }
                    }
                    if (mTextView != null)
                    {
                        mTextView.setVisibility(8);
                        mTextView.setText(null);
                    }
                }
                if (mIconView != null)
                {
                    mIconView.setContentDescription(tab.getContentDescription());
                }
            }
        }

        public TabView(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }
    }


    private class TabClickListener
        implements android.view.View.OnClickListener
    {

        final ScrollingTabContainerView this$0;

        public void onClick(View view)
        {
            int j = AbsActionBarView.b;
            ((TabView)view).getTab().select();
            int k = mTabLayout.getChildCount();
            int i = 0;
            do
            {
label0:
                {
                    if (i < k)
                    {
                        View view1 = mTabLayout.getChildAt(i);
                        boolean flag;
                        if (view1 == view)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        view1.setSelected(flag);
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

        private TabClickListener()
        {
            this$0 = ScrollingTabContainerView.this;
            super();
        }

        TabClickListener(_cls1 _pcls1)
        {
            this();
        }
    }


    private class TabAdapter extends BaseAdapter
    {

        final ScrollingTabContainerView this$0;

        public int getCount()
        {
            return mTabLayout.getChildCount();
        }

        public Object getItem(int i)
        {
            return ((TabView)mTabLayout.getChildAt(i)).getTab();
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
label0:
            {
                if (view == null)
                {
                    view = createTabView((com.actionbarsherlock.app.ActionBar.Tab)getItem(i), true);
                    viewgroup = view;
                    if (AbsActionBarView.b == 0)
                    {
                        break label0;
                    }
                }
                ((TabView)view).bindTab((com.actionbarsherlock.app.ActionBar.Tab)getItem(i));
                viewgroup = view;
            }
            return viewgroup;
        }

        private TabAdapter()
        {
            this$0 = ScrollingTabContainerView.this;
            super();
        }

        TabAdapter(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls1
        implements Runnable
    {

        final ScrollingTabContainerView this$0;
        final View val$tabView;

        public void run()
        {
            int i = tabView.getLeft();
            int j = (getWidth() - tabView.getWidth()) / 2;
            smoothScrollTo(i - j, 0);
            mTabSelector = null;
        }

        _cls1()
        {
            this$0 = ScrollingTabContainerView.this;
            tabView = view;
            super();
        }
    }

}
