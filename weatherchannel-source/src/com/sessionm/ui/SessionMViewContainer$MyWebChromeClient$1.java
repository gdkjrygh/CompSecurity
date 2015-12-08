// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.content.DialogInterface;
import android.webkit.JsResult;

// Referenced classes of package com.sessionm.ui:
//            SessionMViewContainer

class this._cls1
    implements android.content.this._cls1
{

    final is._cls0 this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (SessionMViewContainer.access$500(_fld0) != null)
        {
            SessionMViewContainer.access$500(_fld0).confirm();
            SessionMViewContainer.access$502(_fld0, null);
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
