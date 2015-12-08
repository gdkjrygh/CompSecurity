// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.webkit.WebView;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            PopupActivity

class val.jsCommand
    implements Runnable
{

    final PopupActivity this$0;
    private final String val$jsCommand;

    public void run()
    {
        PopupActivity.access$9().loadUrl((new StringBuilder("javascript:")).append(val$jsCommand).toString());
    }

    ()
    {
        this$0 = final_popupactivity;
        val$jsCommand = String.this;
        super();
    }
}
