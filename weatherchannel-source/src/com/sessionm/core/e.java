// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.sessionm.b.a;
import com.sessionm.c.c;
import com.sessionm.net.Request;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;

// Referenced classes of package com.sessionm.core:
//            Session

public class e
{

    static final String TAG = "SessionM.Backlog";
    private static e cG;
    static final String cq = "com.sessionm.session.backlog";
    static final String cr = "com.sessionm.session.backlog.sesisonid";
    static final String cs = "com.sessionm.session.backlog.start.time";
    static final String ct = "com.sessionm.session.backlog.end.time";
    static final String cu = "com.sessionm.session.backlog.max.size";
    static final String cv = "com.sessionm.session.backlog.max.sync.size";
    static final String cw = "com.session.session.backlog.max.session.age";
    static final int cx = 1024;
    static final int cy = 1000;
    static final int cz = 0x93a80;
    private int cA;
    private int cB;
    private String cC;
    private long cD;
    private long cE;
    private long cF;

    public e(Context context)
    {
        if (Log.isLoggable("SessionM.Backlog", 3))
        {
            Log.d("SessionM.Backlog", "Instantiating new request backlog processor.");
        }
        context = context.getSharedPreferences("com.sessionm.session.backlog", 0);
        if (context != null)
        {
            cC = context.getString("com.sessionm.session.backlog.sesisonid", null);
            cD = context.getLong("com.sessionm.session.backlog.start.time", 0L);
            cE = context.getLong("com.sessionm.session.backlog.end.time", 0L);
            cA = context.getInt("com.sessionm.session.backlog.max.size", 1024);
            cB = context.getInt("com.sessionm.session.backlog.max.sync.size", 1000);
            cF = context.getInt("com.session.session.backlog.max.session.age", 0x93a80);
        }
    }

    private void A()
    {
        cE = 0L;
        cD = 0L;
        cC = null;
        Object obj = Session.D().getApplicationContext().getSharedPreferences("com.sessionm.session.backlog", 0);
        if (obj != null)
        {
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).remove("com.sessionm.session.backlog.sesisonid");
            ((android.content.SharedPreferences.Editor) (obj)).remove("com.sessionm.session.backlog.start.time");
            ((android.content.SharedPreferences.Editor) (obj)).remove("com.sessionm.session.backlog.end.time");
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        }
    }

    private a B()
    {
        a a1 = com.sessionm.b.a.aJ();
        a1.put("id", cC);
        a1.put("started_at", cD);
        a1.put("ended_at", cE);
        return a1;
    }

    private List a(c c1)
    {
        ArrayList arraylist;
        Iterator iterator;
        arraylist = new ArrayList();
        c1 = c1.r((int)c1.getSize());
        if (c1 == null)
        {
            return arraylist;
        }
        iterator = c1.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        c1 = (Request)iterator.next();
        if (c1.aS() != com.sessionm.net.Request.Type.gL) goto _L4; else goto _L3
_L3:
        if (c1 != null)
        {
            c1 = c1.aW();
            if (c1 != null)
            {
                c1 = (a[])c1.a("sessions", com/sessionm/b/a);
                if (c1 != null)
                {
                    Collections.addAll(arraylist, c1);
                }
            }
        }
        return arraylist;
_L2:
        c1 = null;
        if (true) goto _L3; else goto _L5
_L5:
    }

    private List a(List list)
    {
        Iterator iterator = list.iterator();
        boolean flag = false;
        int i = 0;
label0:
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                a a1 = (a)iterator.next();
                if (a1.has("started_at"))
                {
                    long l = a1.getLong("started_at");
                    if (System.currentTimeMillis() - l > cF * 1000L)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                }
                if (!flag)
                {
                    continue label0;
                }
                i++;
            } while (true);
        } while (i <= 0);
        return list.subList(i, list.size());
    }

    private boolean b(c c1)
    {
        return c1.bF() > (long)(cA * 1024);
    }

    static e u()
    {
        com/sessionm/core/e;
        JVM INSTR monitorenter ;
        if (cG == null) goto _L2; else goto _L1
_L1:
        e e1 = cG;
_L4:
        com/sessionm/core/e;
        JVM INSTR monitorexit ;
        return e1;
_L2:
        cG = new e(Session.D().getApplicationContext());
        e1 = cG;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static void v()
    {
        Object obj = Session.D().getApplicationContext().getSharedPreferences("com.sessionm.session.backlog", 0);
        if (obj != null)
        {
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).clear();
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        }
    }

    public JSONArray a(c c1, c c2)
    {
        this;
        JVM INSTR monitorenter ;
        if (c1 != null) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("SessionM.Backlog", 5))
        {
            Log.w("SessionM.Backlog", String.format(Locale.US, "Current store was null....not processing backlog.", new Object[0]));
        }
        c1 = null;
