// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;

public class CodeView extends LinearLayout
{
    public static interface OnCodeEnteredListener
    {

        public abstract void onCodeEntered(CharSequence charsequence);
    }


    private Animation mAnimation;
    private View mDigits[];
    private final EditText mEditText;
    private OnCodeEnteredListener mListener;
    private int mNbrDigits;

    public CodeView(Context context)
    {
        this(context, null);
    }

    public CodeView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, com.walmart.lib.R.styleable.CodeView);
        mEditText = new EditText(context, attributeset);
        init(context, typedarray);
    }

    public CodeView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, com.walmart.lib.R.styleable.CodeView, i, 0);
        mEditText = new EditText(context, attributeset, i);
        init(context, typedarray);
    }

    public CodeView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, com.walmart.lib.R.styleable.CodeView, i, j);
        mEditText = new EditText(context, attributeset, i, j);
        init(context, typedarray);
    }

    private void init(Context context, TypedArray typedarray)
    {
        setOrientation(0);
        mNbrDigits = typedarray.getInt(com.walmart.lib.R.styleable.CodeView_nbrOfDigits, 1);
        int k = typedarray.getResourceId(com.walmart.lib.R.styleable.CodeView_digitLayout, com.walmart.lib.R.layout.code_digit_view);
        int l = typedarray.getResourceId(com.walmart.lib.R.styleable.CodeView_dividerLayout, 0);
        int i = typedarray.getResourceId(com.walmart.lib.R.styleable.CodeView_cursorAnimation, -1);
        if (i >= 0)
        {
            mAnimation = AnimationUtils.loadAnimation(context, i);
        }
        mDigits = new View[mNbrDigits];
        context = LayoutInflater.from(context);
        for (int j = 0; j < mNbrDigits; j++)
        {
            mDigits[j] = context.inflate(k, this, false);
            addView(mDigits[j]);
            if (j < mNbrDigits - 1 && l != 0)
            {
                context.inflate(l, this, true);
            }
        }

        mEditText.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(mNbrDigits)
        });
        if (mNbrDigits > 0 && mAnimation != null)
        {
            mDigits[0].startAnimation(mAnimation);
        }
        mEditText.addTextChangedListener(new TextWatcher() {

            final CodeView this$0;

            public void afterTextChanged(Editable editable)
            {
                updateDigits(editable);
                if (editable.length() == mNbrDigits && mListener != null)
                {
                    mListener.onCodeEntered(editable);
                }
            }

            public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            
            {
                this$0 = CodeView.this;
                super();
            }
        });
        setOnClickListener(new android.view.View.OnClickListener() {

            final CodeView this$0;

            public void onClick(View view)
            {
                ViewUtil.showKeyboard(view);
            }

            
            {
                this$0 = CodeView.this;
                super();
            }
        });
    }

    public void append(CharSequence charsequence)
    {
        mEditText.append(charsequence);
    }

    public boolean checkInputConnectionProxy(View view)
    {
        return view == mEditText;
    }

    public void clear()
    {
        mEditText.setText("");
    }

    public void delete()
    {
        if (mEditText.getText().length() > 0)
        {
            mEditText.getText().delete(mEditText.getText().length() - 1, mEditText.getText().length());
        }
    }

    public boolean onCheckIsTextEditor()
    {
        return true;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        InputConnection inputconnection = mEditText.onCreateInputConnection(editorinfo);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            editorinfo.imeOptions = editorinfo.imeOptions | 0x2000000;
        }
        editorinfo.imeOptions = editorinfo.imeOptions & 0xffffff00;
        editorinfo.imeOptions = editorinfo.imeOptions | 1;
        return inputconnection;
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        return mEditText.onKeyDown(i, keyevent);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyevent)
    {
        return mEditText.onKeyLongPress(i, keyevent);
    }

    public boolean onKeyMultiple(int i, int j, KeyEvent keyevent)
    {
        return mEditText.onKeyMultiple(i, j, keyevent);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyevent)
    {
        return mEditText.onKeyPreIme(i, keyevent);
    }

    public boolean onKeyShortcut(int i, KeyEvent keyevent)
    {
        return mEditText.onKeyShortcut(i, keyevent);
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        return mEditText.onKeyUp(i, keyevent);
    }

    public void setOnCodeEnteredListener(OnCodeEnteredListener oncodeenteredlistener)
    {
        mListener = oncodeenteredlistener;
    }

    protected void updateDigit(View view, CharSequence charsequence)
    {
        if (view instanceof TextView)
        {
            ((TextView)view).setText(charsequence);
            return;
        }
        boolean flag;
        if (charsequence != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setSelected(flag);
    }

    protected void updateDigits(Editable editable)
    {
        int i;
        for (i = 0; i < mNbrDigits && i < editable.length(); i++)
        {
            updateDigit(mDigits[i], editable.subSequence(i, i + 1));
            mDigits[i].clearAnimation();
        }

        int j = i;
        if (i < mNbrDigits)
        {
            updateDigit(mDigits[i], null);
            if (mAnimation != null)
            {
                mDigits[i].startAnimation(mAnimation);
            }
            j = i + 1;
        }
        for (; j < mNbrDigits; j++)
        {
            updateDigit(mDigits[j], null);
            mDigits[j].clearAnimation();
        }

    }


}
