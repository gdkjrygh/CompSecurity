// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.a;

import com.jiubang.playsdk.d.d;
import com.jiubang.playsdk.main.b;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.playsdk.a:
//            r, y

public class c
    implements r
{

    public c()
    {
    }

    public d a(String s)
    {
        String s1;
        s1 = new String(com.jiubang.playsdk.f.c.a((new StringBuilder()).append(a()).append(s).toString()));
        s = new d();
        s.a(s1);
        return s;
        Exception exception;
        exception;
        s = null;
_L2:
        exception.printStackTrace();
        return s;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String a()
    {
        String s = "";
        int i;
        if (y.a().b() != null)
        {
            i = y.a().b().l();
        } else
        {
            i = 80;
        }
        if (i != 80) goto _L2; else goto _L1
_L1:
        s = "sms";
_L4:
        return (new StringBuilder()).append(b.c).append(s).append("/").toString();
_L2:
        if (i == 81)
        {
            s = "keyboard";
        } else
        if (i == 84)
        {
            s = "weather";
        } else
        if (i == 83)
        {
            s = "locker";
        } else
        if (i == 82)
        {
            s = "launcher";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean a(String s, d d1)
    {
        try
        {
            com.jiubang.playsdk.f.c.a(d1.i().toString().getBytes(), (new StringBuilder()).append(a()).append(s).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean b(String s)
    {
        return com.jiubang.playsdk.f.c.c((new StringBuilder()).append(a()).append(s).toString());
    }

    public boolean c(String s)
    {
        return com.jiubang.playsdk.f.c.b((new StringBuilder()).append(a()).append(s).toString());
    }
}
