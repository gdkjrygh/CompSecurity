// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.webkit.WebView;

// Referenced classes of package com.facebook.internal:
//            WebDialog

class this._cls0 extends WebView
{

    final WebDialog this$0;

    public void onWindowFocusChanged(boolean flag)
    {
        try
        {
            super.onWindowFocusChanged(flag);
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            return;
        }
    }

    (Context context)
    {
        this$0 = WebDialog.this;
        super(context);
    }
}
