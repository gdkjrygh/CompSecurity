// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.d;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class e
{

    public static boolean a(String s)
    {
        if (s == null)
        {
            return false;
        }
        s = new File(s);
        if (!s.exists())
        {
            boolean flag;
            try
            {
                flag = s.mkdir();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return false;
            }
            return flag;
        } else
        {
            return true;
        }
    }

    public static byte[] b(String s)
    {
        Object obj1;
        Object obj2;
        Object obj3;
        obj2 = null;
        obj3 = null;
        obj1 = null;
        if (s != null) goto _L2; else goto _L1
_L1:
        return ((byte []) (obj1));
_L2:
        Object obj = new FileInputStream(s);
        int i = ((FileInputStream) (obj)).available();
        s = obj3;
        if (i == 0) goto _L4; else goto _L3
_L3:
        s = new byte[i];
        i = 0;
_L5:
        int j = ((FileInputStream) (obj)).read();
        if (j == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        s[i] = (byte)j;
        i++;
        if (true) goto _L5; else goto _L4
        s;
        obj = null;
_L10:
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
        }
        throw s;
        s;
        obj = null;
_L12:
        if (obj == null) goto _L1; else goto _L6
_L6:
        ((FileInputStream) (obj)).close();
        return null;
        s;
        obj = obj2;
_L8:
        s.printStackTrace();
        return ((byte []) (obj));
        s;
        obj = null;
_L11:
        if (obj == null) goto _L1; else goto _L7
_L7:
        ((FileInputStream) (obj)).close();
        return null;
        s;
        obj = obj2;
          goto _L8
_L4:
        obj1 = s;
        if (obj == null) goto _L1; else goto _L9
_L9:
        ((FileInputStream) (obj)).close();
        return s;
        Exception exception;
        exception;
        obj = s;
        s = exception;
          goto _L8
        s;
          goto _L10
        s;
          goto _L11
        s;
          goto _L12
    }
}
