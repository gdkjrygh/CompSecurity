// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.weeklyad;

import android.content.DialogInterface;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.widget.EditText;

// Referenced classes of package com.walmart.android.app.weeklyad:
//            WeeklyAdPresenter

class val.handler
    implements android.content.ickListener
{

    final WeeklyAdPresenter this$0;
    final View val$contentView;
    final HttpAuthHandler val$handler;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (EditText)val$contentView.findViewById(0x7f1005d9);
        EditText edittext = (EditText)val$contentView.findViewById(0x7f1005da);
        val$handler.proceed(String.valueOf(dialoginterface.getText()), String.valueOf(edittext.getText()));
    }

    ()
    {
        this$0 = final_weeklyadpresenter;
        val$contentView = view;
        val$handler = HttpAuthHandler.this;
        super();
    }
}
