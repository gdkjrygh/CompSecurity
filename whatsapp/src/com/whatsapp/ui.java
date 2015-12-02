// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.CamcorderProfile;
import android.os.AsyncTask;
import android.os.Environment;
import android.text.format.Formatter;
import android.view.Display;
import android.view.WindowManager;
import com.whatsapp.fieldstats.k;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.c1;
import com.whatsapp.util.y;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

// Referenced classes of package com.whatsapp:
//            App, MediaData, afq, ws, 
//            aoz, go, dx, mk, 
//            u5, og, ft, jo, 
//            afm, qo

public class ui extends AsyncTask
{

    public static HashMap c;
    public static HashMap i;
    private static final String z[];
    private File a;
    private ui b;
    private final MediaData d;
    private final c4 e;
    private boolean f;
    private String g;
    private long h;
    private Activity j;

    private ui(c4 c4_1, boolean flag, Activity activity)
    {
        a = App.l(c4_1);
        e = c4_1;
        f = flag;
        d = (MediaData)c4_1.B;
        URL url = new URL(c4_1.l);
        int l;
        if (url.getHost() == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        l = url.getHost().length();
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        Log.e((new StringBuilder()).append(z[11]).append(c4_1.l).toString());
        l = App.am;
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        Exception exception;
        try
        {
            g = a(c4_1);
        }
        catch (Exception exception1)
        {
            try
            {
                throw exception1;
            }
            catch (Exception exception2)
            {
                Log.w((new StringBuilder()).append(z[8]).append(c4_1.l).append(" ").append(exception2.toString()).toString());
            }
        }
        try
        {
            c4_1 = (new StringBuilder()).append(z[10]).append(a(g)).append(z[12]).append(flag).append(z[9]);
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (activity != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Log.i(c4_1.append(flag).toString());
        j = activity;
        return;
        exception;
        throw exception;
        exception;
        throw exception;
    }

    private k a(ws ws1)
    {
        switch (com.whatsapp.afq.a[ws1.ordinal()])
        {
        default:
            return k.ERROR_UNKNOWN;

        case 1: // '\001'
            if (d.dedupeDownload)
            {
                return k.DEDUPED;
            } else
            {
                return k.OK;
            }

        case 2: // '\002'
            return k.ERROR_INSUFFICIENT_SPACE;

        case 3: // '\003'
            return k.ERROR_TOO_OLD;

        case 4: // '\004'
            return k.ERROR_CANNOT_RESUME;

        case 5: // '\005'
            return k.ERROR_HASH_MISMATCH;

        case 6: // '\006'
            return k.ERROR_INVALID_URL;

        case 7: // '\007'
            return k.ERROR_OUTPUT_STREAM;

        case 8: // '\b'
            return k.ERROR_CANCEL;
        }
    }

    public static c4 a(a a1)
    {
        synchronized (i)
        {
            a1 = (c4)i.get(a1);
        }
        return a1;
        a1;
        hashmap;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public static ui a(c4 c4_1, boolean flag, Activity activity)
    {
        HashMap hashmap = i;
        hashmap;
        JVM INSTR monitorenter ;
        Object obj = (MediaData)c4_1.B;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        Log.e((new StringBuilder()).append(z[71]).append(c4_1.y.c).toString());
        hashmap;
        JVM INSTR monitorexit ;
        return null;
        if (!((MediaData) (obj)).transferred)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        Log.e((new StringBuilder()).append(z[73]).append(c4_1.y.c).toString());
        hashmap;
        JVM INSTR monitorexit ;
        return null;
        if (!((MediaData) (obj)).transferring)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        Log.e((new StringBuilder()).append(z[75]).append(c4_1.y.c).toString());
        hashmap;
        JVM INSTR monitorexit ;
        return null;
        if (i.containsKey(c4_1.y)) goto _L2; else goto _L1
_L1:
        i.put(c4_1.y, c4_1);
        activity = new ui(c4_1, flag, activity);
        obj.downloader = activity;
        obj.transferring = true;
        obj.progress = 0L;
        obj.autodownloadRetryEnabled = true;
_L9:
        if (activity == null) goto _L4; else goto _L3
_L3:
        obj = (ArrayList)c.get(c4_1.h);
        if (obj == null) goto _L6; else goto _L5
_L5:
        activity.b = ((MediaData)((c4)((ArrayList) (obj)).get(0)).B).downloader;
        Log.i((new StringBuilder()).append(z[74]).append(c4_1.y.c).append(z[72]).append(((ArrayList) (obj)).size()).toString());
        activity = null;
_L7:
        ((ArrayList) (obj)).add(c4_1);
_L4:
        hashmap;
        JVM INSTR monitorexit ;
        App.ah.a(c4_1, false, -1);
        return activity;
_L2:
        Log.w((new StringBuilder()).append(z[70]).append(c4_1.y.c).toString());
        activity = null;
        continue; /* Loop/switch isn't completed */
_L6:
        obj = new ArrayList();
        c.put(c4_1.h, obj);
          goto _L7
        c4_1;
        hashmap;
        JVM INSTR monitorexit ;
        throw c4_1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static String a(c4 c4_1)
    {
        String s;
        int l;
        int i1;
        int j1;
        int k1;
        s = (new StringBuilder()).append(c4_1.l).append(z[17]).toString();
        if (c4_1.w != 3)
        {
            break MISSING_BLOCK_LABEL_388;
        }
        j1 = 640;
        k1 = 480;
        l = k1;
        i1 = j1;
        if (android.os.Build.VERSION.SDK_INT < 8) goto _L2; else goto _L1
_L1:
        c4_1 = CamcorderProfile.get(1);
        l = k1;
        i1 = j1;
        if (c4_1 == null) goto _L4; else goto _L3
_L3:
        k1 = Math.max(640, ((CamcorderProfile) (c4_1)).videoFrameWidth);
        j1 = Math.max(480, ((CamcorderProfile) (c4_1)).videoFrameHeight);
        l = j1;
        i1 = k1;
        if (App.am == 0) goto _L2; else goto _L5
_L5:
        i1 = k1;
        l = j1;
_L4:
        int l1;
        l1 = 0;
        k1 = i1;
        j1 = l;
_L7:
        int i2;
        int l2;
        c4_1 = ((WindowManager)App.au.getSystemService(z[18])).getDefaultDisplay();
        i2 = c4_1.getWidth();
        l2 = c4_1.getHeight();
        l = i2;
        i1 = l2;
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        l = i2;
        Point point = new Point();
        l = i2;
        c4_1.getRealSize(point);
        l = i2;
        i2 = point.x;
        l = i2;
        i1 = point.y;
        l = i2;
_L6:
label0:
        {
            int j2;
            if (l >= i1)
            {
                int k2 = l;
                l = i1;
                i1 = k2;
            }
            if (l1 != 0)
            {
                j2 = j1;
                l1 = k1;
                if (k1 <= i1)
                {
                    break label0;
                }
                j2 = j1;
                l1 = k1;
                if (j1 <= l)
                {
                    break label0;
                }
            }
            l1 = i1;
            j2 = l;
        }
        c4_1 = (new StringBuilder()).append(s).append(z[15]).append(l1).append(z[16]).append(j2).toString();
        Log.i((new StringBuilder()).append(z[13]).append(l1).append(z[14]).append(j2).toString());
_L8:
        return App.h(c4_1);
        c4_1;
        i1 = l2;
          goto _L6
_L2:
        l1 = 1;
        j1 = l;
        k1 = i1;
          goto _L7
        c4_1 = s;
          goto _L8
    }

    private static String a(String s)
    {
        if (App.l >= 2)
        {
            return s;
        }
        StringBuilder stringbuilder = (new StringBuilder()).append(z[19]);
        if (s.length() > 13)
        {
            s = s.substring(s.length() - 13);
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).toString();
    }

    public go a(Void avoid[])
    {
        int i1;
        int j1;
label0:
        {
            i1 = 0;
            j1 = App.am;
            try
            {
                h = System.currentTimeMillis();
                if (g != null)
                {
                    break label0;
                }
                avoid = new go(ws.FAILED_INVALID_URL);
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                throw avoid;
            }
            return avoid;
        }
        c1.a(App.au);
        obj = null;
        avoid = App.ah.q(e.h);
        if (avoid == null) goto _L2; else goto _L1
_L1:
        Log.i((new StringBuilder()).append(z[2]).append(a(e.h)).append(" ").append(avoid.getAbsolutePath()).toString());
        c1.a(avoid, a);
        avoid = new go(ws.SUCCESS);
        d.dedupeDownload = true;
        obj = avoid;
_L21:
        avoid = ((Void []) (obj));
        if (obj != null) goto _L4; else goto _L3
_L3:
        int l;
        Object obj1;
        Exception exception;
        ws ws1;
        long l1;
        boolean flag;
        try
        {
            l1 = a.length();
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            try
            {
                throw avoid;
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                throw avoid;
            }
        }
        if (l1 > 0L)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        obj = c();
        if (((go) (obj)).b == ws.FAILED_CANNOT_RESUME) goto _L6; else goto _L5
_L5:
        obj1 = ((go) (obj)).b;
        ws1 = ws.FAILED_HASH_MISMATCH;
        avoid = ((Void []) (obj));
        if (obj1 != ws1) goto _L7; else goto _L6
_L6:
        flag = a.delete();
        if (!flag)
        {
            try
            {
                Log.e((new StringBuilder()).append(z[7]).append(a.getAbsolutePath()).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                throw avoid;
            }
        }
        if (l == 0) goto _L9; else goto _L8
_L8:
        obj = c();
        avoid = ((Void []) (obj));
        if (j1 == 0) goto _L4; else goto _L10
_L10:
        avoid = ((Void []) (obj));
_L7:
        obj1 = ((go) (avoid)).b;
        ws1 = ws.FAILED_TOO_OLD;
        obj = avoid;
        if (obj1 != ws1) goto _L9; else goto _L11
_L11:
        try
        {
            l = e.M;
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            throw avoid;
        }
        obj = avoid;
        if (l == 12) goto _L9; else goto _L12
_L12:
        Log.i((new StringBuilder()).append(z[6]).append(e.y).toString());
        App.ah.b(e.y, 11);
        App.o(e);
        obj1 = e.l;
        l = i1;
_L18:
        obj = avoid;
        if (l > 12) goto _L9; else goto _L13
_L13:
        Thread.sleep(1000L);
_L17:
        try
        {
            flag = ((String) (obj1)).equals(e.l);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            throw avoid;
        }
        if (flag) goto _L15; else goto _L14
_L14:
        Log.i(z[4]);
        obj = new URL(e.l);
        if (((URL) (obj)).getHost() == null)
        {
            break MISSING_BLOCK_LABEL_442;
        }
        i1 = ((URL) (obj)).getHost().length();
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_478;
        }
        Log.e((new StringBuilder()).append(z[5]).append(e.l).toString());
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_489;
        }
        g = a(e);
        obj = c();
        avoid = ((Void []) (obj));
_L4:
        try
        {
            if (e.w != 1)
            {
                break MISSING_BLOCK_LABEL_545;
            }
            flag = avoid.a();
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            throw avoid;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_545;
        }
        obj = y.a(e);
        try
        {
            if (((Bitmap) (obj)).getHeight() > ((Bitmap) (obj)).getWidth())
            {
                c1.a(d);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        synchronized (i)
        {
            i.remove(e.y);
        }
        return avoid;
        avoid;
        obj;
        JVM INSTR monitorexit ;
        throw avoid;
        exception;
        avoid = ((Void []) (obj));
        obj = exception;
_L19:
        Log.a(z[1], ((Throwable) (obj)));
        obj = avoid;
        continue; /* Loop/switch isn't completed */
        avoid;
        try
        {
            throw avoid;
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[]) { }
        throw avoid;
        avoid;
        throw avoid;
        obj;
        if (j1 != 0) goto _L17; else goto _L16
_L16:
        obj = avoid;
_L9:
        avoid = ((Void []) (obj));
          goto _L4
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            Log.w((new StringBuilder()).append(z[3]).append(e.l).append(" ").append(((Exception) (obj)).toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            throw avoid;
        }
        obj = avoid;
        if (j1 == 0) goto _L9; else goto _L15
_L15:
        l++;
        if (j1 == 0) goto _L18; else goto _L4
        obj;
          goto _L19
_L2:
        obj = null;
        if (true) goto _L21; else goto _L20
_L20:
    }

    public void a(go go1)
    {
        Object obj;
        Object obj1;
        int l;
        l = App.am;
        Log.i((new StringBuilder()).append(z[25]).append(a(g)).append(z[22]).append(go1).toString());
        d.transferring = false;
        d.transferred = go1.a();
        obj1 = "";
        obj = obj1;
        if (!go1.a()) goto _L2; else goto _L1
_L1:
        d.file = a;
        d.fileSize = d.file.length();
        obj = go1.a;
        MediaData mediadata;
label0:
        {
            if (obj != null)
            {
                obj1 = go1.a;
                obj = obj1;
                if (l == 0)
                {
                    break label0;
                }
            }
            Object obj2;
            byte byte0;
            long l1;
            boolean flag;
            try
            {
                obj2 = e.l;
            }
            // Misplaced declaration of an exception variable
            catch (go go1)
            {
                throw go1;
            }
            obj = obj1;
            if (obj2 != null)
            {
                obj2 = (new File(e.l)).getName();
                int i1 = ((String) (obj2)).lastIndexOf('.');
                obj = obj1;
                if (i1 > 0)
                {
                    obj = ((String) (obj2)).substring(i1 + 1);
                }
            }
        }
        d.file = c1.a(App.au, (new StringBuilder()).append(".").append(((String) (obj))).toString(), e.w, e.n, false);
        a.renameTo(d.file);
        a.delete();
        obj1 = obj;
        if (e.w != 3) goto _L4; else goto _L3
_L3:
        flag = e.f();
        obj1 = obj;
        if (flag) goto _L4; else goto _L5
_L5:
        e.a(c1.a(d.file.getAbsolutePath()));
        e.f = 1;
        obj1 = obj;
        if (l == 0) goto _L4; else goto _L2
_L2:
        l1 = a.length();
        obj1 = obj;
        if (l1 != 0L) goto _L4; else goto _L6
_L6:
        try
        {
            a.delete();
        }
        // Misplaced declaration of an exception variable
        catch (go go1)
        {
            throw go1;
        }
_L27:
        y.b(e);
        App.ah.a(e, true, 3);
        obj1 = (ArrayList)c.remove(e.h);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_606;
        }
        obj1 = ((ArrayList) (obj1)).iterator();
_L8:
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (c4)((Iterator) (obj1)).next();
        if (obj2 == e)
        {
            continue; /* Loop/switch isn't completed */
        }
        mediadata = (MediaData)((c4) (obj2)).B;
        mediadata.transferring = false;
        mediadata.transferred = d.transferred;
        mediadata.dedupeDownload = d.dedupeDownload;
        if (!go1.a())
        {
            break MISSING_BLOCK_LABEL_586;
        }
        mediadata.fileSize = d.fileSize;
        byte0 = ((c4) (obj2)).w;
        if (byte0 != 3)
        {
            break MISSING_BLOCK_LABEL_529;
        }
        flag = ((c4) (obj2)).f();
        if (!flag)
        {
            try
            {
                ((c4) (obj2)).a(e.a());
                obj2.f = 1;
            }
            // Misplaced declaration of an exception variable
            catch (go go1)
            {
                throw go1;
            }
        }
        mediadata.file = c1.a(App.au, (new StringBuilder()).append(".").append(((String) (obj))).toString(), ((c4) (obj2)).w, ((c4) (obj2)).n, false);
        try
        {
            c1.a(d.file, mediadata.file);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            mediadata.transferred = false;
            Log.a(z[24], filenotfoundexception);
        }
        catch (IOException ioexception)
        {
            mediadata.transferred = false;
            Log.a(z[26], ioexception);
        }
        App.ah.a(((c4) (obj2)), true, 3);
        if (l == 0) goto _L8; else goto _L7
_L7:
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_615;
        }
        try
        {
            Log.e(z[23]);
        }
        // Misplaced declaration of an exception variable
        catch (go go1)
        {
            throw go1;
        }
        obj = j;
        if (obj == null) goto _L10; else goto _L9
_L9:
        flag = j.isFinishing();
        if (flag) goto _L10; else goto _L11
_L11:
        obj = go1.b;
        obj1 = ws.FAILED_GENERIC;
        if (obj != obj1) goto _L13; else goto _L12
_L12:
        try
        {
            j.showDialog(101);
        }
        // Misplaced declaration of an exception variable
        catch (go go1)
        {
            throw go1;
        }
        if (l == 0) goto _L10; else goto _L13
_L13:
        obj = go1.b;
        obj1 = ws.FAILED_OUTPUT_STREAM;
        if (obj != obj1) goto _L15; else goto _L14
_L14:
        obj = Environment.getExternalStorageState();
        flag = ((String) (obj)).equals(z[27]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_715;
        }
        j.showDialog(104);
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_764;
        }
        flag = ((String) (obj)).equals(z[21]);
        if (!flag)
        {
            try
            {
                j.showDialog(103);
            }
            // Misplaced declaration of an exception variable
            catch (go go1)
            {
                throw go1;
            }
            if (l == 0)
            {
                break MISSING_BLOCK_LABEL_764;
            }
        }
        Log.e(z[28]);
        j.showDialog(101);
        if (l == 0) goto _L10; else goto _L15
_L15:
        try
        {
            obj = go1.b;
            obj1 = ws.FAILED_INSUFFICIENT_SPACE;
        }
        // Misplaced declaration of an exception variable
        catch (go go1)
        {
            try
            {
                throw go1;
            }
            // Misplaced declaration of an exception variable
            catch (go go1) { }
            try
            {
                throw go1;
            }
            // Misplaced declaration of an exception variable
            catch (go go1)
            {
                throw go1;
            }
        }
        if (obj != obj1) goto _L17; else goto _L16
_L16:
        j.showDialog(102);
        if (l == 0) goto _L10; else goto _L17
_L17:
        if (go1.b != ws.FAILED_TOO_OLD) goto _L19; else goto _L18
_L18:
        flag = j instanceof dx;
        if (!flag) goto _L21; else goto _L20
_L20:
        obj1 = (dx)j;
        if (!mk.h(e.y.a)) goto _L23; else goto _L22
_L22:
        obj = e.G;
_L25:
        if (obj != null)
        {
            obj = u5.d(((String) (obj)));
            ((dx) (obj1)).f(j.getString(0x7f0e044a, new Object[] {
                ((og) (obj)).a(j)
            }));
        }
        if (l == 0) goto _L10; else goto _L21
_L21:
        j.showDialog(111);
        if (l == 0) goto _L10; else goto _L19
_L19:
        try
        {
            if (go1.b == ws.FAILED_INVALID_URL)
            {
                j.showDialog(112);
            }
        }
        // Misplaced declaration of an exception variable
        catch (go go1)
        {
            throw go1;
        }
_L10:
        com.whatsapp.ft.a(App.au, e, a(go1.b), e.t, System.currentTimeMillis() - h);
        j = null;
        return;
        go1;
        throw go1;
        go1;
        try
        {
            throw go1;
        }
        // Misplaced declaration of an exception variable
        catch (go go1) { }
        try
        {
            throw go1;
        }
        // Misplaced declaration of an exception variable
        catch (go go1) { }
        throw go1;
        go1;
        try
        {
            throw go1;
        }
        // Misplaced declaration of an exception variable
        catch (go go1) { }
        throw go1;
        go1;
        try
        {
            throw go1;
        }
        // Misplaced declaration of an exception variable
        catch (go go1) { }
        try
        {
            throw go1;
        }
        // Misplaced declaration of an exception variable
        catch (go go1) { }
        throw go1;
        go1;
        try
        {
            throw go1;
        }
        // Misplaced declaration of an exception variable
        catch (go go1) { }
        try
        {
            throw go1;
        }
        // Misplaced declaration of an exception variable
        catch (go go1) { }
        throw go1;
        go1;
        throw go1;
_L23:
        obj = e.y.a;
        if (true) goto _L25; else goto _L24
_L24:
        go1;
        throw go1;
_L4:
        obj = obj1;
        if (true) goto _L27; else goto _L26
_L26:
    }

    public void a(Long along[])
    {
        d.progress = along[0].longValue();
        App.ah.a(e, false, -1);
    }

    public boolean a()
    {
        return f;
    }

    public void b()
    {
label0:
        {
            int l = App.am;
            Log.i((new StringBuilder()).append(z[0]).append(a(g)).toString());
            if (b != null)
            {
                b.b();
                if (l == 0)
                {
                    break label0;
                }
            }
            cancel(true);
            com.whatsapp.jo.a().b(e);
            synchronized (i)
            {
                i.remove(e.y);
                if (!d.transferred)
                {
                    d.transferring = false;
                    d.transferred = false;
                    d.autodownloadRetryEnabled = false;
                    App.ah.e(e);
                }
            }
            obj = (ArrayList)c.remove(e.h);
            if (obj != null)
            {
                obj = ((ArrayList) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    c4 c4_1 = (c4)((Iterator) (obj)).next();
                    if (c4_1 != e)
                    {
                        com.whatsapp.jo.a().b(c4_1);
                        MediaData mediadata = (MediaData)c4_1.B;
                        mediadata.transferring = false;
                        mediadata.transferred = d.transferred;
                        mediadata.autodownloadRetryEnabled = false;
                        if (mediadata.downloader != null)
                        {
                            mediadata.downloader.j = null;
                            mediadata.downloader.b = null;
                        }
                        App.ah.e(c4_1);
                        i.remove(c4_1.y);
                    }
                } while (l == 0);
            }
            j = null;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public go c()
    {
        Object obj1;
        Object obj3;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        int i1;
        i1 = App.am;
        obj10 = null;
        obj9 = null;
        obj13 = null;
        obj11 = null;
        obj7 = null;
        obj8 = null;
        obj12 = null;
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        byte abyte0[] = new byte[1024];
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        Object obj = new BasicHttpParams();
        obj1 = obj11;
        obj3 = obj10;
        HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj)), 15000);
        obj1 = obj11;
        obj3 = obj10;
        int l = e.w;
        Object obj4;
        HttpResponse httpresponse;
        long l1;
        if (l == 3)
        {
            l = 60000;
        } else
        {
            l = 30000;
        }
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj)), l);
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        HttpProtocolParams.setUserAgent(((org.apache.http.params.HttpParams) (obj)), com.whatsapp.afm.a());
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        obj4 = new DefaultHttpClient(((org.apache.http.params.HttpParams) (obj)));
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        obj = new HttpGet(g);
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        l1 = a.length();
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        obj1 = obj11;
        obj3 = obj10;
        Log.i((new StringBuilder()).append(z[36]).append(l1).toString());
        obj1 = obj11;
        obj3 = obj10;
        ((HttpGet) (obj)).addHeader(z[32], (new StringBuilder()).append(z[64]).append(l1).append("-").toString());
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        httpresponse = ((DefaultHttpClient) (obj4)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        l = httpresponse.getStatusLine().getStatusCode();
        if (l == 200 || l == 206) goto _L2; else goto _L1
_L1:
        if (l != 404 && l != 410) goto _L4; else goto _L3
_L3:
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        obj4 = new go(ws.FAILED_TOO_OLD);
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w((new StringBuilder()).append(z[67]).append(((IOException) (obj)).toString()).toString());
            }
            new go(ws.FAILED_GENERIC);
        }
        obj = obj4;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w((new StringBuilder()).append(z[38]).append(((IOException) (obj)).toString()).toString());
            }
            new go(ws.FAILED_GENERIC);
            return ((go) (obj4));
        }
