// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.app.Activity;
import android.content.DialogInterface;
import android.util.Log;

// Referenced classes of package com.kochava.android.tracker:
//            WebAdView, Global

class this._cls0
    implements android.content.ace.OnCancelListener
{

    final WebAdView this$0;

    public void onCancel(DialogInterface dialoginterface)
    {
        if (Global.DEBUG)
        {
            Log.i("KochavaAds", "Back pressed during loading dialog.");
        }
        activity.onBackPressed();
    }

    Listener()
    {
        this$0 = WebAdView.this;
        super();
    }
}
