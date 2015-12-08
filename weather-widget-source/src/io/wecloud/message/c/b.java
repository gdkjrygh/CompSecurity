// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.c;

import android.content.Context;
import android.text.TextUtils;
import io.wecloud.message.bean.c;
import io.wecloud.message.bean.d;
import java.util.ArrayList;

// Referenced classes of package io.wecloud.message.c:
//            a

public class b
{

    private Context a;

    public b(Context context)
    {
        a = context;
    }

    public ArrayList a()
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        String s;
        arraylist = new ArrayList();
        s = io.wecloud.message.c.a.B(a);
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        String as[];
        StringBuffer stringbuffer;
        int j;
        as = s.split("&&");
        stringbuffer = new StringBuffer();
        j = as.length;
        int i = 0;
_L6:
        if (i < j) goto _L4; else goto _L3
_L3:
        io.wecloud.message.c.a.f(a, stringbuffer.toString());
_L2:
        this;
        JVM INSTR monitorexit ;
        return arraylist;
_L4:
        String s1 = as[i];
        if (TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_147;
        }
        if (arraylist.size() >= 10)
        {
            if (stringbuffer.length() > 0)
            {
                stringbuffer.append("&&");
            }
            stringbuffer.append(s1);
            break MISSING_BLOCK_LABEL_147;
        }
        d d1 = new d();
        d1.a(s1);
        arraylist.add(d1);
        break MISSING_BLOCK_LABEL_147;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(d d1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!(d1 instanceof c)) goto _L2; else goto _L1
_L1:
        StringBuffer stringbuffer = new StringBuffer(io.wecloud.message.c.a.h(a, 1));
_L3:
        if (stringbuffer.length() > 0)
        {
            stringbuffer.append("&&");
        }
        stringbuffer.append(d1.a());
        if (!(d1 instanceof c))
        {
            break MISSING_BLOCK_LABEL_92;
        }
        io.wecloud.message.c.a.g(a, stringbuffer.toString());
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        stringbuffer = new StringBuffer(io.wecloud.message.c.a.B(a));
          goto _L3
        d1;
        this;
        JVM INSTR monitorexit ;
        throw d1;
        io.wecloud.message.c.a.f(a, stringbuffer.toString());
          goto _L4
    }

    public ArrayList b()
    {
        Object obj = new ArrayList();
        this;
        JVM INSTR monitorenter ;
        String s;
        s = io.wecloud.message.c.a.h(a, 1);
        io.wecloud.message.c.a.g(a, "");
        this;
        JVM INSTR monitorexit ;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        String as[];
        int i;
        int j;
        as = s.split("&&");
        j = as.length;
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        return ((ArrayList) (obj));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L3:
        String s1 = as[i];
        if (!TextUtils.isEmpty(s1))
        {
            c c1 = new c();
            c1.a(s1);
            ((ArrayList) (obj)).add(c1);
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