_L5:
        return ((go) (obj));
        obj;
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally { }
_L26:
        obj1 = obj5;
        obj3 = obj6;
        Log.w((new StringBuilder()).append(z[41]).append(((IOException) (obj)).toString()).append(z[53]).append(g).toString());
        obj1 = obj5;
        obj3 = obj6;
        obj = new go(ws.FAILED_GENERIC);
        obj1 = obj;
        if (obj5 == null)
        {
            break MISSING_BLOCK_LABEL_545;
        }
        ((InputStream) (obj5)).close();
        obj1 = obj;
_L29:
        obj = obj1;
        if (obj6 != null)
        {
            try
            {
                ((OutputStream) (obj6)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w((new StringBuilder()).append(z[43]).append(((IOException) (obj)).toString()).toString());
                return new go(ws.FAILED_GENERIC);
            }
            return ((go) (obj1));
        } else
        {
            break MISSING_BLOCK_LABEL_443;
        }
        obj;
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        throw obj;
_L28:
        obj1 = obj5;
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Log.w((new StringBuilder()).append(z[35]).append(((IOException) (obj1)).toString()).toString());
                new go(ws.FAILED_GENERIC);
            }
        }
        if (obj3 != null)
        {
            try
            {
                ((OutputStream) (obj3)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Log.w((new StringBuilder()).append(z[31]).append(((IOException) (obj1)).toString()).toString());
                new go(ws.FAILED_GENERIC);
            }
        }
        throw obj;
_L4:
        if (l != 416)
        {
            break MISSING_BLOCK_LABEL_924;
        }
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        Log.w((new StringBuilder()).append(z[45]).append(g).toString());
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        obj4 = new go(ws.FAILED_CANNOT_RESUME);
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w((new StringBuilder()).append(z[29]).append(((IOException) (obj)).toString()).toString());
            }
            break MISSING_BLOCK_LABEL_910;
        }
