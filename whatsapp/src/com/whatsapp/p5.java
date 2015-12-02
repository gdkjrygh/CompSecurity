// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import com.whatsapp.fieldstats.ag;
import com.whatsapp.fieldstats.q;
import com.whatsapp.fieldstats.x;
import com.whatsapp.fieldstats.z;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.c1;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import org.apache.http.HttpException;

// Referenced classes of package com.whatsapp:
//            MediaData, App, aoz, uj, 
//            abw, qa, gc, abe, 
//            ft, l1, qh, b9, 
//            asw, ir

public class p5 extends AsyncTask
{

    protected static final LinkedHashMap b;
    private static Timer c;
    private static final Object i;
    protected static final LinkedHashMap n;
    private static final String z[];
    protected boolean a;
    private long d;
    private boolean e;
    protected b f;
    private long g;
    private final long h;
    private TimerTask j;
    protected final c4 k;
    private final MediaData l;
    private boolean m;
    private long o;
    protected int p;
    private gc q;
    private boolean r;

    public p5(c4 c4_1)
    {
        this(c4_1, 0L);
    }

    public p5(c4 c4_1, long l2)
    {
        this(c4_1, 0L, false);
    }

    public p5(c4 c4_1, long l2, boolean flag)
    {
        a = false;
        d = System.currentTimeMillis();
        o = l2;
        k = c4_1;
        l = (MediaData)c4_1.B;
        h = c4_1.t;
        p = 0;
        r = flag;
        if (!flag)
        {
            c4_1.M = 1;
            l.transferring = true;
            l.progress = 0L;
            if (c4_1.w == 1 && l.file == null)
            {
                l.autodownloadRetryEnabled = false;
            }
            App.ah.a(c4_1, false, -1);
        }
    }

    static gc a(p5 p5_1)
    {
        return p5_1.q;
    }

    static gc a(p5 p5_1, gc gc1)
    {
        p5_1.q = gc1;
        return gc1;
    }

