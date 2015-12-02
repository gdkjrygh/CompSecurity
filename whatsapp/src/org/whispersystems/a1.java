// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

// Referenced classes of package org.whispersystems:
//            L, bH

public class a1
{

    public static boolean a;

    private static String a(Throwable throwable)
    {
        boolean flag = a;
        if (throwable == null)
        {
            return "";
        }
        Object obj = throwable;
        do
        {
            if (obj == null)
            {
                break;
            }
            if (obj instanceof UnknownHostException)
            {
                return "";
            }
            obj = ((Throwable) (obj)).getCause();
        } while (!flag);
        obj = new StringWriter();
        PrintWriter printwriter = new PrintWriter(((java.io.Writer) (obj)));
        throwable.printStackTrace(printwriter);
        printwriter.flush();
        return ((StringWriter) (obj)).toString();
    }

    private static void a(int i, String s, String s1)
    {
        bH bh = L.a();
        if (bh != null)
        {
            bh.a(i, s, s1);
        }
    }

    public static void a(String s, String s1)
    {
        a(5, s, s1);
    }

    public static void a(String s, Throwable throwable)
    {
        a(5, s, a(throwable));
    }
}
