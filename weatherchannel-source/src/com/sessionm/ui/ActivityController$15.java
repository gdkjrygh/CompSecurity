// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.content.DialogInterface;
import com.sessionm.b.a;

// Referenced classes of package com.sessionm.ui:
//            ActivityController

class val.message
    implements android.content.kListener
{

    final ActivityController this$0;
    final a val$message;
    final String val$url;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        ActivityController.access$1200(ActivityController.this, val$url, val$message);
    }

    kListener()
    {
        this$0 = final_activitycontroller;
        val$url = s;
        val$message = a.this;
        super();
    }
}