    public static void a()
    {
        int j1 = App.am;
        Log.i((new StringBuilder()).append(z[21]).append(n.size()).append(z[22]).append(b.size()).toString());
        p5 ap5[] = (p5[])n.values().toArray(new p5[0]);
        int k1 = ap5.length;
        int i1 = 0;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            ap5[i1].a(false);
            i1++;
        } while (j1 == 0);
        n.clear();
        ap5 = (p5[])b.values().toArray(new p5[0]);
        k1 = ap5.length;
        i1 = 0;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            ap5[i1].a(false);
            i1++;
        } while (j1 == 0);
        b.clear();
    }

    static void a(p5 p5_1, String s)
    {
        p5_1.a(s);
    }

    static void a(p5 p5_1, Object aobj[])
    {
        p5_1.publishProgress(aobj);
    }

    private void a(String s)
    {
        uj uj1;
label0:
        {
            Log.i((new StringBuilder()).append(z[19]).append(k.y).append(z[20]).append(s).toString());
            uj1 = new uj(this);
            uj1.f = k.y.a;
            uj1.e = b();
            uj1.d = c4.a(k.w);
            uj1.b = s;
            if (k.h == null)
            {
                k.h = s;
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (!k.h.equals(s))
            {
                uj1.a = k.h;
            }
        }
        if (k.w == 2 && k.n == 1 && uj1.b != null && uj1.a != null)
        {
            s = uj1.a;
            uj1.a = uj1.b;
            uj1.b = s;
        }
        j = new abw(this);
        c.schedule(j, 20000L);
        com.whatsapp.App.a(uj1);
    }

    static boolean a(p5 p5_1, boolean flag)
    {
        p5_1.m = flag;
        return flag;
    }

    public static boolean a(c4 c4_1)
    {
        return b.containsKey(c4_1.y) || n.containsKey(c4_1.y);
    }

    static TimerTask b(p5 p5_1)
    {
        return p5_1.j;
    }

    static MediaData c(p5 p5_1)
    {
        return p5_1.l;
    }

    static Object d()
    {
        return i;
    }

    public qa a(Void avoid[])
    {
        boolean flag;
        c1.a(App.au);
        if (q != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        flag = a;
        if (flag)
        {
            try
            {
                return qa.SUCCESS;
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                throw avoid;
            }
        } else
        {
            return qa.FAILED_GENERIC;
        }
        avoid;
        throw avoid;
        long l2;
        long l3;
        long l4;
        flag = q.b();
        if (q.a() == 415)
        {
            return qa.FAILED_BAD_MEDIA;
        }
        l2 = o;
        l3 = System.currentTimeMillis();
        l4 = d;
        l2 -= l3 - l4;
        if (l2 <= 0L)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        Thread.sleep(l2);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        avoid = qa.SUCCESS;
        return avoid;
        avoid;
        try
        {
            throw avoid;
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Log.e((new StringBuilder()).append(z[18]).append(k.y).append(" ").append(avoid.toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Log.e((new StringBuilder()).append(z[16]).append(k.y).append(" ").append(avoid.toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Log.e((new StringBuilder()).append(z[17]).append(k.y).append(" ").append(avoid.toString()).toString());
        }
        return qa.FAILED_GENERIC;
        avoid;
        throw avoid;
        avoid = qa.FAILED_GENERIC;
        return avoid;
    }

    public void a(qa qa1)
    {
        int i1;
        int j1;
        i1 = 0;
        j1 = App.am;
        p5 p5_1;
        try
        {
            l.transferring = false;
            Log.i((new StringBuilder()).append(z[4]).append(k.y).append(z[13]).append(n.size()).append(z[9]).append(b.size()).append(z[6]).append(qa1).toString());
            if (j != null)
            {
                j.cancel();
            }
        }
        // Misplaced declaration of an exception variable
        catch (qa qa1)
        {
            throw qa1;
        }
        p5_1 = (p5)n.remove(k.y);
        if (!b.isEmpty())
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)b.entrySet().iterator().next();
            b.remove(entry.getKey());
            ((p5)entry.getValue()).k();
        }
        if (p5_1 == this) goto _L2; else goto _L1
_L1:
        boolean flag;
        try
        {
            qa1 = (new StringBuilder()).append(z[12]).append(k.y).append(" ");
        }
        // Misplaced declaration of an exception variable
        catch (qa qa1)
        {
            try
            {
                throw qa1;
            }
            // Misplaced declaration of an exception variable
            catch (qa qa1)
            {
                throw qa1;
            }
        }
        if (p5_1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Log.i(qa1.append(flag).toString());
_L4:
        return;
_L2:
        boolean flag1;
        try
        {
            flag1 = r;
        }
        // Misplaced declaration of an exception variable
        catch (qa qa1)
        {
            throw qa1;
        }
        if (flag1) goto _L4; else goto _L3
_L3:
        Object obj;
        Exception exception;
        int k1;
        boolean flag2;
        try
        {
            if (qa1 != qa.SUCCESS)
            {
                break MISSING_BLOCK_LABEL_691;
            }
            flag2 = a;
        }
        // Misplaced declaration of an exception variable
        catch (qa qa1)
        {
            throw qa1;
        }
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_691;
        }
        obj = new URL(f.e);
        if (((URL) (obj)).getHost() == null)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        k1 = ((URL) (obj)).getHost().length();
        if (k1 != 0)
        {
            break MISSING_BLOCK_LABEL_372;
        }
        try
        {
            Log.e(z[11]);
            App.ah.a(k, false, -1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            Log.w((new StringBuilder()).append(z[7]).append(exception.toString()).toString());
        }
        Exception exception1;
        try
        {
            exception = f.b;
        }
        // Misplaced declaration of an exception variable
        catch (qa qa1)
        {
            try
            {
                throw qa1;
            }
            // Misplaced declaration of an exception variable
            catch (qa qa1) { }
            try
            {
                throw qa1;
            }
            // Misplaced declaration of an exception variable
            catch (qa qa1)
            {
                throw qa1;
            }
        }
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_408;
        }
        exception = f.e;
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_408;
        }
        if (f.c != 0L)
        {
            break MISSING_BLOCK_LABEL_448;
        }
        Log.e(z[14]);
        App.ah.a(k, false, -1);
        return;
        exception1;
        throw exception1;
        Object obj1;
        Object obj2;
        Object obj3;
        ag ag1;
        byte byte0;
        boolean flag3;
        try
        {
            flag3 = m;
        }
        // Misplaced declaration of an exception variable
        catch (qa qa1)
        {
            try
            {
                throw qa1;
            }
            // Misplaced declaration of an exception variable
            catch (qa qa1) { }
            try
            {
                throw qa1;
            }
            // Misplaced declaration of an exception variable
            catch (qa qa1) { }
            try
            {
                throw qa1;
            }
            // Misplaced declaration of an exception variable
            catch (qa qa1) { }
            try
            {
                throw qa1;
            }
            // Misplaced declaration of an exception variable
            catch (qa qa1) { }
            try
            {
                throw qa1;
            }
            // Misplaced declaration of an exception variable
            catch (qa qa1)
            {
                throw qa1;
            }
        }
        if (flag3)
        {
            break MISSING_BLOCK_LABEL_604;
        }
        flag3 = TextUtils.isEmpty(f.d);
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_489;
        }
        Log.e(z[5]);
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_604;
        }
        flag3 = f.d.equals(k.h);
        if (flag3)
        {
            break MISSING_BLOCK_LABEL_590;
        }
        byte0 = k.w;
        if (byte0 != 2)
        {
            break MISSING_BLOCK_LABEL_539;
        }
        if (k.n == 1)
        {
            break MISSING_BLOCK_LABEL_590;
        }
        Log.w((new StringBuilder()).append(z[10]).append(k.h).append(z[8]).append(f.d).toString());
        k.h = f.d;
        try
        {
            k.t = f.c;
            k.l = f.e;
            k.e = f.b;
            if (k.H == 0)
            {
                k.H = f.f;
            }
        }
        // Misplaced declaration of an exception variable
        catch (qa qa1)
        {
            throw qa1;
        }
        try
        {
            k.M = 2;
            l.transferred = true;
        }
        // Misplaced declaration of an exception variable
        catch (qa qa1)
        {
            throw qa1;
        }
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_699;
        }
        k.M = 0;
        flag3 = isCancelled();
        if (flag3) goto _L6; else goto _L5
_L5:
        obj1 = qa.SUCCESS;
        if (qa1 != obj1)
        {
            try
            {
                if (!r)
                {
                    App.au.ab().post(new abe(this, qa1));
                }
            }
            // Misplaced declaration of an exception variable
            catch (qa qa1)
            {
                throw qa1;
            }
        }
        k.w;
        JVM INSTR tableswitch 1 3: default 780
    //                   1 994
    //                   2 1003
    //                   3 1023;
           goto _L7 _L8 _L9 _L10
_L7:
        obj1 = q.NONE;
_L14:
        try
        {
            obj2 = qa.SUCCESS;
        }
        // Misplaced declaration of an exception variable
        catch (qa qa1)
        {
            try
            {
                throw qa1;
            }
            // Misplaced declaration of an exception variable
            catch (qa qa1)
            {
                throw qa1;
            }
        }
        if (qa1 != obj2)
        {
            break MISSING_BLOCK_LABEL_827;
        }
        if (!a)
        {
            break MISSING_BLOCK_LABEL_827;
        }
        obj2 = q;
        if (obj2 != null)
        {
            obj2 = x.OK;
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_831;
            }
        }
        obj2 = x.DUPLICATE;
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_831;
        }
        obj2 = x.ERROR_UNKNOWN;
        try
        {
            obj3 = App.au;
            ag1 = ag.RETRY_COUNTER;
            flag3 = e;
        }
        // Misplaced declaration of an exception variable
        catch (qa qa1)
        {
            throw qa1;
        }
        if (flag3)
        {
            i1 = 1;
        }
        com.whatsapp.fieldstats.z.a(((android.content.Context) (obj3)), ag1, Integer.valueOf(i1));
        com.whatsapp.ft.a(App.au, ((q) (obj1)), l.forward, ((x) (obj2)), h, System.currentTimeMillis() - g);
        com.whatsapp.fieldstats.z.a(App.au, ag.RETRY_COUNTER);
