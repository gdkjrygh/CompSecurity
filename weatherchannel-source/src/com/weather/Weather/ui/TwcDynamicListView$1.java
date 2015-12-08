// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.ui;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.weather.Weather.ui:
//            TwcDynamicListView

class this._cls0
    implements android.widget.gClickListener
{

    final TwcDynamicListView this$0;

    public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        if (TwcDynamicListView.access$000(TwcDynamicListView.this) == 0)
        {
            TwcDynamicListView.access$102(TwcDynamicListView.this, true);
            TwcDynamicListView.access$200(TwcDynamicListView.this);
            return true;
        } else
        {
            return false;
        }
    }

    stener()
    {
        this$0 = TwcDynamicListView.this;
        super();
    }
}
