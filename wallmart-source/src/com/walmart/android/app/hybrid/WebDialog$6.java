// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.view.View;
import android.webkit.WebView;

// Referenced classes of package com.walmart.android.app.hybrid:
//            WebDialog

class this._cls0
    implements android.view.Listener
{

    final WebDialog this$0;

    public void onClick(View view)
    {
        if (WebDialog.access$100(WebDialog.this))
        {
            WebDialog.access$200(WebDialog.this).loadUrl("javascript:onAccept()");
            return;
        } else
        {
            WebDialog.access$000(WebDialog.this, "ok", null);
            dismiss();
            return;
        }
    }

    ()
    {
        this$0 = WebDialog.this;
        super();
    }
}
