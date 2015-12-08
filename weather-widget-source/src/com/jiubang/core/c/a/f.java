// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.c.a;

import android.text.TextUtils;
import com.gtp.a.a.b.c;
import java.io.File;

// Referenced classes of package com.jiubang.core.c.a:
//            b, a, d

class f
    implements Runnable
{

    final b a;
    private final a b;

    public f(b b1, a a1)
    {
        a = b1;
        super();
        b = a1;
    }

    public void run()
    {
        int i = -1;
        if (com.jiubang.core.c.a.b.a(a)) goto _L2; else goto _L1
_L1:
        b.f = 2;
        c.a("new_download", (new StringBuilder()).append("new Download -> ").append(b.a).toString());
        Object obj = b.b;
        String s = b.a;
        String s1 = b.c;
        if (!TextUtils.isEmpty(((CharSequence) (obj))) && !TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
        {
            obj = new File(((String) (obj)));
            if (!((File) (obj)).exists())
            {
                ((File) (obj)).mkdirs();
            }
            obj = b;
            if (com.jiubang.core.c.a.b.a(a, b, s, b.a()))
            {
                i = 1;
            }
            obj.f = i;
        } else
        {
            b.f = -1;
        }
        c.a("new_download", (new StringBuilder()).append("mDownloadBean.mStatus = ").append(b.f).toString());
        b.f;
        JVM INSTR tableswitch -1 1: default 216
    //                   -1 255
    //                   0 216
    //                   1 228;
           goto _L2 _L3 _L2 _L4
_L2:
        return;
_L4:
        com.jiubang.core.c.a.b.b(a).sendMessage(com.jiubang.core.c.a.b.b(a).obtainMessage(2, b));
        return;
_L3:
        com.jiubang.core.c.a.b.b(a).sendMessage(com.jiubang.core.c.a.b.b(a).obtainMessage(3, b));
        return;
    }
}
