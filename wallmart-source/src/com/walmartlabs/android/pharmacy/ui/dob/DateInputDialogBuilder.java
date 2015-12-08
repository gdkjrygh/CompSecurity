// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.ui.dob;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import com.walmart.android.ui.dialog.AlertDialog;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.util.TestFairyUtils;

// Referenced classes of package com.walmartlabs.android.pharmacy.ui.dob:
//            MultipleDigitEditor

public class DateInputDialogBuilder
{
    public static interface OnDateSetListener
    {

        public abstract void onCancel();

        public abstract void onDateSet(int i, int j, int k);
    }


    private final com.walmart.android.ui.CustomAlertDialog.Builder mBuilder;
    private Context mContext;
    private MultipleDigitEditor mDayEditor;
    private AlertDialog mDialog;
    private MultipleDigitEditor mMonthEditor;
    private OnDateSetListener mOnDateSetListener;
    private int mPrepopulatedDay;
    private int mPrepopulatedMonth;
    private int mPrepopulatedYear;
    private View mView;
    private MultipleDigitEditor mYearEditor;

    public DateInputDialogBuilder(Context context)
    {
        mPrepopulatedMonth = -1;
        mPrepopulatedDay = -1;
        mPrepopulatedYear = -1;
        mContext = context;
        mBuilder = new com.walmart.android.ui.CustomAlertDialog.Builder(mContext);
    }

    private void clear()
    {
        mMonthEditor.clear();
        mDayEditor.clear();
        mYearEditor.clear();
    }

    private void setupTestFairy()
    {
        TestFairyUtils.hideView(com.walmartlabs.android.pharmacy.R.id.month_field);
        TestFairyUtils.hideView(com.walmartlabs.android.pharmacy.R.id.day_field);
        TestFairyUtils.hideView(com.walmartlabs.android.pharmacy.R.id.year_field);
    }

    public DateInputDialogBuilder addCancelButton()
    {
        mBuilder.setNegativeButton(com.walmartlabs.android.pharmacy.R.string.cancel_button, new android.content.DialogInterface.OnClickListener() {

            final DateInputDialogBuilder this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                mDialog.cancel();
            }

            
            {
                this$0 = DateInputDialogBuilder.this;
                super();
            }
        });
        return this;
    }

    public AlertDialog create()
    {
        setupTestFairy();
        mView = ViewUtil.inflate(mContext, com.walmartlabs.android.pharmacy.R.layout.dob_dialog);
        mMonthEditor = (MultipleDigitEditor)ViewUtil.findViewById(mView, com.walmartlabs.android.pharmacy.R.id.month_field);
        mDayEditor = (MultipleDigitEditor)ViewUtil.findViewById(mView, com.walmartlabs.android.pharmacy.R.id.day_field);
        mYearEditor = (MultipleDigitEditor)ViewUtil.findViewById(mView, com.walmartlabs.android.pharmacy.R.id.year_field);
        if (mPrepopulatedMonth > 0 && mPrepopulatedDay > 0 && mPrepopulatedYear > 0)
        {
            mMonthEditor.setValue(mPrepopulatedMonth);
            mDayEditor.setValue(mPrepopulatedDay);
            mYearEditor.setValue(mPrepopulatedYear);
        }
        MultipleDigitEditor.OnContentChangeWatcher oncontentchangewatcher = new MultipleDigitEditor.OnContentChangeWatcher() {

            final DateInputDialogBuilder this$0;

            public void onContentChanged()
            {
                validate();
            }

            
            {
                this$0 = DateInputDialogBuilder.this;
                super();
            }
        };
        mMonthEditor.setOnContentChangeWatcher(oncontentchangewatcher);
        mMonthEditor.setValidator(new Validator.Month());
        mDayEditor.setOnContentChangeWatcher(oncontentchangewatcher);
        mDayEditor.setValidator(new Validator.Day());
        mYearEditor.setOnContentChangeWatcher(oncontentchangewatcher);
        mYearEditor.setValidator(new Validator.Year());
        mBuilder.setView(mView);
        mBuilder.setPositiveButton(com.walmartlabs.android.pharmacy.R.string.continue_button, new android.content.DialogInterface.OnClickListener() {

            final DateInputDialogBuilder this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                if (mOnDateSetListener != null)
                {
                    mOnDateSetListener.onDateSet(mYearEditor.getValue(), mMonthEditor.getValue(), mDayEditor.getValue());
                }
                ViewUtil.hideKeyboard(mView);
                clear();
            }

            
            {
                this$0 = DateInputDialogBuilder.this;
                super();
            }
        });
        mBuilder.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final DateInputDialogBuilder this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                clear();
                if (mOnDateSetListener != null)
                {
                    mOnDateSetListener.onCancel();
                }
                ViewUtil.hideKeyboard(mView);
            }

            
            {
                this$0 = DateInputDialogBuilder.this;
                super();
            }
        });
        mDialog = mBuilder.create();
        mDialog.setOnShowListener(new android.content.DialogInterface.OnShowListener() {

            final DateInputDialogBuilder this$0;

            public void onShow(DialogInterface dialoginterface)
            {
                mDialog.getButton(-1).setEnabled(false);
                validate();
                if (mYearEditor.isComplete())
                {
                    mYearEditor.activate();
                    return;
                } else
                {
                    mMonthEditor.activate();
                    return;
                }
            }

            
            {
                this$0 = DateInputDialogBuilder.this;
                super();
            }
        });
        return mDialog;
    }

    public DateInputDialogBuilder prePopulate(int i, int j, int k)
    {
        boolean flag2 = true;
        boolean flag;
        boolean flag1;
        if (k >= 1 && k <= 31)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (j >= 1 && j <= 12)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i < 1800 || i > 2099)
        {
            flag2 = false;
        }
        if (flag && flag1 && flag2)
        {
            mPrepopulatedMonth = j;
            mPrepopulatedDay = k;
            mPrepopulatedYear = i;
        }
        return this;
    }

    public DateInputDialogBuilder setOnDateSetListener(OnDateSetListener ondatesetlistener)
    {
        mOnDateSetListener = ondatesetlistener;
        return this;
    }

    public DateInputDialogBuilder setTitle(int i)
    {
        mBuilder.setTitle(i);
        return this;
    }

    public DateInputDialogBuilder setTitle(CharSequence charsequence)
    {
        mBuilder.setTitle(charsequence);
        return this;
    }

    void validate()
    {
        boolean flag;
        if (mMonthEditor.isComplete() && mDayEditor.isComplete() && mYearEditor.isComplete())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mDialog.getButton(-1).setEnabled(flag);
    }







}
