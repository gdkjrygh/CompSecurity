// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.graphics.Picture;
import android.webkit.WebView;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.hybrid:
//            WebTransitionHandler

class this._cls1
    implements android.webkit.ardTransition._cls2
{

    final this._cls1 this$1;

    public void onNewPicture(WebView webview, Picture picture)
    {
        WLog.d(WebTransitionHandler.TAG, "onNewPicture");
        WebTransitionHandler.access$600(_fld0).setPictureListener(null);
        cess._mth1002(this._cls1.this, true);
        cess._mth900(this._cls1.this);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
