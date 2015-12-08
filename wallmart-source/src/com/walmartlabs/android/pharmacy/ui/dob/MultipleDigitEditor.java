// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.ui.dob;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import java.util.Arrays;

// Referenced classes of package com.walmartlabs.android.pharmacy.ui.dob:
//            Validator

public class MultipleDigitEditor extends View
{
    public static interface OnContentChangeWatcher
    {

        public abstract void onContentChanged();
    }

    private static class SavedState extends android.view.View.BaseSavedState
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
        int mDigits[];
        int mLastDigitPos;
        boolean mStateError;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeIntArray(mDigits);
            parcel.writeInt(mLastDigitPos);
            if (mStateError)
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
            mDigits = parcel.createIntArray();
            mLastDigitPos = parcel.readInt();
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mStateError = flag;
        }

        public SavedState(Parcelable parcelable, int ai[], int i, boolean flag)
        {
            super(parcelable);
            mDigits = ai;
            mLastDigitPos = i;
            mStateError = flag;
        }
    }


    private static final String WIDEST_CHAR = "M";
    private static final String sMapDigitString[] = {
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
    };
    private int mDigitColor;
    private int mDigitHeight;
    private Paint mDigitPaint;
    private int mDigitWidth;
    private int mDigits[];
    private Rect mDrawRect[];
    private int mErrorColor;
    private Paint mErrorPaint;
    private boolean mErrorState;
    private int mFieldSize;
    private float mFontSize;
    private int mHeight;
    private String mHintChar;
    private int mHintColor;
    private Paint mHintPaint;
    private BaseInputConnection mIMEConnection = new BaseInputConnection(this, false) {

        final MultipleDigitEditor this$0;

        public boolean deleteSurroundingText(int i, int j)
        {
            return sendKeyEvent(new KeyEvent(0, 67));
        }

        public CharSequence getTextBeforeCursor(int i, int j)
        {
            StringBuffer stringbuffer = new StringBuffer(mDigits.length + 1);
            stringbuffer.append(" ");
            for (j = 0; j <= mLastDigitPos; j++)
            {
                stringbuffer.append(mDigits[j]);
            }

            return stringbuffer.subSequence(Math.max(0, stringbuffer.length() - i), stringbuffer.length());
        }

            
            {
                this$0 = MultipleDigitEditor.this;
                super(view, flag);
            }
    };
    private int mLastDigitPos;
    private OnContentChangeWatcher mOnContentChangedWatcher;
    private InputMethodManager mSoftKeyboard;
    private Validator mValidator;
    private int mValidatorBackBuffer[];
    private int mWidth;

    public MultipleDigitEditor(Context context)
    {
        super(context);
        mHintChar = "M";
        mFieldSize = 2;
        mDigitColor = 0xff000000;
        mHintColor = 0xff888888;
        mErrorColor = 0xffff0000;
        mLastDigitPos = -1;
        init(context, null);
    }

    public MultipleDigitEditor(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mHintChar = "M";
        mFieldSize = 2;
        mDigitColor = 0xff000000;
        mHintColor = 0xff888888;
        mErrorColor = 0xffff0000;
        mLastDigitPos = -1;
        init(context, attributeset);
    }

    public MultipleDigitEditor(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mHintChar = "M";
        mFieldSize = 2;
        mDigitColor = 0xff000000;
        mHintColor = 0xff888888;
        mErrorColor = 0xffff0000;
        mLastDigitPos = -1;
        init(context, attributeset);
    }

    private void appendDigit(int i)
    {
        if (i < 0 || i > 9)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("").append(i).append(" is not a single digit number").toString());
        }
        boolean flag = true;
        if (mLastDigitPos < mFieldSize - 1)
        {
            mLastDigitPos = mLastDigitPos + 1;
            flag = false;
        }
        mDigits[mLastDigitPos] = i;
        invalidate();
        if (flag)
        {
            syncIME();
        }
        if (mLastDigitPos == mFieldSize - 1)
        {
            focusNextField();
        }
        dispatchContentChanged();
    }

    private void calculateDigitDimensions()
    {
        mDigitWidth = (int)Math.ceil(mDigitPaint.measureText("M"));
        Rect rect = new Rect();
        mDigitPaint.getTextBounds("M", 0, 1, rect);
        mDigitHeight = (int)Math.ceil(rect.height());
    }

    private void calculateDrawingRects()
    {
        int k = getPaddingTop();
        int l = mDigitHeight;
        int j = getPaddingLeft();
        for (int i = 0; i < mFieldSize; i++)
        {
            mDrawRect[i] = new Rect();
            mDrawRect[i].top = k;
            mDrawRect[i].bottom = k + l;
            mDrawRect[i].left = j;
            j += mDigitWidth;
            mDrawRect[i].right = j;
        }

    }

    private void calculateViewDimensions()
    {
        mWidth = (int)Math.ceil(mFieldSize * mDigitWidth + getPaddingRight() + getPaddingLeft());
        mHeight = (int)Math.ceil(mDigitHeight + getPaddingTop() + getPaddingBottom());
    }

    private void clearError()
    {
        mErrorState = false;
        invalidate();
    }

    private void dispatchContentChanged()
    {
        if (mOnContentChangedWatcher != null)
        {
            mOnContentChangedWatcher.onContentChanged();
        }
    }

    private void drawCharOnRectangle(Canvas canvas, Paint paint, Rect rect, String s)
    {
        float f = paint.measureText(s);
        canvas.drawText(s, (float)rect.left + ((float)rect.width() - f) / 2.0F, rect.bottom, paint);
    }

    private void drawDigitOnRectangle(Canvas canvas, Paint paint, Rect rect, int i)
    {
        drawCharOnRectangle(canvas, paint, rect, sMapDigitString[i]);
    }

    private void eraseLastDigit()
    {
        if (mLastDigitPos >= 0)
        {
            mDigits[mLastDigitPos] = -1;
            mLastDigitPos = mLastDigitPos - 1;
            invalidate();
        } else
        {
            focusPreviousField();
        }
        dispatchContentChanged();
    }

    private void focusNextField()
    {
        View view = focusSearch(66);
        if (view instanceof MultipleDigitEditor)
        {
            ((MultipleDigitEditor)view).activate();
        }
    }

    private void focusPreviousField()
    {
        Object obj = focusSearch(17);
        if (obj instanceof MultipleDigitEditor)
        {
            obj = (MultipleDigitEditor)obj;
            ((MultipleDigitEditor) (obj)).activate();
            if (!((MultipleDigitEditor) (obj)).isEmpty())
            {
                ((MultipleDigitEditor) (obj)).eraseLastDigit();
            }
        }
    }

    private boolean isValidInput(int i)
    {
        if (mValidator == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        System.arraycopy(mDigits, 0, mValidatorBackBuffer, 0, mDigits.length);
        static class _cls2
        {

            static final int $SwitchMap$com$walmartlabs$android$pharmacy$ui$dob$Validator$Action[];

            static 
            {
                $SwitchMap$com$walmartlabs$android$pharmacy$ui$dob$Validator$Action = new int[Validator.Action.values().length];
                try
                {
                    $SwitchMap$com$walmartlabs$android$pharmacy$ui$dob$Validator$Action[Validator.Action.PAD.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$walmartlabs$android$pharmacy$ui$dob$Validator$Action[Validator.Action.ACCEPT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$walmartlabs$android$pharmacy$ui$dob$Validator$Action[Validator.Action.REJECT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.walmartlabs.android.pharmacy.ui.dob.Validator.Action[mValidator.isValidInput(mValidatorBackBuffer, mLastDigitPos, i).ordinal()];
        JVM INSTR tableswitch 1 3: default 76
    //                   1 88
    //                   2 92
    //                   3 76;
           goto _L1 _L2 _L3 _L1
_L3:
        break MISSING_BLOCK_LABEL_92;
_L1:
        boolean flag = false;
_L4:
        if (flag)
        {
            clearError();
            return flag;
        } else
        {
            setError();
            syncIME();
            return flag;
        }
_L2:
        pad();
        flag = true;
          goto _L4
        return true;
    }

    private void pad()
    {
        int ai[] = mDigits;
        int i = mLastDigitPos + 1;
        mLastDigitPos = i;
        ai[i] = 0;
        syncIME();
    }

    private void setError()
    {
        mErrorState = true;
        invalidate();
    }

    private void syncIME()
    {
        mSoftKeyboard.restartInput(this);
    }

    public void activate()
    {
        requestFocus();
        requestFocusFromTouch();
        mSoftKeyboard.showSoftInput(this, 0);
    }

    public void clear()
    {
        Arrays.fill(mDigits, -1);
        mLastDigitPos = -1;
        invalidate();
    }

    public boolean getErrorState()
    {
        return mErrorState;
    }

    public int getValue()
    {
        int j = 0;
        for (int i = 0; i <= mLastDigitPos; i++)
        {
            j = j * 10 + mDigits[i];
        }

        return j;
    }

    public void init(Context context, AttributeSet attributeset)
    {
        mFontSize = TypedValue.applyDimension(2, 25F, getResources().getDisplayMetrics());
        if (attributeset == null)
        {
            break MISSING_BLOCK_LABEL_315;
        }
        attributeset = context.obtainStyledAttributes(attributeset, com.walmartlabs.android.pharmacy.R.styleable.MultipleDigitEditor);
        mFontSize = attributeset.getDimension(com.walmartlabs.android.pharmacy.R.styleable.MultipleDigitEditor_fontSize, mFontSize);
        String s = attributeset.getString(com.walmartlabs.android.pharmacy.R.styleable.MultipleDigitEditor_hintChar);
        if (!TextUtils.isEmpty(s))
        {
            mHintChar = s.substring(0, 1);
        }
        mFieldSize = attributeset.getInt(com.walmartlabs.android.pharmacy.R.styleable.MultipleDigitEditor_fieldSize, mFieldSize);
        mDigitColor = attributeset.getColor(com.walmartlabs.android.pharmacy.R.styleable.MultipleDigitEditor_digitColor, mDigitColor);
        mHintColor = attributeset.getColor(com.walmartlabs.android.pharmacy.R.styleable.MultipleDigitEditor_hintColor, mHintColor);
        mErrorColor = attributeset.getColor(com.walmartlabs.android.pharmacy.R.styleable.MultipleDigitEditor_errorColor, mErrorColor);
        attributeset.recycle();
        mDigitPaint = new Paint(1);
        mDigitPaint.setColor(mDigitColor);
        mDigitPaint.setTypeface(Typeface.MONOSPACE);
        mDigitPaint.setTextSize(mFontSize);
        mHintPaint = new Paint(mDigitPaint);
        mHintPaint.setColor(mHintColor);
        mErrorPaint = new Paint(mDigitPaint);
        mErrorPaint.setColor(mErrorColor);
        setFocusable(true);
        setFocusableInTouchMode(true);
        mSoftKeyboard = (InputMethodManager)context.getSystemService("input_method");
        mDrawRect = new Rect[mFieldSize];
        mDigits = new int[mFieldSize];
        Arrays.fill(mDigits, -1);
        mValidatorBackBuffer = new int[mFieldSize];
        Arrays.fill(mValidatorBackBuffer, -1);
        calculateDigitDimensions();
        calculateViewDimensions();
        calculateDrawingRects();
        return;
        context;
        attributeset.recycle();
        throw context;
    }

    public boolean isComplete()
    {
        return mLastDigitPos == mFieldSize - 1;
    }

    public boolean isEmpty()
    {
        return mLastDigitPos == -1;
    }

    public boolean onCheckIsTextEditor()
    {
        return true;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        editorinfo.inputType = 2;
        editorinfo.imeOptions = 0x10000000;
        return mIMEConnection;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int i;
        for (i = 0; i <= mLastDigitPos; i++)
        {
            drawDigitOnRectangle(canvas, mDigitPaint, mDrawRect[i], mDigits[i]);
        }

        int j = i;
        if (mErrorState)
        {
            j = i;
            if (i < mFieldSize)
            {
                drawCharOnRectangle(canvas, mErrorPaint, mDrawRect[i], mHintChar);
                j = i + 1;
            }
        }
        for (; j < mFieldSize; j++)
        {
            drawCharOnRectangle(canvas, mHintPaint, mDrawRect[j], mHintChar);
        }

    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        super.onFocusChanged(flag, i, rect);
        if (flag)
        {
            mSoftKeyboard.showSoftInput(this, 0);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (keyevent.getMetaState() == 0)
        {
            if (i >= 7 && i <= 16)
            {
                i -= 7;
                if (isValidInput(i))
                {
                    appendDigit(i);
                }
                return true;
            }
            if (i == 67)
            {
                clearError();
                eraseLastDigit();
                return true;
            } else
            {
                return false;
            }
        } else
        {
            return false;
        }
    }

    protected void onMeasure(int i, int j)
    {
        setMeasuredDimension(mWidth, mHeight);
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            parcelable = (SavedState)parcelable;
            super.onRestoreInstanceState(parcelable.getSuperState());
            System.arraycopy(((SavedState) (parcelable)).mDigits, 0, mDigits, 0, mDigits.length);
            mLastDigitPos = ((SavedState) (parcelable)).mLastDigitPos;
            mErrorState = ((SavedState) (parcelable)).mStateError;
            return;
        } else
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        return new SavedState(super.onSaveInstanceState(), mDigits, mLastDigitPos, mErrorState);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            activate();
        }
        return true;
    }

    public void setOnContentChangeWatcher(OnContentChangeWatcher oncontentchangewatcher)
    {
        mOnContentChangedWatcher = oncontentchangewatcher;
    }

    public void setValidator(Validator validator)
    {
        mValidator = validator;
    }

    public void setValue(int i)
    {
        if (i < 0 || (double)i >= Math.pow(10D, mFieldSize))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("").append(i).append(" cannot be represented by this editor").toString());
        }
        mLastDigitPos = mFieldSize - 1;
        int k = mLastDigitPos;
        int j = i;
        for (i = k; i >= 0; i--)
        {
            mDigits[i] = j % 10;
            j /= 10;
        }

        invalidate();
    }



}
