// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.view.View;

// Referenced classes of package com.weather.commons.ups.ui:
//            ChangePasswordFragment

class this._cls0
    implements android.view.ordFragment._cls1
{

    final ChangePasswordFragment this$0;

    public void onClick(View view)
    {
        (new vePasswordTask(ChangePasswordFragment.this, null)).execute(new Void[0]);
    }

    vePasswordTask()
    {
        this$0 = ChangePasswordFragment.this;
        super();
    }
}
