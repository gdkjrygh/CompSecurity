// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.EditText;

// Referenced classes of package com.whatsapp:
//            VerifySms, App, abk, asw

class alg
    implements android.content.DialogInterface.OnClickListener
{

    final EditText a;
    final VerifySms b;

    alg(VerifySms verifysms, EditText edittext)
    {
        b = verifysms;
        a = edittext;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
label0:
        {
            dialoginterface = a.getText().toString().trim();
            if (TextUtils.isEmpty(dialoginterface) || dialoginterface.length() != VerifySms.A())
            {
                b.removeDialog(32);
                b.showDialog(33);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            b.removeDialog(32);
            asw.a(new abk(b), new String[] {
                dialoginterface
            });
        }
    }
}
