// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.media.MediaPlayer;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            VideoView

class a98
    implements android.media.MediaPlayer.OnErrorListener
{

    private static final String z;
    final VideoView a;

    a98(VideoView videoview)
    {
        a = videoview;
        super();
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        Log.w((new StringBuilder()).append(z).append(i).append(",").append(j).toString());
        VideoView.d(a, -1);
        VideoView.g(a, -1);
        if (VideoView.i(a) != null)
        {
            if (!VideoView.i(a).onError(VideoView.d(a), i, j));
        }
        return true;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "ifU~\035ifTl]?JCi\035m5\021".toCharArray();
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
        byte byte0 = 114;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 31;
          goto _L8
_L3:
        byte0 = 15;
          goto _L8
_L4:
        byte0 = 49;
          goto _L8
        byte0 = 27;
          goto _L8
    }
}
