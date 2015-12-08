// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ActionProvider;
import android.support.v7.internal.widget.ActivityChooserModel;
import android.view.View;
import android.widget.AdapterView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.wmui:
//            WalmartActivityChooserView

private class <init>
    implements android.view.w.Callbacks, android.view.w.Callbacks, android.widget.Callbacks, android.widget.Callbacks
{

    final WalmartActivityChooserView this$0;

    private void notifyOnDismissListener()
    {
        if (WalmartActivityChooserView.access$700(WalmartActivityChooserView.this) != null)
        {
            WalmartActivityChooserView.access$700(WalmartActivityChooserView.this).ss();
        }
    }

    public void onClick(View view)
    {
        if (view == WalmartActivityChooserView.this)
        {
            WalmartActivityChooserView.access$500(WalmartActivityChooserView.this, WalmartActivityChooserView.access$600(WalmartActivityChooserView.this));
            return;
        } else
        {
            throw new IllegalArgumentException();
        }
    }

    public void onDismiss()
    {
        notifyOnDismissListener();
        if (mProvider != null)
        {
            mProvider.subUiVisibilityChanged(false);
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        ((ooserViewAdapter)adapterview.getAdapter()).getItemViewType(i);
        JVM INSTR tableswitch 0 1: default 32
    //                   0 50
    //                   1 40;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException();
_L3:
        WalmartActivityChooserView.access$500(WalmartActivityChooserView.this, 0x7fffffff);
_L5:
        return;
_L2:
        dismissPopup();
        adapterview = WalmartActivityChooserView.access$000(WalmartActivityChooserView.this).getDataModel().chooseActivity(i);
        if (adapterview == null) goto _L5; else goto _L4
_L4:
        if (!adapterview.hasExtra("walmart_extra_share_flag")) goto _L7; else goto _L6
_L6:
        view = new com.walmartlabs.anivia.seActivity("listShareTap");
        adapterview.removeExtra("walmart_extra_share_flag");
        MessageBus.getBus().post(view);
_L9:
        adapterview.addFlags(0x80000);
        getContext().startActivity(adapterview);
        return;
_L7:
        view = new com.walmartlabs.anivia.xt("shareItem");
        if (adapterview.getComponent() == null)
        {
            break; /* Loop/switch isn't completed */
        }
        view.xt("shareType", adapterview.getComponent().getPackageName());
_L11:
        view.xt("itemId", adapterview.getStringExtra("walmart_extra_itemid"));
        adapterview.removeExtra("walmart_extra_itemid");
        MessageBus.getBus().post(view);
        if (true) goto _L9; else goto _L8
_L8:
        if (adapterview.getPackage() == null) goto _L11; else goto _L10
_L10:
        view.xt("shareType", adapterview.getPackage());
          goto _L11
    }

    public boolean onLongClick(View view)
    {
        throw new IllegalArgumentException();
    }

    private ooserViewAdapter()
    {
        this$0 = WalmartActivityChooserView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
