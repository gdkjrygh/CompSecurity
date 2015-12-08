// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v7.internal.widget.ActivityChooserModel;
import android.view.MenuItem;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.wmui:
//            WalmartShareActionProvider

private class <init>
    implements android.view.ickListener
{

    final WalmartShareActionProvider this$0;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        menuitem = ActivityChooserModel.get(WalmartShareActionProvider.access$100(WalmartShareActionProvider.this), WalmartShareActionProvider.access$200(WalmartShareActionProvider.this)).chooseActivity(menuitem.getItemId());
        if (menuitem == null) goto _L2; else goto _L1
_L1:
        if (!menuitem.hasExtra("walmart_extra_share_flag")) goto _L4; else goto _L3
_L3:
        com.walmartlabs.anivia.r r = new com.walmartlabs.anivia.r.this._cls0("listShareTap");
        MessageBus.getBus().post(r);
        menuitem.removeExtra("walmart_extra_share_flag");
_L6:
        menuitem.addFlags(0x80000);
        WalmartShareActionProvider.access$100(WalmartShareActionProvider.this).startActivity(menuitem);
_L2:
        return true;
_L4:
        com.walmartlabs.anivia.r r1;
        r1 = new com.walmartlabs.anivia.r.this._cls0("shareItem");
        if (menuitem.getComponent() == null)
        {
            break; /* Loop/switch isn't completed */
        }
        r1._mth0("shareType", menuitem.getComponent().getPackageName());
_L8:
        r1._mth0("itemId", menuitem.getStringExtra("walmart_extra_itemid"));
        menuitem.removeExtra("walmart_extra_itemid");
        MessageBus.getBus().post(r1);
        if (true) goto _L6; else goto _L5
_L5:
        if (menuitem.getPackage() == null) goto _L8; else goto _L7
_L7:
        r1._mth0("shareType", menuitem.getPackage());
          goto _L8
    }

    private ()
    {
        this$0 = WalmartShareActionProvider.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
