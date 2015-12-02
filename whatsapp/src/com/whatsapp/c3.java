// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;

// Referenced classes of package com.whatsapp:
//            VoiceService, Voip

class c3
    implements android.bluetooth.BluetoothProfile.ServiceListener
{

    final VoiceService a;

    c3(VoiceService voiceservice)
    {
        a = voiceservice;
        super();
    }

    public void onServiceConnected(int i, BluetoothProfile bluetoothprofile)
    {
        if (i == 1)
        {
            VoiceService.a(a, (BluetoothHeadset)bluetoothprofile);
            bluetoothprofile = Voip.getCurrentCallState();
            if ((bluetoothprofile == Voip.CallState.CALLING || bluetoothprofile == Voip.CallState.RECEIVED_CALL) && a.e())
            {
                VoiceService.c(a, true);
            }
        }
    }

    public void onServiceDisconnected(int i)
    {
        if (i == 1)
        {
            VoiceService.a(a, null);
        }
    }
}
