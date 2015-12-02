// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.whatsapp.util.a4;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            App

class adh
    implements Runnable
{

    private static final String z;
    final App a;

    adh(App app)
    {
        a = app;
        super();
    }

    public void run()
    {
        ApplicationInfo applicationinfo;
        try
        {
            applicationinfo = a.getPackageManager().getApplicationInfo(a.getPackageName(), 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            throw new Error(namenotfoundexception);
        }
        a4.b(3, z, new File(applicationinfo.dataDir));
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "bn8uOm}:?Aw{g;Ps|=4Do{".toCharArray();
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
    //                   1 91
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 32;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 3;
          goto _L8
_L3:
        byte0 = 30;
          goto _L8
_L4:
        byte0 = 72;
          goto _L8
        byte0 = 90;
          goto _L8
    }
}
