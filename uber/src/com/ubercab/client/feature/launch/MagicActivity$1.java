// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.launch;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.ubercab.ui.EditText;
import dao;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.ubercab.client.feature.launch:
//            MagicActivity

final class a
    implements android.content.OnClickListener
{

    final EditText a;
    final MagicActivity b;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        String s = a.getText().toString();
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        b.m.f();
_L6:
        MagicActivity.a(b);
_L4:
        return;
_L2:
        if (!MagicActivity.f().matcher(s).matches()) goto _L4; else goto _L3
_L3:
        dialoginterface = "";
        if ("amex".equals(s))
        {
            dialoginterface = ":8000";
        }
        b.m.b(String.format("https://cn.%s.dev.uber.com%s", new Object[] {
            s, dialoginterface
        }));
        if (true) goto _L6; else goto _L5
_L5:
    }

    (MagicActivity magicactivity, EditText edittext)
    {
        b = magicactivity;
        a = edittext;
        super();
    }
}
