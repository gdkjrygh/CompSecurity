// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import android.app.Activity;
import android.nfc.NfcAdapter;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb:
//            c, d

public final class b
{

    public static void a(Activity activity, d d)
    {
        c.a(activity);
        c.a(d);
        NfcAdapter nfcadapter = NfcAdapter.getDefaultAdapter(activity);
        if (nfcadapter == null)
        {
            return;
        } else
        {
            d = new com.google.android.apps.youtube.app.honeycomb.c(d);
            nfcadapter.setNdefPushMessageCallback(d, activity, new Activity[0]);
            nfcadapter.setOnNdefPushCompleteCallback(d, activity, new Activity[0]);
            return;
        }
    }
}