_L17:
        this;
        JVM INSTR monitorexit ;
        return c1;
_L2:
        if (c2 != null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        if (Log.isLoggable("SessionM.Backlog", 5))
        {
            Log.w("SessionM.Backlog", String.format(Locale.US, "Backlog store was null....not processing backlog.", new Object[0]));
        }
        c1.removeAll();
        c1 = null;
        continue; /* Loop/switch isn't completed */
        if (c1 != c2)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        Log.w("SessionM.Backlog", String.format(Locale.US, "Backlog and current store are the same....not processing backlog.", new Object[0]));
        c1.removeAll();
        c1 = null;
        continue; /* Loop/switch isn't completed */
        if (c1.getSize() != 0L) goto _L4; else goto _L3
_L3:
        if (Log.isLoggable("SessionM.Backlog", 3))
        {
            Log.d("SessionM.Backlog", String.format(Locale.US, "Nothing in current store to move to backlog.", new Object[0]));
        }
          goto _L5
_L4:
        if (c2.bF() == -1L || !b(c2))
        {
            break MISSING_BLOCK_LABEL_232;
        }
        if (Log.isLoggable("SessionM.Backlog", 3))
        {
            Log.d("SessionM.Backlog", String.format(Locale.US, "Maximum backlog request store size exceeded: %dKB. Do not backlog session requests.", new Object[] {
                Integer.valueOf(cA)
            }));
        }
        c1.removeAll();
        c1 = null;
        continue; /* Loop/switch isn't completed */
        if (cB > 0)
        {
            break MISSING_BLOCK_LABEL_289;
        }
        if (Log.isLoggable("SessionM.Backlog", 3))
        {
            Log.d("SessionM.Backlog", String.format(Locale.US, "Maximum sync batch size is %d. Do not backlog session requests.", new Object[] {
                Integer.valueOf(cB)
            }));
        }
        c1.removeAll();
        c1 = null;
        continue; /* Loop/switch isn't completed */
        List list;
        Object obj;
        Object obj1;
        if (Log.isLoggable("SessionM.Backlog", 3))
        {
            Log.d("SessionM.Backlog", String.format("Moving session store data to backlog. Current session request count: %d, store size: %dB, backlog store size: %dB", new Object[] {
                Long.valueOf(c1.getSize()), Long.valueOf(c1.bF()), Long.valueOf(c2.bF())
            }));
        }
        list = a(c1);
        obj = c1.r((int)c1.getSize());
        obj1 = new ArrayList();
        Iterator iterator = ((List) (obj)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Request request = (Request)iterator.next();
            if (request.aS() == com.sessionm.net.Request.Type.gM)
            {
                ((List) (obj1)).add(B());
                a a1 = request.aW();
                a1.put("z", request.aY());
                a1.put("session[end]", null);
                ((List) (obj1)).add(a1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_481;
        c1;
        throw c1;
        if (((List) (obj1)).size() == 0)
        {
            ((List) (obj1)).add(B());
        }
        list.addAll(((java.util.Collection) (obj1)));
        obj = ((List) (obj)).iterator();
_L9:
        if (!((Iterator) (obj)).hasNext()) goto _L7; else goto _L6
_L6:
        obj1 = (Request)((Iterator) (obj)).next();
        if (((Request) (obj1)).aS() == com.sessionm.net.Request.Type.gM || ((Request) (obj1)).aS() == com.sessionm.net.Request.Type.gN || ((Request) (obj1)).aS() == com.sessionm.net.Request.Type.gL) goto _L9; else goto _L8
_L8:
        if (c2.bF() == -1L || !b(c2)) goto _L11; else goto _L10
_L10:
        if (Log.isLoggable("SessionM.Backlog", 3))
        {
            Log.d("SessionM.Backlog", String.format(Locale.US, "Maximum backlog request store size exceeded: %dKB. Do not backlog session requests.", new Object[] {
                Integer.valueOf(cA)
            }));
        }
        c1.removeAll();
_L7:
        if (Log.isLoggable("SessionM.Backlog", 3))
        {
            Log.d("SessionM.Backlog", String.format(Locale.US, "Backlog store size after processing: %dB", new Object[] {
                Long.valueOf(c2.bF())
            }));
        }
        c1.removeAll();
        A();
        c1 = a(list);
        if (c1.size() <= 0) goto _L13; else goto _L12
_L12:
        c2 = new JSONArray();
        for (c1 = c1.iterator(); c1.hasNext(); c2.put(((a)c1.next()).aL())) { }
          goto _L14
_L11:
        c1.m(((Request) (obj1)));
        c2.l(((Request) (obj1)));
          goto _L9
_L14:
        if (c2.length() > cB)
        {
            c2 = null;
        }
_L15:
        c1 = c2;
        if (!Log.isLoggable("SessionM.Backlog", 3))
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.d("SessionM.Backlog", String.format("%s", new Object[] {
            c2
        }));
        c1 = c2;
        continue; /* Loop/switch isn't completed */
_L13:
        c2 = null;
        if (true) goto _L15; else goto _L5
_L5:
        c1 = null;
        if (true) goto _L17; else goto _L16
_L16:
    }

    public void a(long l)
    {
        cF = l;
    }

    public void g(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = Session.D().getApplicationContext().getSharedPreferences("com.sessionm.session.backlog", 0);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        obj = ((SharedPreferences) (obj)).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putInt("com.sessionm.session.backlog.max.sync.size", i);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        cB = i;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void h(int i)
    {
        if (i == 0)
        {
            return;
        }
        Object obj = Session.D().getApplicationContext().getSharedPreferences("com.sessionm.session.backlog", 0);
        if (obj != null)
        {
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putInt("com.sessionm.session.backlog.max.size", i);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        }
        cA = i;
    }

    public void h(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("SessionM.Backlog", 3))
        {
            Log.d("SessionM.Backlog", String.format(Locale.US, "Notified session id: %s", new Object[] {
                s
            }));
        }
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.length() != 0) goto _L3; else goto _L2
_L2:
        if (Log.isLoggable("SessionM.Backlog", 6))
        {
            Log.e("SessionM.Backlog", "Session id cannot be null");
        }
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (cD == 0L)
        {
            if (Log.isLoggable("SessionM.Backlog", 6))
            {
                Log.e("SessionM.Backlog", "Session start time was not set! This shouldn't happen.");
            }
            w();
        }
        cC = s;
        s = Session.D().getApplicationContext().getSharedPreferences("com.sessionm.session.backlog", 0);
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = s.edit();
        s.putString("com.sessionm.session.backlog.sesisonid", cC);
        s.commit();
        if (true) goto _L5; else goto _L4
_L4:
        s;
        throw s;
    }

    public void w()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (Log.isLoggable("SessionM.Backlog", 3))
        {
            Log.d("SessionM.Backlog", "Notified session started.");
        }
        cD = System.currentTimeMillis();
        obj = Session.D().getApplicationContext().getSharedPreferences("com.sessionm.session.backlog", 0);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        obj = ((SharedPreferences) (obj)).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putLong("com.sessionm.session.backlog.start.time", cD);
        ((android.content.SharedPreferences.Editor) (obj)).remove("com.sessionm.session.backlog.end.time");
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void x()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (Log.isLoggable("SessionM.Backlog", 3))
        {
            Log.d("SessionM.Backlog", "Notified session stopped.");
        }
        if (cD == 0L && Log.isLoggable("SessionM.Backlog", 6))
        {
            Log.e("SessionM.Backlog", "Session start time was not set! This shouldn't happen.");
        }
        cE = System.currentTimeMillis();
        obj = Session.D().getApplicationContext().getSharedPreferences("com.sessionm.session.backlog", 0);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        obj = ((SharedPreferences) (obj)).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putLong("com.sessionm.session.backlog.end.time", cE);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    int y()
    {
        return cA;
    }

    int z()
    {
        return cB;
    }
}
