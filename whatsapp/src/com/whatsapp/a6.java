// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.messaging.MessageService;
import com.whatsapp.messaging.h;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.protocol.cf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            App, mk, u5, og, 
//            k, qr, vp, kg

final class a6
    implements Runnable
{

    final boolean a;
    final qr b;
    final int c;
    final List d;
    final String e;

    a6(List list, qr qr1, String s, int i, boolean flag)
    {
        d = list;
        b = qr1;
        e = s;
        c = i;
        a = flag;
        super();
    }

    public void run()
    {
        int i = App.am;
        ArrayList arraylist = new ArrayList();
        if (d == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = d.iterator();
_L17:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        c4 c4_1 = (c4)iterator.next();
        if (c4_1.M != 6) goto _L5; else goto _L4
_L4:
        Object obj = mk.b(c4_1);
        if (i == 0) goto _L6; else goto _L5
_L5:
        Object obj1;
        obj1 = new cf();
        obj1.e = c4_1;
        if (c4_1.p != null || !u5.d(c4_1.y.a).k()) goto _L8; else goto _L7
_L7:
        if (c4_1.G == null) goto _L10; else goto _L9
_L9:
        obj = App.az.e(c4_1.G);
_L15:
        c4_1 = ((cf) (obj1)).e;
        if (obj == null) goto _L12; else goto _L11
_L11:
        obj = ((og) (obj)).N;
_L16:
        c4_1.p = ((String) (obj));
          goto _L8
_L6:
        if (obj == null) goto _L14; else goto _L13
_L13:
        arraylist.add(obj);
          goto _L14
_L2:
        b.a();
        obj1 = new vp(new kg(e, d, c, a));
        if (e != null)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        obj = h.a(c, arraylist, ((vp) (obj1)));
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        obj = h.b(e, arraylist, 4, ((vp) (obj1)));
        App.H().c(((android.os.Message) (obj)));
        b.b();
        return;
_L10:
        obj = null;
          goto _L15
_L12:
        obj = null;
          goto _L16
        obj;
        b.b();
        throw obj;
_L8:
        obj = obj1;
          goto _L6
_L14:
        if (i == 0) goto _L17; else goto _L2
    }
}