_L6:
        obj = obj4;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w((new StringBuilder()).append(z[34]).append(((IOException) (obj)).toString()).toString());
            }
            new go(ws.FAILED_GENERIC);
            return ((go) (obj4));
        }
          goto _L5
        new go(ws.FAILED_GENERIC);
          goto _L6
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        throw new IOException((new StringBuilder()).append(z[62]).append(l).toString());
_L2:
        obj1 = obj11;
        obj3 = obj10;
        if (!f)
        {
            break MISSING_BLOCK_LABEL_1161;
        }
        obj1 = obj11;
        obj3 = obj10;
        flag = App.i(e);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_1161;
        }
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        obj4 = new go(ws.CANCEL);
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w((new StringBuilder()).append(z[55]).append(((IOException) (obj)).toString()).toString());
            }
            break MISSING_BLOCK_LABEL_1147;
        }
_L7:
        obj = obj4;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w((new StringBuilder()).append(z[68]).append(((IOException) (obj)).toString()).toString());
            }
            new go(ws.FAILED_GENERIC);
            return ((go) (obj4));
        }
          goto _L5
        obj;
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        throw obj;
        new go(ws.FAILED_GENERIC);
          goto _L7
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        if (!isCancelled())
        {
            break MISSING_BLOCK_LABEL_1323;
        }
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        obj4 = new go(ws.CANCEL);
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w((new StringBuilder()).append(z[30]).append(((IOException) (obj)).toString()).toString());
            }
            break MISSING_BLOCK_LABEL_1309;
        }
