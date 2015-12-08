// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;

import android.os.SystemClock;
import android.view.View;

public abstract class OnSingleClickListener
    implements android.view.View.OnClickListener
{

    private long mTimestamp;

    public OnSingleClickListener()
    {
    }

    public void onClick(View view)
    {
        long l = SystemClock.elapsedRealtime();
        if (l - mTimestamp > 200L)
        {
            mTimestamp = l;
            onSingleClick(view);
        }
    }

    public abstract void onSingleClick(View view);
}
