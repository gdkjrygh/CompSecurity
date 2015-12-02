// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.net.Uri;
import android.os.AsyncTask;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.aj;
import com.whatsapp.util.c1;
import com.whatsapp.util.y;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            qa, p5, MediaData, App, 
//            aoz

class b9 extends AsyncTask
{

    private static final String z[];
    qa a;
    final p5 b;

    b9(p5 p5_1)
    {
        b = p5_1;
        super();
        a = qa.SUCCESS;
    }

    protected String a(Void avoid[])
    {
        Uri uri;
        byte abyte0[];
        try
        {
            if (b.k.w != 1)
            {
                break MISSING_BLOCK_LABEL_179;
            }
            avoid = p5.c(b).file;
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            throw avoid;
        }
        if (avoid != null)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        uri = Uri.parse(b.k.L);
        synchronized (p5.d())
        {
            abyte0 = c1.a(App.au, uri, p5.c(b));
            b.k.a(abyte0);
            b.k.L = p5.c(b).file.getName();
            b.k.t = p5.c(b).file.length();
            p5.c(b).fileSize = b.k.t;
        }
        y.b(b.k);
        p5.c(b).autodownloadRetryEnabled = true;
        App.ah.a(b.k, true, -1);
_L2:
        String s;
        boolean flag;
        try
        {
            if (a != qa.SUCCESS)
            {
                break; /* Loop/switch isn't completed */
            }
            avoid = b.j();
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            throw avoid;
        }
        return avoid;
        exception;
        avoid;
        JVM INSTR monitorexit ;
        throw exception;
        avoid;
        try
        {
            Log.e((new StringBuilder()).append(z[1]).append(avoid.toString()).toString());
            s = avoid.getMessage();
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            try
            {
                throw avoid;
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[]) { }
            try
            {
                throw avoid;
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                throw avoid;
            }
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        flag = avoid.getMessage().contains(z[0]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        a = qa.FAILED_INSUFFICIENT_SPACE;
        if (App.am == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        a = qa.FAILED_IO;
        continue; /* Loop/switch isn't completed */
        avoid;
        Log.e((new StringBuilder()).append(z[2]).append(avoid.toString()).toString());
        a = qa.FAILED_BAD_MEDIA;
        continue; /* Loop/switch isn't completed */
        avoid;
        Log.e((new StringBuilder()).append(z[4]).append(avoid.toString()).toString());
        a = qa.FAILED_OOM;
        continue; /* Loop/switch isn't completed */
        avoid;
        Log.e((new StringBuilder()).append(z[3]).append(avoid.toString()).toString());
        a = qa.FAILED_NO_PERMISSIONS;
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

    public void a(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        p5 p5_1 = b;
        if (a == qa.SUCCESS) goto _L4; else goto _L3
_L3:
        s = a;
_L5:
        p5_1.a(s);
        return;
        s;
        throw s;
_L4:
        s = qa.FAILED_GENERIC;
        if (true) goto _L5; else goto _L2
_L2:
        p5.a(b, s);
        return;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    public void onPostExecute(Object obj)
    {
        a((String)obj);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "d)J\002/K%\017";
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
                obj = "G#\016\030>_6\006\036>Ni\032\003:Z'\030\0246G'\r\024p\n";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "G#\016\030>_6\006\036>Ni\032\003:Z'\030\0246G'\r\024p\n";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "G#\016\030>_6\006\036>Ni\032\003:Z'\030\0246G'\r\024p\n";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "G#\016\030>_6\006\036>Ni\032\003:Z'\030\0246G'\r\024p\n";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 95;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 42;
          goto _L9
_L5:
        byte1 = 70;
          goto _L9
_L6:
        byte1 = 106;
          goto _L9
        byte1 = 113;
          goto _L9
    }
}
