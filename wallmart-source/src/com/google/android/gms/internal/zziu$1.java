// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsResult;

// Referenced classes of package com.google.android.gms.internal:
//            zziu

static final class zzJx
    implements android.content.nterface.OnCancelListener
{

    final JsResult zzJx;

    public void onCancel(DialogInterface dialoginterface)
    {
        zzJx.cancel();
    }

    lListener(JsResult jsresult)
    {
        zzJx = jsresult;
        super();
    }
}