_L6:
        try
        {
            if (qa1 == qa.FAILED_BAD_MEDIA)
            {
                l.autodownloadRetryEnabled = false;
            }
        }
        // Misplaced declaration of an exception variable
        catch (qa qa1)
        {
            throw qa1;
        }
        obj1 = App.ah;
        obj2 = k;
        obj3 = qa.SUCCESS;
        if (qa1 != obj3) goto _L12; else goto _L11
_L11:
        try
        {
            flag3 = a;
        }
        // Misplaced declaration of an exception variable
        catch (qa qa1)
        {
            throw qa1;
        }
        if (!flag3) goto _L12; else goto _L13
_L13:
        i1 = 1;
_L18:
        ((aoz) (obj1)).a(((c4) (obj2)), true, i1);
        return;
        qa1;
        try
        {
            throw qa1;
        }
        // Misplaced declaration of an exception variable
        catch (qa qa1) { }
        throw qa1;
_L8:
        obj1 = q.PHOTO;
        if (j1 == 0) goto _L14; else goto _L9
_L9:
        if (k.n != 1) goto _L16; else goto _L15
_L15:
        obj1 = q.PTT;
_L17:
        if (j1 == 0) goto _L14; else goto _L10
_L10:
        obj1 = q.VIDEO;
        if (j1 == 0) goto _L14; else goto _L7
        qa1;
        throw qa1;
