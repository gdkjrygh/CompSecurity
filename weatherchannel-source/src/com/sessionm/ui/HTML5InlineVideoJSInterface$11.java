// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.webkit.WebView;

// Referenced classes of package com.sessionm.ui:
//            HTML5InlineVideoJSInterface

class val.name
    implements Runnable
{

    final HTML5InlineVideoJSInterface this$0;
    final String val$name;

    public void run()
    {
        synchronized (HTML5InlineVideoJSInterface.this)
        {
            if (HTML5InlineVideoJSInterface.access$900(HTML5InlineVideoJSInterface.this) != null)
            {
                HTML5InlineVideoJSInterface.access$900(HTML5InlineVideoJSInterface.this).loadUrl((new StringBuilder()).append("javascript:").append(HTML5InlineVideoJSInterface.access$1000(HTML5InlineVideoJSInterface.this)).append("(\"").append(val$name).append("\")").toString());
            }
        }
        return;
        exception;
        html5inlinevideojsinterface;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ()
    {
        this$0 = final_html5inlinevideojsinterface;
        val$name = String.this;
        super();
    }
}
