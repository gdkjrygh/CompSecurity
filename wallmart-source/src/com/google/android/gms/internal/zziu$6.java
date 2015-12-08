// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

// Referenced classes of package com.google.android.gms.internal:
//            zziu

static final class zzJz
    implements android.content.nterface.OnClickListener
{

    final JsPromptResult zzJy;
    final EditText zzJz;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        zzJy.confirm(zzJz.getText().toString());
    }

    Listener(JsPromptResult jspromptresult, EditText edittext)
    {
        zzJy = jspromptresult;
        zzJz = edittext;
        super();
    }
}
