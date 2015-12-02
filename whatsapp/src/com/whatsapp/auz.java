// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.media.MediaPlayer;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            RecordAudio

class auz
    implements android.media.MediaPlayer.OnPreparedListener
{

    private static final String z;
    final RecordAudio a;

    auz(RecordAudio recordaudio)
    {
        a = recordaudio;
        super();
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        Log.i(z);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\r<I\036\r\0338_\025\026\020vZ\035\036\006<X\001\r\032)K\003\032\033".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
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
        byte byte0 = 127;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 127;
          goto _L8
_L3:
        byte0 = 89;
          goto _L8
_L4:
        byte0 = 42;
          goto _L8
        byte0 = 113;
          goto _L8
    }
}
