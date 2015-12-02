// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

// Referenced classes of package com.whatsapp.util:
//            Log

public abstract class bc extends FileInputStream
{

    private long a;

    public bc(File file)
    {
        super(file);
    }

    public abstract boolean a();

    public int read(byte abyte0[], int i, int j)
    {
        boolean flag = Log.f;
_L5:
        if (getChannel().size() >= a + (long)j) goto _L2; else goto _L1
_L1:
        boolean flag1 = a();
        if (flag1) goto _L3; else goto _L2
_L2:
        int k = super.read(abyte0, i, j);
        if (!flag) goto _L4; else goto _L3
_L3:
        Thread.sleep(200L);
          goto _L5
        abyte0;
        i = 0;
_L7:
        return i;
        abyte0;
        throw abyte0;
_L4:
        i = k;
        if (k >= 0)
        {
            try
            {
                a = a + (long)k;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            return k;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }
}
