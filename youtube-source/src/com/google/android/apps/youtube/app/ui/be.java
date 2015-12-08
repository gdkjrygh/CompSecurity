// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.CheckBox;
import android.widget.EditText;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.core.client.bc;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            bd, bf, bg

final class be
    implements android.content.DialogInterface.OnClickListener
{

    final EditText a;
    final CheckBox b;
    final bg c;
    final bd d;

    be(bd bd1, EditText edittext, CheckBox checkbox, bg bg)
    {
        d = bd1;
        a = edittext;
        b = checkbox;
        c = bg;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
label0:
        {
            if (i == -1)
            {
                dialoginterface = a.getText().toString().trim();
                if (!TextUtils.isEmpty(dialoginterface))
                {
                    break label0;
                }
            }
            return;
        }
        bd.d(d).a(dialoginterface, b.isChecked(), com.google.android.apps.youtube.common.a.a.a(com.google.android.apps.youtube.app.ui.bd.a(d), new bf(this)));
    }
}
