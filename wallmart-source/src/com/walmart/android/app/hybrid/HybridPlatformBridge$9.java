// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.content.DialogInterface;

// Referenced classes of package com.walmart.android.app.hybrid:
//            HybridPlatformBridge

class val.checkedItems
    implements android.content.lListener
{

    final HybridPlatformBridge this$0;
    final allback val$callback;
    final boolean val$checkedItems[];

    public void onCancel(DialogInterface dialoginterface)
    {
        (new ltipleChoiceOnClickListener(val$callback, val$checkedItems, "cancel")).onClick(null, -1);
    }

    allback()
    {
        this$0 = final_hybridplatformbridge;
        val$callback = allback;
        val$checkedItems = _5B_Z.this;
        super();
    }
}
