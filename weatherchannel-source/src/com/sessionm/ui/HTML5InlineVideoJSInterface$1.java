// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;


// Referenced classes of package com.sessionm.ui:
//            HTML5InlineVideoJSInterface

class val.eventCallback
    implements Runnable
{

    final HTML5InlineVideoJSInterface this$0;
    final String val$eventCallback;
    final int val$height;
    final String val$url;
    final int val$width;
    final int val$x;
    final int val$y;

    public void run()
    {
        HTML5InlineVideoJSInterface.access$000(HTML5InlineVideoJSInterface.this, val$url, val$x, val$y, val$width, val$height, val$eventCallback);
    }

    ()
    {
        this$0 = final_html5inlinevideojsinterface;
        val$url = s;
        val$x = i;
        val$y = j;
        val$width = k;
        val$height = l;
        val$eventCallback = String.this;
        super();
    }
}
