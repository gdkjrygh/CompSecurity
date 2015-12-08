// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.util.Log;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

// Referenced classes of package com.google.android.apps.analytics:
//            n, t, s, j, 
//            ae, z, h, v

final class u
    implements Runnable
{

    final t a;
    private final LinkedList b = new LinkedList();

    public u(t t1, n an[])
    {
        a = t1;
        super();
        Collections.addAll(b, an);
    }

    public final n a()
    {
        return (n)b.poll();
    }

    public final void run()
    {
        int i;
        t.a(a, this);
        i = 0;
_L22:
        if (i >= 5 || b.size() <= 0) goto _L2; else goto _L1
_L1:
        long l1 = 0L;
        if (t.a(a) != 500 && t.a(a) != 503) goto _L4; else goto _L3
_L3:
        long l2 = (long)(Math.random() * (double)t.b(a));
        l1 = l2;
        if (t.b(a) >= 256L)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        t.a(a, 2L);
        l1 = l2;
_L16:
        boolean flag;
        Thread.sleep(l1 * 1000L);
        flag = t.c(a).a();
        if (!j.a().d() || !flag)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        Log.v("GoogleAnalyticsTracker", "dispatching hits in dry run mode");
        n an[] = (n[])b.toArray(new n[0]);
        int k = 0;
_L24:
        if (k >= an.length || k >= t.f(a)) goto _L6; else goto _L5
_L5:
        Object obj2;
        int l;
        obj2 = ae.a(an[k].a, System.currentTimeMillis());
        l = ((String) (obj2)).indexOf('?');
        if (l >= 0) goto _L8; else goto _L7
_L7:
        Object obj1 = obj2;
          goto _L9
_L20:
        Object obj;
        if (((String) (obj)).length() >= 2036) goto _L11; else goto _L10
_L10:
        obj1 = new BasicHttpEntityEnclosingRequest("GET", ((String) (obj2)));
_L21:
        String s1 = s.a(t.c(a)).getHostName();
        obj2 = s1;
        if (s.a(t.c(a)).getPort() != 80)
        {
            obj2 = (new StringBuilder()).append(s1).append(":").append(s.a(t.c(a)).getPort()).toString();
        }
        ((HttpEntityEnclosingRequest) (obj1)).addHeader("Host", ((String) (obj2)));
        ((HttpEntityEnclosingRequest) (obj1)).addHeader("User-Agent", t.g(a));
        if (!j.a().d()) goto _L13; else goto _L12
_L12:
        org.apache.http.Header aheader[];
        int i1;
        obj2 = new StringBuffer();
        aheader = ((HttpEntityEnclosingRequest) (obj1)).getAllHeaders();
        i1 = aheader.length;
        l = 0;
_L15:
        if (l >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringBuffer) (obj2)).append(aheader[l].toString()).append("\n");
        l++;
        if (true) goto _L15; else goto _L14
_L4:
        t.b(a, 2L);
          goto _L16
_L2:
        t.d(a).b();
        t.e(a).a();
        t.a(a, null);
        return;
_L8:
        if (l <= 0) goto _L18; else goto _L17
_L17:
        obj = ((String) (obj2)).substring(0, l);
_L23:
        obj1 = obj;
        if (l >= ((String) (obj2)).length() - 2) goto _L9; else goto _L19
_L19:
        aheader = ((String) (obj2)).substring(l + 1);
        obj1 = obj;
        obj = aheader;
          goto _L20
_L11:
        obj1 = new BasicHttpEntityEnclosingRequest("POST", (new StringBuilder("/p")).append(((String) (obj1))).toString());
        ((HttpEntityEnclosingRequest) (obj1)).addHeader("Content-Length", Integer.toString(((String) (obj)).length()));
        ((HttpEntityEnclosingRequest) (obj1)).addHeader("Content-Type", "text/plain");
        ((HttpEntityEnclosingRequest) (obj1)).setEntity(new StringEntity(((String) (obj))));
          goto _L21
_L14:
        ((StringBuffer) (obj2)).append(((HttpEntityEnclosingRequest) (obj1)).getRequestLine().toString()).append("\n");
        Log.i("GoogleAnalyticsTracker", ((StringBuffer) (obj2)).toString());
_L13:
label0:
        {
            if (((String) (obj)).length() > 8192)
            {
                Log.w("GoogleAnalyticsTracker", "Hit too long (> 8192 bytes)--not sent");
                t.h(a).a();
                break MISSING_BLOCK_LABEL_732;
            }
            if (!flag)
            {
                break label0;
            }
            try
            {
                t.h(a).a();
                break MISSING_BLOCK_LABEL_732;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w("GoogleAnalyticsTracker", "Couldn't sleep.", ((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w("GoogleAnalyticsTracker", "Problem with socket or streams.", ((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w("GoogleAnalyticsTracker", "Problem with http streams.", ((Throwable) (obj)));
            }
        }
          goto _L2
        t.d(a).a(((HttpEntityEnclosingRequest) (obj1)));
        break MISSING_BLOCK_LABEL_732;
_L6:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_709;
        }
        t.d(a).a();
        i++;
          goto _L22
_L9:
        obj = "";
          goto _L20
_L18:
        obj = "";
          goto _L23
        k++;
          goto _L24
    }
}
