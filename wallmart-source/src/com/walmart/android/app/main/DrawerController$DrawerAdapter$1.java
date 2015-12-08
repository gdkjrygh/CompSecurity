// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.view.View;

// Referenced classes of package com.walmart.android.app.main:
//            DrawerController

class awerItem
    implements android.view.DrawerAdapter._cls1
{

    final val.drawerItem this$0;
    final awerItem val$drawerItem;

    public void onClick(View view)
    {
        if (cess._mth3400(this._cls0.this) != null)
        {
            cess._mth3400(this._cls0.this).onSecondaryActionClick(val$drawerItem);
        }
    }

    awerItem()
    {
        this$0 = final_aweritem;
        val$drawerItem = awerItem.this;
        super();
    }
}
