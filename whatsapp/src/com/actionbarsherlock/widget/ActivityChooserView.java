// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.internal.widget.IcsLinearLayout;
import com.actionbarsherlock.internal.widget.IcsListPopupWindow;
import com.actionbarsherlock.view.ActionProvider;

// Referenced classes of package com.actionbarsherlock.widget:
//            SearchView, ActivityChooserModel

class ActivityChooserView extends ViewGroup
    implements ActivityChooserModel.ActivityChooserModelClient
{

    private static final boolean IS_HONEYCOMB;
    private static final String z;
    private final IcsLinearLayout mActivityChooserContent;
    private final Drawable mActivityChooserContentBackground;
    private final ActivityChooserViewAdapter mAdapter;
    private final Callbacks mCallbacks;
    private final Context mContext;
    private int mDefaultActionButtonContentDescription;
    private final FrameLayout mDefaultActivityButton;
    private final ImageView mDefaultActivityButtonImage;
    private final FrameLayout mExpandActivityOverflowButton;
    private final ImageView mExpandActivityOverflowButtonImage;
    private int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    private boolean mIsSelectingDefaultActivity;
    private final int mListPopupMaxWidth;
    private IcsListPopupWindow mListPopupWindow;
    private final DataSetObserver mModelDataSetOberver;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    ActionProvider mProvider;

    public ActivityChooserView(Context context)
    {
        this(context, null);
    }

    public ActivityChooserView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeset, int i)
    {
        boolean flag = SearchView.a;
        super(context, attributeset, i);
        mModelDataSetOberver = new _cls1();
        mOnGlobalLayoutListener = new _cls2();
        mInitialActivityCount = 4;
        mContext = context;
        attributeset = context.obtainStyledAttributes(attributeset, com.actionbarsherlock.R.styleable.SherlockActivityChooserView, i, 0);
        mInitialActivityCount = attributeset.getInt(com.actionbarsherlock.R.styleable.SherlockActivityChooserView_initialActivityCount, 4);
        Drawable drawable = attributeset.getDrawable(com.actionbarsherlock.R.styleable.SherlockActivityChooserView_expandActivityOverflowButtonDrawable);
        attributeset.recycle();
        LayoutInflater.from(mContext).inflate(com.actionbarsherlock.R.layout.abs__activity_chooser_view, this, true);
        mCallbacks = new Callbacks(null);
        mActivityChooserContent = (IcsLinearLayout)findViewById(com.actionbarsherlock.R.id.abs__activity_chooser_view_content);
        mActivityChooserContentBackground = mActivityChooserContent.getBackground();
        mDefaultActivityButton = (FrameLayout)findViewById(com.actionbarsherlock.R.id.abs__default_activity_button);
        mDefaultActivityButton.setOnClickListener(mCallbacks);
        mDefaultActivityButton.setOnLongClickListener(mCallbacks);
        mDefaultActivityButtonImage = (ImageView)mDefaultActivityButton.findViewById(com.actionbarsherlock.R.id.abs__image);
        mExpandActivityOverflowButton = (FrameLayout)findViewById(com.actionbarsherlock.R.id.abs__expand_activities_button);
        mExpandActivityOverflowButton.setOnClickListener(mCallbacks);
        mExpandActivityOverflowButtonImage = (ImageView)mExpandActivityOverflowButton.findViewById(com.actionbarsherlock.R.id.abs__image);
        mExpandActivityOverflowButtonImage.setImageDrawable(drawable);
        mAdapter = new ActivityChooserViewAdapter(null);
        mAdapter.registerDataSetObserver(new _cls3());
        context = context.getResources();
        boolean flag1;
        try
        {
            mListPopupMaxWidth = Math.max(context.getDisplayMetrics().widthPixels / 2, context.getDimensionPixelSize(com.actionbarsherlock.R.dimen.abs__config_prefDialogWidth));
            flag1 = SherlockActivity.a;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        if (flag1)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            SearchView.a = flag;
        }
    }

    private IcsListPopupWindow getListPopupWindow()
    {
        try
        {
            if (mListPopupWindow == null)
            {
                mListPopupWindow = new IcsListPopupWindow(getContext());
                mListPopupWindow.setAdapter(mAdapter);
                mListPopupWindow.setAnchorView(this);
                mListPopupWindow.setModal(true);
                mListPopupWindow.setOnItemClickListener(mCallbacks);
                mListPopupWindow.setOnDismissListener(mCallbacks);
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        return mListPopupWindow;
    }

    private void showPopupUnchecked(int i)
    {
        int j = 1;
        boolean flag1 = SearchView.a;
        try
        {
            if (mAdapter.getDataModel() == null)
            {
                throw new IllegalStateException(z);
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        int k;
        boolean flag;
        try
        {
            getViewTreeObserver().addOnGlobalLayoutListener(mOnGlobalLayoutListener);
            k = mDefaultActivityButton.getVisibility();
        }
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
        if (k == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = mAdapter.getActivityCount();
        if (!flag)
        {
            j = 0;
        }
        if (i != 0x7fffffff && k > j + i)
        {
            IcsListPopupWindow icslistpopupwindow;
            boolean flag2;
            try
            {
                mAdapter.setShowFooterView(true);
                mAdapter.setMaxActivityCount(i - 1);
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_127;
            }
        }
        mAdapter.setShowFooterView(false);
        mAdapter.setMaxActivityCount(i);
        icslistpopupwindow = getListPopupWindow();
        flag2 = icslistpopupwindow.isShowing();
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        flag2 = mIsSelectingDefaultActivity;
        if (flag2 || !flag)
        {
            IllegalStateException illegalstateexception3;
            try
            {
                mAdapter.setShowDefaultActivity(true, flag);
            }
            catch (IllegalStateException illegalstateexception4)
            {
                throw illegalstateexception4;
            }
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_183;
            }
        }
        mAdapter.setShowDefaultActivity(false, false);
        i = Math.min(mAdapter.measureContentWidth(), mListPopupMaxWidth);
        try
        {
            icslistpopupwindow.setContentWidth(i);
            icslistpopupwindow.show();
            if (mProvider != null)
            {
                mProvider.subUiVisibilityChanged(true);
            }
        }
        catch (IllegalStateException illegalstateexception5)
        {
            throw illegalstateexception5;
        }
        icslistpopupwindow.getListView().setContentDescription(mContext.getString(com.actionbarsherlock.R.string.abs__activitychooserview_choose_application));
        return;
        illegalstateexception3;
        throw illegalstateexception3;
        illegalstateexception3;
        throw illegalstateexception3;
        illegalstateexception3;
        throw illegalstateexception3;
    }

    private void updateAppearance()
    {
        boolean flag = SearchView.a;
        int i = mAdapter.getCount();
        if (i > 0)
        {
            Object obj;
            IllegalStateException illegalstateexception;
            android.content.pm.PackageManager packagemanager;
            int j;
            int k;
            try
            {
                mExpandActivityOverflowButton.setEnabled(true);
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_38;
            }
        }
        mExpandActivityOverflowButton.setEnabled(false);
        j = mAdapter.getActivityCount();
        k = mAdapter.getHistorySize();
        if (j > 0 && k > 0)
        {
            mDefaultActivityButton.setVisibility(0);
            obj = mAdapter.getDefaultActivity();
            packagemanager = mContext.getPackageManager();
            mDefaultActivityButtonImage.setImageDrawable(((ResolveInfo) (obj)).loadIcon(packagemanager));
            if (mDefaultActionButtonContentDescription != 0)
            {
                obj = ((ResolveInfo) (obj)).loadLabel(packagemanager);
                obj = mContext.getString(mDefaultActionButtonContentDescription, new Object[] {
                    obj
                });
                mDefaultActivityButton.setContentDescription(((CharSequence) (obj)));
            }
            try
            {
                mAdapter.setShowDefaultActivity(false, false);
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_164;
            }
        }
        mDefaultActivityButton.setVisibility(8);
        j = mDefaultActivityButton.getVisibility();
        if (j == 0)
        {
            IllegalStateException illegalstateexception3;
            try
            {
                mActivityChooserContent.setBackgroundDrawable(mActivityChooserContentBackground);
            }
            catch (IllegalStateException illegalstateexception4)
            {
                throw illegalstateexception4;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_211;
            }
        }
        mActivityChooserContent.setBackgroundDrawable(null);
        mActivityChooserContent.setPadding(0, 0, 0, 0);
        return;
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception3;
        throw illegalstateexception3;
    }

    public boolean dismissPopup()
    {
        if (isShowingPopup())
        {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewtreeobserver = getViewTreeObserver();
            try
            {
                if (viewtreeobserver.isAlive())
                {
                    viewtreeobserver.removeGlobalOnLayoutListener(mOnGlobalLayoutListener);
                }
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
        }
        return true;
    }

    public boolean isShowingPopup()
    {
        return getListPopupWindow().isShowing();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ActivityChooserModel activitychoosermodel = mAdapter.getDataModel();
        if (activitychoosermodel != null)
        {
            try
            {
                activitychoosermodel.registerObserver(mModelDataSetOberver);
            }
            catch (IllegalStateException illegalstateexception) { }
        }
        mIsAttachedToWindow = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Object obj = mAdapter.getDataModel();
        if (obj != null)
        {
            try
            {
                ((ActivityChooserModel) (obj)).unregisterObserver(mModelDataSetOberver);
            }
            catch (IllegalStateException illegalstateexception1) { }
        }
        obj = getViewTreeObserver();
        try
        {
            if (((ViewTreeObserver) (obj)).isAlive())
            {
                ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(mOnGlobalLayoutListener);
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        mIsAttachedToWindow = false;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        try
        {
            mActivityChooserContent.layout(0, 0, k - i, l - j);
            flag = getListPopupWindow().isShowing();
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
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        showPopupUnchecked(mAdapter.getMaxActivityCount());
        if (!SearchView.a)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        dismissPopup();
        return;
    }

    protected void onMeasure(int i, int j)
    {
        IcsLinearLayout icslinearlayout = mActivityChooserContent;
        int k = j;
        if (mDefaultActivityButton.getVisibility() != 0)
        {
            k = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j), 0x40000000);
        }
        measureChild(icslinearlayout, i, k);
        setMeasuredDimension(icslinearlayout.getMeasuredWidth(), icslinearlayout.getMeasuredHeight());
    }

    static 
    {
        char ac[];
        int j;
        int k;
        ac = "\020\\/S\177*R/Zq:Vc\031>\032Zk\027g1F/T\1772_/\024m;GKVj?~`S{2\f".toCharArray();
        k = ac.length;
        j = 0;
_L6:
        if (k <= j)
        {
            z = (new String(ac)).intern();
            int i;
            char c;
            boolean flag;
            try
            {
                i = android.os.Build.VERSION.SDK_INT;
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            if (i >= 11)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            IS_HONEYCOMB = flag;
            return;
        }
        c = ac[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 88
    //                   0 106
    //                   1 112
    //                   2 118
    //                   3 124;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_124;
_L1:
        i = 30;
_L7:
        ac[j] = (char)(i ^ c);
        j++;
          goto _L6
_L2:
        i = 94;
          goto _L7
_L3:
        i = 51;
          goto _L7
_L4:
        i = 15;
          goto _L7
        i = 55;
          goto _L7
    }










/*
    static boolean access$602(ActivityChooserView activitychooserview, boolean flag)
    {
        activitychooserview.mIsSelectingDefaultActivity = flag;
        return flag;
    }

*/




    private class _cls1 extends DataSetObserver
    {

        final ActivityChooserView this$0;

        public void onChanged()
        {
            super.onChanged();
            mAdapter.notifyDataSetChanged();
        }

        public void onInvalidated()
        {
            super.onInvalidated();
            mAdapter.notifyDataSetInvalidated();
        }

        _cls1()
        {
            this$0 = ActivityChooserView.this;
            super();
        }
    }


    private class _cls2
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final ActivityChooserView this$0;

        public void onGlobalLayout()
        {
label0:
            {
                if (!isShowingPopup())
                {
                    break label0;
                }
                if (!isShown())
                {
                    getListPopupWindow().dismiss();
                    if (!SearchView.a)
                    {
                        break label0;
                    }
                }
                getListPopupWindow().show();
                if (mProvider != null)
                {
                    mProvider.subUiVisibilityChanged(true);
                }
            }
        }

        _cls2()
        {
            this$0 = ActivityChooserView.this;
            super();
        }
    }


    private class Callbacks
        implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.PopupWindow.OnDismissListener
    {

        final ActivityChooserView this$0;

        private void notifyOnDismissListener()
        {
            try
            {
                if (mOnDismissListener != null)
                {
                    mOnDismissListener.onDismiss();
                }
                return;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        }

        public void onClick(View view)
        {
            boolean flag = SearchView.a;
            if (view == mDefaultActivityButton)
            {
                dismissPopup();
                Object obj = mAdapter.getDefaultActivity();
                int i = mAdapter.getDataModel().getActivityIndex(((ResolveInfo) (obj)));
                obj = mAdapter.getDataModel().chooseActivity(i);
                if (obj != null)
                {
                    try
                    {
                        mContext.startActivity(((android.content.Intent) (obj)));
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        throw view;
                    }
                }
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_143;
                }
            }
            obj = mExpandActivityOverflowButton;
            if (view == obj)
            {
                try
                {
                    mIsSelectingDefaultActivity = false;
                    showPopupUnchecked(mInitialActivityCount);
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    throw view;
                }
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_143;
                }
            }
            throw new IllegalArgumentException();
            view;
            throw view;
        }

        public void onDismiss()
        {
            try
            {
                notifyOnDismissListener();
                if (mProvider != null)
                {
                    mProvider.subUiVisibilityChanged(false);
                }
                return;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        }

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            boolean flag = SearchView.a;
            ((ActivityChooserViewAdapter)adapterview.getAdapter()).getItemViewType(i);
            JVM INSTR tableswitch 0 1: default 40
        //                       0 65
        //                       1 51;
               goto _L1 _L2 _L3
_L1:
            try
            {
                throw new IllegalArgumentException();
            }
            // Misplaced declaration of an exception variable
            catch (AdapterView adapterview)
            {
                throw adapterview;
            }
_L3:
            showPopupUnchecked(0x7fffffff);
            if (!flag)
            {
                break; /* Loop/switch isn't completed */
            }
_L2:
            boolean flag1;
            dismissPopup();
            flag1 = mIsSelectingDefaultActivity;
            if (!flag1) goto _L5; else goto _L4
_L4:
            if (i <= 0)
            {
                break; /* Loop/switch isn't completed */
            }
            mAdapter.getDataModel().setDefaultActivity(i);
            if (!flag)
            {
                break; /* Loop/switch isn't completed */
            }
_L5:
            boolean flag2;
            try
            {
                flag2 = mAdapter.getShowDefaultActivity();
            }
            // Misplaced declaration of an exception variable
            catch (AdapterView adapterview)
            {
                throw adapterview;
            }
            if (!flag2)
            {
                i++;
            }
            adapterview = mAdapter.getDataModel().chooseActivity(i);
            if (adapterview != null)
            {
                try
                {
                    mContext.startActivity(adapterview);
                }
                // Misplaced declaration of an exception variable
                catch (AdapterView adapterview)
                {
                    throw adapterview;
                }
            }
            if (flag) goto _L1; else goto _L6
_L6:
            return;
            adapterview;
            try
            {
                throw adapterview;
            }
            // Misplaced declaration of an exception variable
            catch (AdapterView adapterview) { }
            try
            {
                throw adapterview;
            }
            // Misplaced declaration of an exception variable
            catch (AdapterView adapterview) { }
            try
            {
                throw adapterview;
            }
            // Misplaced declaration of an exception variable
            catch (AdapterView adapterview) { }
            throw adapterview;
        }

        public boolean onLongClick(View view)
        {
            FrameLayout framelayout;
            int i;
            try
            {
                framelayout = mDefaultActivityButton;
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
            if (view != framelayout)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            i = mAdapter.getCount();
            if (i <= 0)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            mIsSelectingDefaultActivity = true;
            showPopupUnchecked(mInitialActivityCount);
            if (!SearchView.a)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            throw new IllegalArgumentException();
            return true;
        }

        private Callbacks()
        {
            this$0 = ActivityChooserView.this;
            super();
        }

        Callbacks(_cls1 _pcls1)
        {
            this();
        }
    }


    private class ActivityChooserViewAdapter extends BaseAdapter
    {

        private ActivityChooserModel mDataModel;
        private boolean mHighlightDefaultActivity;
        private int mMaxActivityCount;
        private boolean mShowDefaultActivity;
        private boolean mShowFooterView;
        final ActivityChooserView this$0;

        public int getActivityCount()
        {
            return mDataModel.getActivityCount();
        }

        public int getCount()
        {
            int j = mDataModel.getActivityCount();
            boolean flag = mShowDefaultActivity;
            int i = j;
            if (!flag)
            {
                ResolveInfo resolveinfo;
                IllegalArgumentException illegalargumentexception;
                boolean flag1;
                try
                {
                    resolveinfo = mDataModel.getDefaultActivity();
                }
                catch (IllegalArgumentException illegalargumentexception1)
                {
                    throw illegalargumentexception1;
                }
                i = j;
                if (resolveinfo != null)
                {
                    i = j - 1;
                }
            }
            j = Math.min(i, mMaxActivityCount);
            try
            {
                flag1 = mShowFooterView;
            }
            catch (IllegalArgumentException illegalargumentexception2)
            {
                throw illegalargumentexception2;
            }
            i = j;
            if (flag1)
            {
                i = j + 1;
            }
            return i;
            illegalargumentexception;
            throw illegalargumentexception;
        }

        public ActivityChooserModel getDataModel()
        {
            return mDataModel;
        }

        public ResolveInfo getDefaultActivity()
        {
            return mDataModel.getDefaultActivity();
        }

        public int getHistorySize()
        {
            return mDataModel.getHistorySize();
        }

        public Object getItem(int i)
        {
            switch (getItemViewType(i))
            {
            default:
                throw new IllegalArgumentException();

            case 1: // '\001'
                return null;

            case 0: // '\0'
                break;
            }
            boolean flag = mShowDefaultActivity;
            int j = i;
            if (!flag)
            {
                ResolveInfo resolveinfo;
                IllegalArgumentException illegalargumentexception;
                try
                {
                    resolveinfo = mDataModel.getDefaultActivity();
                }
                catch (IllegalArgumentException illegalargumentexception1)
                {
                    throw illegalargumentexception1;
                }
                j = i;
                if (resolveinfo != null)
                {
                    j = i + 1;
                }
            }
            return mDataModel.getActivity(j);
            illegalargumentexception;
            throw illegalargumentexception;
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public int getItemViewType(int i)
        {
            boolean flag;
            try
            {
                flag = mShowFooterView;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                try
                {
                    throw illegalargumentexception;
                }
                catch (IllegalArgumentException illegalargumentexception1)
                {
                    throw illegalargumentexception1;
                }
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_27;
            }
            if (i == getCount() - 1)
            {
                return 1;
            }
            return 0;
        }

        public int getMaxActivityCount()
        {
            return mMaxActivityCount;
        }

        public boolean getShowDefaultActivity()
        {
            return mShowDefaultActivity;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            getItemViewType(i);
            JVM INSTR tableswitch 0 1: default 28
        //                       0 112
        //                       1 36;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException();
_L3:
            Object obj;
label0:
            {
                if (view != null)
                {
                    try
                    {
                        i = view.getId();
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        throw view;
                    }
                    obj = view;
                    if (i == 1)
                    {
                        break label0;
                    }
                }
                obj = LayoutInflater.from(getContext()).inflate(com.actionbarsherlock.R.layout.abs__activity_chooser_view_list_item, viewgroup, false);
                ((View) (obj)).setId(1);
                ((TextView)((View) (obj)).findViewById(com.actionbarsherlock.R.id.abs__title)).setText(mContext.getString(com.actionbarsherlock.R.string.abs__activity_chooser_view_see_all));
            }
_L8:
            return ((View) (obj));
_L2:
            if (view == null) goto _L5; else goto _L4
_L4:
            Object obj1;
            int j;
            int k;
            boolean flag;
            try
            {
                j = view.getId();
                k = com.actionbarsherlock.R.id.abs__list_item;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (j == k) goto _L6; else goto _L5
_L5:
            view = LayoutInflater.from(getContext()).inflate(com.actionbarsherlock.R.layout.abs__activity_chooser_view_list_item, viewgroup, false);
_L6:
            viewgroup = mContext.getPackageManager();
            obj1 = (ImageView)view.findViewById(com.actionbarsherlock.R.id.abs__icon);
            obj = (ResolveInfo)getItem(i);
            ((ImageView) (obj1)).setImageDrawable(((ResolveInfo) (obj)).loadIcon(viewgroup));
            obj1 = (TextView)view.findViewById(com.actionbarsherlock.R.id.abs__title);
            ((TextView) (obj1)).setText(((ResolveInfo) (obj)).loadLabel(viewgroup));
            flag = ActivityChooserView.IS_HONEYCOMB;
            obj = view;
            if (!flag) goto _L8; else goto _L7
_L7:
            flag = mShowDefaultActivity;
            if (!flag || i != 0)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = mHighlightDefaultActivity;
            if (!flag)
            {
                break; /* Loop/switch isn't completed */
            }
            try
            {
                SetActivated.invoke(view, true);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            obj = view;
            if (!SearchView.a) goto _L8; else goto _L9
_L9:
            SetActivated.invoke(view, false);
            return view;
            view;
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
            catch (View view) { }
            try
            {
                throw view;
            }
            // Misplaced declaration of an exception variable
            catch (View view) { }
            throw view;
        }

        public int getViewTypeCount()
        {
            return 3;
        }

        public int measureContentWidth()
        {
            int i = 0;
            boolean flag = SearchView.a;
            int l = mMaxActivityCount;
            mMaxActivityCount = 0x7fffffff;
            int i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int k1 = getCount();
            int j = 0;
            View view = null;
            int k;
            do
            {
                k = i;
                if (j >= k1)
                {
                    break;
                }
                view = getView(j, view, null);
                view.measure(i1, j1);
                k = Math.max(i, view.getMeasuredWidth());
                j++;
                i = k;
            } while (!flag);
            mMaxActivityCount = l;
            return k;
        }

        public void setMaxActivityCount(int i)
        {
            try
            {
                if (mMaxActivityCount != i)
                {
                    mMaxActivityCount = i;
                    notifyDataSetChanged();
                }
                return;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        }

        public void setShowDefaultActivity(boolean flag, boolean flag1)
        {
            boolean flag2;
            try
            {
                flag2 = mShowDefaultActivity;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                try
                {
                    throw illegalargumentexception;
                }
                catch (IllegalArgumentException illegalargumentexception1)
                {
                    throw illegalargumentexception1;
                }
            }
            if (flag2 != flag)
            {
                break MISSING_BLOCK_LABEL_20;
            }
            if (mHighlightDefaultActivity == flag1)
            {
                break MISSING_BLOCK_LABEL_41;
            }
            mShowDefaultActivity = flag;
            mHighlightDefaultActivity = flag1;
            notifyDataSetChanged();
            return;
        }

        public void setShowFooterView(boolean flag)
        {
            try
            {
                if (mShowFooterView != flag)
                {
                    mShowFooterView = flag;
                    notifyDataSetChanged();
                }
                return;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        }

        private ActivityChooserViewAdapter()
        {
            this$0 = ActivityChooserView.this;
            super();
            mMaxActivityCount = 4;
            mShowDefaultActivity = true;
        }

        ActivityChooserViewAdapter(_cls1 _pcls1)
        {
            this();
        }

        private class SetActivated
        {

            public static void invoke(View view, boolean flag)
            {
                view.setActivated(flag);
            }
        }

    }


    private class _cls3 extends DataSetObserver
    {

        final ActivityChooserView this$0;

        public void onChanged()
        {
            super.onChanged();
            updateAppearance();
        }

        _cls3()
        {
            this$0 = ActivityChooserView.this;
            super();
        }
    }

}
