// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.media.audiofx.Visualizer;

// Referenced classes of package com.whatsapp:
//            akr, at4

class m1
    implements android.media.audiofx.Visualizer.OnDataCaptureListener
{

    final akr a;

    m1(akr akr1)
    {
        a = akr1;
        super();
    }

    public void onFftDataCapture(Visualizer visualizer, byte abyte0[], int i)
    {
    }

    public void onWaveFormDataCapture(Visualizer visualizer, byte abyte0[], int i)
    {
        if (akr.d(a) != null)
        {
            akr.d(a).a(abyte0);
        }
    }
}