_L16:
        obj1 = q.AUDIO;
          goto _L17
        qa1;
        throw qa1;
_L12:
        i1 = -1;
          goto _L18
    }

    public void a(boolean flag)
    {
        boolean flag1 = true;
        Log.i((new StringBuilder()).append(z[15]).append(k.y).toString());
        cancel(true);
        if (!r)
        {
            k.M = 0;
            l.transferring = false;
            l.transferred = false;
            MediaData mediadata = l;
            if (!flag)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            mediadata.autodownloadRetryEnabled = flag;
            App.ah.e(k);
        }
        n.remove(k.y);
        b.remove(k.y);
    }

    public void a(Integer ainteger[])
    {
label0:
        {
label1:
            {
                int i1 = ainteger[0].intValue();
                com.whatsapp.l1.a(i1 - p, 0);
                p = i1;
                if (r)
                {
                    break label0;
                }
                if (h != 0L)
                {
                    l.progress = ((long)i1 * 100L) / h;
                    if (App.am == 0)
                    {
                        break label1;
                    }
                }
                l.progress = 0L;
            }
            App.ah.a(k, false, -1);
        }
    }

    protected long b()
    {
        return l.file.length();
    }

    public void c()
    {
        e = true;
    }

    public Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    public c4 e()
    {
        return k;
    }

    public void f()
    {
        a(true);
    }

    protected ir g()
    {
        return new qh(l.file);
    }

    protected int h()
    {
        return 16384;
    }

    public MediaData i()
    {
        return l;
    }

    protected String j()
    {
        return c1.a(l.file);
    }

    public void k()
    {
label0:
        {
            Log.i((new StringBuilder()).append(z[0]).append(k.y).append(z[2]).append(n.size()).append(z[1]).append(b.size()).toString());
            if (n.size() > 10)
            {
                b.put(k.y, this);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            n.put(k.y, this);
            g = System.currentTimeMillis();
            com.whatsapp.asw.a(new b9(this), new Void[0]);
        }
    }

    protected void onCancelled()
    {
        Log.i((new StringBuilder()).append(z[3]).append(k.y).toString());
        a(qa.CANCEL);
    }

    public void onPostExecute(Object obj)
    {
        a((qa)obj);
    }

    public void onProgressUpdate(Object aobj[])
    {
        a((Integer[])aobj);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[23];
        obj = "n\017Kw3v\032Cq3gE\\j3q\036\017";
        byte0 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "#\032Jp6j\004H$";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "#\tZl f\004[$";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "n\017Kw3v\032Cq3gE@p1b\004L{>o\017K>";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "n\017Kw3v\032Cq3gEJp6#";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "n\017Kw3v\032Cq3gE\017m7q\034Jl\rk\013\\vrn\003\\m;m\r";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "#\030Jm'o\036\025";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "n\017Kw3v\032Cq3gEZl>,\017]l=qJ";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "#\031Jl$f\030pv3p\002\025";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "#\032Jp6j\004H$";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "n\017Kw3v\032Cq3gE\017r=`\013CA:b\031G$";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "n\017Kw3v\032Cq3gEZl>,\004@3:l\031[";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "n\017Kw3v\032Cq3gEJp6,\004@jrw\002Fmr";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "`\037]l7m\036\025";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "n\017Kw3v\032Cq3gEBw!p\003Ayrh\017Vmrj\004\017k\"o\005Nzrq\017\\k>w";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "n\017Kw3v\032Cq3gEL\177<`\017C>";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "n\017Kw3v\032Cq3gEGj&s\017]l=qJ";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "n\017Kw3v\032Cq3gEJl l\030\017";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "n\017Kw3v\032Cq3gEFq\177f\030]q #";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "n\017Kw3v\032Cq3gE]{#v\017\\j's\006@\1776#";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "#\002Nm:9";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "n\017Kw3v\032Cq3gEL\177<`\017C\177>oJLk q\017Ajh";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "#\032Jp6j\004H$";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                z = as;
                c = new Timer();
                n = new LinkedHashMap();
                b = new LinkedHashMap();
                i = new Object();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 628
    //                   0 651
    //                   1 657
    //                   2 664
    //                   3 671;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_671;
_L3:
        byte byte1 = 82;
_L9:
        obj[j1] = (char)(byte1 ^ c2);
        j1++;
          goto _L8
_L4:
        byte1 = 3;
          goto _L9
_L5:
        byte1 = 106;
          goto _L9
_L6:
        byte1 = 47;
          goto _L9
        byte1 = 30;
          goto _L9
    }
}
