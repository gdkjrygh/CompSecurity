// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.os.Environment;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            c

public final class u
{

    private boolean a;
    private boolean b;
    private File c;

    public u()
    {
        String s;
        byte byte0;
        a = false;
        b = false;
        s = Environment.getExternalStorageState();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 52
    //                   1242932856: 94
    //                   1299749220: 108;
           goto _L1 _L2 _L3
_L1:
        byte0;
        JVM INSTR tableswitch 0 1: default 76
    //                   0 122
    //                   1 135;
           goto _L4 _L5 _L6
_L4:
        b = false;
        a = false;
_L7:
        c = Environment.getExternalStorageDirectory();
        return;
_L2:
        if (s.equals("mounted"))
        {
            byte0 = 0;
        }
          goto _L1
_L3:
        if (s.equals("mounted_ro"))
        {
            byte0 = 1;
        }
          goto _L1
_L5:
        b = true;
        a = true;
          goto _L7
_L6:
        a = true;
        b = false;
          goto _L7
    }

    public final void a(String s)
    {
        c = new File(s);
    }

    public final void a(String s, byte abyte0[])
    {
        Object obj;
        if (!a || !b)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        obj = null;
        if (!c.mkdirs() && !c.isDirectory())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        s = new FileOutputStream(new File(c, s));
        s.write(abyte0);
        obj = s;
        com.paypal.android.sdk.onetouch.core.c.a(((java.io.Closeable) (obj)));
        return;
        s;
        obj = null;
        abyte0 = s;
_L2:
        com.paypal.android.sdk.onetouch.core.c.a(((java.io.Closeable) (obj)));
        throw abyte0;
        abyte0;
        obj = s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final String b(String s)
    {
        byte abyte0[];
        byte abyte1[];
        abyte1 = new byte[1024];
        abyte0 = abyte1;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        s = new FileInputStream(new File(c, s));
        int i;
        abyte0 = new ByteArrayOutputStream();
        i = s.read(abyte1, 0, 1024);
_L1:
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        abyte0.write(abyte1, 0, i);
        i = s.read(abyte1, 0, 1024);
          goto _L1
        abyte0 = abyte0.toByteArray();
        com.paypal.android.sdk.onetouch.core.c.a(s);
        return new String(abyte0, "UTF-8");
        s;
        s = null;
_L5:
        com.paypal.android.sdk.onetouch.core.c.a(s);
        return "";
        Object obj;
        obj;
        s = null;
_L3:
        com.paypal.android.sdk.onetouch.core.c.a(s);
        throw obj;
        obj;
        if (true) goto _L3; else goto _L2
_L2:
        obj;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
