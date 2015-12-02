// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.util.LruCache;
import com.whatsapp.util.Log;
import java.util.regex.Pattern;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ai, t

public abstract class ar
    implements ai
{

    private static final Pattern a;
    private static final String z[];
    protected Cursor b;
    protected ContentResolver c;
    protected Uri d;
    protected int e;
    private final LruCache f = new LruCache(512);
    protected boolean g;
    protected String h;

    public ar(ContentResolver contentresolver, Uri uri, int i, String s)
    {
        g = false;
        e = i;
        d = uri;
        h = s;
        c = contentresolver;
        b = d();
        if (b == null)
        {
            Log.w(z[0]);
        }
        f.trimToSize(0);
    }

    private Cursor a()
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        this;
        JVM INSTR monitorexit ;
        return null;
        if (g)
        {
            b.requery();
            g = false;
        }
        Cursor cursor = b;
        this;
        JVM INSTR monitorexit ;
        return cursor;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        throw obj;
    }

    public Uri a(long l)
    {
        NumberFormatException numberformatexception;
        long l1;
        try
        {
            l1 = ContentUris.parseId(d);
        }
        catch (NumberFormatException numberformatexception1)
        {
            return ContentUris.withAppendedId(d, l);
        }
        if (l1 == l)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        Log.e(z[1]);
        return d;
        numberformatexception;
        throw numberformatexception;
    }

    public t a(int i)
    {
        Object obj;
        t t1;
        t1 = (t)f.get(Integer.valueOf(i));
        obj = t1;
        if (t1 != null) goto _L2; else goto _L1
_L1:
        obj = a();
        if (obj == null)
        {
            return null;
        }
        this;
        JVM INSTR monitorenter ;
        if (!((Cursor) (obj)).moveToPosition(i)) goto _L4; else goto _L3
_L3:
        obj = a(((Cursor) (obj)));
_L6:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        f.put(Integer.valueOf(i), obj);
        this;
        JVM INSTR monitorexit ;
          goto _L2
        obj;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        return ((t) (obj));
_L4:
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected abstract t a(Cursor cursor);

    public void a()
    {
    }

    public void a(ContentObserver contentobserver)
    {
    }

    protected String b()
    {
        if (e != 1) goto _L2; else goto _L1
_L1:
        Object obj = z[6];
_L4:
        String s = z[5];
        return (new StringBuilder()).append(s).append(((String) (obj))).append(z[3]).append(((String) (obj))).toString();
        obj;
        throw obj;
_L2:
        obj = z[4];
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void b()
    {
        try
        {
            c();
        }
        catch (IllegalStateException illegalstateexception)
        {
            Log.a(z[2], illegalstateexception);
        }
        try
        {
            c = null;
            if (b != null)
            {
                b.close();
                b = null;
            }
            return;
        }
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
    }

    public void b(ContentObserver contentobserver)
    {
    }

    public void c()
    {
        Cursor cursor;
        try
        {
            cursor = b;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (cursor == null)
        {
            return;
        } else
        {
            b.deactivate();
            g = true;
            return;
        }
    }

    public int d()
    {
        Cursor cursor;
        cursor = a();
        if (cursor == null)
        {
            return 0;
        }
        this;
        JVM INSTR monitorenter ;
        int i = cursor.getCount();
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected abstract Cursor d();

    public boolean e()
    {
        int i;
        try
        {
            i = d();
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        return i == 0;
    }

    static 
    {
        char ac[];
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        ac = "\004}P$@\013}D$E\017oWnJ\024yB5L%iQ2F\024<Q$]\023nM2\t\biO-";
        byte0 = -1;
        i = 0;
_L18:
        String as1[];
        int k;
        int l;
        as1 = as;
        ac = ac.toCharArray();
        l = ac.length;
        k = 0;
_L16:
        if (l > k) goto _L2; else goto _L1
_L1:
        ac = (new String(ac)).intern();
        byte0;
        JVM INSTR tableswitch 0 5: default 88
    //                   0 104
    //                   1 120
    //                   2 136
    //                   3 152
    //                   4 168
    //                   5 185;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        as1[i] = ac;
        ac = "\004}P$@\013}D$E\017oWn@\002<N(Z\013}W\"A";
        i = 1;
        byte0 = 0;
        break; /* Loop/switch isn't completed */
_L4:
        as1[i] = ac;
        ac = "\004}P$@\013}D$E\017oWnL\036\177F1]\017sMa^\016uO$\t\002yB\"]\017jB5@\b{\003\"\\\024oL3";
        i = 2;
        byte0 = 1;
        break; /* Loop/switch isn't completed */
_L5:
        as1[i] = ac;
        ac = "J<|(M";
        i = 3;
        byte0 = 2;
        break; /* Loop/switch isn't completed */
_L6:
        as1[i] = ac;
        ac = "FXf\022j";
        i = 4;
        byte0 = 3;
        break; /* Loop/switch isn't completed */
_L7:
        as1[i] = ac;
        i = 5;
        ac = "\005}P$\t\017zM4E\n4G ]\003hB*L\b0\023h\t\021tF/\tV<W)L\b<G ]\003CN.M\017zJ$ML-\023q\031FyO2LFxB5L\022}H$GFyM%";
        byte0 = 4;
        break; /* Loop/switch isn't completed */
_L8:
        as1[i] = ac;
        i = 6;
        ac = "F]p\002";
        byte0 = 5;
        break; /* Loop/switch isn't completed */
_L9:
        int j;
        as1[i] = ac;
        z = as;
        ac = "N2\th\006:x\b".toCharArray();
        j = ac.length;
        i = 0;
          goto _L10
_L2:
        c1 = ac[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 272
    //                   0 295
    //                   1 302
    //                   2 309
    //                   3 316;
           goto _L11 _L12 _L13 _L14 _L15
_L15:
        break MISSING_BLOCK_LABEL_316;
_L11:
        j = 41;
_L17:
        ac[k] = (char)(j ^ c1);
        k++;
          goto _L16
_L12:
        j = 102;
          goto _L17
_L13:
        j = 28;
          goto _L17
_L14:
        j = 35;
          goto _L17
        j = 65;
          goto _L17
        if (true) goto _L18; else goto _L2
_L10:
        char c1;
        if (j <= i)
        {
            a = Pattern.compile((new String(ac)).intern());
            return;
        }
        k = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 364
    //                   0 385
    //                   1 391
    //                   2 397
    //                   3 403;
           goto _L19 _L20 _L21 _L22 _L23
_L23:
        break MISSING_BLOCK_LABEL_403;
_L20:
        break; /* Loop/switch isn't completed */
_L19:
        byte0 = 41;
_L25:
        ac[i] = (char)(byte0 ^ k);
        i++;
        if (true) goto _L10; else goto _L24
_L24:
        byte0 = 102;
          goto _L25
_L21:
        byte0 = 28;
          goto _L25
_L22:
        byte0 = 35;
          goto _L25
        byte0 = 65;
          goto _L25
    }
}
