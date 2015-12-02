// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class djt
    implements gqy
{

    private final gpt a;
    private final Pattern b = Pattern.compile("[A-Za-z0-9]{8}-[A-Za-z0-9]{4}-[A-Za-z0-9]{4}-[A-Za-z0-9]{4}-[A-Za-z0-9]{12}");
    private boolean c;

    public djt(gpt gpt1)
    {
        a = gpt1;
    }

    private static int a(gqo gqo1)
    {
        gqo1 = gqo1.e();
        if (gqo1 == null)
        {
            return 0;
        } else
        {
            return gqo1.length();
        }
    }

    private static int a(gqq gqq1)
    {
        Object obj = null;
        try
        {
            gqq1 = gqq1.g();
        }
        // Misplaced declaration of an exception variable
        catch (gqq gqq1)
        {
            gqq1 = obj;
        }
        if (gqq1 == null)
        {
            return 0;
        } else
        {
            return gqq1.length();
        }
    }

    private String a(String s)
    {
        if (s == null)
        {
            return "";
        } else
        {
            return b.matcher(s).replaceAll("uuid");
        }
    }

    public final gqq a(gqo gqo1, gqz gqz1)
    {
        if (!c)
        {
            return gqz1.a(gqo1);
        }
        String s = a.a(gpv.b, dju.a);
        int i = a(gqo1);
        a.a(dju.a, s, "method", gqo1.b());
        a.a(dju.a, s, "requestSize", Integer.valueOf(i));
        gqo1 = gqz1.a(gqo1);
        i = a(((gqq) (gqo1)));
        a.a(dju.a, s, "url", gqo1.h());
        a.a(dju.a, s, "code", Integer.valueOf(gqo1.b()));
        a.a(dju.a, s, "responseSize", Integer.valueOf(i));
        try
        {
            gqz1 = URI.create(gqo1.h());
            a.a(dju.a, s, "host", gqz1.getHost());
            a.a(dju.a, s, "path", a(gqz1.getPath()));
        }
        // Misplaced declaration of an exception variable
        catch (gqz gqz1) { }
        a.a(dju.a, s);
        return gqo1;
    }

    public final void a()
    {
        c = true;
    }
}
