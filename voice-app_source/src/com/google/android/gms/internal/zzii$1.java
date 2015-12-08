// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzii

static final class zzHA
    implements android.content.nterface.OnCancelListener
{

    final JsResult zzHA;

    public void onCancel(DialogInterface dialoginterface)
    {
        zzHA.cancel();
    }

    lListener(JsResult jsresult)
    {
        zzHA = jsresult;
        super();
    }
}
