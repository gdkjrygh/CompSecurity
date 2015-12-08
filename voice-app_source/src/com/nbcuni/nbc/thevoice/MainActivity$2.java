// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.webkit.WebView;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            MainActivity, HTTPTask

class > extends BroadcastReceiver
{

    final MainActivity this$0;

    public boolean isInternet(Context context)
    {
        return ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equalsIgnoreCase("android.net.conn.CONNECTIVITY_CHANGE") && isInternet(context))
        {
            MainActivity.access$15(MainActivity.this).dismiss();
            DNSDialogActive = false;
            MainActivity.access$16(MainActivity.this, (new HTTPTask(MainActivity.this)).execute(new String[] {
                ""
            }));
            MainActivity.access$14(MainActivity.this).loadUrl(MainActivity.access$17(MainActivity.this));
            unregisterReceiver(MainActivity.access$18(MainActivity.this));
        }
    }

    ()
    {
        this$0 = MainActivity.this;
        super();
    }
}
