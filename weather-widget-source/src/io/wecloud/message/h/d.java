// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.h;

import android.os.Environment;
import io.wecloud.message.e.c;
import java.io.File;
import java.io.IOException;

public class d
{

    private static final String a = io/wecloud/message/h/d.getSimpleName();

    public d()
    {
    }

    public static File a(String s)
    {
        File file = new File(s);
        if (file.isFile() && !file.delete())
        {
            return null;
        }
        if (file.exists())
        {
            break MISSING_BLOCK_LABEL_55;
        }
        if (!file.mkdirs())
        {
            break MISSING_BLOCK_LABEL_80;
        }
        s = new File(s, ".nomedia");
        s.createNewFile();
_L2:
        return file;
        s;
        c.a(a, "", s);
        if (true) goto _L2; else goto _L1
_L1:
        s;
        c.a(a, "", s);
        return null;
    }

    public static boolean a()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }

}
