// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.ads;

import android.net.Uri;

// Referenced classes of package com.google.android.ads:
//            p, q

public final class t
{

    private String a;
    private String b;
    private String c[] = {
        ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"
    };
    private q d;
    private final p e = new p();

    public t(q q)
    {
        a = "googleads.g.doubleclick.net";
        b = "/pagead/ads";
        d = q;
    }

    public final q a()
    {
        return d;
    }

    public final void a(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public final boolean a(Uri uri)
    {
label0:
        {
            boolean flag1 = false;
            if (uri == null)
            {
                throw new NullPointerException();
            }
            boolean flag = flag1;
            boolean flag2;
            try
            {
                if (!uri.getHost().equals(a))
                {
                    break label0;
                }
                flag2 = uri.getPath().equals(b);
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                return false;
            }
            flag = flag1;
            if (flag2)
            {
                flag = true;
            }
        }
        return flag;
    }
}
