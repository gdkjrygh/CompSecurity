// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzgi

static final class zzDC
    implements android.content.nterface.OnClickListener
{

    final JsPromptResult zzDC;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        zzDC.cancel();
    }

    Listener(JsPromptResult jspromptresult)
    {
        zzDC = jspromptresult;
        super();
    }
}
