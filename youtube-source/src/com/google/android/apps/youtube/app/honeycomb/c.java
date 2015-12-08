// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcEvent;
import com.google.android.apps.youtube.common.L;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb:
//            d

final class c
    implements android.nfc.NfcAdapter.CreateNdefMessageCallback, android.nfc.NfcAdapter.OnNdefPushCompleteCallback
{

    private final d a;

    public c(d d1)
    {
        a = d1;
    }

    public final NdefMessage createNdefMessage(NfcEvent nfcevent)
    {
        nfcevent = a.M();
        if (nfcevent != null)
        {
            int i = a.K() / 1000;
            return new NdefMessage(new NdefRecord[] {
                new NdefRecord((short)3, (new StringBuilder("http://www.youtube.com/watch?v=")).append(nfcevent).append("#t=").append(i).toString().getBytes(), new byte[0], new byte[0])
            });
        } else
        {
            return null;
        }
    }

    public final void onNdefPushComplete(NfcEvent nfcevent)
    {
        L.d("NFC push completed");
    }
}
