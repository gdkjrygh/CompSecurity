// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.moremenu;

import android.view.View;
import android.widget.CheckBox;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.moremenu:
//            SettingsPresenter

class this._cls0
    implements android.view.
{

    final SettingsPresenter this$0;

    public void onClick(View view)
    {
        ((CheckBox)ViewUtil.findViewById(view, 0x7f10005b)).toggle();
    }

    ()
    {
        this$0 = SettingsPresenter.this;
        super();
    }
}
