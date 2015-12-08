// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;

public class FloatLabel extends TextView
{
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
        boolean mShouldShow;
        int mState;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(mState);
            if (mShouldShow)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
        }


        SavedState(Parcel parcel)
        {
            super(parcel);
            mState = parcel.readInt();
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mShouldShow = flag;
        }

        SavedState(Parcelable parcelable, int i, boolean flag)
        {
            super(parcelable);
            mState = i;
            mShouldShow = flag;
        }
    }


    private static final int STATE_ERROR = 1;
    private static final int STATE_NORMAL = 0;
    private View mAttachedField;
    private int mErrorTextColor;
    private android.view.View.OnFocusChangeListener mFocusListener;
    private int mFocusedTextColor;
    private Animation mInAnimation;
    private CharSequence mLabelText;
    private Animation mOutAnimation;
    private boolean mSelfChange;
    private boolean mShouldShow;
    private int mState;
    private TextWatcher mTextWatcher;
    private int mUnfocusedTextColor;

    public FloatLabel(Context context)
    {
        super(context);
        mFocusedTextColor = 0xff0000ff;
        mUnfocusedTextColor = 0xff444444;
        mErrorTextColor = 0xffff0000;
        mState = 0;
        init(context, null);
    }

    public FloatLabel(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mFocusedTextColor = 0xff0000ff;
        mUnfocusedTextColor = 0xff444444;
        mErrorTextColor = 0xffff0000;
        mState = 0;
        init(context, attributeset);
    }

    public FloatLabel(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mFocusedTextColor = 0xff0000ff;
        mUnfocusedTextColor = 0xff444444;
        mErrorTextColor = 0xffff0000;
        mState = 0;
        init(context, attributeset);
    }

    private void init(Context context, AttributeSet attributeset)
    {
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        context = context.obtainStyledAttributes(attributeset, com.walmart.lib.R.styleable.FloatLabel);
        mFocusedTextColor = context.getColor(com.walmart.lib.R.styleable.FloatLabel_focusedTextColor, 0xff0000ff);
        mUnfocusedTextColor = context.getColor(com.walmart.lib.R.styleable.FloatLabel_unfocusedTextColor, 0xff444444);
        mErrorTextColor = context.getColor(com.walmart.lib.R.styleable.FloatLabel_errorTextColor, 0xffff0000);
        mInAnimation = AnimationUtils.loadAnimation(getContext(), context.getResourceId(com.walmart.lib.R.styleable.FloatLabel_inAnimation, com.walmart.lib.R.anim.float_label_in));
        mOutAnimation = AnimationUtils.loadAnimation(getContext(), context.getResourceId(com.walmart.lib.R.styleable.FloatLabel_outAnimation, com.walmart.lib.R.anim.float_label_out));
        context.recycle();
_L4:
        setVisibility(4);
        mTextWatcher = new TextWatcher() {

            final FloatLabel this$0;

            public void afterTextChanged(Editable editable)
            {
                if (!TextUtils.isEmpty(editable))
                {
                    show();
                    return;
                } else
                {
                    hide();
                    return;
                }
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            
            {
                this$0 = FloatLabel.this;
                super();
            }
        };
        mFocusListener = new android.view.View.OnFocusChangeListener() {

            final FloatLabel this$0;

            public void onFocusChange(View view, boolean flag)
            {
                if (mState == 0)
                {
                    view = FloatLabel.this;
                    int i;
                    if (flag)
                    {
                        i = mFocusedTextColor;
                    } else
                    {
                        i = mUnfocusedTextColor;
                    }
                    view.setTextColor(i);
                }
            }

            
            {
                this$0 = FloatLabel.this;
                super();
            }
        };
        mLabelText = getText();
        mSelfChange = false;
        return;
        attributeset;
        context.recycle();
        throw attributeset;
_L2:
        mInAnimation = AnimationUtils.loadAnimation(context, com.walmart.lib.R.anim.float_label_in);
        mOutAnimation = AnimationUtils.loadAnimation(context, com.walmart.lib.R.anim.float_label_out);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void setTextInternal(int i)
    {
        mSelfChange = true;
        setText(i);
        mSelfChange = false;
    }

    private void setTextInternal(CharSequence charsequence)
    {
        mSelfChange = true;
        setText(charsequence);
        mSelfChange = false;
    }

    public void attach(View view)
    {
        mAttachedField = view;
        mAttachedField.setOnFocusChangeListener(mFocusListener);
        if (view instanceof EditText)
        {
            ((EditText)mAttachedField).addTextChangedListener(mTextWatcher);
        }
    }

    public void clearError()
    {
        mState = 0;
        if (mAttachedField != null)
        {
            int i;
            if (mAttachedField.hasFocus())
            {
                i = mFocusedTextColor;
            } else
            {
                i = mUnfocusedTextColor;
            }
            setTextColor(i);
        } else
        {
            setTextColor(mUnfocusedTextColor);
        }
        setTextInternal(mLabelText);
        if (!mShouldShow)
        {
            setVisibility(4);
        }
    }

    public void hide()
    {
        mShouldShow = false;
        if (mState == 0 && isShown())
        {
            startAnimation(mOutAnimation);
            mOutAnimation.setStartOffset(0L);
            mOutAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final FloatLabel this$0;

                public void onAnimationEnd(Animation animation)
                {
                    setVisibility(4);
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$0 = FloatLabel.this;
                super();
            }
            });
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            parcelable = (SavedState)parcelable;
            super.onRestoreInstanceState(parcelable.getSuperState());
            mState = ((SavedState) (parcelable)).mState;
            mShouldShow = ((SavedState) (parcelable)).mShouldShow;
            return;
        } else
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        return new SavedState(super.onSaveInstanceState(), mState, mShouldShow);
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
        if (!mSelfChange)
        {
            mLabelText = charsequence;
        }
    }

    public void setError()
    {
        mState = 1;
        setTextColor(mErrorTextColor);
        setVisibility(0);
    }

    public void setError(int i)
    {
        setError();
        setTextInternal(i);
    }

    public void setError(CharSequence charsequence)
    {
        setError();
        setTextInternal(charsequence);
    }

    public void show()
    {
        mShouldShow = true;
        if (mState == 0 && !isShown())
        {
            setVisibility(0);
            mInAnimation.setStartOffset(0L);
            startAnimation(mInAnimation);
        }
    }



}
