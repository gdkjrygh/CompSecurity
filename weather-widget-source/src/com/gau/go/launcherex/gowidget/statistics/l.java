// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.statistics;

import android.content.Context;
import com.gtp.a.a.a.a;
import com.gtp.a.a.b.c;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.gau.go.launcherex.gowidget.statistics:
//            i, b, h

class l
    implements Runnable
{

    final i a;

    l(i j)
    {
        a = j;
        super();
    }

    public void run()
    {
        long l1;
        long l2;
        long l3;
        l1 = 0x1b77400L;
        l2 = System.currentTimeMillis();
        l3 = i.e(a);
        if (l3 != 0L && l2 - l3 < 0x1b77400L && l2 - l3 > 0L) goto _L2; else goto _L1
_L1:
        com.gtp.a.a.a.a.a().a("\u5F00\u542F\u7EBF\u7A0B\u542F\u52A8\u4E0A\u4F20", "statistics_log.txt");
        Object obj = i.b(a).openFileInput("network_time_and_status_statistics.txt");
        Object obj1 = new InputStreamReader(((java.io.InputStream) (obj)), "UTF-8");
        Object obj5 = new BufferedReader(((java.io.Reader) (obj1)));
        Object obj2;
        Object obj3;
        Object obj4;
        obj4 = obj5;
        obj3 = obj1;
        obj2 = obj;
        Object obj7 = new StringBuilder();
_L4:
        obj4 = obj5;
        obj3 = obj1;
        obj2 = obj;
        Object obj6 = ((BufferedReader) (obj5)).readLine();
        if (obj6 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj4 = obj5;
        obj3 = obj1;
        obj2 = obj;
        ((StringBuilder) (obj7)).append((new StringBuilder()).append(((String) (obj6))).append("\r\n").toString());
        if (true) goto _L4; else goto _L3
        obj6;
_L15:
        obj4 = obj5;
        obj3 = obj1;
        obj2 = obj;
        ((UnsupportedEncodingException) (obj6)).printStackTrace();
        if (obj5 == null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        ((BufferedReader) (obj5)).close();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        ((InputStreamReader) (obj1)).close();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        ((FileInputStream) (obj)).close();
        boolean flag = false;
_L7:
        if (!flag) goto _L6; else goto _L5
_L5:
        com.gtp.a.a.a.a.a().a("\u4E0A\u4F20\u6210\u529F\uFF0C\u6E05\u9664\u672C\u6B21\u6570\u636E", "statistics_log.txt");
        c.a("CYN", "\u4E0A\u4F20\u6210\u529F\uFF0C\u6E05\u9664\u672C\u6B21\u6570\u636E");
        obj = i.b(a).openFileOutput("network_time_and_status_statistics.txt", 0);
        Exception exception;
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
        }
_L9:
        com.gau.go.launcherex.gowidget.statistics.i.a(a, l2);
_L10:
        i.b(a, l1);
        return;
_L3:
        obj4 = obj5;
        obj3 = obj1;
        obj2 = obj;
        obj6 = ((StringBuilder) (obj7)).toString();
        obj4 = obj5;
        obj3 = obj1;
        obj2 = obj;
        obj7 = URLEncoder.encode(((String) (obj6)), "UTF-8");
        obj6 = obj7;
_L8:
        obj7 = obj6;
        if (obj6 == null)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        obj4 = obj5;
        obj3 = obj1;
        obj2 = obj;
        obj7 = com.gau.go.launcherex.gowidget.statistics.b.a(((String) (obj6)), "lvsiqiaoil611230");
        obj4 = obj5;
        obj3 = obj1;
        obj2 = obj;
        flag = com.gau.go.launcherex.gowidget.statistics.h.a(((String) (obj7)), i.b(a), true);
        if (obj5 == null)
        {
            break MISSING_BLOCK_LABEL_376;
        }
        ((BufferedReader) (obj5)).close();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_384;
        }
        ((InputStreamReader) (obj1)).close();
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
          goto _L7
        exception;
        obj4 = obj5;
        obj3 = obj1;
        obj2 = obj;
        exception.printStackTrace();
          goto _L8
        obj;
        ((IOException) (obj)).printStackTrace();
        flag = false;
          goto _L7
        obj6;
        obj5 = null;
        obj1 = null;
        obj = null;
_L13:
        obj4 = obj5;
        obj3 = obj1;
        obj2 = obj;
        ((FileNotFoundException) (obj6)).printStackTrace();
        if (obj5 == null)
        {
            break MISSING_BLOCK_LABEL_466;
        }
        ((BufferedReader) (obj5)).close();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_474;
        }
        ((InputStreamReader) (obj1)).close();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_482;
        }
        ((FileInputStream) (obj)).close();
        flag = false;
          goto _L7
        obj;
        ((IOException) (obj)).printStackTrace();
        flag = false;
          goto _L7
        obj6;
        obj5 = null;
        obj1 = null;
        obj = null;
_L12:
        obj4 = obj5;
        obj3 = obj1;
        obj2 = obj;
        ((IOException) (obj6)).printStackTrace();
        if (obj5 == null)
        {
            break MISSING_BLOCK_LABEL_532;
        }
        ((BufferedReader) (obj5)).close();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_540;
        }
        ((InputStreamReader) (obj1)).close();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_548;
        }
        ((FileInputStream) (obj)).close();
        flag = false;
          goto _L7
        obj;
        ((IOException) (obj)).printStackTrace();
        flag = false;
          goto _L7
        obj5;
        obj4 = null;
        obj1 = null;
        obj = null;
_L11:
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_584;
        }
        ((BufferedReader) (obj4)).close();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_592;
        }
        ((InputStreamReader) (obj1)).close();
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw obj5;
        obj;
        ((FileNotFoundException) (obj)).printStackTrace();
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
        }
          goto _L9
        obj1;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
        }
        throw obj1;
_L6:
        com.gtp.a.a.a.a.a().a("\u4E0A\u4F20\u4E0D\u6210\u529F\uFF0C\u672C\u6B21\u6570\u636E\u4FDD\u7559", "statistics_log.txt");
        c.a("CYN", "\u4E0A\u4F20\u4E0D\u6210\u529F\uFF0C\u672C\u6B21\u6570\u636E\u4FDD\u7559");
        l1 = 0x6ddd00L;
          goto _L10
_L2:
        l1 = 0x1b77400L - (l2 - l3);
          goto _L10
        obj5;
        obj4 = null;
        obj1 = null;
          goto _L11
        obj5;
        obj4 = null;
          goto _L11
        obj5;
        obj1 = obj3;
        obj = obj2;
          goto _L11
        obj6;
        obj5 = null;
        obj1 = null;
          goto _L12
        obj6;
        obj5 = null;
          goto _L12
        obj6;
          goto _L12
        obj6;
        obj5 = null;
        obj1 = null;
          goto _L13
        obj6;
        obj5 = null;
          goto _L13
        obj6;
          goto _L13
        obj6;
        obj5 = null;
        obj1 = null;
        obj = null;
        continue; /* Loop/switch isn't completed */
        obj6;
        obj5 = null;
        obj1 = null;
        continue; /* Loop/switch isn't completed */
        obj6;
        obj5 = null;
        if (true) goto _L15; else goto _L14
_L14:
    }
}
