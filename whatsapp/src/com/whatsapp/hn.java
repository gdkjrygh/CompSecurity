// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.CountDownTimer;
import android.text.format.DateUtils;

// Referenced classes of package com.whatsapp:
//            SpamWarningActivity, CircularProgressBar

class hn extends CountDownTimer
{

    final CircularProgressBar a;
    final SpamWarningActivity b;

    hn(SpamWarningActivity spamwarningactivity, long l, long l1, CircularProgressBar circularprogressbar)
    {
        b = spamwarningactivity;
        a = circularprogressbar;
        super(l, l1);
    }

    public void onFinish()
    {
        b.finish();
    }

    public void onTick(long l)
    {
        int i = (int)l / 1000;
        a.setCenterText(DateUtils.formatElapsedTime(i));
        a.setProgress((int)l);
    }
}
