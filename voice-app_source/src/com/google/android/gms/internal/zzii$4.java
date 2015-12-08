// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzii

static final class zzHB
    implements android.content.nterface.OnCancelListener
{

    final JsPromptResult zzHB;

    public void onCancel(DialogInterface dialoginterface)
    {
        zzHB.cancel();
    }

    lListener(JsPromptResult jspromptresult)
    {
        zzHB = jspromptresult;
        super();
    }
}