_L8:
        obj = obj4;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w((new StringBuilder()).append(z[33]).append(((IOException) (obj)).toString()).toString());
            }
            new go(ws.FAILED_GENERIC);
            return ((go) (obj4));
        }
          goto _L5
        new go(ws.FAILED_GENERIC);
          goto _L8
        obj = null;
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        obj4 = httpresponse.getFirstHeader(z[39]);
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_3017;
        }
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        obj4 = ((Header) (obj4)).getValue();
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_3017;
        }
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        s = z[57];
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        l = ((String) (obj4)).indexOf(z[42]);
        if (l < 0) goto _L10; else goto _L9
_L9:
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        l = z[54].length() + l;
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        j1 = ((String) (obj4)).indexOf(';', l);
        if (j1 < 0) goto _L12; else goto _L11
_L11:
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        obj = ((String) (obj4)).substring(l, j1);
_L10:
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        s = z[60];
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        l = ((String) (obj4)).indexOf(z[40]);
        if (l < 0) goto _L14; else goto _L13
_L13:
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        l = z[48].length() + l;
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        j1 = ((String) (obj4)).indexOf(';', l);
        if (j1 < 0) goto _L16; else goto _L15
_L15:
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        s = ((String) (obj4)).substring(l, j1);
        obj4 = obj;
        obj = s;
