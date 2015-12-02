// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.ap;
import com.whatsapp.util.c1;
import com.whatsapp.util.o;
import com.whatsapp.util.y;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            App, ab6, MediaData, w5, 
//            d5, VideoFrameConverter, au2, aoz, 
//            u7, fg

class asg extends Thread
{

    private static final String z[];
    final ab6 a;

    asg(ab6 ab6_1)
    {
        a = ab6_1;
        super();
    }

    public void run()
    {
        int k = App.am;
        Log.i(z[6]);
_L16:
        if (ab6.b(a).size() != 0) goto _L2; else goto _L1
_L1:
        Log.i(z[5]);
        synchronized (ab6.b(a))
        {
            ab6.b(a).wait();
        }
_L2:
        if (ab6.b(a).size() == 0) goto _L4; else goto _L3
_L3:
        synchronized (ab6.b(a))
        {
            obj = (c4)ab6.b(a).remove(0);
            Log.i((new StringBuilder()).append(z[7]).append(((c4) (obj)).y.c).toString());
        }
        File file;
        obj2 = (MediaData)((c4) (obj)).B;
        file = c1.a(App.au, ((MediaData) (obj2)).file, ((c4) (obj)).w, ((c4) (obj)).n, true);
        obj2.transcoder = new w5(((MediaData) (obj2)).file, file, ((MediaData) (obj2)).trimFrom, ((MediaData) (obj2)).trimTo);
        ((MediaData) (obj2)).transcoder.a(new d5(this, ((c4) (obj)), ((MediaData) (obj2))));
        App.aL.createNewFile();
        VideoFrameConverter.setLogFilePath(App.aL.getAbsolutePath());
_L17:
        if (com.whatsapp.ab6.a(a) != null)
        {
            com.whatsapp.ab6.a(a).acquire();
        }
        if (!w5.b(((MediaData) (obj2)).file)) goto _L6; else goto _L5
_L5:
        Object obj3;
        int l;
        int i1;
        obj3 = new o(((MediaData) (obj2)).file);
        l = ((o) (obj3)).e();
        i1 = ((o) (obj3)).f();
        int j;
        if (l < i1)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        j = 640;
        int i = (i1 * 640) / l;
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_330;
        }
        i = 640;
        j = (l * 640) / i1;
        long l1;
        if (((MediaData) (obj2)).trimFrom < 0L)
        {
            break MISSING_BLOCK_LABEL_441;
        }
        l1 = ((MediaData) (obj2)).trimTo;
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_441;
        }
        boolean flag = ((o) (obj3)).d();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_402;
        }
        flag = com.whatsapp.w5.a(((MediaData) (obj2)).file);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_402;
        }
        Log.i(z[0]);
        ((MediaData) (obj2)).transcoder.b();
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_505;
        }
        ((MediaData) (obj2)).transcoder.a(c1.a(j, i, ((MediaData) (obj2)).trimTo - ((MediaData) (obj2)).trimFrom));
        ((MediaData) (obj2)).transcoder.a();
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_505;
        }
        flag = ((o) (obj3)).d();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_477;
        }
        Log.i(z[11]);
        c1.a(((MediaData) (obj2)).file, file);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_505;
        }
        ((MediaData) (obj2)).transcoder.a(c1.a(j, i, ((o) (obj3)).c()));
        ((MediaData) (obj2)).transcoder.a();
        if (k == 0) goto _L7; else goto _L6
_L6:
        l1 = ((MediaData) (obj2)).trimFrom;
        if (l1 < 0L) goto _L9; else goto _L8
_L8:
        l1 = ((MediaData) (obj2)).trimTo;
        if (l1 <= 0L) goto _L9; else goto _L10
_L10:
        ((MediaData) (obj2)).transcoder.b();
        if (k == 0) goto _L7; else goto _L9
_L9:
        double d;
        d = ((MediaData) (obj2)).file.length();
        i = au2.q;
        if (d >= (double)((long)i * 0x100000L) * 1.5D) goto _L12; else goto _L11
_L11:
        Log.i(z[3]);
        c1.a(((MediaData) (obj2)).file, file);
        if (k == 0) goto _L7; else goto _L12
_L12:
        throw new IllegalArgumentException();
        Object obj4;
        obj4;
        throw obj4;
        obj4;
        Log.e(z[4]);
        VideoFrameConverter.setLogFilePath(null);
        obj4 = com.whatsapp.ab6.a(a);
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_670;
        }
        if (com.whatsapp.ab6.a(a).isHeld())
        {
            com.whatsapp.ab6.a(a).release();
        }
        if (!App.aL.exists())
        {
            break MISSING_BLOCK_LABEL_1482;
        }
        App.aL.delete();
        i = 0;
_L18:
        if (!i) goto _L14; else goto _L13
_L13:
        obj2.file = file;
        obj2.transcoded = true;
        obj2.fileSize = ((MediaData) (obj2)).file.length();
        obj.L = ((MediaData) (obj2)).file.getName();
        obj.t = ((MediaData) (obj2)).fileSize;
        obj.H = c1.b(((MediaData) (obj2)).file);
        l1 = ((MediaData) (obj2)).trimFrom;
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_808;
        }
        byte abyte0[];
        y.b(((c4) (obj)));
        abyte0 = c1.a(((MediaData) (obj2)).file.getAbsolutePath());
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_800;
        }
        ((c4) (obj)).a(abyte0);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_808;
        }
        Log.w(z[1]);
        App.ah.a(((c4) (obj)), true, -1);
        ab6.c(a).post(new u7(this, ((c4) (obj))));
        if (k == 0) goto _L4; else goto _L14
