// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.webkit.WebView;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            MainActivity

class val.jsCommand
    implements Runnable
{

    final MainActivity this$0;
    private final String val$jsCommand;

    public void run()
    {
        MainActivity.access$14(MainActivity.this).loadUrl((new StringBuilder("javascript:")).append(val$jsCommand).toString());
    }

    ()
    {
        this$0 = final_mainactivity;
        val$jsCommand = String.this;
        super();
    }
}
