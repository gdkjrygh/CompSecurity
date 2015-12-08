// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v7.internal.widget:
//            p, l, n, o, 
//            m

public class k extends DataSetObservable
{

    private static final String a = android/support/v7/internal/widget/k.getSimpleName();
    private static final Object b = new Object();
    private static final Map c = new HashMap();
    private final Object d;
    private final List e;
    private final List f;
    private final Context g;
    private final String h;
    private Intent i;
    private m j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private o p;

    static Context a(k k1)
    {
        return k1.g;
    }

    static boolean a(k k1, boolean flag)
    {
        k1.l = true;
        return true;
    }

    private boolean a(n n1)
    {
        boolean flag = f.add(n1);
        if (flag)
        {
            n = true;
            g();
            if (!m)
            {
                throw new IllegalStateException("No preceding call to #readHistoricalData");
            }
            if (n)
            {
                n = false;
                if (!TextUtils.isEmpty(h))
                {
                    if (android.os.Build.VERSION.SDK_INT >= 11)
                    {
                        (new p(this, (byte)0)).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Object[] {
                            new ArrayList(f), h
                        });
                    } else
                    {
                        (new p(this, (byte)0)).execute(new Object[] {
                            new ArrayList(f), h
                        });
                    }
                }
            }
            f();
            notifyChanged();
        }
        return flag;
    }

    static String b(k k1)
    {
        return k1.h;
    }

    static String d()
    {
        return a;
    }

    private void e()
    {
        boolean flag1 = true;
        boolean flag;
        if (o && i != null)
        {
            o = false;
            e.clear();
            List list = g.getPackageManager().queryIntentActivities(i, 0);
            int j1 = list.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ResolveInfo resolveinfo = (ResolveInfo)list.get(i1);
                e.add(new l(this, resolveinfo));
            }

            flag = true;
        } else
        {
            flag = false;
        }
        if (l && n && !TextUtils.isEmpty(h))
        {
            l = false;
            m = true;
            h();
        } else
        {
            flag1 = false;
        }
        g();
        if (flag | flag1)
        {
            f();
            notifyChanged();
        }
    }

    private boolean f()
    {
        if (j != null && i != null && !e.isEmpty() && !f.isEmpty())
        {
            Object obj = j;
            obj = i;
            obj = e;
            Collections.unmodifiableList(f);
            return true;
        } else
        {
            return false;
        }
    }

    private void g()
    {
        int j1 = f.size() - k;
        if (j1 > 0)
        {
            n = true;
            int i1 = 0;
            while (i1 < j1) 
            {
                f.remove(0);
                i1++;
            }
        }
    }

    private void h()
    {
        Object obj;
        Object obj1;
        Exception exception;
        List list;
        int i1;
        try
        {
            obj = g.openFileInput(h);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            return;
        }
        obj1 = Xml.newPullParser();
        ((XmlPullParser) (obj1)).setInput(((java.io.InputStream) (obj)), null);
        i1 = 0;
_L1:
        if (i1 == 1 || i1 == 2)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        i1 = ((XmlPullParser) (obj1)).next();
          goto _L1
        if (!"historical-records".equals(((XmlPullParser) (obj1)).getName()))
        {
            throw new XmlPullParserException("Share records file does not start with historical-records tag.");
        }
          goto _L2
        obj1;
        Log.e(a, (new StringBuilder("Error reading historical recrod file: ")).append(h).toString(), ((Throwable) (obj1)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ((FileInputStream) (obj)).close();
_L6:
        return;
_L2:
        list = f;
        list.clear();
_L4:
        i1 = ((XmlPullParser) (obj1)).next();
        if (i1 == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == 3 || i1 == 4) goto _L4; else goto _L3
_L3:
        if (!"historical-record".equals(((XmlPullParser) (obj1)).getName()))
        {
            throw new XmlPullParserException("Share records file not well-formed.");
        }
        break MISSING_BLOCK_LABEL_211;
        obj1;
        Log.e(a, (new StringBuilder("Error reading historical recrod file: ")).append(h).toString(), ((Throwable) (obj1)));
        if (obj == null) goto _L6; else goto _L5
_L5:
        try
        {
            ((FileInputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        list.add(new n(((XmlPullParser) (obj1)).getAttributeValue(null, "activity"), Long.parseLong(((XmlPullParser) (obj1)).getAttributeValue(null, "time")), Float.parseFloat(((XmlPullParser) (obj1)).getAttributeValue(null, "weight"))));
          goto _L4
        exception;
        IOException ioexception;
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            catch (IOException ioexception1) { }
        }
        throw exception;
        if (obj == null) goto _L6; else goto _L7
_L7:
        try
        {
            ((FileInputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            return;
        }
        ioexception;
    }

    public final int a()
    {
        int i1;
        synchronized (d)
        {
            e();
            i1 = e.size();
        }
        return i1;
    }

    public final int a(ResolveInfo resolveinfo)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        List list;
        int j1;
        e();
        list = e;
        j1 = list.size();
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((l)list.get(i1)).a != resolveinfo)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        obj;
        JVM INSTR monitorexit ;
        return i1;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        return -1;
        resolveinfo;
        throw resolveinfo;
    }

    public final ResolveInfo a(int i1)
    {
        ResolveInfo resolveinfo;
        synchronized (d)
        {
            e();
            resolveinfo = ((l)e.get(i1)).a;
        }
        return resolveinfo;
    }

    public final Intent b(int i1)
    {
label0:
        {
            synchronized (d)
            {
                if (i != null)
                {
                    break label0;
                }
            }
            return null;
        }
        Object obj1;
        Intent intent;
        e();
        obj1 = (l)e.get(i1);
        obj1 = new ComponentName(((l) (obj1)).a.activityInfo.packageName, ((l) (obj1)).a.activityInfo.name);
        intent = new Intent(i);
        intent.setComponent(((ComponentName) (obj1)));
        if (p == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        new Intent(intent);
        if (!p.a())
        {
            break MISSING_BLOCK_LABEL_117;
        }
        obj;
        JVM INSTR monitorexit ;
        return null;
        a(new n(((ComponentName) (obj1)), System.currentTimeMillis(), 1.0F));
        obj;
        JVM INSTR monitorexit ;
        return intent;
        exception;
        throw exception;
    }

    public final ResolveInfo b()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        ResolveInfo resolveinfo;
        e();
        if (e.isEmpty())
        {
            break MISSING_BLOCK_LABEL_44;
        }
        resolveinfo = ((l)e.get(0)).a;
        return resolveinfo;
        obj;
        JVM INSTR monitorexit ;
        return null;
        Exception exception;
        exception;
        throw exception;
    }

    public final int c()
    {
        int i1;
        synchronized (d)
        {
            e();
            i1 = f.size();
        }
        return i1;
    }

    public final void c(int i1)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        l l1;
        l l2;
        e();
        l1 = (l)e.get(i1);
        l2 = (l)e.get(0);
        if (l2 == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        float f1 = (l2.b - l1.b) + 5F;
_L1:
        a(new n(new ComponentName(l1.a.activityInfo.packageName, l1.a.activityInfo.name), System.currentTimeMillis(), f1));
        obj;
        JVM INSTR monitorexit ;
        return;
        f1 = 1.0F;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

}
