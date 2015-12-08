// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.sessionm.core.StatsCollector;
import com.sessionm.net.Request;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.sessionm.c:
//            c, a, b

public class d
    implements c
{

    private static final String ix = "com.sesisonm.persistentstore.name";
    private static final String iy = "com.sesisonm.persistentstore.istransient";
    private Context cf;
    private c iA;
    private c iz;

    public d(Context context, String s1)
    {
        if (context == null)
        {
            throw new NullPointerException("Store context must not be null.");
        }
        cf = context.getApplicationContext();
        if (cf.getSharedPreferences("com.sesisonm.persistentstore.name", 0).getBoolean("com.sesisonm.persistentstore.istransient", false))
        {
            iA = new a();
            return;
        } else
        {
            iz = new b(context, s1);
            return;
        }
    }

    private void bG()
    {
        try
        {
            android.content.SharedPreferences.Editor editor = cf.getSharedPreferences("com.sesisonm.persistentstore.name", 0).edit();
            editor.putBoolean("com.sesisonm.persistentstore.istransient", true);
            editor.commit();
        }
        catch (Exception exception) { }
        StatsCollector.a(com.sessionm.core.StatsCollector.Stat.eG, 1L);
        iA = new a();
        iz = null;
    }

    public static void t(Context context)
    {
        try
        {
            context = context.getSharedPreferences("com.sesisonm.persistentstore.name", 0).edit();
            context.clear();
            context.commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public long bF()
    {
        if (isTransient())
        {
            return iA.bF();
        } else
        {
            return iz.bF();
        }
    }

    public void close()
    {
        if (iz != null)
        {
            iz.close();
        }
    }

    public long getSize()
    {
        if (isTransient())
        {
            return iA.getSize();
        } else
        {
            return iz.getSize();
        }
    }

    public boolean isTransient()
    {
        return iA != null;
    }

    public boolean l(Request request)
    {
        if (!isTransient()) goto _L2; else goto _L1
_L1:
        iA.l(request);
_L4:
        request.c(this);
        return true;
_L2:
        if (!iz.l(request))
        {
            bG();
            iA.l(request);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean m(Request request)
    {
        if (!isTransient()) goto _L2; else goto _L1
_L1:
        request.c(iA);
        iA.m(request);
_L4:
        request.c(null);
        return true;
_L2:
        request.c(iz);
        if (!iz.m(request))
        {
            bG();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public List r(int i)
    {
        if (!isTransient()) goto _L2; else goto _L1
_L1:
        List list = iA.r(i);
_L4:
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ((Request)iterator.next()).c(this)) { }
        break; /* Loop/switch isn't completed */
_L2:
        list = iz.r(i);
        if (list == null)
        {
            bG();
            list = iA.r(i);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return list;
    }

    public boolean removeAll()
    {
        if (isTransient())
        {
            iA.removeAll();
        } else
        {
            iz.removeAll();
        }
        return true;
    }

    public void s(int i)
    {
        if (isTransient())
        {
            iA.s(i);
            return;
        } else
        {
            iz.s(i);
            return;
        }
    }
}
