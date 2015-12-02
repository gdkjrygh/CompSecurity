// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;
import com.whatsapp.util.c;
import com.whatsapp.util.o;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            VideoPreviewActivity, VideoView, ConversationTextEntry

class akw
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final VideoPreviewActivity a;

    akw(VideoPreviewActivity videopreviewactivity)
    {
        a = videopreviewactivity;
        super();
    }

    public void onClick(View view)
    {
        VideoPreviewActivity.a(a).b();
        view = new Intent();
        if (VideoPreviewActivity.l(a) - VideoPreviewActivity.n(a) < 1000L)
        {
            VideoPreviewActivity.b(a, Math.min(VideoPreviewActivity.n(a) + 1000L, VideoPreviewActivity.b(a).c()));
            VideoPreviewActivity.a(a, Math.max(0L, VideoPreviewActivity.l(a) - 1000L));
        }
        if (VideoPreviewActivity.n(a) - 200L > 0L || VideoPreviewActivity.l(a) + 200L < VideoPreviewActivity.b(a).c())
        {
            view.putExtra(z[1], VideoPreviewActivity.n(a));
            view.putExtra(z[3], VideoPreviewActivity.l(a));
        }
        view.putExtra(z[0], VideoPreviewActivity.i(a).getAbsolutePath());
        view.putExtra(z[2], c.a(VideoPreviewActivity.j(a).getText().toString()));
        a.setResult(-1, view);
        a.finish();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "k}\0364\033}u\0069";
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
                obj = "y}\0374\033kf\035<";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "nu\002%-bz";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "y}\0374\033y{";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 68;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 13;
          goto _L9
_L5:
        byte0 = 20;
          goto _L9
_L6:
        byte0 = 114;
          goto _L9
        byte0 = 81;
          goto _L9
    }
}
