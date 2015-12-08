// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            SubscribeHelper

final class gc
    implements android.content.DialogInterface.OnClickListener
{

    final SubscribeHelper a;

    gc(SubscribeHelper subscribehelper)
    {
        a = subscribehelper;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            SubscribeHelper.i(a);
        }
    }
}
