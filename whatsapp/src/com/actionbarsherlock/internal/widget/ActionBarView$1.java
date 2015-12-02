// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.view.View;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            ActionBarView, IcsAdapterView

class this._cls0
    implements nItemSelectedListener
{

    final ActionBarView this$0;

    public void onItemSelected(IcsAdapterView icsadapterview, View view, int i, long l)
    {
        if (ActionBarView.access$000(ActionBarView.this) != null)
        {
            ActionBarView.access$000(ActionBarView.this).onNavigationItemSelected(i, l);
        }
    }

    public void onNothingSelected(IcsAdapterView icsadapterview)
    {
    }

    er()
    {
        this$0 = ActionBarView.this;
        super();
    }
}