_L19:
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        this;
        JVM INSTR monitorenter ;
        obj5 = obj8;
        obj3 = obj9;
        if (!isCancelled()) goto _L18; else goto _L17
_L17:
        obj5 = obj8;
        obj3 = obj9;
        obj1 = new go(ws.CANCEL);
        obj5 = obj8;
        obj3 = obj9;
        this;
        JVM INSTR monitorexit ;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w((new StringBuilder()).append(z[37]).append(((IOException) (obj)).toString()).toString());
            }
            new go(ws.FAILED_GENERIC);
        }
        obj = obj1;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w((new StringBuilder()).append(z[59]).append(((IOException) (obj)).toString()).toString());
            }
            new go(ws.FAILED_GENERIC);
            return ((go) (obj1));
        }
          goto _L5
_L12:
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        obj = ((String) (obj4)).substring(l);
          goto _L10
_L16:
        obj5 = obj12;
        obj6 = obj13;
        obj1 = obj11;
        obj3 = obj10;
        obj4 = ((String) (obj4)).substring(l);
        obj1 = obj4;
        obj4 = obj;
        obj = obj1;
          goto _L19
_L18:
        obj5 = obj8;
        obj3 = obj9;
        obj1 = new FileOutputStream(a, true);
        obj3 = httpresponse.getEntity();
        l2 = ((HttpEntity) (obj3)).getContentLength();
        l2 += l1;
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_1968;
        }
        publishProgress(new Long[] {
            Long.valueOf((100L * l1) / l2)
        });
        l3 = App.A();
        if (l3 >= l2) goto _L21; else goto _L20
