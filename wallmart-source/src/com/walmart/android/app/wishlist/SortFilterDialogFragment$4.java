// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.DialogInterface;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.app.wishlist:
//            SortFilterDialogFragment

class this._cls0
    implements android.content.ner
{

    final SortFilterDialogFragment this$0;

    public void onShow(DialogInterface dialoginterface)
    {
        dialoginterface = (new com.walmartlabs.anivia.init>("pageView")).utString("name", "list sort").utString("section", "lists");
        MessageBus.getBus().post(dialoginterface);
    }

    A()
    {
        this$0 = SortFilterDialogFragment.this;
        super();
    }
}
