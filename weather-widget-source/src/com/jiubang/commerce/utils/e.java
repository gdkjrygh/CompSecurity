// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import android.os.Environment;
import android.text.TextUtils;
import com.jiubang.commerce.ad.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

// Referenced classes of package com.jiubang.commerce.utils:
//            o

public class e
{

    public static String a(String s, boolean flag)
    {
        Object obj1;
        Object obj4;
        obj4 = null;
        obj1 = obj4;
        if (!a()) goto _L2; else goto _L1
_L1:
        if (!TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
        obj1 = obj4;
_L2:
        return ((String) (obj1));
_L4:
        s = new File((new StringBuilder()).append(c.b).append(s).toString());
        obj1 = obj4;
        if (!s.exists()) goto _L2; else goto _L5
_L5:
        Object obj = new FileInputStream(s);
        Object obj3;
        s = new StringWriter();
        obj3 = new InputStreamReader(((InputStream) (obj)), "UTF-8");
        Object obj2;
        obj2 = obj3;
        obj1 = obj;
        char ac[] = new char[4096];
_L7:
        obj2 = obj3;
        obj1 = obj;
        int i = ((InputStreamReader) (obj3)).read(ac);
        if (-1 == i)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = obj3;
        obj1 = obj;
        s.write(ac, 0, i);
        if (true) goto _L7; else goto _L6
        obj1;
        s = ((String) (obj3));
        obj3 = obj1;
_L13:
        obj2 = s;
        obj1 = obj;
        ((Exception) (obj3)).printStackTrace();
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        obj1 = obj4;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return null;
            }
            return null;
        }
          goto _L2
_L6:
        if (!flag) goto _L9; else goto _L8
_L8:
        obj2 = obj3;
        obj1 = obj;
        s = o.b(s.toString());
_L10:
        if (obj3 != null)
        {
            try
            {
                ((InputStreamReader) (obj3)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
            }
        }
        obj1 = s;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
                return s;
            }
            return s;
        }
          goto _L2
_L9:
        obj2 = obj3;
        obj1 = obj;
        s = s.toString();
          goto _L10
        s;
        obj2 = null;
        obj = null;
_L12:
        if (obj2 != null)
        {
            try
            {
                ((InputStreamReader) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
            }
        }
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
        }
        throw s;
        s;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        s;
        obj = obj1;
        if (true) goto _L12; else goto _L11
_L11:
        obj3;
        s = null;
        obj = null;
          goto _L13
        obj3;
        s = null;
          goto _L13
    }

    public static boolean a()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean a(String s, String s1, boolean flag)
    {
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = flag2;
        if (!a()) goto _L2; else goto _L1
_L1:
        flag1 = flag2;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L3
_L3:
        if (!TextUtils.isEmpty(s1)) goto _L5; else goto _L4
_L4:
        flag1 = flag2;
_L2:
        return flag1;
_L5:
        String s2;
        Object obj1;
        File file;
        s2 = s1;
        if (flag)
        {
            s2 = o.a(s1);
        }
        s1 = new File(c.b);
        if (!s1.exists())
        {
            s1.mkdirs();
        }
        file = new File((new StringBuilder()).append(c.b).append(s).toString());
        s1 = null;
        obj1 = null;
        s = s1;
        if (file.exists())
        {
            break MISSING_BLOCK_LABEL_124;
        }
        s = s1;
        file.createNewFile();
        s = s1;
        s1 = new FileOutputStream(file, false);
        s1.write(s2.getBytes("UTF-8"));
        flag1 = true;
        if (s1 != null)
        {
            try
            {
                s1.flush();
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return true;
            }
            return true;
        }
        if (true) goto _L2; else goto _L6
_L6:
        Object obj;
        obj;
        s1 = obj1;
_L10:
        s = s1;
        ((Exception) (obj)).printStackTrace();
        flag1 = flag2;
        if (s1 == null) goto _L2; else goto _L7
_L7:
        try
        {
            s1.flush();
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return false;
        }
        return false;
        obj;
        s1 = s;
        s = ((String) (obj));
_L9:
        if (s1 != null)
        {
            try
            {
                s1.flush();
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
            }
        }
        throw s;
        s;
        if (true) goto _L9; else goto _L8
_L8:
        obj;
          goto _L10
    }
}
