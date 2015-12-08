// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a;

import android.os.Process;
import android.util.Log;
import com.gau.go.a.a.c;
import com.gau.go.a.c.h;
import com.gau.go.a.f.e;
import java.util.HashSet;

// Referenced classes of package com.gau.go.a:
//            v, e, d

class w extends Thread
{

    final v a;

    w(v v1, String s)
    {
        a = v1;
        super(s);
    }

    public void run()
    {
        HashSet hashset;
        Process.setThreadPriority(11);
        hashset = new HashSet();
        Log.i("TongJiTest", "upload loop start");
_L1:
        if (e.l(a.a))
        {
            e.b(a.a, System.currentTimeMillis());
            e.a("StatisticsManager", "quit post!");
            e.m(a.a);
            Log.i("TongJiTest", "quit loop");
            return;
        }
        Object obj = e.n(a.a).a();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
label0:
        {
            if (!e.a(a.a, hashset))
            {
                break label0;
            }
            e.a("StatisticsManager", "now push data from DB!");
        }
          goto _L1
        try
        {
            e.a("StatisticsManager", "no data quit!");
            e.f(a.a, true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            e.a(((Exception) (obj)));
        }
          goto _L1
label1:
        {
            hashset.add(String.valueOf(((c) (obj)).a));
            if (((c) (obj)).g < 3)
            {
                e.b(a.a, ((c) (obj)));
            }
            if (((c) (obj)).f != 3)
            {
                break label1;
            }
            e.f(a.a).a(((c) (obj)));
            Log.i("TongJiTest", "upload success");
        }
          goto _L1
label2:
        {
            obj.g = ((c) (obj)).g + 1;
            Log.i("TongJiTest", (new StringBuilder()).append("upload failed and retryTime:").append(((c) (obj)).g).toString());
            if (((c) (obj)).g >= 3)
            {
                break label2;
            }
            e.n(a.a).a(((c) (obj)));
        }
          goto _L1
        obj.q = true;
        e.f(a.a).b(((c) (obj)));
        e.f(a.a, true);
        e.a("quit loop");
        Log.i("TongJiTest", "upload failed and exit upload loop");
        return;
    }
}
