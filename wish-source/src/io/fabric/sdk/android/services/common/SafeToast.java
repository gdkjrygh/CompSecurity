// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import io.fabric.sdk.android.services.concurrency.PriorityRunnable;

public class SafeToast extends Toast
{

    public SafeToast(Context context)
    {
        super(context);
    }

    public static Toast makeText(Context context, int i, int j)
        throws android.content.res.Resources.NotFoundException
    {
        return makeText(context, context.getResources().getText(i), j);
    }

    public static Toast makeText(Context context, CharSequence charsequence, int i)
    {
        charsequence = Toast.makeText(context, charsequence, i);
        context = new SafeToast(context);
        context.setView(charsequence.getView());
        context.setDuration(charsequence.getDuration());
        return context;
    }

    public void show()
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            super.show();
            return;
        } else
        {
            (new Handler(Looper.getMainLooper())).post(new PriorityRunnable() {

                final SafeToast this$0;

                public void run()
                {
                    show();
                }

            
            {
                this$0 = SafeToast.this;
                super();
            }
            });
            return;
        }
    }

}