_L14:
        obj2.transferring = false;
        obj.M = 0;
        flag = ((MediaData) (obj2)).transcoder.e();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_874;
        }
        obj2.autodownloadRetryEnabled = false;
        App.ah.a(((c4) (obj)), true, -1);
_L4:
        flag = Thread.interrupted();
        if (!flag) goto _L16; else goto _L15
_L15:
        return;
        obj2;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw obj2;
        }
        catch (InterruptedException interruptedexception) { }
        ArrayList arraylist = ab6.b(a);
        arraylist;
        JVM INSTR monitorenter ;
        do
        {
            if (ab6.b(a).isEmpty())
            {
                break;
            }
            obj2 = (MediaData)((c4)ab6.b(a).remove(0)).B;
            obj2.transferring = false;
            obj2.progress = 0L;
        } while (k == 0);
        arraylist;
        JVM INSTR monitorexit ;
        return;
        obj2;
        arraylist;
        JVM INSTR monitorexit ;
        throw obj2;
        exception;
        obj2;
        JVM INSTR monitorexit ;
        throw exception;
        obj4;
        Log.a(z[9], ((Throwable) (obj4)));
          goto _L17
        obj4;
        throw obj4;
        obj4;
        Log.a(z[8], ((Throwable) (obj4)));
        VideoFrameConverter.setLogFilePath(null);
        obj4 = com.whatsapp.ab6.a(a);
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_1055;
        }
        if (com.whatsapp.ab6.a(a).isHeld())
        {
            com.whatsapp.ab6.a(a).release();
        }
        if (!App.aL.exists())
        {
            break MISSING_BLOCK_LABEL_1482;
        }
        App.aL.delete();
        i = 0;
          goto _L18
        obj4;
        throw obj4;
        obj4;
        throw obj4;
        obj4;
        throw obj4;
        obj4;
        throw obj4;
        obj4;
        throw obj4;
        obj4;
        throw obj4;
        obj4;
        throw obj4;
        obj4;
        throw obj4;
        obj4;
        Log.a(z[2], ((Throwable) (obj4)));
        if (((IOException) (obj4)).getMessage() == null)
        {
            break MISSING_BLOCK_LABEL_1177;
        }
        flag = ((IOException) (obj4)).getMessage().contains(z[10]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1177;
        }
        ab6.c(a).post(new fg(this));
        VideoFrameConverter.setLogFilePath(null);
        if (com.whatsapp.ab6.a(a) == null)
        {
            break MISSING_BLOCK_LABEL_1218;
        }
        flag = com.whatsapp.ab6.a(a).isHeld();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1218;
        }
        com.whatsapp.ab6.a(a).release();
        if (!App.aL.exists())
        {
            break MISSING_BLOCK_LABEL_1482;
        }
        App.aL.delete();
        i = 0;
          goto _L18
        obj4;
        throw obj4;
        obj4;
        throw obj4;
        obj4;
        throw obj4;
        obj4;
        throw obj4;
        obj4;
        throw obj4;
        Object obj1;
        obj1;
        VideoFrameConverter.setLogFilePath(null);
        if (com.whatsapp.ab6.a(a) == null)
        {
            break MISSING_BLOCK_LABEL_1307;
        }
        flag = com.whatsapp.ab6.a(a).isHeld();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1307;
        }
        com.whatsapp.ab6.a(a).release();
        if (App.aL.exists())
        {
            App.aL.delete();
        }
        throw obj1;
_L7:
        flag = ((MediaData) (obj2)).transcoder.e();
        if (!flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        VideoFrameConverter.setLogFilePath(null);
        if (com.whatsapp.ab6.a(a) == null)
        {
            break MISSING_BLOCK_LABEL_1384;
        }
        flag = com.whatsapp.ab6.a(a).isHeld();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1384;
        }
        com.whatsapp.ab6.a(a).release();
        i = j;
        if (!App.aL.exists()) goto _L18; else goto _L19
_L19:
        App.aL.delete();
        i = j;
          goto _L18
        obj1;
        throw obj1;
        obj4;
        throw obj4;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        i = 0;
          goto _L18
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[12];
        obj = "zF\td\000x]\fo\034o@\td\036yJ\030d@x]\004l";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "zF\td\000x]\fo\034o@\td\036yJ\030d@o@\030m\013,A\002uOkJ\031!\031eK\bnOxG\030l\r";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "zF\td\000x]\fo\034o@\td\036yJ\030d@e@\by\fi_\031h\000b";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "zF\td\000x]\fo\034o@\td\036yJ\030d@o@\035x";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "zF\td\000x]\fo\034o@\td\036yJ\030d@nN\t!\031eK\bn";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "zF\td\000x]\fo\034o@\td\036yJ\030d@{F\001mO{N\004u";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "zF\td\000x]\fo\034o@\td\036yJ\030d@~Z\003";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "zF\td\000x]\fo\034o@\td\036yJ\030d@|]\002b\n\177\\M";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "zF\td\000x]\fo\034o@\td\036yJ\030d@jF\001d\001c[\013n\032bK";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "zF\td\000x]\fo\034o@\td\036yJ\030d@YA\fc\003i\017\031nOo]\b`\033i\017\016s\016\177GMh\001,Y\004e\nc\017\036d\001xF\003d\003,I\004m\n";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "B@Mr\037mL\b";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "zF\td\000x]\fo\034o@\td\036yJ\030d@o@\035x";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 344
    //                   0 367
    //                   1 374
    //                   2 381
    //                   3 388;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_388;
_L3:
        byte byte1 = 111;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 12;
          goto _L9
_L5:
        byte1 = 47;
          goto _L9
_L6:
        byte1 = 109;
          goto _L9
        byte1 = 1;
          goto _L9
    }
}
