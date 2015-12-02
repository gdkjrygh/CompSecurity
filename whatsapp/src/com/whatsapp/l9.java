// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.media.MediaPlayer;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            RecordAudio

class l9
    implements android.media.MediaPlayer.OnErrorListener
{

    private static final String z[];
    final RecordAudio a;

    l9(RecordAudio recordaudio)
    {
        a = recordaudio;
        super();
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        Log.e((new StringBuilder()).append(z[1]).append(i).append(z[0]).append(j).toString());
        return false;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "M\022\022\022\020\037SM";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "\037W\024\005\026\tS\002\016\r\002\035\022\030\026\002@W\035\f\fFM";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 100;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 109;
          goto _L9
_L5:
        byte0 = 50;
          goto _L9
_L6:
        byte0 = 119;
          goto _L9
        byte0 = 106;
          goto _L9
    }
}
