// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.ui.dob;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.walmart.android.ui.dialog.AlertDialog;
import java.util.Locale;

// Referenced classes of package com.walmartlabs.android.pharmacy.ui.dob:
//            DateInputDialogBuilder

public class DateEditText extends EditText
    implements android.view.View.OnClickListener
{
    private static class DateEditSavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public DateEditSavedState createFromParcel(Parcel parcel)
            {
                return new DateEditSavedState(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public DateEditSavedState[] newArray(int i)
            {
                return new DateEditSavedState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        int day;
        int month;
        int year;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(year);
            parcel.writeInt(month);
            parcel.writeInt(day);
        }


        public DateEditSavedState(Parcel parcel)
        {
            super(parcel);
            year = parcel.readInt();
            month = parcel.readInt();
            day = parcel.readInt();
        }

        public DateEditSavedState(Parcelable parcelable, int i, int j, int k)
        {
            super(parcelable);
            year = i;
            month = j;
            day = k;
        }
    }


    private int mDayOfMonth;
    private String mDialogPrompt;
    private int mMonthOfYear;
    private int mYear;

    public DateEditText(Context context)
    {
        super(context);
        mYear = -1;
        mMonthOfYear = -1;
        mDayOfMonth = -1;
        mDialogPrompt = null;
        init();
    }

    public DateEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mYear = -1;
        mMonthOfYear = -1;
        mDayOfMonth = -1;
        mDialogPrompt = null;
        init();
    }

    public DateEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mYear = -1;
        mMonthOfYear = -1;
        mDayOfMonth = -1;
        mDialogPrompt = null;
        init();
    }

    private void init()
    {
        setRawInputType(0);
        setFocusable(true);
        setFocusableInTouchMode(false);
        setSingleLine();
        setOnClickListener(this);
    }

    private void renderText()
    {
        String s = "";
        if (isDateSet())
        {
            s = String.format(Locale.US, "%02d/%02d/%04d", new Object[] {
                Integer.valueOf(mMonthOfYear), Integer.valueOf(mDayOfMonth), Integer.valueOf(mYear)
            });
        }
        setText(s);
    }

    public String getDate()
    {
        if (isDateSet())
        {
            return String.format(Locale.US, "%02d%02d%04d", new Object[] {
                Integer.valueOf(mMonthOfYear), Integer.valueOf(mDayOfMonth), Integer.valueOf(mYear)
            });
        } else
        {
            return null;
        }
    }

    protected boolean getDefaultEditable()
    {
        return false;
    }

    public boolean isDateSet()
    {
        return mYear != -1 && mMonthOfYear != -1 && mDayOfMonth != -1;
    }

    public void onClick(View view)
    {
        view = new DateInputDialogBuilder.OnDateSetListener() {

            final DateEditText this$0;

            public void onCancel()
            {
            }

            public void onDateSet(int i, int j, int k)
            {
                mYear = i;
                mMonthOfYear = j;
                mDayOfMonth = k;
                renderText();
            }

            
            {
                this$0 = DateEditText.this;
                super();
            }
        };
        DateInputDialogBuilder dateinputdialogbuilder = new DateInputDialogBuilder(getContext());
        dateinputdialogbuilder.setOnDateSetListener(view);
        if (!TextUtils.isEmpty(mDialogPrompt))
        {
            dateinputdialogbuilder.setTitle(mDialogPrompt);
        }
        if (isDateSet())
        {
            dateinputdialogbuilder.prePopulate(mYear, mMonthOfYear, mDayOfMonth);
        }
        dateinputdialogbuilder.create().show();
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof DateEditSavedState)
        {
            parcelable = (DateEditSavedState)parcelable;
            super.onRestoreInstanceState(parcelable.getSuperState());
            mYear = ((DateEditSavedState) (parcelable)).year;
            mMonthOfYear = ((DateEditSavedState) (parcelable)).month;
            mDayOfMonth = ((DateEditSavedState) (parcelable)).day;
            renderText();
            return;
        } else
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        return new DateEditSavedState(super.onSaveInstanceState(), mYear, mMonthOfYear, mDayOfMonth);
    }

    public void setPromptDialog(String s)
    {
        mDialogPrompt = s;
    }


/*
    static int access$002(DateEditText dateedittext, int i)
    {
        dateedittext.mYear = i;
        return i;
    }

*/


/*
    static int access$102(DateEditText dateedittext, int i)
    {
        dateedittext.mMonthOfYear = i;
        return i;
    }

*/


/*
    static int access$202(DateEditText dateedittext, int i)
    {
        dateedittext.mDayOfMonth = i;
        return i;
    }

*/

}
