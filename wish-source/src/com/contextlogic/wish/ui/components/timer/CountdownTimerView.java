// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.timer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.ui.components.text.UnifiedFontTextView;
import com.contextlogic.wish.util.DateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimerView extends LinearLayout
{
    public static interface DoneCallback
    {

        public abstract void onCountdownEnd();
    }


    private static int NO_BACKGROUND = -1;
    private int backgroundColor;
    private int backgroundDrawable;
    private DoneCallback callback;
    private ArrayList digitElements;
    private TextView expiredText;
    private ArrayList hourElements;
    private boolean isBold;
    private ArrayList minuteElements;
    private ArrayList secondElements;
    private Date targetDate;
    private long timeParts[];
    private Timer timer;
    private boolean updatePosted;
    private Runnable updateRunnable;

    public CountdownTimerView(Context context)
    {
        super(context);
        setOrientation(0);
    }

    public CountdownTimerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOrientation(0);
    }

    private void addColon(ArrayList arraylist, int i, int j, int k)
    {
        UnifiedFontTextView unifiedfonttextview = new UnifiedFontTextView(getContext());
        unifiedfonttextview.setTextColor(k);
        unifiedfonttextview.setText(":");
        unifiedfonttextview.setPadding(j, j, j, j);
        unifiedfonttextview.setTextSize(0, i);
        if (isBold)
        {
            unifiedfonttextview.setTypeface(Typeface.DEFAULT_BOLD);
        }
        addView(unifiedfonttextview);
        arraylist.add(unifiedfonttextview);
    }

    private void addDigits(ArrayList arraylist, int i, int j, int k, int l, int i1, ArrayList arraylist1)
    {
        int j1 = 0;
        while (j1 < i) 
        {
            UnifiedFontTextView unifiedfonttextview = new UnifiedFontTextView(getContext());
            unifiedfonttextview.setTextColor(i1);
            if (backgroundDrawable != NO_BACKGROUND)
            {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), backgroundDrawable);
                bitmap = Bitmap.createScaledBitmap(bitmap, (bitmap.getWidth() * j) / bitmap.getHeight(), j, false);
                unifiedfonttextview.setBackgroundDrawable(new BitmapDrawable(getResources(), bitmap));
            } else
            {
                unifiedfonttextview.setBackgroundColor(backgroundColor);
            }
            unifiedfonttextview.setText("0");
            unifiedfonttextview.setPadding((int)((double)k * 1.75D), k, (int)((double)k * 1.75D), k);
            unifiedfonttextview.setTextSize(0, j);
            if (isBold)
            {
                unifiedfonttextview.setTypeface(Typeface.DEFAULT_BOLD);
            }
            addView(unifiedfonttextview);
            arraylist.add(unifiedfonttextview);
            arraylist1.add(unifiedfonttextview);
            if (j1 > 0)
            {
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutparams.leftMargin = l;
                unifiedfonttextview.setLayoutParams(layoutparams);
            }
            j1++;
        }
    }

    private void updateDigits(ArrayList arraylist, long l)
    {
        for (int i = 1; l != 0L; i++)
        {
            int j = (int)l;
            l /= 10L;
            int k = arraylist.size() - i;
            if (k < 0 || k >= arraylist.size())
            {
                continue;
            }
            TextView textview = (TextView)arraylist.get(k);
            if (textview != null)
            {
                textview.setText(Integer.toString(j % 10));
            }
        }

    }

    private void updateTime()
    {
label0:
        {
            if (timeParts == null)
            {
                timeParts = new long[3];
            }
            timeParts = DateUtil.getTimeDifferenceFromNow(targetDate, timeParts);
            boolean flag1 = true;
            int i = 0;
label1:
            do
            {
label2:
                {
                    boolean flag = flag1;
                    if (i < timeParts.length)
                    {
                        if (timeParts[i] <= 0L)
                        {
                            break label2;
                        }
                        flag = false;
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                    for (Iterator iterator = digitElements.iterator(); iterator.hasNext(); ((View)iterator.next()).setVisibility(8)) { }
                    break label1;
                }
                i++;
            } while (true);
            if (callback != null)
            {
                callback.onCountdownEnd();
            } else
            {
                expiredText.setVisibility(0);
            }
            pauseTimer();
            return;
        }
        for (Iterator iterator1 = digitElements.iterator(); iterator1.hasNext(); ((View)iterator1.next()).setVisibility(0)) { }
        expiredText.setVisibility(8);
        if (hourElements != null)
        {
            zeroOutValues(hourElements);
            updateDigits(hourElements, timeParts[0]);
        }
        zeroOutValues(minuteElements);
        updateDigits(minuteElements, timeParts[1]);
        zeroOutValues(secondElements);
        updateDigits(secondElements, timeParts[2]);
    }

    private void zeroOutValues(ArrayList arraylist)
    {
        for (int i = 0; i < arraylist.size(); i++)
        {
            ((TextView)arraylist.get(i)).setText("0");
        }

    }

    public boolean isSetup()
    {
        return targetDate != null;
    }

    public void pauseTimer()
    {
        if (timer == null)
        {
            return;
        } else
        {
            timer.cancel();
            timer = null;
            callback = null;
            updatePosted = false;
            return;
        }
    }

    public void setup(Date date, int i)
    {
        setup(date, i, getResources().getColor(0x7f0c00c6));
    }

    public void setup(Date date, int i, int j)
    {
        setup(date, i, j, getResources().getColor(0x7f0c00e8));
    }

    public void setup(Date date, int i, int j, int k)
    {
        setup(date, i, j, k, j);
    }

    public void setup(Date date, int i, int j, int k, int l)
    {
        setup(date, i, j, k, l, NO_BACKGROUND);
    }

    public void setup(Date date, int i, int j, int k, int l, int i1)
    {
        setup(date, i, j, k, l, i1, false);
    }

    public void setup(Date date, int i, int j, int k, int l, int i1, boolean flag)
    {
        setup(date, i, j, k, l, i1, flag, null);
    }

    public void setup(Date date, int i, int j, int k, int l, int i1, boolean flag, 
            DoneCallback donecallback)
    {
        pauseTimer();
        removeAllViews();
        targetDate = date;
        backgroundColor = j;
        backgroundDrawable = i1;
        isBold = flag;
        callback = donecallback;
        if (timeParts == null)
        {
            timeParts = new long[3];
        }
        timeParts = DateUtil.getTimeDifferenceFromNow(targetDate, timeParts);
        i1 = (int)((0.25D * (double)i) / 2D);
        j = (int)TypedValue.applyDimension(1, i1, getResources().getDisplayMetrics());
        i1 = (int)TypedValue.applyDimension(1, i - i1 - i1, getResources().getDisplayMetrics());
        int j1 = (int)TypedValue.applyDimension(1, 2.0F, getResources().getDisplayMetrics());
        if (timeParts[0] > 0L)
        {
            i = (int)Math.ceil(Math.log10(timeParts[0]));
        } else
        {
            i = 1;
        }
        i = Math.max(2, i);
        digitElements = new ArrayList();
        if (timeParts[0] > 0L)
        {
            hourElements = new ArrayList();
            addDigits(digitElements, i, i1, j, j1, k, hourElements);
            addColon(digitElements, i1, j1, l);
        }
        minuteElements = new ArrayList();
        addDigits(digitElements, 2, i1, j, j1, k, minuteElements);
        addColon(digitElements, i1, j1, l);
        secondElements = new ArrayList();
        addDigits(digitElements, 2, i1, j, j1, k, secondElements);
        expiredText = new UnifiedFontTextView(getContext());
        expiredText.setTextColor(getResources().getColor(0x7f0c00e8));
        expiredText.setBackgroundColor(getResources().getColor(0x7f0c009a));
        expiredText.setText(getContext().getString(0x7f060154));
        expiredText.setPadding(j, (int)((double)j * 1.25D), j, (int)((double)j * 1.25D));
        expiredText.setGravity(17);
        expiredText.setTextSize(0, (int)((double)i1 * 0.80000000000000004D));
        expiredText.setVisibility(8);
        date = new android.widget.LinearLayout.LayoutParams(-2, -2);
        date.leftMargin = j;
        expiredText.setLayoutParams(date);
        addView(expiredText);
    }

    public void startTimer()
    {
        if (timer != null)
        {
            return;
        }
        if (updateRunnable == null)
        {
            updateRunnable = new Runnable() {

                final CountdownTimerView this$0;

                public void run()
                {
                    updateTime();
                    updatePosted = false;
                }

            
            {
                this$0 = CountdownTimerView.this;
                super();
            }
            };
        }
        TimerTask timertask = new TimerTask() {

            final CountdownTimerView this$0;

            public void run()
            {
                if (!updatePosted && getWindowVisibility() != 8)
                {
                    updatePosted = post(updateRunnable);
                }
            }

            
            {
                this$0 = CountdownTimerView.this;
                super();
            }
        };
        timer = new Timer();
        timer.schedule(timertask, 0L, 100L);
        updateTime();
    }





/*
    static boolean access$102(CountdownTimerView countdowntimerview, boolean flag)
    {
        countdowntimerview.updatePosted = flag;
        return flag;
    }

*/

}
