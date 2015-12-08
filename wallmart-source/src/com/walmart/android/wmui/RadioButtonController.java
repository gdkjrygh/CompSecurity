// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.widget.CompoundButton;
import android.widget.RadioButton;

public class RadioButtonController
{
    private class CheckedStateTracker
        implements android.widget.CompoundButton.OnCheckedChangeListener
    {

        final RadioButtonController this$0;

        public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
        {
            if (mProtectFromCheckedChange)
            {
                return;
            }
            mProtectFromCheckedChange = true;
            if (mCheckedId != -1)
            {
                setCheckedStateForView(mCheckedId, false);
            }
            mProtectFromCheckedChange = false;
            int i = compoundbutton.getId();
            setCheckedId(i);
        }

        private CheckedStateTracker()
        {
            this$0 = RadioButtonController.this;
            super();
        }

    }

    public static interface OnCheckedChangeListener
    {

        public abstract void onCheckedChanged(int i);
    }


    private int mCheckedId;
    private final android.widget.CompoundButton.OnCheckedChangeListener mChildOnCheckedChangeListener = new CheckedStateTracker();
    private OnCheckedChangeListener mOnCheckedChangeListener;
    private boolean mProtectFromCheckedChange;
    private final RadioButton mRadioButtons[];

    public transient RadioButtonController(RadioButton aradiobutton[])
    {
        int i = 0;
        super();
        mCheckedId = -1;
        mProtectFromCheckedChange = false;
        mRadioButtons = aradiobutton;
        aradiobutton = mRadioButtons;
        for (int j = aradiobutton.length; i < j; i++)
        {
            aradiobutton[i].setOnCheckedChangeListener(mChildOnCheckedChangeListener);
        }

    }

    private RadioButton findViewById(int i)
    {
        RadioButton aradiobutton[] = mRadioButtons;
        int k = aradiobutton.length;
        for (int j = 0; j < k; j++)
        {
            RadioButton radiobutton = aradiobutton[j];
            if (radiobutton.getId() == i)
            {
                return radiobutton;
            }
        }

        return null;
    }

    private void setCheckedId(int i)
    {
        mCheckedId = i;
        if (mOnCheckedChangeListener != null)
        {
            mOnCheckedChangeListener.onCheckedChanged(mCheckedId);
        }
    }

    private void setCheckedStateForView(int i, boolean flag)
    {
        RadioButton radiobutton = findViewById(i);
        if (radiobutton != null)
        {
            radiobutton.setChecked(flag);
        }
    }

    public void check(int i)
    {
        if (i != -1 && i == mCheckedId)
        {
            return;
        }
        if (mCheckedId != -1)
        {
            setCheckedStateForView(mCheckedId, false);
        }
        if (i != -1)
        {
            setCheckedStateForView(i, true);
        }
        setCheckedId(i);
    }

    public int getCheckedRadioButtonId()
    {
        return mCheckedId;
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener oncheckedchangelistener)
    {
        mOnCheckedChangeListener = oncheckedchangelistener;
    }



/*
    static boolean access$102(RadioButtonController radiobuttoncontroller, boolean flag)
    {
        radiobuttoncontroller.mProtectFromCheckedChange = flag;
        return flag;
    }

*/



}
