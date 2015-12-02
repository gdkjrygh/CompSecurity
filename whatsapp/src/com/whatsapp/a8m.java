// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            RecordAudio

class a8m
    implements android.content.DialogInterface.OnClickListener
{

    final RecordAudio a;

    a8m(RecordAudio recordaudio)
    {
        a = recordaudio;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(0);
        a.finish();
    }
}
