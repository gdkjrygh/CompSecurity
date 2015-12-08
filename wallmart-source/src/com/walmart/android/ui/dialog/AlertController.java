// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AlertController
{
    public static class AlertParams
    {

        public ListAdapter mAdapter;
        public boolean mCancelable;
        public int mCheckedItem;
        public boolean mCheckedItems[];
        public Cursor mCursor;
        public View mCustomTitleView;
        public boolean mForceInverseBackground;
        public Drawable mIcon;
        public int mIconAttrId;
        public int mIconId;
        public String mIsCheckedColumn;
        public boolean mIsMultiChoice;
        public boolean mIsSingleChoice;
        public CharSequence mItems[];
        public String mLabelColumn;
        public CharSequence mMessage;
        public android.content.DialogInterface.OnClickListener mNegativeButtonListener;
        public CharSequence mNegativeButtonText;
        public android.content.DialogInterface.OnClickListener mNeutralButtonListener;
        public CharSequence mNeutralButtonText;
        public android.content.DialogInterface.OnCancelListener mOnCancelListener;
        public android.content.DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
        public android.content.DialogInterface.OnClickListener mOnClickListener;
        public android.content.DialogInterface.OnDismissListener mOnDismissListener;
        public android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
        public android.content.DialogInterface.OnKeyListener mOnKeyListener;
        public OnPrepareListViewListener mOnPrepareListViewListener;
        public android.content.DialogInterface.OnClickListener mPositiveButtonListener;
        public CharSequence mPositiveButtonText;
        public boolean mRecycleOnMeasure;
        public CharSequence mTitle;
        public View mView;
        public int mViewSpacingBottom;
        public int mViewSpacingLeft;
        public int mViewSpacingRight;
        public boolean mViewSpacingSpecified;
        public int mViewSpacingTop;

        private void createListView(AlertController alertcontroller)
        {
            Object obj = (LayoutInflater)alertcontroller.mContext.getSystemService("layout_inflater");
            alertcontroller.mListContentView = ((LayoutInflater) (obj)).inflate(alertcontroller.mListLayout, null);
            final RecycleListView listView = (RecycleListView)alertcontroller.mListContentView.findViewById(com.walmart.lib.R.id.select_dialog_listview);
            if (mIsMultiChoice)
            {
                if (mCursor == null)
                {
                    obj = alertcontroller.mContext. new ArrayAdapter(alertcontroller.mMultiChoiceItemLayout, com.walmart.lib.R.id.text1, mItems, listView) {

                        final AlertParams this$0;
                        final RecycleListView val$listView;

                        public View getView(int i, View view, ViewGroup viewgroup)
                        {
                            view = super.getView(i, view, viewgroup);
                            if (mCheckedItems != null && mCheckedItems[i])
                            {
                                listView.setItemChecked(i, true);
                            }
                            return view;
                        }

            
            {
                this$0 = final_alertparams;
                listView = recyclelistview;
                super(Context.this, i, j, acharsequence);
            }
                    };
                } else
                {
                    obj = false. new CursorAdapter(listView, ((LayoutInflater) (obj)), alertcontroller) {

                        private final int mIsCheckedIndex;
                        private final int mLabelIndex;
                        final AlertParams this$0;
                        final AlertController val$dialog;
                        final RecycleListView val$listView;
                        final LayoutInflater val$mInflater;

                        public void bindView(View view, Context context, Cursor cursor)
                        {
                            boolean flag = true;
                            ((CheckedTextView)view.findViewById(com.walmart.lib.R.id.text1)).setText(cursor.getString(mLabelIndex));
                            view = listView;
                            int i = cursor.getPosition();
                            if (cursor.getInt(mIsCheckedIndex) != 1)
                            {
                                flag = false;
                            }
                            view.setItemChecked(i, flag);
                        }

                        public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
                        {
                            return mInflater.inflate(dialog.mMultiChoiceItemLayout, viewgroup, false);
                        }

            
            {
                this$0 = final_alertparams;
                listView = recyclelistview;
                mInflater = layoutinflater;
                dialog = alertcontroller;
                super(final_context, final_cursor, Z.this);
                final_alertparams = getCursor();
                mLabelIndex = final_alertparams.getColumnIndexOrThrow(mLabelColumn);
                mIsCheckedIndex = final_alertparams.getColumnIndexOrThrow(mIsCheckedColumn);
            }
                    };
                }
            } else
            {
                int i;
                if (mIsSingleChoice)
                {
                    i = alertcontroller.mSingleChoiceItemLayout;
                } else
                {
                    i = alertcontroller.mListItemLayout;
                }
                if (mCursor == null)
                {
                    if (mAdapter != null)
                    {
                        obj = mAdapter;
                    } else
                    {
                        obj = new ArrayAdapter(alertcontroller.mContext, i, com.walmart.lib.R.id.text1, mItems);
                    }
                } else
                {
                    obj = alertcontroller.mContext;
                    Cursor cursor = mCursor;
                    String s = mLabelColumn;
                    int j = com.walmart.lib.R.id.text1;
                    obj = new SimpleCursorAdapter(((Context) (obj)), i, cursor, new String[] {
                        s
                    }, new int[] {
                        j
                    });
                }
            }
            if (mOnPrepareListViewListener != null)
            {
                mOnPrepareListViewListener.onPrepareListView(listView);
            }
            alertcontroller.mAdapter = ((ListAdapter) (obj));
            alertcontroller.mCheckedItem = mCheckedItem;
            if (mOnClickListener != null)
            {
                listView.setOnItemClickListener(alertcontroller. new android.widget.AdapterView.OnItemClickListener() {

                    final AlertParams this$0;
                    final AlertController val$dialog;

                    public void onItemClick(AdapterView adapterview, View view, int i, long l)
                    {
                        mOnClickListener.onClick(dialog.mDialogInterface, i);
                        if (!mIsSingleChoice)
                        {
                            dialog.mDialogInterface.dismiss();
                        }
                    }

            
            {
                this$0 = final_alertparams;
                dialog = AlertController.this;
                super();
            }
                });
            } else
            if (mOnCheckboxClickListener != null)
            {
                listView.setOnItemClickListener(alertcontroller. new android.widget.AdapterView.OnItemClickListener() {

                    final AlertParams this$0;
                    final AlertController val$dialog;
                    final RecycleListView val$listView;

                    public void onItemClick(AdapterView adapterview, View view, int i, long l)
                    {
                        if (mCheckedItems != null)
                        {
                            mCheckedItems[i] = listView.isItemChecked(i);
                        }
                        mOnCheckboxClickListener.onClick(dialog.mDialogInterface, i, listView.isItemChecked(i));
                    }

            
            {
                this$0 = final_alertparams;
                listView = recyclelistview;
                dialog = AlertController.this;
                super();
            }
                });
            }
            if (mOnItemSelectedListener != null)
            {
                listView.setOnItemSelectedListener(mOnItemSelectedListener);
            }
            if (mIsSingleChoice)
            {
                listView.setChoiceMode(1);
            } else
            if (mIsMultiChoice)
            {
                listView.setChoiceMode(2);
            }
            listView.mRecycleOnMeasure = mRecycleOnMeasure;
            alertcontroller.mListView = listView;
        }

        public void apply(AlertController alertcontroller)
        {
            if (mCustomTitleView == null) goto _L2; else goto _L1
_L1:
            alertcontroller.setCustomTitle(mCustomTitleView);
_L4:
            if (mMessage != null)
            {
                alertcontroller.setMessage(mMessage);
            }
            if (mPositiveButtonText != null)
            {
                alertcontroller.setButton(-1, mPositiveButtonText, mPositiveButtonListener, null);
            }
            if (mNegativeButtonText != null)
            {
                alertcontroller.setButton(-2, mNegativeButtonText, mNegativeButtonListener, null);
            }
            if (mNeutralButtonText != null)
            {
                alertcontroller.setButton(-3, mNeutralButtonText, mNeutralButtonListener, null);
            }
            if (mForceInverseBackground)
            {
                alertcontroller.setInverseBackgroundForced(true);
            }
            if (mItems != null || mCursor != null || mAdapter != null)
            {
                createListView(alertcontroller);
            }
            if (mView != null)
            {
                if (!mViewSpacingSpecified)
                {
                    break; /* Loop/switch isn't completed */
                }
                alertcontroller.setView(mView, mViewSpacingLeft, mViewSpacingTop, mViewSpacingRight, mViewSpacingBottom);
            }
            return;
_L2:
            if (mTitle != null)
            {
                alertcontroller.setTitle(mTitle);
            }
            if (mIcon != null)
            {
                alertcontroller.setIcon(mIcon);
            }
            if (mIconId >= 0)
            {
                alertcontroller.setIcon(mIconId);
            }
            if (mIconAttrId > 0)
            {
                alertcontroller.setIcon(alertcontroller.getIconAttributeResId(mIconAttrId));
            }
            if (true) goto _L4; else goto _L3
_L3:
            alertcontroller.setView(mView);
            return;
        }

        public AlertParams()
        {
            mIconId = 0;
            mIconAttrId = 0;
            mViewSpacingSpecified = false;
            mCheckedItem = -1;
            mRecycleOnMeasure = true;
            mCancelable = true;
        }
    }

    public static interface AlertParams.OnPrepareListViewListener
    {

        public abstract void onPrepareListView(ListView listview);
    }

    private static final class ButtonHandler extends Handler
    {

        private static final int MSG_DISMISS_DIALOG = 1;
        private WeakReference mDialog;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            case 0: // '\0'
            default:
                return;

            case -3: 
            case -2: 
            case -1: 
                ((android.content.DialogInterface.OnClickListener)message.obj).onClick((DialogInterface)mDialog.get(), message.what);
                return;

            case 1: // '\001'
                ((DialogInterface)message.obj).dismiss();
                break;
            }
        }

        public ButtonHandler(DialogInterface dialoginterface)
        {
            mDialog = new WeakReference(dialoginterface);
        }
    }

    public static class RecycleListView extends ListView
    {

        boolean mRecycleOnMeasure;

        protected boolean recycleOnMeasure()
        {
            return mRecycleOnMeasure;
        }

        public RecycleListView(Context context)
        {
            super(context);
            mRecycleOnMeasure = true;
        }

        public RecycleListView(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            mRecycleOnMeasure = true;
        }

        public RecycleListView(Context context, AttributeSet attributeset, int i)
        {
            super(context, attributeset, i);
            mRecycleOnMeasure = true;
        }
    }


    private ListAdapter mAdapter;
    private int mAlertDialogLayout;
    android.view.View.OnClickListener mButtonHandler;
    private Button mButtonNegative;
    private Message mButtonNegativeMessage;
    private CharSequence mButtonNegativeText;
    private Button mButtonNeutral;
    private Message mButtonNeutralMessage;
    private CharSequence mButtonNeutralText;
    private Button mButtonPositive;
    private Message mButtonPositiveMessage;
    private CharSequence mButtonPositiveText;
    private int mCheckedItem;
    private final Context mContext;
    private View mCustomTitleView;
    private final DialogInterface mDialogInterface;
    private boolean mForceInverseBackground;
    private Handler mHandler;
    private Drawable mIcon;
    private int mIconId;
    private ImageView mIconView;
    private View mListContentView;
    private int mListItemLayout;
    private int mListLayout;
    private ListView mListView;
    private CharSequence mMessage;
    private TextView mMessageView;
    private int mMultiChoiceItemLayout;
    private ScrollView mScrollView;
    private int mSingleChoiceItemLayout;
    private CharSequence mTitle;
    private TextView mTitleView;
    private View mView;
    private int mViewSpacingBottom;
    private int mViewSpacingLeft;
    private int mViewSpacingRight;
    private boolean mViewSpacingSpecified;
    private int mViewSpacingTop;
    private final Window mWindow;

    public AlertController(Context context, DialogInterface dialoginterface, Window window)
    {
        mViewSpacingSpecified = false;
        mIconId = -1;
        mCheckedItem = -1;
        mButtonHandler = new android.view.View.OnClickListener() {

            final AlertController this$0;

            public void onClick(View view)
            {
                Object obj = null;
                if (view != mButtonPositive || mButtonPositiveMessage == null) goto _L2; else goto _L1
_L1:
                Message message = Message.obtain(mButtonPositiveMessage);
_L4:
                if (message != null)
                {
                    message.sendToTarget();
                }
                mHandler.obtainMessage(1, mDialogInterface).sendToTarget();
                return;
_L2:
                if (view == mButtonNegative && mButtonNegativeMessage != null)
                {
                    message = Message.obtain(mButtonNegativeMessage);
                } else
                {
                    message = obj;
                    if (view == mButtonNeutral)
                    {
                        message = obj;
                        if (mButtonNeutralMessage != null)
                        {
                            message = Message.obtain(mButtonNeutralMessage);
                        }
                    }
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = AlertController.this;
                super();
            }
        };
        mContext = context;
        mDialogInterface = dialoginterface;
        mWindow = window;
        mHandler = new ButtonHandler(dialoginterface);
        context = context.obtainStyledAttributes(null, com.walmart.lib.R.styleable.AlertDialog, com.walmart.lib.R.attr.alertDialogStyleCustom, 0);
        mAlertDialogLayout = context.getResourceId(com.walmart.lib.R.styleable.AlertDialog_layout, com.walmart.lib.R.layout.dialog_alert_dialog);
        mListLayout = context.getResourceId(com.walmart.lib.R.styleable.AlertDialog_listLayout, com.walmart.lib.R.layout.dialog_select_dialog);
        mMultiChoiceItemLayout = context.getResourceId(com.walmart.lib.R.styleable.AlertDialog_multiChoiceItemLayout, com.walmart.lib.R.layout.dialog_select_dialog_multichoice);
        mSingleChoiceItemLayout = context.getResourceId(com.walmart.lib.R.styleable.AlertDialog_singleChoiceItemLayout, com.walmart.lib.R.layout.dialog_select_dialog_singlechoice);
        mListItemLayout = context.getResourceId(com.walmart.lib.R.styleable.AlertDialog_listItemLayout, com.walmart.lib.R.layout.dialog_select_dialog_item);
        context.recycle();
    }

    static boolean canTextInput(View view)
    {
        if (view.onCheckIsTextEditor())
        {
            return true;
        }
        if (!(view instanceof ViewGroup))
        {
            return false;
        }
        view = (ViewGroup)view;
        for (int i = view.getChildCount(); i > 0;)
        {
            int j = i - 1;
            i = j;
            if (canTextInput(view.getChildAt(j)))
            {
                return true;
            }
        }

        return false;
    }

    private void centerButton(Button button)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)button.getLayoutParams();
        layoutparams.gravity = 1;
        layoutparams.weight = 0.5F;
        button.setLayoutParams(layoutparams);
        button = mWindow.findViewById(com.walmart.lib.R.id.leftSpacer);
        if (button != null)
        {
            button.setVisibility(0);
        }
        button = mWindow.findViewById(com.walmart.lib.R.id.rightSpacer);
        if (button != null)
        {
            button.setVisibility(0);
        }
    }

    private void setBackground(LinearLayout linearlayout, LinearLayout linearlayout1, View view, boolean flag, TypedArray typedarray, boolean flag1, View view1)
    {
        int k1 = typedarray.getResourceId(com.walmart.lib.R.styleable.AlertDialog_android_fullDark, com.walmart.lib.R.drawable.dialog_full_dark);
        int l1 = typedarray.getResourceId(com.walmart.lib.R.styleable.AlertDialog_android_topDark, com.walmart.lib.R.drawable.dialog_top_dark);
        int i2 = typedarray.getResourceId(com.walmart.lib.R.styleable.AlertDialog_android_centerDark, com.walmart.lib.R.drawable.dialog_center_dark);
        int j2 = typedarray.getResourceId(com.walmart.lib.R.styleable.AlertDialog_android_bottomDark, com.walmart.lib.R.drawable.dialog_bottom_dark);
        int k2 = typedarray.getResourceId(com.walmart.lib.R.styleable.AlertDialog_android_fullBright, com.walmart.lib.R.drawable.dialog_full_bright);
        int l2 = typedarray.getResourceId(com.walmart.lib.R.styleable.AlertDialog_android_topBright, com.walmart.lib.R.drawable.dialog_top_bright);
        int i3 = typedarray.getResourceId(com.walmart.lib.R.styleable.AlertDialog_android_centerBright, com.walmart.lib.R.drawable.dialog_center_bright);
        int j3 = typedarray.getResourceId(com.walmart.lib.R.styleable.AlertDialog_android_bottomBright, com.walmart.lib.R.drawable.dialog_bottom_bright);
        int k3 = typedarray.getResourceId(com.walmart.lib.R.styleable.AlertDialog_android_bottomMedium, com.walmart.lib.R.drawable.dialog_bottom_medium);
        View aview[] = new View[4];
        boolean aflag[] = new boolean[4];
        typedarray = null;
        boolean flag2 = false;
        int i = 0;
        if (flag1)
        {
            aview[0] = linearlayout;
            aflag[0] = false;
            i = 0 + 1;
        }
        linearlayout = linearlayout1;
        if (linearlayout1.getVisibility() == 8)
        {
            linearlayout = null;
        }
        aview[i] = linearlayout;
        int l;
        int j1;
        if (mListContentView != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        aflag[i] = flag1;
        l = i + 1;
        i = l;
        if (view != null)
        {
            aview[l] = view;
            aflag[l] = mForceInverseBackground;
            i = l + 1;
        }
        if (flag)
        {
            aview[i] = view1;
            aflag[i] = true;
        }
        i = 0;
        j1 = 0;
        linearlayout = typedarray;
        flag1 = flag2;
        while (j1 < aview.length) 
        {
            linearlayout1 = aview[j1];
            if (linearlayout1 != null)
            {
                int i1 = i;
                if (linearlayout != null)
                {
                    if (i == 0)
                    {
                        if (flag1)
                        {
                            i = l2;
                        } else
                        {
                            i = l1;
                        }
                        linearlayout.setBackgroundResource(i);
                    } else
                    {
                        if (flag1)
                        {
                            i = i3;
                        } else
                        {
                            i = i2;
                        }
                        linearlayout.setBackgroundResource(i);
                    }
                    i1 = 1;
                }
                linearlayout = linearlayout1;
                flag1 = aflag[j1];
                i = i1;
            }
            j1++;
        }
        if (linearlayout != null)
        {
            if (i != 0)
            {
                int j;
                if (flag1)
                {
                    if (flag)
                    {
                        j = k3;
                    } else
                    {
                        j = j3;
                    }
                } else
                {
                    j = j2;
                }
                linearlayout.setBackgroundResource(j);
            } else
            {
                int k;
                if (flag1)
                {
                    k = k2;
                } else
                {
                    k = k1;
                }
                linearlayout.setBackgroundResource(k);
            }
        }
        if (mListView != null && mAdapter != null)
        {
            mListView.setAdapter(mAdapter);
            if (mCheckedItem > -1)
            {
                mListView.setItemChecked(mCheckedItem, true);
                mListView.setSelection(mCheckedItem);
            }
        }
    }

    private boolean setupButtons()
    {
        int i = 0;
        mButtonPositive = (Button)mWindow.findViewById(com.walmart.lib.R.id.button1);
        mButtonPositive.setOnClickListener(mButtonHandler);
        if (TextUtils.isEmpty(mButtonPositiveText))
        {
            mButtonPositive.setVisibility(8);
        } else
        {
            mButtonPositive.setText(mButtonPositiveText);
            mButtonPositive.setVisibility(0);
            i = false | true;
        }
        mButtonNegative = (Button)mWindow.findViewById(com.walmart.lib.R.id.button2);
        mButtonNegative.setOnClickListener(mButtonHandler);
        if (TextUtils.isEmpty(mButtonNegativeText))
        {
            mButtonNegative.setVisibility(8);
        } else
        {
            mButtonNegative.setText(mButtonNegativeText);
            mButtonNegative.setVisibility(0);
            i |= 2;
        }
        mButtonNeutral = (Button)mWindow.findViewById(com.walmart.lib.R.id.button3);
        mButtonNeutral.setOnClickListener(mButtonHandler);
        if (TextUtils.isEmpty(mButtonNeutralText))
        {
            mButtonNeutral.setVisibility(8);
        } else
        {
            mButtonNeutral.setText(mButtonNeutralText);
            mButtonNeutral.setVisibility(0);
            i |= 4;
        }
        if (i == 1)
        {
            centerButton(mButtonPositive);
        } else
        if (i == 2)
        {
            centerButton(mButtonNegative);
        } else
        if (i == 4)
        {
            centerButton(mButtonNeutral);
        }
        if (i == 5)
        {
            View view = mWindow.findViewById(com.walmart.lib.R.id.divider32);
            if (view != null)
            {
                view.setVisibility(8);
            }
        } else
        if (i == 3)
        {
            View view1 = mWindow.findViewById(com.walmart.lib.R.id.divider32);
            if (view1 != null)
            {
                view1.setVisibility(8);
            }
        } else
        if (i == 6)
        {
            View view2 = mWindow.findViewById(com.walmart.lib.R.id.divider13);
            if (view2 != null)
            {
                view2.setVisibility(8);
            }
        } else
        if (i == 0 || i == 1 || i == 2 || i == 4)
        {
            View view3 = mWindow.findViewById(com.walmart.lib.R.id.divider13);
            if (view3 != null)
            {
                view3.setVisibility(8);
            }
            view3 = mWindow.findViewById(com.walmart.lib.R.id.divider32);
            if (view3 != null)
            {
                view3.setVisibility(8);
            }
        }
        return i != 0;
    }

    private void setupContent(LinearLayout linearlayout)
    {
        mScrollView = (ScrollView)mWindow.findViewById(com.walmart.lib.R.id.scrollView);
        mScrollView.setFocusable(false);
        mMessageView = (TextView)mWindow.findViewById(com.walmart.lib.R.id.message);
        if (mMessageView == null)
        {
            return;
        }
        if (mMessage != null)
        {
            mMessageView.setText(mMessage);
            return;
        }
        mMessageView.setVisibility(8);
        mScrollView.removeView(mMessageView);
        if (mListContentView != null)
        {
            linearlayout.removeView(mWindow.findViewById(com.walmart.lib.R.id.scrollView));
            linearlayout.addView(mListContentView, new android.widget.LinearLayout.LayoutParams(-1, -1));
            linearlayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F));
            return;
        } else
        {
            linearlayout.setVisibility(8);
            return;
        }
    }

    private boolean setupTitle(LinearLayout linearlayout)
    {
        boolean flag = false;
        if (mCustomTitleView != null)
        {
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            linearlayout.addView(mCustomTitleView, 0, layoutparams);
            mWindow.findViewById(com.walmart.lib.R.id.title_template).setVisibility(8);
        } else
        {
            if (!TextUtils.isEmpty(mTitle))
            {
                flag = true;
            }
            mIconView = (ImageView)mWindow.findViewById(com.walmart.lib.R.id.icon);
            if (flag)
            {
                mTitleView = (TextView)mWindow.findViewById(com.walmart.lib.R.id.alertTitle);
                mTitleView.setText(mTitle);
                if (mIconId > 0)
                {
                    mIconView.setImageResource(mIconId);
                    return true;
                }
                if (mIcon != null)
                {
                    mIconView.setImageDrawable(mIcon);
                    return true;
                }
                if (mIconId == 0)
                {
                    mTitleView.setPadding(mIconView.getPaddingLeft(), mIconView.getPaddingTop(), mIconView.getPaddingRight(), mIconView.getPaddingBottom());
                    mIconView.setVisibility(8);
                    return true;
                }
            } else
            {
                mWindow.findViewById(com.walmart.lib.R.id.title_template).setVisibility(8);
                mIconView.setVisibility(8);
                linearlayout.setVisibility(8);
                return false;
            }
        }
        return true;
    }

    private void setupView()
    {
        LinearLayout linearlayout = (LinearLayout)mWindow.findViewById(com.walmart.lib.R.id.contentPanel);
        setupContent(linearlayout);
        boolean flag = setupButtons();
        LinearLayout linearlayout1 = (LinearLayout)mWindow.findViewById(com.walmart.lib.R.id.topPanel);
        TypedArray typedarray = mContext.obtainStyledAttributes(null, com.walmart.lib.R.styleable.AlertDialog, 0x101005d, 0);
        boolean flag1 = setupTitle(linearlayout1);
        View view = mWindow.findViewById(com.walmart.lib.R.id.buttonPanel);
        if (!flag)
        {
            view.setVisibility(8);
            Object obj;
            Exception exception;
            Object obj1;
            try
            {
                mWindow.getClass().getMethod("setCloseOnTouchOutsideIfNotSet", new Class[] {
                    Boolean.TYPE
                }).invoke(mWindow, new Object[] {
                    Boolean.valueOf(true)
                });
            }
            catch (Exception exception1) { }
        }
        obj = mWindow.findViewById(com.walmart.lib.R.id.buttonBar);
        if (obj instanceof LinearLayout)
        {
            try
            {
                obj1 = android/widget/LinearLayout.getDeclaredField("mUseLargestChild");
                ((Field) (obj1)).setAccessible(true);
                ((Field) (obj1)).setBoolean(obj, true);
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception) { }
        }
        obj = null;
        if (mView != null)
        {
            obj1 = (FrameLayout)mWindow.findViewById(com.walmart.lib.R.id.customPanel);
            obj = (FrameLayout)mWindow.findViewById(com.walmart.lib.R.id.custom);
            ((FrameLayout) (obj)).addView(mView, new android.view.ViewGroup.LayoutParams(-1, -1));
            if (mViewSpacingSpecified)
            {
                ((FrameLayout) (obj)).setPadding(mViewSpacingLeft, mViewSpacingTop, mViewSpacingRight, mViewSpacingBottom);
            }
            obj = obj1;
            if (mListContentView != null)
            {
                ((android.widget.LinearLayout.LayoutParams)((FrameLayout) (obj1)).getLayoutParams()).weight = 0.0F;
                obj = obj1;
            }
        } else
        {
            mWindow.findViewById(com.walmart.lib.R.id.customPanel).setVisibility(8);
        }
        if (flag1)
        {
            obj1 = null;
            if (mMessage != null || mView != null || mListContentView != null)
            {
                obj1 = mWindow.findViewById(com.walmart.lib.R.id.titleDivider);
            }
            if (obj1 != null)
            {
                ((View) (obj1)).setVisibility(0);
            }
        }
        setBackground(linearlayout1, linearlayout, ((View) (obj)), flag, typedarray, flag1, view);
        typedarray.recycle();
    }

    public Button getButton(int i)
    {
        switch (i)
        {
        default:
            return null;

        case -1: 
            return mButtonPositive;

        case -2: 
            return mButtonNegative;

        case -3: 
            return mButtonNeutral;
        }
    }

    public int getIconAttributeResId(int i)
    {
        TypedValue typedvalue = new TypedValue();
        mContext.getTheme().resolveAttribute(i, typedvalue, true);
        return typedvalue.resourceId;
    }

    public ListView getListView()
    {
        return mListView;
    }

    public void installContent()
    {
        mWindow.requestFeature(1);
        if (mView == null || !canTextInput(mView))
        {
            mWindow.setFlags(0x20000, 0x20000);
        }
        mWindow.setContentView(mAlertDialogLayout);
        setupView();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        return mScrollView != null && mScrollView.executeKeyEvent(keyevent);
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        return mScrollView != null && mScrollView.executeKeyEvent(keyevent);
    }

    public void setButton(int i, CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener, Message message)
    {
        Message message1 = message;
        if (message == null)
        {
            message1 = message;
            if (onclicklistener != null)
            {
                message1 = mHandler.obtainMessage(i, onclicklistener);
            }
        }
        switch (i)
        {
        default:
            throw new IllegalArgumentException("Button does not exist");

        case -1: 
            mButtonPositiveText = charsequence;
            mButtonPositiveMessage = message1;
            return;

        case -2: 
            mButtonNegativeText = charsequence;
            mButtonNegativeMessage = message1;
            return;

        case -3: 
            mButtonNeutralText = charsequence;
            mButtonNeutralMessage = message1;
            return;
        }
    }

    public void setCustomTitle(View view)
    {
        mCustomTitleView = view;
    }

    public void setIcon(int i)
    {
        mIconId = i;
        if (mIconView != null)
        {
            if (i > 0)
            {
                mIconView.setImageResource(mIconId);
            } else
            if (i == 0)
            {
                mIconView.setVisibility(8);
                return;
            }
        }
    }

    public void setIcon(Drawable drawable)
    {
        mIcon = drawable;
        if (mIconView != null && mIcon != null)
        {
            mIconView.setImageDrawable(drawable);
        }
    }

    public void setInverseBackgroundForced(boolean flag)
    {
        mForceInverseBackground = flag;
    }

    public void setMessage(CharSequence charsequence)
    {
        mMessage = charsequence;
        if (mMessageView != null)
        {
            mMessageView.setText(charsequence);
        }
    }

    public void setTitle(CharSequence charsequence)
    {
        mTitle = charsequence;
        if (mTitleView != null)
        {
            mTitleView.setText(charsequence);
        }
    }

    public void setView(View view)
    {
        mView = view;
        mViewSpacingSpecified = false;
    }

    public void setView(View view, int i, int j, int k, int l)
    {
        mView = view;
        mViewSpacingSpecified = true;
        mViewSpacingLeft = i;
        mViewSpacingTop = j;
        mViewSpacingRight = k;
        mViewSpacingBottom = l;
    }








/*
    static ListAdapter access$1402(AlertController alertcontroller, ListAdapter listadapter)
    {
        alertcontroller.mAdapter = listadapter;
        return listadapter;
    }

*/


/*
    static int access$1502(AlertController alertcontroller, int i)
    {
        alertcontroller.mCheckedItem = i;
        return i;
    }

*/


/*
    static ListView access$1602(AlertController alertcontroller, ListView listview)
    {
        alertcontroller.mListView = listview;
        return listview;
    }

*/










/*
    static View access$902(AlertController alertcontroller, View view)
    {
        alertcontroller.mListContentView = view;
        return view;
    }

*/
}
