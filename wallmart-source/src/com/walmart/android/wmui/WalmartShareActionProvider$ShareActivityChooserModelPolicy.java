// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Intent;
import android.support.v7.internal.widget.ActivityChooserModel;

// Referenced classes of package com.walmart.android.wmui:
//            WalmartShareActionProvider

private class <init>
    implements android.support.v7.internal.widget.
{

    final WalmartShareActionProvider this$0;

    public boolean onChooseActivity(ActivityChooserModel activitychoosermodel, Intent intent)
    {
        if (WalmartShareActionProvider.access$400(WalmartShareActionProvider.this) != null)
        {
            WalmartShareActionProvider.access$400(WalmartShareActionProvider.this).ShareTargetSelected(WalmartShareActionProvider.this, intent);
        }
        return false;
    }

    private Y()
    {
        this$0 = WalmartShareActionProvider.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