_L20:
        Log.i((new StringBuilder()).append(z[47]).append(Formatter.formatFileSize(App.au, l3)).toString());
        obj3 = new go(ws.FAILED_INSUFFICIENT_SPACE);
        this;
        JVM INSTR monitorexit ;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w((new StringBuilder()).append(z[52]).append(((IOException) (obj)).toString()).toString());
            }
            new go(ws.FAILED_GENERIC);
        }
        obj = obj3;
        if (obj1 != null)
        {
            try
            {
                ((OutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w((new StringBuilder()).append(z[44]).append(((IOException) (obj)).toString()).toString());
                new go(ws.FAILED_GENERIC);
                return ((go) (obj3));
            }
            return ((go) (obj3));
        }
          goto _L5
        obj;
        obj5 = obj8;
        obj3 = obj9;
        Log.c(z[61], ((Throwable) (obj)));
        obj5 = obj8;
        obj3 = obj9;
        obj1 = new go(ws.FAILED_OUTPUT_STREAM);
        obj5 = obj8;
        obj3 = obj9;
        this;
        JVM INSTR monitorexit ;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w((new StringBuilder()).append(z[50]).append(((IOException) (obj)).toString()).toString());
            }
            break MISSING_BLOCK_LABEL_2238;
        }
_L22:
        obj = obj1;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w((new StringBuilder()).append(z[51]).append(((IOException) (obj)).toString()).toString());
            }
            new go(ws.FAILED_GENERIC);
            return ((go) (obj1));
        }
          goto _L5
        new go(ws.FAILED_GENERIC);
          goto _L22
        obj;
        throw obj;
        obj4;
        obj = obj1;
        obj1 = obj7;
_L30:
        obj5 = obj1;
        obj3 = obj;
        this;
        JVM INSTR monitorexit ;
        obj5 = obj1;
        obj6 = obj;
        obj3 = obj;
        throw obj4;
_L21:
        obj5 = new qo(((HttpEntity) (obj3)).getContent(), 0);
_L24:
        l = ((InputStream) (obj5)).read(abyte0, 0, abyte0.length);
        if (l < 0)
        {
            break MISSING_BLOCK_LABEL_2527;
        }
        ((OutputStream) (obj1)).write(abyte0, 0, l);
        l1 += l;
        publishProgress(new Long[] {
            Long.valueOf((100L * l1) / l2)
        });
        if (!isCancelled()) goto _L24; else goto _L23
_L23:
        obj3 = new go(ws.CANCEL);
        this;
        JVM INSTR monitorexit ;
        if (obj5 != null)
        {
            try
            {
                ((InputStream) (obj5)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w((new StringBuilder()).append(z[66]).append(((IOException) (obj)).toString()).toString());
                new go(ws.FAILED_GENERIC);
            }
        }
        obj = obj3;
        if (obj1 == null) goto _L5; else goto _L25
_L25:
        try
        {
            ((OutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w((new StringBuilder()).append(z[46]).append(((IOException) (obj)).toString()).toString());
            new go(ws.FAILED_GENERIC);
            return ((go) (obj3));
        }
        return ((go) (obj3));
        this;
        JVM INSTR monitorexit ;
        obj6 = c1.a(a);
        if (obj6 != null)
        {
            break MISSING_BLOCK_LABEL_2626;
        }
        Log.w((new StringBuilder()).append(z[58]).append(a.getAbsolutePath()).append(" ").append(a.exists()).append(" ").append(g).toString());
        a.delete();
        obj3 = new go(ws.FAILED_GENERIC);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_2720;
        }
        flag = ((String) (obj6)).equals(obj);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_2707;
        }
        Log.w((new StringBuilder()).append(z[63]).append(((String) (obj))).append(z[65]).append(((String) (obj6))).append(" ").append(g).toString());
        obj3 = new go(ws.FAILED_HASH_MISMATCH);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_2720;
        }
        obj3 = new go(ws.SUCCESS, ((String) (obj4)));
        obj4 = obj3;
        if (obj5 == null)
        {
            break MISSING_BLOCK_LABEL_2736;
        }
        ((InputStream) (obj5)).close();
        obj4 = obj3;
