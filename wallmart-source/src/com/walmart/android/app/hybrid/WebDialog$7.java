// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;


// Referenced classes of package com.walmart.android.app.hybrid:
//            WebDialog

class val.data
    implements Runnable
{

    final WebDialog this$0;
    final String val$action;
    final String val$data;

    public void run()
    {
        WebDialog.access$000(WebDialog.this, val$action, val$data);
        dismiss();
    }

    ()
    {
        this$0 = final_webdialog;
        val$action = s;
        val$data = String.this;
        super();
    }
}
