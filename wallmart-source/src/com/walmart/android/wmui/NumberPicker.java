// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.walmart.android.wmui:
//            NumberPickerButton

public class NumberPicker extends LinearLayout
    implements android.view.View.OnClickListener, android.view.View.OnFocusChangeListener, android.view.View.OnLongClickListener
{
    public static interface Formatter
    {

        public abstract String toString(int i);
    }

    private class NumberPickerInputFilter
        implements InputFilter
    {

        final NumberPicker this$0;

        public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
        {
            if (mDisplayedValues != null) goto _L2; else goto _L1
_L1:
            charsequence = mNumberInputFilter.filter(charsequence, i, j, spanned, k, l);
_L4:
            return charsequence;
_L2:
            String s = String.valueOf(charsequence.subSequence(i, j));
            spanned = String.valueOf((new StringBuilder()).append(String.valueOf(spanned.subSequence(0, k))).append(s).append(spanned.subSequence(l, spanned.length())).toString()).toLowerCase();
            String as[] = mDisplayedValues;
            j = as.length;
            i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    charsequence = s;
                    if (as[i].toLowerCase().startsWith(spanned))
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
            return "";
        }

        private NumberPickerInputFilter()
        {
            this$0 = NumberPicker.this;
            super();
        }

    }

    private class NumberRangeKeyListener extends NumberKeyListener
    {

        final NumberPicker this$0;

        public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
        {
            CharSequence charsequence2 = super.filter(charsequence, i, j, spanned, k, l);
            CharSequence charsequence1 = charsequence2;
            if (charsequence2 == null)
            {
                charsequence1 = charsequence.subSequence(i, j);
            }
            charsequence = (new StringBuilder()).append(String.valueOf(spanned.subSequence(0, k))).append(charsequence1).append(spanned.subSequence(l, spanned.length())).toString();
            if ("".equals(charsequence))
            {
                return charsequence;
            }
            if (getSelectedPos(charsequence) > mEnd)
            {
                return "";
            } else
            {
                return charsequence1;
            }
        }

        protected char[] getAcceptedChars()
        {
            return NumberPicker.DIGIT_CHARACTERS;
        }

        public int getInputType()
        {
            return 2;
        }

        private NumberRangeKeyListener()
        {
            this$0 = NumberPicker.this;
            super();
        }

    }

    public static interface OnChangedListener
    {

        public abstract void onChanged(NumberPicker numberpicker, int i, int j);
    }


    private static final int DEFAULT_MAX = 200;
    private static final int DEFAULT_MIN = 0;
    private static final char DIGIT_CHARACTERS[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
    };
    public static final String TAG = com/walmart/android/wmui/NumberPicker.getSimpleName();
    public static final Formatter TWO_DIGIT_FORMATTER = new Formatter() {

        final Object mArgs[] = new Object[1];
        final StringBuilder mBuilder = new StringBuilder();
        final java.util.Formatter mFmt;

        public String toString(int i)
        {
            mArgs[0] = Integer.valueOf(i);
            mBuilder.delete(0, mBuilder.length());
            mFmt.format("%02d", mArgs);
            return mFmt.toString();
        }

            
            {
                mFmt = new java.util.Formatter(mBuilder);
            }
    };
    protected int mCurrent;
    private boolean mDecrement;
    private NumberPickerButton mDecrementButton;
    private String mDisplayedValues[];
    protected int mEnd;
    private Formatter mFormatter;
    private final Handler mHandler;
    private boolean mIncrement;
    private NumberPickerButton mIncrementButton;
    private int mLayout;
    private OnChangedListener mListener;
    private final InputFilter mNumberInputFilter;
    protected int mPrevious;
    private final Runnable mRunnable;
    private long mSpeed;
    protected int mStart;
    private final TextView mText;
    private final TextWatcher mTextWatcher;

    public NumberPicker(Context context)
    {
        this(context, null);
    }

    public NumberPicker(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NumberPicker(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
        mRunnable = new Runnable() {

            final NumberPicker this$0;

            public void run()
            {
                if (mIncrement)
                {
                    changeCurrent(mCurrent + 1);
                    mHandler.postDelayed(this, mSpeed);
                } else
                if (mDecrement)
                {
                    changeCurrent(mCurrent - 1);
                    mHandler.postDelayed(this, mSpeed);
                    return;
                }
            }

            
            {
                this$0 = NumberPicker.this;
                super();
            }
        };
        mSpeed = 300L;
        mLayout = 0x7f0400d2;
        mTextWatcher = new TextWatcher() {

            final NumberPicker this$0;

            public void afterTextChanged(Editable editable)
            {
            }

            public void beforeTextChanged(CharSequence charsequence, int j, int k, int l)
            {
            }

            public void onTextChanged(CharSequence charsequence, int j, int k, int l)
            {
                j = getSelectedPos(charsequence.toString());
                setupButtons(j);
            }

            
            {
                this$0 = NumberPicker.this;
                super();
            }
        };
        attributeset = context.getTheme().obtainStyledAttributes(attributeset, com.walmart.android.R.styleable.NumberPicker, 0, 0);
        mLayout = attributeset.getResourceId(0, 0x7f0400d2);
        attributeset.recycle();
        setOrientation(0);
        setGravity(17);
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(mLayout, this, true);
        mHandler = new Handler();
        context = new NumberPickerInputFilter();
        mNumberInputFilter = new NumberRangeKeyListener();
        mIncrementButton = (NumberPickerButton)findViewById(0x7f100211);
        mIncrementButton.setOnClickListener(this);
        mIncrementButton.setOnLongClickListener(this);
        mIncrementButton.setNumberPicker(this);
        mDecrementButton = (NumberPickerButton)findViewById(0x7f10020f);
        mDecrementButton.setOnClickListener(this);
        mDecrementButton.setOnLongClickListener(this);
        mDecrementButton.setNumberPicker(this);
        mText = (TextView)findViewById(0x7f100210);
        mText.setOnFocusChangeListener(this);
        mText.setFilters(new InputFilter[] {
            context
        });
        mText.setRawInputType(2);
        mText.addTextChangedListener(mTextWatcher);
        if (!isEnabled())
        {
            setEnabled(false);
        }
        mStart = 0;
        mEnd = 200;
        return;
        context;
        attributeset.recycle();
        throw context;
    }

    private String formatNumber(int i)
    {
        if (mFormatter != null)
        {
            return mFormatter.toString(i);
        } else
        {
            return String.valueOf(i);
        }
    }

    private int getSelectedPos(String s)
    {
        if (mDisplayedValues == null)
        {
            int i;
            try
            {
                i = Integer.parseInt(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return mStart;
            }
            return i;
        }
        for (int j = 0; j < mDisplayedValues.length; j++)
        {
            s = s.toLowerCase();
            if (mDisplayedValues[j].toLowerCase().startsWith(s))
            {
                return mStart + j;
            }
        }

        int k;
        try
        {
            k = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return mStart;
        }
        return k;
    }

    public static Formatter getTwoDigitFormatter()
    {
        return TWO_DIGIT_FORMATTER;
    }

    private void setupButtons(int i)
    {
        boolean flag1 = true;
        NumberPickerButton numberpickerbutton = mDecrementButton;
        boolean flag;
        if (i > mStart)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        numberpickerbutton.setEnabled(flag);
        numberpickerbutton = mIncrementButton;
        if (i < mEnd)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        numberpickerbutton.setEnabled(flag);
    }

    private void validateCurrentView(CharSequence charsequence)
    {
        int i = getSelectedPos(charsequence.toString());
        if (i >= mStart && i <= mEnd && mCurrent != i)
        {
            mPrevious = mCurrent;
            mCurrent = i;
            notifyChange();
        }
        updateView();
    }

    private void validateInput(View view)
    {
        view = String.valueOf(((TextView)view).getText());
        if ("".equals(view))
        {
            updateView();
            return;
        } else
        {
            validateCurrentView(view);
            return;
        }
    }

    public void cancelDecrement()
    {
        mDecrement = false;
    }

    public void cancelIncrement()
    {
        mIncrement = false;
    }

    protected void changeCurrent(int i)
    {
        if (i <= mEnd) goto _L2; else goto _L1
_L1:
        int j = mEnd;
_L4:
        if (j != mCurrent)
        {
            mPrevious = mCurrent;
            mCurrent = j;
            updateView();
            notifyChange();
        }
        return;
_L2:
        j = i;
        if (i < mStart)
        {
            j = mStart;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getCurrent()
    {
        validateInput(mText);
        return mCurrent;
    }

    protected void notifyChange()
    {
        if (mListener != null)
        {
            mListener.onChanged(this, mPrevious, mCurrent);
        }
    }

    public void onClick(View view)
    {
        validateInput(mText);
        if (!mText.hasFocus())
        {
            mText.requestFocus();
        }
        if (0x7f100211 == view.getId())
        {
            changeCurrent(mCurrent + 1);
        } else
        if (0x7f10020f == view.getId())
        {
            changeCurrent(mCurrent - 1);
            return;
        }
    }

    public void onFocusChange(View view, boolean flag)
    {
        if (!flag)
        {
            validateInput(view);
        }
    }

    public boolean onLongClick(View view)
    {
        mText.clearFocus();
        if (0x7f100211 == view.getId())
        {
            mIncrement = true;
            mHandler.post(mRunnable);
        } else
        if (0x7f10020f == view.getId())
        {
            mDecrement = true;
            mHandler.post(mRunnable);
            return true;
        }
        return true;
    }

    public void setCurrent(int i)
    {
        mCurrent = i;
        updateView();
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        mIncrementButton.setEnabled(flag);
        mDecrementButton.setEnabled(flag);
        mText.setEnabled(flag);
    }

    public void setFormatter(Formatter formatter)
    {
        mFormatter = formatter;
    }

    public void setOnChangeListener(OnChangedListener onchangedlistener)
    {
        mListener = onchangedlistener;
    }

    public void setRange(int i, int j)
    {
        mStart = i;
        mEnd = j;
        mCurrent = i;
        updateView();
    }

    public void setRange(int i, int j, String as[])
    {
        mDisplayedValues = as;
        mStart = i;
        mEnd = j;
        mCurrent = i;
        updateView();
    }

    public void setSpeed(long l)
    {
        mSpeed = l;
    }

    protected void updateView()
    {
        if (mDisplayedValues == null)
        {
            mText.setText(formatNumber(mCurrent));
        } else
        {
            mText.setText(mDisplayedValues[mCurrent - mStart]);
        }
        if (mText instanceof EditText)
        {
            ((EditText)mText).setSelection(mText.getText().length());
        }
        setupButtons(mCurrent);
    }










}
