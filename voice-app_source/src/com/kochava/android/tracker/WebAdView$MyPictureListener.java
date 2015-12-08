// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.app.ProgressDialog;
import android.graphics.Picture;
import android.webkit.WebView;

// Referenced classes of package com.kochava.android.tracker:
//            WebAdView

private class <init>
    implements android.webkit.tureListener
{

    final WebAdView this$0;

    public void onNewPicture(WebView webview, Picture picture)
    {
        if (mDialog.isShowing())
        {
            mDialog.dismiss();
        }
    }

    private ()
    {
        this$0 = WebAdView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
