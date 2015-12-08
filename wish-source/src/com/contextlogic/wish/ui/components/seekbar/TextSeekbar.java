// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.seekbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class TextSeekbar extends RelativeLayout
{

    private TextView currentText;
    private TextView maxText;
    private int maxValue;
    private TextView minText;
    private int minValue;
    private SeekBar seekBar;
    private View spacer;

    public TextSeekbar(Context context)
    {
        super(context);
        init();
    }

    public TextSeekbar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public TextSeekbar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300d4, this);
        minText = (TextView)view.findViewById(0x7f0d0433);
        maxText = (TextView)view.findViewById(0x7f0d0435);
        currentText = (TextView)view.findViewById(0x7f0d0437);
        spacer = view.findViewById(0x7f0d0436);
        seekBar = (SeekBar)view.findViewById(0x7f0d0434);
        seekBar.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener() {

            final TextSeekbar this$0;

            public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
            {
                updateCurrentText(i);
            }

            public void onStartTrackingTouch(SeekBar seekbar)
            {
            }

            public void onStopTrackingTouch(SeekBar seekbar)
            {
            }

            
            {
                this$0 = TextSeekbar.this;
                super();
            }
        });
    }

    public int getValue()
    {
        return seekBar.getProgress() + minValue;
    }

    public void initialize(int i, int j, String s, String s1)
    {
        minText.setText(s);
        maxText.setText(s1);
        minValue = i;
        maxValue = j;
        seekBar.setMax(maxValue - minValue);
        seekBar.setProgress(seekBar.getMax() / 2);
    }

    public void updateCurrentText(int i)
    {
        currentText.setText(String.valueOf(minValue + i));
        float f = (float)i / (float)seekBar.getMax();
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)spacer.getLayoutParams();
        layoutparams.weight = f;
        spacer.setLayoutParams(layoutparams);
    }
}
