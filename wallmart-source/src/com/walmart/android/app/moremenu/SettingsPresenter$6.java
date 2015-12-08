// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.moremenu;

import android.content.Context;
import android.widget.CompoundButton;
import com.walmart.android.util.SharedPreferencesUtil;

// Referenced classes of package com.walmart.android.app.moremenu:
//            SettingsPresenter

class val.context
    implements android.widget.ckedChangeListener
{

    final SettingsPresenter this$0;
    final Context val$context;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        SharedPreferencesUtil.setVuduNotificationsEnabled(val$context, flag);
    }

    ()
    {
        this$0 = final_settingspresenter;
        val$context = Context.this;
        super();
    }
}
