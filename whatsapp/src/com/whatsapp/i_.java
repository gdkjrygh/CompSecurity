// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.whatsapp:
//            ate, Voip

class i_
    implements Runnable
{

    private static final String z;
    final byte a[];
    final Voip.RecordingInfo b[];
    final Voip.DebugTapType c;
    final int d;
    final VoiceService.VoiceServiceEventCallback e;

    i_(VoiceService.VoiceServiceEventCallback voiceserviceeventcallback, Voip.RecordingInfo arecordinginfo[], Voip.DebugTapType debugtaptype, byte abyte0[], int i)
    {
        e = voiceserviceeventcallback;
        b = arecordinginfo;
        c = debugtaptype;
        a = abyte0;
        d = i;
        super();
    }

    public void run()
    {
        Voip.RecordingInfo recordinginfo = b[c.ordinal()];
        if (recordinginfo == null)
        {
            b[c.ordinal()] = new Voip.RecordingInfo(c);
            recordinginfo = b[c.ordinal()];
        }
        try
        {
            recordinginfo.a().write(a, 0, d);
        }
        catch (IOException ioexception1)
        {
            Log.a(ioexception1);
        }
        try
        {
            e.bufferQueue.a(a);
            if (recordinginfo.b().length() >= 0x3200000L)
            {
                Log.i(z);
                Voip.stopCallRecording();
            }
            return;
        }
        catch (IOException ioexception)
        {
            throw ioexception;
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "-\004LdV/\025T}g+'Uns+\027fay\"\000D(f:\nP(g+\006Ozq'\013G(q;\000\000|zn\000Xkp+\001S(s'\tE(f'\037E(y'\bI|".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 21;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 78;
          goto _L8
_L3:
        byte0 = 101;
          goto _L8
_L4:
        byte0 = 32;
          goto _L8
        byte0 = 8;
          goto _L8
    }
}
