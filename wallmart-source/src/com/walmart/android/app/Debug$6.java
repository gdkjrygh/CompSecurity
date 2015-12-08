// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.walmart.android.data.AppConfig;

// Referenced classes of package com.walmart.android.app:
//            Debug

static final class val.box
    implements android.content.terface.OnClickListener
{

    final AppConfig val$appConfig;
    final CheckBox val$box;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        val$appConfig.allowSaverWithoutEReceipt = val$box.isChecked();
    }

    ig(AppConfig appconfig, CheckBox checkbox)
    {
        val$appConfig = appconfig;
        val$box = checkbox;
        super();
    }
}
