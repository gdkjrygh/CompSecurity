// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.net.Uri;
import android.os.AsyncTask;
import android.view.View;
import com.whatsapp.App;
import com.whatsapp.og;
import com.whatsapp.util.Log;
import com.whatsapp.util.aj;
import com.whatsapp.util.c1;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.whatsapp.camera:
//            a1, CameraActivity

class h extends AsyncTask
{

    private static final String z;
    final Uri a;
    final a1 b;

    h(a1 a1_1, Uri uri)
    {
        b = a1_1;
        a = uri;
        super();
    }

    protected Throwable a(Void avoid[])
    {
        c1.a(b.c, CameraActivity.j(b.c).a, a);
        return null;
        avoid;
_L2:
        Log.e((new StringBuilder()).append(z).append(avoid.getMessage()).toString());
        return avoid;
        avoid;
        continue; /* Loop/switch isn't completed */
        avoid;
        continue; /* Loop/switch isn't completed */
        avoid;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void a(Throwable throwable)
    {
        int i = CameraActivity.n;
        boolean flag;
        b.c.findViewById(0x7f0b00f9).setVisibility(8);
        flag = throwable instanceof FileNotFoundException;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        App.b(b.c, 0x7f0e0074, 1);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        flag = throwable instanceof OutOfMemoryError;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        App.b(b.c, 0x7f0e0074, 1);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        flag = throwable instanceof IOException;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        App.b(b.c, 0x7f0e0074, 1);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        flag = throwable instanceof aj;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        App.b(b.c, 0x7f0e0074, 1);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        try
        {
            if (throwable instanceof SecurityException)
            {
                App.b(b.c, 0x7f0e02a4, 0);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            throw throwable;
        }
        b.c.finish();
        return;
        throwable;
        try
        {
            throw throwable;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable) { }
        try
        {
            throw throwable;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable) { }
        try
        {
            throw throwable;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable) { }
        try
        {
            throw throwable;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable) { }
        try
        {
            throw throwable;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable) { }
        try
        {
            throw throwable;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable) { }
        try
        {
            throw throwable;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable) { }
        throw throwable;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Throwable)obj);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "q`\030\r@s`\026\034[dh\001\021\035ws\007\007@(!".toCharArray();
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
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 50;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 18;
          goto _L8
_L3:
        byte0 = 1;
          goto _L8
_L4:
        byte0 = 117;
          goto _L8
        byte0 = 104;
          goto _L8
    }
}
