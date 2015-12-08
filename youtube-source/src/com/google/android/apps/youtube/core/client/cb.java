// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.text.TextUtils;
import com.google.android.exoplayer.ExoPlaybackException;
import java.util.Arrays;
import java.util.Locale;

public final class cb
{

    private static final String a[] = {
        "Exception", "Error"
    };

    public static String a(Object obj)
    {
        if (obj == null)
        {
            obj = "null";
        } else
        {
            if (!(obj instanceof Throwable))
            {
                return obj.getClass().getName();
            }
            Object obj1 = (Throwable)obj;
            String s2 = "";
            String s = s2;
            obj = obj1;
            if (obj1 instanceof ExoPlaybackException)
            {
                s = s2;
                obj = obj1;
                if (((Throwable) (obj1)).getCause() != null)
                {
                    obj = ((Throwable) (obj1)).getCause();
                    s = "EPE.";
                }
            }
            s2 = obj.getClass().getName();
            int i = Math.max(s2.lastIndexOf('.'), s2.lastIndexOf('$'));
            obj1 = s2;
            if (i >= 0)
            {
                obj1 = s2.substring(i + 1);
            }
            s = (new StringBuilder()).append(s).append(a(((String) (obj1)))).toString();
            if (((Throwable) (obj)).getStackTrace().length == 0)
            {
                obj = "";
            } else
            {
                String s1 = a(((Throwable) (obj)).getStackTrace()[0].getClassName(), ((Throwable) (obj)).getStackTrace()[0].getMethodName());
                obj = Integer.toString(((Throwable) (obj)).getStackTrace()[0].getLineNumber());
                obj = a(b(s1), ((String) (obj)));
            }
            s = a(s, ((String) (obj)));
            obj = s;
            if (s.length() > 80)
            {
                return s.substring(0, 80);
            }
        }
        return ((String) (obj));
    }

    private static String a(String s)
    {
        String as[] = a;
        int j = as.length;
        int i = 0;
        do
        {
label0:
            {
                String s1 = s;
                if (i < j)
                {
                    s1 = as[i];
                    if (!s.endsWith(s1))
                    {
                        break label0;
                    }
                    s1 = s.substring(0, (s.length() - s1.length()) + 1);
                }
                return s1;
            }
            i++;
        } while (true);
    }

    private static String a(String s, String s1)
    {
        return String.format(Locale.US, "%s.%s", new Object[] {
            s, s1
        });
    }

    private static String b(String s)
    {
        s = s.split("[\\.$]");
        for (int i = 0; i < s.length; i++)
        {
            if (s[i].length() > 2)
            {
                s[i] = s[i].substring(0, 2);
            }
        }

        return TextUtils.join(".", Arrays.asList(s));
    }

}
