// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.a;

import android.text.TextUtils;
import com.jiubang.playsdk.a.a.c;
import com.jiubang.playsdk.d.f;
import com.jiubang.playsdk.f.l;
import java.util.Map;

// Referenced classes of package com.jiubang.playsdk.a:
//            t, w

public class n
    implements t
{

    public n()
    {
    }

    private String b(byte abyte0[], boolean flag)
    {
        if (flag)
        {
            abyte0 = l.a(abyte0);
        } else
        {
            abyte0 = new String(abyte0);
        }
        if (TextUtils.isEmpty(abyte0))
        {
            throw new w("\u6570\u636E\u4E3A\u7A7A");
        } else
        {
            return abyte0;
        }
    }

    public c a(byte abyte0[], boolean flag)
    {
        return f.b(b(abyte0, flag));
    }

    public Map a(byte abyte0[], boolean flag, long l1, int i, int j, int k)
    {
        return f.a(b(abyte0, flag), l1, i, j, k);
    }

    public Object b(byte abyte0[], boolean flag, long l1, int i, int j, int k)
    {
        return a(abyte0, flag, l1, i, j, k);
    }
}
