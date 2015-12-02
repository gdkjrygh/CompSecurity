// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            ConversationRowVideo, afi, aj, App, 
//            MediaData, asb

class qu
    implements Runnable
{

    private static final String z[];
    long a;
    MediaData b;
    long c;
    final ConversationRowVideo d;
    Drawable e;

    qu(ConversationRowVideo conversationrowvideo, MediaData mediadata)
    {
        d = conversationrowvideo;
        super();
        c = 0xf4240L;
        b = mediadata;
    }

    void a()
    {
        ConversationRowVideo.a().post(new afi(this));
        d.post(new aj(this));
    }

    public void run()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        int i;
        flag2 = true;
        flag = true;
        flag1 = false;
        i = App.am;
        if (b == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj2;
        obj = b;
        obj2 = d.i.B;
        if (obj != obj2) goto _L2; else goto _L3
_L3:
        boolean flag3 = d.isShown();
        if (!flag3) goto _L2; else goto _L4
_L4:
        obj = ConversationRowVideo.a(d);
        if (obj != this) goto _L2; else goto _L5
_L5:
        obj = b.file;
        if (obj == null) goto _L2; else goto _L6
_L6:
        Object obj1;
        try
        {
            flag3 = b.file.exists();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw obj1;
            }
        }
        if (flag3) goto _L7; else goto _L2
_L2:
        a();
_L9:
        return;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
_L7:
        long l = d.getDrawingTime();
        try
        {
            if (a == l)
            {
                a();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        a = l;
        obj2 = new MediaMetadataRetriever();
        long l1;
        ((MediaMetadataRetriever) (obj2)).setDataSource(b.file.getAbsolutePath());
        obj1 = ((MediaMetadataRetriever) (obj2)).getFrameAtTime(c);
        l1 = Long.parseLong(((MediaMetadataRetriever) (obj2)).extractMetadata(9));
        if (l1 <= 2000L)
        {
            break MISSING_BLOCK_LABEL_437;
        }
        long l2 = c;
        if (l2 <= l1 * 1000L)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        c = 0L;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        c = c + 0xf4240L;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_437;
        }
        MediaData mediadata;
        Object obj3;
        mediadata = b;
        obj3 = d.i.B;
        if (mediadata != obj3)
        {
            break MISSING_BLOCK_LABEL_437;
        }
        flag3 = d.isShown();
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_437;
        }
        d.post(new asb(this, ((android.graphics.Bitmap) (obj1))));
_L10:
        ((MediaMetadataRetriever) (obj2)).release();
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            ConversationRowVideo.a().postDelayed(this, 2000L);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        if (i == 0) goto _L9; else goto _L8
_L8:
        a();
        return;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        flag = flag1;
_L12:
        Log.e((new StringBuilder()).append(z[1]).append(((Exception) (obj1)).toString()).toString());
          goto _L10
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        flag = false;
_L11:
        Log.e((new StringBuilder()).append(z[0]).append(((NoSuchMethodError) (obj1)).toString()).toString());
          goto _L10
        obj1;
        flag = flag2;
          goto _L11
        obj1;
        flag = true;
          goto _L12
        flag = false;
          goto _L10
    }

    static 
    {
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        Object obj;
        int j;
        int k;
        as1 = as;
        obj = "nsCq1hhBb7}m\bs;llNp;wnOa3z".toCharArray();
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
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 128
    //                   0 149
    //                   1 155
    //                   2 161
    //                   3 167;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_167;
_L3:
        byte byte0 = 94;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 24;
          goto _L9
_L5:
        byte0 = 26;
          goto _L9
_L6:
        byte0 = 39;
          goto _L9
        byte0 = 20;
          goto _L9
    }
}
