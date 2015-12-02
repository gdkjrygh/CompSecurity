// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import java.io.File;

// Referenced classes of package com.whatsapp.util:
//            Log, ap

public class o
{

    private static final String z[];
    private long a;
    private int b;
    private int c;
    private int d;
    private File e;
    private int f;

    public o(File file)
    {
        MediaMetadataRetriever mediametadataretriever;
        String s;
        String s1;
        e = file;
        mediametadataretriever = new MediaMetadataRetriever();
        try
        {
            mediametadataretriever.setDataSource(file.getAbsolutePath());
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Log.e((new StringBuilder()).append(z[1]).append(e.getAbsolutePath()).append(" ").append(e.length()).append(" ").append(e.exists()).toString());
            mediametadataretriever.release();
            throw new ap();
        }
        file = mediametadataretriever.extractMetadata(9);
        s = mediametadataretriever.extractMetadata(18);
        s1 = mediametadataretriever.extractMetadata(19);
        try
        {
            a = Long.parseLong(file);
        }
        catch (Exception exception)
        {
            Log.e((new StringBuilder()).append(z[5]).append(file).append(" ").append(e.getAbsolutePath()).append(" ").append(e.length()).toString());
            mediametadataretriever.release();
            throw new ap();
        }
        if (a == 0L)
        {
            Log.e((new StringBuilder()).append(z[8]).append(file).append(" ").append(e.getAbsolutePath()).append(" ").append(e.length()).toString());
            mediametadataretriever.release();
            throw new ap();
        }
        f = Integer.parseInt(s);
        d = Integer.parseInt(s1);
_L2:
        Bitmap bitmap;
        Object obj;
        int i;
        boolean flag;
        try
        {
            c = Integer.parseInt(mediametadataretriever.extractMetadata(20));
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        try
        {
            b = Integer.parseInt(mediametadataretriever.extractMetadata(24));
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        mediametadataretriever.release();
        return;
        file;
        Log.w((new StringBuilder()).append(z[4]).append(s).append(z[2]).append(s1).append(z[3]).append(e.getAbsolutePath()).append(" ").append(e.length()).toString());
        file = null;
        bitmap = mediametadataretriever.getFrameAtTime(0L);
        file = bitmap;
_L3:
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_437;
        }
        f = file.getWidth();
        d = file.getHeight();
        flag = Log.f;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_498;
        }
        try
        {
            Log.e((new StringBuilder()).append(z[7]).append(e.getAbsolutePath()).append(" ").append(e.length()).toString());
            throw new ap();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        file;
        throw file;
        try
        {
            if (f == 0)
            {
                break; /* Loop/switch isn't completed */
            }
            i = d;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        Log.e((new StringBuilder()).append(z[0]).append(s).append(z[6]).append(s1).append(z[9]).append(e.getAbsolutePath()).append(" ").append(e.length()).toString());
        mediametadataretriever.release();
        throw new ap();
        obj;
          goto _L3
        obj;
          goto _L3
    }

    public int a()
    {
        return c;
    }

    public int b()
    {
        return b;
    }

    public long c()
    {
        return a;
    }

    public boolean d()
    {
        int j;
        boolean flag;
        j = 640;
        flag = Log.f;
        if (f > 640 || d > 640) goto _L2; else goto _L1
_L1:
        int i;
        int k;
        k = f;
        i = d;
        if (!flag) goto _L3; else goto _L2
_L2:
        if (f >= d) goto _L5; else goto _L4
_L4:
        i = (f * 640) / d;
        if (!flag) goto _L6; else goto _L5
_L5:
        i = (d * 640) / f;
_L8:
        return (double)(((long)(i * j * 3) * (a / 1000L)) / 8L + (0x17700L * (a / 1000L)) / 8L) < (double)e.length() * 1.5D;
_L6:
        j = i;
        i = 640;
        continue; /* Loop/switch isn't completed */
_L3:
        j = k;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public int e()
    {
        return f;
    }

    public int f()
    {
        return d;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[10];
        obj = "=w} .&{m$n)\177}e6\"zm-ac";
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
                obj = "=w} .&{m$n(\177w+.?>i7.({j6a-wu {";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "b>v7a#{p\")?>1";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "b>";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "=w} .&{m$n(\177w+.?>i$38{92(/jqei";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "=w} .&{m$n(\177w+.?>i$38{9!49\177m,.%$";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "b>v7a#{p\")?>1";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "=w} .&{m$n(\177w+.?>~ 5kxk$,.";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "=w} .&{m$n%q9!49\177m,.%$";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "b>";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 300
    //                   0 323
    //                   1 330
    //                   2 337
    //                   3 344;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_344;
_L3:
        byte byte1 = 65;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 75;
          goto _L9
_L5:
        byte1 = 30;
          goto _L9
_L6:
        byte1 = 25;
          goto _L9
        byte1 = 69;
          goto _L9
    }
}
