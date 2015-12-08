// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ActionProvider;
import android.support.v7.internal.widget.ActivityChooserModel;
import android.support.v7.widget.ListPopupWindow;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

public class WalmartActivityChooserView extends RelativeLayout
    implements android.support.v7.internal.widget.ActivityChooserModel.ActivityChooserModelClient
{
    private class ActivityChooserViewAdapter extends BaseAdapter
    {

        private static final int ITEM_VIEW_TYPE_ACTIVITY = 0;
        private static final int ITEM_VIEW_TYPE_COUNT = 3;
        private static final int ITEM_VIEW_TYPE_FOOTER = 1;
        public static final int MAX_ACTIVITY_COUNT_DEFAULT = 4;
        public static final int MAX_ACTIVITY_COUNT_UNLIMITED = 0x7fffffff;
        private ActivityChooserModel mDataModel;
        private int mMaxActivityCount;
        private boolean mShowFooterView;
        final WalmartActivityChooserView this$0;

        public int getActivityCount()
        {
            return mDataModel.getActivityCount();
        }

        public int getCount()
        {
            int j = Math.min(mDataModel.getActivityCount(), mMaxActivityCount);
            int i = j;
            if (mShowFooterView)
            {
                i = j + 1;
            }
            return i;
        }

        public ActivityChooserModel getDataModel()
        {
            return mDataModel;
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
                return mDataModel.getActivity(i);
            }
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public int getItemViewType(int i)
        {
            return !mShowFooterView || i != getCount() - 1 ? 0 : 1;
        }

        public int getMaxActivityCount()
        {
            return mMaxActivityCount;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            getItemViewType(i);
            JVM INSTR tableswitch 0 1: default 28
        //                       0 104
        //                       1 36;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException();
_L3:
            if (view == null) goto _L5; else goto _L4
_L4:
            View view1 = view;
            if (view.getId() == 1) goto _L6; else goto _L5
_L5:
            view1 = LayoutInflater.from(getContext()).inflate(0x7f040009, viewgroup, false);
            view1.setId(1);
            ((TextView)view1.findViewById(0x7f10004f)).setText(getContext().getString(0x7f090005));
_L6:
            return view1;
_L2:
            if (view == null) goto _L8; else goto _L7
_L7:
            view1 = view;
            if (view.getId() == 0x7f10004d) goto _L9; else goto _L8
_L8:
            view1 = LayoutInflater.from(getContext()).inflate(0x7f040009, viewgroup, false);
_L9:
            view = getContext().getPackageManager();
            viewgroup = (ImageView)view1.findViewById(0x7f10004e);
            ResolveInfo resolveinfo = (ResolveInfo)getItem(i);
            viewgroup.setImageDrawable(resolveinfo.loadIcon(view));
            ((TextView)view1.findViewById(0x7f10004f)).setText(resolveinfo.loadLabel(view));
            return view1;
        }

        public int getViewTypeCount()
        {
            return 3;
        }

        public int measureContentWidth()
        {
            int k = mMaxActivityCount;
            mMaxActivityCount = 0x7fffffff;
            int j = 0;
            View view = null;
            int l = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int j1 = getCount();
            for (int i = 0; i < j1; i++)
            {
                view = getView(i, view, null);
                view.measure(l, i1);
                j = Math.max(j, view.getMeasuredWidth());
            }

            mMaxActivityCount = k;
            return j;
        }

        public void setDataModel(ActivityChooserModel activitychoosermodel)
        {
            ActivityChooserModel activitychoosermodel1 = mAdapter.getDataModel();
            if (activitychoosermodel1 != null && isShown())
            {
                activitychoosermodel1.unregisterObserver(mModelDataSetOberver);
            }
            mDataModel = activitychoosermodel;
            if (activitychoosermodel != null && isShown())
            {
                activitychoosermodel.registerObserver(mModelDataSetOberver);
            }
            notifyDataSetChanged();
        }

        public void setMaxActivityCount(int i)
        {
            if (mMaxActivityCount != i)
            {
                mMaxActivityCount = i;
                notifyDataSetChanged();
            }
        }

        public void setShowFooterView(boolean flag)
        {
            if (mShowFooterView != flag)
            {
                mShowFooterView = flag;
                notifyDataSetChanged();
            }
        }

        private ActivityChooserViewAdapter()
        {
            this$0 = WalmartActivityChooserView.this;
            super();
            mMaxActivityCount = 4;
        }

    }

    private class Callbacks
        implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
    {

        final WalmartActivityChooserView this$0;

        private void notifyOnDismissListener()
        {
            if (mOnDismissListener != null)
            {
                mOnDismissListener.onDismiss();
            }
        }

        public void onClick(View view)
        {
            if (view == WalmartActivityChooserView.this)
            {
                showPopupUnchecked(mInitialActivityCount);
                return;
            } else
            {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss()
        {
            notifyOnDismissListener();
            if (mProvider != null)
            {
                mProvider.subUiVisibilityChanged(false);
            }
        }

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            ((ActivityChooserViewAdapter)adapterview.getAdapter()).getItemViewType(i);
            JVM INSTR tableswitch 0 1: default 32
        //                       0 50
        //                       1 40;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException();
_L3:
            showPopupUnchecked(0x7fffffff);
_L5:
            return;
_L2:
            dismissPopup();
            adapterview = mAdapter.getDataModel().chooseActivity(i);
            if (adapterview == null) goto _L5; else goto _L4
_L4:
            if (!adapterview.hasExtra("walmart_extra_share_flag")) goto _L7; else goto _L6
_L6:
            view = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("listShareTap");
            adapterview.removeExtra("walmart_extra_share_flag");
            MessageBus.getBus().post(view);
_L9:
            adapterview.addFlags(0x80000);
            getContext().startActivity(adapterview);
            return;
_L7:
            view = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("shareItem");
            if (adapterview.getComponent() == null)
            {
                break; /* Loop/switch isn't completed */
            }
            view.putString("shareType", adapterview.getComponent().getPackageName());
_L11:
            view.putString("itemId", adapterview.getStringExtra("walmart_extra_itemid"));
            adapterview.removeExtra("walmart_extra_itemid");
            MessageBus.getBus().post(view);
            if (true) goto _L9; else goto _L8
_L8:
            if (adapterview.getPackage() == null) goto _L11; else goto _L10
_L10:
            view.putString("shareType", adapterview.getPackage());
              goto _L11
        }

        public boolean onLongClick(View view)
        {
            throw new IllegalArgumentException();
        }

        private Callbacks()
        {
            this$0 = WalmartActivityChooserView.this;
            super();
        }

    }


    private final ActivityChooserViewAdapter mAdapter;
    private final Callbacks mCallbacks;
    private int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    private final int mListPopupMaxWidth;
    private ListPopupWindow mListPopupWindow;
    private final DataSetObserver mModelDataSetOberver;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    ActionProvider mProvider;

    public WalmartActivityChooserView(Context context)
    {
        this(context, null);
    }

    public WalmartActivityChooserView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public WalmartActivityChooserView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mModelDataSetOberver = new DataSetObserver() {

            final WalmartActivityChooserView this$0;

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

            
            {
                this$0 = WalmartActivityChooserView.this;
                super();
            }
        };
        mOnGlobalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final WalmartActivityChooserView this$0;

            public void onGlobalLayout()
            {
                if (isShowingPopup())
                {
                    if (!isShown())
                    {
                        getListPopupWindow().dismiss();
                    } else
                    {
                        getListPopupWindow().show();
                        if (mProvider != null)
                        {
                            mProvider.subUiVisibilityChanged(true);
                            return;
                        }
                    }
                }
            }

            
            {
                this$0 = WalmartActivityChooserView.this;
                super();
            }
        };
        mInitialActivityCount = 4;
        attributeset = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActivityChooserView, i, 0);
        mInitialActivityCount = attributeset.getInt(0, 4);
        attributeset.recycle();
        mCallbacks = new Callbacks();
        setOnClickListener(mCallbacks);
        mAdapter = new ActivityChooserViewAdapter();
        mAdapter.registerDataSetObserver(new DataSetObserver() {

            final WalmartActivityChooserView this$0;

            public void onChanged()
            {
                super.onChanged();
                updateAppearance();
            }

            
            {
                this$0 = WalmartActivityChooserView.this;
                super();
            }
        });
        context = context.getResources();
        mListPopupMaxWidth = Math.max(context.getDisplayMetrics().widthPixels / 2, context.getDimensionPixelSize(0x7f0a0013));
    }

    private ListPopupWindow getListPopupWindow()
    {
        if (mListPopupWindow == null)
        {
            mListPopupWindow = new ListPopupWindow(getContext());
            mListPopupWindow.setAdapter(mAdapter);
            mListPopupWindow.setAnchorView(this);
            mListPopupWindow.setModal(true);
            mListPopupWindow.setOnItemClickListener(mCallbacks);
            mListPopupWindow.setOnDismissListener(mCallbacks);
        }
        return mListPopupWindow;
    }

    private void showPopupUnchecked(int i)
    {
        if (mAdapter.getDataModel() == null)
        {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(mOnGlobalLayoutListener);
        int j = mAdapter.getActivityCount();
        ListPopupWindow listpopupwindow;
        if (i != 0x7fffffff && j > i)
        {
            mAdapter.setShowFooterView(true);
            mAdapter.setMaxActivityCount(i - 1);
        } else
        {
            mAdapter.setShowFooterView(false);
            mAdapter.setMaxActivityCount(i);
        }
        listpopupwindow = getListPopupWindow();
        if (!listpopupwindow.isShowing())
        {
            listpopupwindow.setContentWidth(Math.min(mAdapter.measureContentWidth(), mListPopupMaxWidth));
            listpopupwindow.show();
            if (mProvider != null)
            {
                mProvider.subUiVisibilityChanged(true);
            }
            listpopupwindow.getListView().setContentDescription(getContext().getString(0x7f090006));
        }
    }

    private void updateAppearance()
    {
        if (mAdapter.getCount() > 0)
        {
            setEnabled(true);
            return;
        } else
        {
            setEnabled(false);
            return;
        }
    }

    public boolean dismissPopup()
    {
        if (isShowingPopup())
        {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewtreeobserver = getViewTreeObserver();
            if (viewtreeobserver.isAlive())
            {
                viewtreeobserver.removeGlobalOnLayoutListener(mOnGlobalLayoutListener);
            }
        }
        return true;
    }

    public ActivityChooserModel getDataModel()
    {
        return mAdapter.getDataModel();
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
            activitychoosermodel.registerObserver(mModelDataSetOberver);
        }
        mIsAttachedToWindow = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Object obj = mAdapter.getDataModel();
        if (obj != null)
        {
            ((ActivityChooserModel) (obj)).unregisterObserver(mModelDataSetOberver);
        }
        obj = getViewTreeObserver();
        if (((ViewTreeObserver) (obj)).isAlive())
        {
            ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(mOnGlobalLayoutListener);
        }
        if (isShowingPopup())
        {
            dismissPopup();
        }
        mIsAttachedToWindow = false;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (!isShowingPopup())
        {
            dismissPopup();
        }
    }

    public void setActivityChooserModel(ActivityChooserModel activitychoosermodel)
    {
        mAdapter.setDataModel(activitychoosermodel);
        if (isShowingPopup())
        {
            dismissPopup();
            showPopup();
        }
    }

    public void setExpandActivityOverflowButtonContentDescription(int i)
    {
        String s = getContext().getString(i);
        ImageView imageview = (ImageView)findViewById(0x7f10004b);
        if (imageview != null)
        {
            imageview.setContentDescription(s);
        }
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable)
    {
        ImageView imageview = (ImageView)findViewById(0x7f10004b);
        if (imageview != null)
        {
            imageview.setImageDrawable(drawable);
        }
    }

    public void setInitialActivityCount(int i)
    {
        mInitialActivityCount = i;
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        mOnDismissListener = ondismisslistener;
    }

    public void setProvider(ActionProvider actionprovider)
    {
        mProvider = actionprovider;
    }

    public boolean showPopup()
    {
        if (isShowingPopup() || !mIsAttachedToWindow)
        {
            return false;
        } else
        {
            showPopupUnchecked(mInitialActivityCount);
            return true;
        }
    }







}
