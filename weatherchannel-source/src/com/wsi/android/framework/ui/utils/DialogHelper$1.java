// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.ui.utils;

import android.content.DialogInterface;
import android.util.Log;

// Referenced classes of package com.wsi.android.framework.ui.utils:
//            DialogHelper

class val.dialogId
    implements android.content..OnDismissListener
{

    final DialogHelper this$0;
    final int val$dialogId;

    public void onDismiss(DialogInterface dialoginterface)
    {
        Log.d(DialogHelper.TAG, (new StringBuilder()).append("onDismiss: dialog = ").append(dialoginterface).append("; id = ").append(val$dialogId).toString());
        removeFromShowing(val$dialogId);
    }

    ()
    {
        this$0 = final_dialoghelper;
        val$dialogId = I.this;
        super();
    }
}
