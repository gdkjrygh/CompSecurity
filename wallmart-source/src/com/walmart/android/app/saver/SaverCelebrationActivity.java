// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.walmart.android.app.main.AppState;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.wmui.RadiantView;

public class SaverCelebrationActivity extends Activity
{

    public static final String EXTRA_LOWER_PRICES_FOUND = "EXTRA_LOWER_PRICES_FOUND";
    private boolean mLowerPrices;

    public SaverCelebrationActivity()
    {
    }

    private void setupViews()
    {
        if (mLowerPrices)
        {
            findViewById(0x7f100474).setBackgroundColor(getResources().getColor(0x7f0f00cf));
            findViewById(0x7f100476).setBackgroundColor(getResources().getColor(0x7f0f00cf));
            ((RadiantView)findViewById(0x7f100477)).setBackgroundCenterColor(getResources().getColor(0x7f0f00cd));
            ((RadiantView)findViewById(0x7f100477)).setBackgroundEdgeColor(getResources().getColor(0x7f0f00cf));
            ((ImageView)findViewById(0x7f100479)).setImageResource(0x7f0202ae);
            ((TextView)findViewById(0x7f10047a)).setText(0x7f09048d);
            ((TextView)findViewById(0x7f10047b)).setText(0x7f09048e);
            return;
        } else
        {
            findViewById(0x7f100474).setBackgroundColor(getResources().getColor(0x7f0f00ce));
            findViewById(0x7f100476).setBackgroundColor(getResources().getColor(0x7f0f00ce));
            ((RadiantView)findViewById(0x7f100477)).setBackgroundCenterColor(getResources().getColor(0x7f0f00cc));
            ((RadiantView)findViewById(0x7f100477)).setBackgroundEdgeColor(getResources().getColor(0x7f0f00ce));
            ((ImageView)findViewById(0x7f100479)).setImageResource(0x7f0202a2);
            ((TextView)findViewById(0x7f10047a)).setText(0x7f09048f);
            ((TextView)findViewById(0x7f10047b)).setText(0x7f090490);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!AppState.rerouteOnAppStart(this))
        {
            setContentView(0x7f040149);
            if (getIntent() != null)
            {
                mLowerPrices = getIntent().getBooleanExtra("EXTRA_LOWER_PRICES_FOUND", false);
                return;
            }
            if (bundle != null)
            {
                mLowerPrices = bundle.getBoolean("EXTRA_LOWER_PRICES_FOUND", false);
                return;
            }
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("EXTRA_LOWER_PRICES_FOUND", mLowerPrices);
    }

    protected void onStart()
    {
        super.onStart();
        setupViews();
        findViewById(0x7f100475).setOnClickListener(new android.view.View.OnClickListener() {

            final SaverCelebrationActivity this$0;

            public void onClick(View view)
            {
                finish();
            }

            
            {
                this$0 = SaverCelebrationActivity.this;
                super();
            }
        });
        ((CheckBox)findViewById(0x7f100478)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final SaverCelebrationActivity this$0;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                compoundbutton = SaverCelebrationActivity.this;
                if (!flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                SharedPreferencesUtil.setSaverShowCelebration(compoundbutton, flag);
            }

            
            {
                this$0 = SaverCelebrationActivity.this;
                super();
            }
        });
        Object obj = findViewById(0x7f100479);
        Animation animation = AnimationUtils.loadAnimation(this, 0x7f05002a);
        ((View) (obj)).startAnimation(animation);
        long l = animation.getDuration();
        obj = AnimationUtils.loadAnimation(this, 0x7f050029);
        ((Animation) (obj)).setStartOffset((long)((double)l * 0.5D));
        ((Animation) (obj)).setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final SaverCelebrationActivity this$0;

            public void onAnimationEnd(Animation animation1)
            {
                if (!isFinishing())
                {
                    animation1 = AnimationUtils.loadAnimation(SaverCelebrationActivity.this, 0x7f05002b);
                    findViewById(0x7f100477).startAnimation(animation1);
                }
            }

            public void onAnimationRepeat(Animation animation1)
            {
            }

            public void onAnimationStart(Animation animation1)
            {
            }

            
            {
                this$0 = SaverCelebrationActivity.this;
                super();
            }
        });
        findViewById(0x7f100477).startAnimation(((Animation) (obj)));
        obj = AnimationUtils.loadAnimation(this, 0x7f05002a);
        ((Animation) (obj)).setStartOffset((long)((double)l * 0.80000000000000004D));
        findViewById(0x7f10047b).startAnimation(((Animation) (obj)));
        obj = AnimationUtils.loadAnimation(this, 0x7f05002a);
        ((Animation) (obj)).setStartOffset((long)((double)l * 0.80000000000000004D));
        findViewById(0x7f10047a).startAnimation(((Animation) (obj)));
    }
}