_L27:
        obj = obj4;
        if (obj1 != null)
        {
            try
            {
                ((OutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w((new StringBuilder()).append(z[69]).append(((IOException) (obj)).toString()).toString());
                return new go(ws.FAILED_GENERIC);
            }
            return ((go) (obj4));
        }
          goto _L5
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj6 = obj1;
        }
        finally
        {
            obj3 = obj1;
        }
          goto _L26
        obj;
        Log.w((new StringBuilder()).append(z[49]).append(((IOException) (obj)).toString()).toString());
        obj4 = new go(ws.FAILED_GENERIC);
          goto _L27
        obj;
        Log.w((new StringBuilder()).append(z[56]).append(((IOException) (obj)).toString()).toString());
        obj1 = new go(ws.FAILED_GENERIC);
        if (true) goto _L29; else goto _L28
        obj4;
        obj1 = obj5;
        obj = obj3;
          goto _L30
        obj4;
        obj = obj1;
        obj1 = obj5;
          goto _L30
_L14:
        Object obj2 = null;
        obj4 = obj;
        obj = obj2;
          goto _L19
        obj = null;
        obj4 = null;
          goto _L19
    }

    public Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onCancelled()
    {
        Log.i((new StringBuilder()).append(z[20]).append(a(g)).toString());
    }

    public void onPostExecute(Object obj)
    {
        a((go)obj);
    }

    public void onProgressUpdate(Object aobj[])
    {
        a((Long[])aobj);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int l;
        as = new String[76];
        obj = "(,FIs!&UN~*(F\017q$'AE~e";
        byte0 = -1;
        l = 0;
_L2:
        String as1[];
        int i1;
        int j1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        j1 = obj.length;
        i1 = 0;
_L8:
label0:
        {
            if (j1 > i1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[l] = ((String) (obj));
                l = 1;
                obj = "(,FIs!&UN~*(F\017q-,AKw= QTa";
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[l] = ((String) (obj));
                l = 2;
                obj = "(,FIs!&UN~*(F\017t,%G\000w= QTa\177";
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[l] = ((String) (obj));
                l = 3;
                obj = "(,FIs!&UN~*(F\017g7%\rE`7&P\0";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[l] = ((String) (obj));
                l = 4;
                obj = "(,FIs!&UN~*(F\017g7%\002Rw5%CCw!e\002W{)%\002Rw1;[";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[l] = ((String) (obj));
                l = 5;
                obj = "(,FIs!&UN~*(F\017g7%\rN}h!MSf";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[l] = ((String) (obj));
                l = 6;
                obj = "(,FIs!&UN~*(F\017a 'F\000\177 -KA2 ;PO`e";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[l] = ((String) (obj));
                l = 7;
                obj = "(,FIs!&UN~*(F\017q$'LOfe-GLw1,\002";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[l] = ((String) (obj));
                l = 8;
                obj = "(,FIs!&UN~*(F\017g7%\rE`7&P\0";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[l] = ((String) (obj));
                l = 9;
                obj = "e(AT(";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[l] = ((String) (obj));
                l = 10;
                obj = "(,FIs!&UN~*(F\017{+ V\000g7%\030";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[l] = ((String) (obj));
                l = 11;
                obj = "(,FIs!&UN~*(F\017g7%\rN}h!MSf";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[l] = ((String) (obj));
                l = 12;
                obj = "e(WT}\177";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[l] = ((String) (obj));
                l = 13;
                obj = "(,FIs!&UN~*(F\017f7(LSq*-G\000e,-VH(";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[l] = ((String) (obj));
                l = 14;
                obj = "e!GIu-=\030";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[l] = ((String) (obj));
                l = 15;
                obj = "c>KDf-t";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[l] = ((String) (obj));
                l = 16;
                obj = "c!GIu-=\037";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[l] = ((String) (obj));
                l = 17;
                obj = "z1\037\022";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[l] = ((String) (obj));
                obj = "2 LD}2";
                byte0 = 17;
                l = 18;
                break;

            case 17: // '\021'
                as1[l] = ((String) (obj));
                l = 19;
                obj = "oc\b";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[l] = ((String) (obj));
                l = 20;
                obj = "(,FIs!&UN~*(F\017}+*CNq %NEve";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[l] = ((String) (obj));
                l = 21;
                obj = "(&WNf -";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[l] = ((String) (obj));
                l = 22;
                obj = "e:VAf0:\030";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[l] = ((String) (obj));
                l = 23;
                obj = "(,FIs!&UN~*(F\017\177,:QI|\"iFUb) AAf iNIa1";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[l] = ((String) (obj));
                l = 24;
                obj = "(,FIs!&UN~*(F\017w7;MR=";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[l] = ((String) (obj));
                l = 25;
                obj = "(,FIs!&UN~*(F\017}+9MSf 1GCg1,\002";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[l] = ((String) (obj));
                l = 26;
                obj = "(,FIs!&UN~*(F\017w7;MR=";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[l] = ((String) (obj));
                l = 27;
                obj = "(&WNf -}R}";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[l] = ((String) (obj));
                l = 28;
                obj = "(,FIs!&UN~*(F\017w7;MR=+&V\177f-,}Sv\032*CRv\032$MU|1\026QTs1,";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[l] = ((String) (obj));
                l = 29;
                obj = "(,FIs!&UN~*(F\017{+fGR`*;\002";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[l] = ((String) (obj));
                l = 30;
                obj = "(,FIs!&UN~*(F\017{+fGR`*;\002";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[l] = ((String) (obj));
                l = 31;
                obj = "(,FIs!&UN~*(F\017}0=\rE`7&P\0";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[l] = ((String) (obj));
                obj = "\027(LGw";
                byte0 = 31;
                l = 32;
                break;

            case 31: // '\037'
                as1[l] = ((String) (obj));
                l = 33;
                obj = "(,FIs!&UN~*(F\017}0=\rE`7&P\0";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[l] = ((String) (obj));
                obj = "(,FIs!&UN~*(F\017}0=\rE`7&P\0";
                byte0 = 33;
                l = 34;
                break;

            case 33: // '!'
                as1[l] = ((String) (obj));
                l = 35;
                obj = "(,FIs!&UN~*(F\017{+fGR`*;\002";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[l] = ((String) (obj));
                l = 36;
                obj = "(,FIs!&UN~*(F\017` :WMwj/PO\177e";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[l] = ((String) (obj));
                l = 37;
                obj = "(,FIs!&UN~*(F\017{+fGR`*;\002";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[l] = ((String) (obj));
                l = 38;
                obj = "(,FIs!&UN~*(F\017}0=\rE`7&P\0";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[l] = ((String) (obj));
                l = 39;
                obj = "\035dua?\b,VAv$=C";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[l] = ((String) (obj));
                l = 40;
                obj = "# NEz$:J\035";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[l] = ((String) (obj));
                l = 41;
                obj = "(,FIs!&UN~*(F\017w7;MR2";
                byte0 = 40;
                break;

            case 40: // '('
                as1[l] = ((String) (obj));
                l = 42;
                obj = "# NEf<9G\035";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[l] = ((String) (obj));
                l = 43;
                obj = "(,FIs!&UN~*(F\017}0=\rE`7&P\0";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[l] = ((String) (obj));
                l = 44;
                obj = "(,FIs!&UN~*(F\017}0=\rE`7&P\0";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[l] = ((String) (obj));
                l = 45;
                obj = "(,FIs!&UN~*(F\017` :WMwj/CI~ -\002\024#si";
                byte0 = 44;
                break;

            case 44: // ','
                as1[l] = ((String) (obj));
                l = 46;
                obj = "(,FIs!&UN~*(F\017}0=\rE`7&P\0";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[l] = ((String) (obj));
                l = 47;
                obj = "(,FIs!&UN~*(F\017{+:WFt,*KE|1\026QPs&,\r";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[l] = ((String) (obj));
                l = 48;
                obj = "# NEz$:J\035";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[l] = ((String) (obj));
                l = 49;
                obj = "(,FIs!&UN~*(F\017{+fGR`*;\002";
                byte0 = 48;
                break;

            case 48: // '0'
                as1[l] = ((String) (obj));
                l = 50;
                obj = "(,FIs!&UN~*(F\017{+fGR`*;\002";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[l] = ((String) (obj));
                l = 51;
                obj = "(,FIs!&UN~*(F\017}0=\rE`7&P\0";
                byte0 = 50;
                break;

            case 50: // '2'
                as1[l] = ((String) (obj));
                l = 52;
                obj = "(,FIs!&UN~*(F\017{+fGR`*;\002";
                byte0 = 51;
                break;

            case 51: // '3'
                as1[l] = ((String) (obj));
                l = 53;
                obj = "e<PL/";
                byte0 = 52;
                break;

            case 52: // '4'
                as1[l] = ((String) (obj));
                l = 54;
                obj = "# NEf<9G\035";
                byte0 = 53;
                break;

            case 53: // '5'
                as1[l] = ((String) (obj));
                l = 55;
                obj = "(,FIs!&UN~*(F\017{+fGR`*;\002";
                byte0 = 54;
                break;

            case 54: // '6'
                as1[l] = ((String) (obj));
                l = 56;
                obj = "(,FIs!&UN~*(F\017{+fGR`*;\002";
                byte0 = 55;
                break;

            case 55: // '7'
                as1[l] = ((String) (obj));
                l = 57;
                obj = "# NEf<9G\035";
                byte0 = 56;
                break;

            case 56: // '8'
                as1[l] = ((String) (obj));
                l = 58;
                obj = "(,FIs!&UN~*(F\017t$ NEve=M\000q$%AU~$=G\000z$:J\032";
                byte0 = 57;
                break;

            case 57: // '9'
                as1[l] = ((String) (obj));
                l = 59;
                obj = "(,FIs!&UN~*(F\017}0=\rE`7&P\0";
                byte0 = 58;
                break;

            case 58: // ':'
                as1[l] = ((String) (obj));
                l = 60;
                obj = "# NEz$:J\035";
                byte0 = 59;
                break;

            case 59: // ';'
                as1[l] = ((String) (obj));
                l = 61;
                obj = "(,FIs!&UN~*(F\017}0=QT` (O\017w7;MR2";
                byte0 = 60;
                break;

            case 60: // '<'
                as1[l] = ((String) (obj));
                l = 62;
                obj = "-=VP26=CTg6t";
                byte0 = 61;
                break;

            case 61: // '='
                as1[l] = ((String) (obj));
                l = 63;
                obj = "(,FIs!&UN~*(F\017t$ NEve!CSze$KS\177$=AH26,PVw7s";
                byte0 = 62;
                break;

            case 62: // '>'
                as1[l] = ((String) (obj));
                l = 64;
                obj = "'0VEax";
                byte0 = 63;
                break;

            case 63: // '?'
                as1[l] = ((String) (obj));
                l = 65;
                obj = "e%MCs)s";
                byte0 = 64;
                break;

            case 64: // '@'
                as1[l] = ((String) (obj));
                l = 66;
                obj = "(,FIs!&UN~*(F\017{+fGR`*;\002";
                byte0 = 65;
                break;

            case 65: // 'A'
                as1[l] = ((String) (obj));
                l = 67;
                obj = "(,FIs!&UN~*(F\017{+fGR`*;\002";
                byte0 = 66;
                break;

            case 66: // 'B'
                as1[l] = ((String) (obj));
                l = 68;
                obj = "(,FIs!&UN~*(F\017}0=\rE`7&P\0";
                byte0 = 67;
                break;

            case 67: // 'C'
                as1[l] = ((String) (obj));
                obj = "(,FIs!&UN~*(F\017}0=\rE`7&P\0";
                byte0 = 68;
                l = 69;
                break;

            case 68: // 'D'
                as1[l] = ((String) (obj));
                l = 70;
                obj = "(,FIs!&UN~*(F\017s);GAv<iKN25;MG` :Q\0";
                byte0 = 69;
                break;

            case 69: // 'E'
                as1[l] = ((String) (obj));
                l = 71;
                obj = "(,FIs!&UN~*(F\017\177 -KAM!(VA2,:\002Ng)%\002";
                byte0 = 70;
                break;

            case 70: // 'F'
                as1[l] = ((String) (obj));
                l = 72;
                obj = "e8WEg iQIh s";
                byte0 = 71;
                break;

            case 71: // 'G'
                as1[l] = ((String) (obj));
                l = 73;
                obj = "(,FIs!&UN~*(F\017s);GAv<iVRs+:DE` -\002";
                byte0 = 72;
                break;

            case 72: // 'H'
                as1[l] = ((String) (obj));
                l = 74;
                obj = "(,FIs!&UN~*(F\017s);GAv<iWP~*(FI|\"iQA\177 iOEv,(\016\000e,%N\000c0,WE2";
                byte0 = 73;
                break;

            case 73: // 'I'
                as1[l] = ((String) (obj));
                l = 75;
                obj = "(,FIs!&UN~*(F\017s);GAv<iVRs+:DE`7 LG2";
                byte0 = 74;
                break;

            case 74: // 'J'
                as1[l] = ((String) (obj));
                z = as;
                i = new HashMap();
                c = new HashMap();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 1772
    //                   0 1795
    //                   1 1802
    //                   2 1809
    //                   3 1816;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1816;
_L3:
        byte byte1 = 18;
_L9:
        obj[i1] = (char)(byte1 ^ c2);
        i1++;
          goto _L8
_L4:
        byte1 = 69;
          goto _L9
_L5:
        byte1 = 73;
          goto _L9
_L6:
        byte1 = 34;
          goto _L9
        byte1 = 32;
          goto _L9
    }
}
