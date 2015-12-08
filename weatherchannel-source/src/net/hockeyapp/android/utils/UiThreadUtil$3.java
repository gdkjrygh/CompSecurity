// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.utils;

import android.app.Activity;
import android.widget.Toast;

// Referenced classes of package net.hockeyapp.android.utils:
//            UiThreadUtil

class val.flags
    implements Runnable
{

    final UiThreadUtil this$0;
    final Activity val$activity;
    final int val$flags;
    final String val$message;

    public void run()
    {
        Toast.makeText(val$activity, val$message, val$flags).show();
    }

    ()
    {
        this$0 = final_uithreadutil;
        val$activity = activity1;
        val$message = s;
        val$flags = I.this;
        super();
    }
}
