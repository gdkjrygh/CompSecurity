// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.e;

import com.gau.go.launcherex.gowidget.download.e;
import com.gau.go.launcherex.gowidget.download.f;
import com.gtp.a.a.a.d;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipException;

// Referenced classes of package com.go.weatherex.e:
//            a

class b
    implements f
{

    final boolean a;
    final a b;

    b(a a1, boolean flag)
    {
        b = a1;
        a = flag;
        super();
    }

    public void a(e e1)
    {
    }

    public void b(e e1)
    {
    }

    public void c(e e1)
    {
        if (e1.g() == null) goto _L2; else goto _L1
_L1:
        File file = new File(e1.g());
        if (file == null || !file.exists()) goto _L2; else goto _L3
_L3:
        StringBuilder stringbuilder = (new StringBuilder()).append(a.c);
        if (!a) goto _L5; else goto _L4
_L4:
        e1 = com.go.weatherex.e.a.a(b);
_L10:
        com.jiubang.commerce.utils.f.a(stringbuilder.append(e1).append(File.separator).toString(), true);
        stringbuilder = (new StringBuilder()).append(a.c);
        if (!a) goto _L7; else goto _L6
_L6:
        e1 = com.go.weatherex.e.a.a(b);
_L8:
        com.gtp.a.a.a.d.a(file, stringbuilder.append(e1).append(File.separator).toString());
        return;
_L5:
        try
        {
            e1 = com.go.weatherex.e.a.b(b);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            e1.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            e1.printStackTrace();
        }
          goto _L2
_L7:
        e1 = com.go.weatherex.e.a.b(b);
          goto _L8
_L2:
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void d(e e1)
    {
    }

    public void e(e e1)
    {
    }

    public void f(e e1)
    {
    }

    public void g(e e1)
    {
    }

    public void h(e e1)
    {
    }
}
