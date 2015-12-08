// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.util.Log;
import android.webkit.WebView;
import com.sessionm.core.Session;
import java.util.Locale;

// Referenced classes of package com.sessionm.ui:
//            SessionMViewContainer

class val.js
    implements Runnable
{

    final SessionMViewContainer this$0;
    final String val$js;

    public void run()
    {
        if (Log.isLoggable("SessionM.WebView", 3))
        {
            Log.d("SessionM.WebView", (new StringBuilder()).append("Executing JS: ").append(val$js).toString());
        }
        if (SessionMViewContainer.access$200(SessionMViewContainer.this) != null)
        {
            SessionMViewContainer.access$200(SessionMViewContainer.this).loadUrl((new StringBuilder()).append("javascript:").append(val$js).toString());
        }
_L1:
        return;
        Throwable throwable;
        throwable;
        if (Log.isLoggable("SessionM.WebView", 3))
        {
            Log.e("SessionM.WebView", (new StringBuilder()).append("Failed to execute javascript: ").append(val$js).toString(), throwable);
            String s = String.format(Locale.US, "exception executing JS string: %s", new Object[] {
                val$js
            });
            Session.D().a("javascript-error", s, throwable);
            return;
        }
          goto _L1
    }

    ()
    {
        this$0 = final_sessionmviewcontainer;
        val$js = String.this;
        super();
    }
}
