// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.view.View;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            ActionBarView

class this._cls0
    implements android.view.ener
{

    final ActionBarView this$0;

    public void onClick(View view)
    {
        mWindowCallback.onMenuItemSelected(0, ActionBarView.access$200(ActionBarView.this));
    }

    ()
    {
        this$0 = ActionBarView.this;
        super();
    }
}
