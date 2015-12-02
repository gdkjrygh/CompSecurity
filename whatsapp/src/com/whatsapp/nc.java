// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            jz, au5, f4

class nc
    implements Runnable
{

    final jz a;
    final File b;

    nc(jz jz1, File file)
    {
        a = jz1;
        b = file;
        super();
    }

    public void run()
    {
        try
        {
            f4.a(a.a, new au5(b));
            FileOutputStream fileoutputstream = new FileOutputStream(a.a.c());
            f4.a(f4.b(a.a), fileoutputstream);
            f4.b(a.a).close();
            f4.a(a.a, null);
            fileoutputstream.close();
        }
        catch (IOException ioexception)
        {
            Log.a(ioexception);
        }
        b.delete();
    }
}
