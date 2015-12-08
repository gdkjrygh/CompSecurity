// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.content.DialogInterface;

// Referenced classes of package com.walmart.android.app.hybrid:
//            HybridPlatformBridge

class val.checkedItems
    implements android.content.ChoiceClickListener
{

    final HybridPlatformBridge this$0;
    final boolean val$checkedItems[];

    public void onClick(DialogInterface dialoginterface, int i, boolean flag)
    {
        val$checkedItems[i] = flag;
    }

    ener()
    {
        this$0 = final_hybridplatformbridge;
        val$checkedItems = _5B_Z.this;
        super();
    }
}
