// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.ggheart.analytic;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.jiubang.ggheart.analytic:
//            b

public class a
{

    private GoogleAnalyticsTracker a;
    private String b;
    private Context c;

    public a(Context context, int i)
    {
        c = context;
        a(i);
    }

    private String a(Context context, int i)
    {
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        if (context != null) goto _L2; else goto _L1
_L1:
        obj1 = obj2;
_L4:
        return ((String) (obj1));
_L2:
        context = context.getResources().openRawResource(i);
        Object obj;
        obj = obj1;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        obj = context;
        byte abyte0[] = new byte[128];
        obj = context;
        i = context.read(abyte0);
        obj = obj1;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        obj = context;
        obj1 = (new String(abyte0, 0, i)).trim();
        obj = obj1;
        obj1 = obj;
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return ((String) (obj));
            }
            return ((String) (obj));
        }
        if (true) goto _L4; else goto _L3
_L3:
        Throwable throwable;
        throwable;
        context = null;
_L8:
        obj = context;
        throwable.printStackTrace();
        throwable = obj2;
        if (context == null) goto _L4; else goto _L5
_L5:
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        return null;
        context;
        obj = null;
_L7:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
        throw context;
        context;
        if (true) goto _L7; else goto _L6
_L6:
        throwable;
          goto _L8
    }

    private void a(int i)
    {
        b = a(c, i);
    }

    public void a()
    {
        if (a == null)
        {
            a = GoogleAnalyticsTracker.getInstance();
            a.setDebug(false);
            a.startNewSession(b, 300, c);
        }
    }

    public void b()
    {
        if (a != null && !com.jiubang.ggheart.analytic.b.a(c))
        {
            a.trackPageView("/GOWeatherIntalled");
            com.jiubang.ggheart.analytic.b.b(c);
        }
    }

    public void c()
    {
        if (a != null)
        {
            a.stopSession();
            a = null;
        }
    }
}
