// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.media:
//            y, u, ad, bj, 
//            w, v

final class z extends Handler
{

    final y a;
    private final ArrayList b;

    private z(y y1)
    {
        a = y1;
        super();
        b = new ArrayList();
    }

    z(y y1, byte byte0)
    {
        this(y1);
    }

    public final void a(int i, Object obj)
    {
        obtainMessage(i, obj).sendToTarget();
    }

    public final void handleMessage(Message message)
    {
        int j;
        j = message.what;
        message = ((Message) (message.obj));
        j;
        JVM INSTR tableswitch 257 262: default 52
    //                   257 117
    //                   258 134
    //                   259 151
    //                   260 52
    //                   261 52
    //                   262 168;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L5
_L1:
        int i = y.d(a).size();
_L6:
        i--;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        Object obj = (u)((WeakReference)y.d(a).get(i)).get();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        y.d(a).remove(i);
          goto _L6
_L2:
        y.e(a).a((ad)message);
          goto _L1
_L3:
        y.e(a).b((ad)message);
          goto _L1
_L4:
        y.e(a).c((ad)message);
          goto _L1
_L5:
        y.e(a).d((ad)message);
          goto _L1
        b.addAll(((u) (obj)).c);
          goto _L6
        int k = b.size();
        i = 0;
_L13:
        if (i >= k) goto _L8; else goto _L7
_L7:
        Object obj1;
        obj = (w)b.get(i);
        obj1 = ((w) (obj)).a;
        obj1 = ((w) (obj)).b;
        0xff00 & j;
        JVM INSTR lookupswitch 2: default 399
    //                   256: 272
    //                   512: 463;
           goto _L9 _L10 _L11
_L10:
        ad ad1 = (ad)message;
        boolean flag;
        if ((((w) (obj)).d & 2) == 0 && !ad1.a(((w) (obj)).c))
        {
            flag = false;
        } else
        {
            flag = true;
        }
          goto _L12
_L15:
        ((v) (obj1)).a(ad1);
          goto _L9
        message;
        b.clear();
        throw message;
_L16:
        ((v) (obj1)).b(ad1);
          goto _L9
_L17:
        ((v) (obj1)).a();
          goto _L9
_L18:
        ((v) (obj1)).e(ad1);
          goto _L9
_L19:
        ((v) (obj1)).c(ad1);
          goto _L9
_L20:
        ((v) (obj1)).d(ad1);
          goto _L9
_L21:
        ((v) (obj1)).b();
          goto _L9
_L22:
        ((v) (obj1)).c();
          goto _L9
_L23:
        ((v) (obj1)).d();
          goto _L9
_L8:
        b.clear();
        return;
_L9:
        i++;
          goto _L13
_L12:
        if (!flag) goto _L9; else goto _L14
_L14:
        j;
        JVM INSTR tableswitch 257 263: default 460
    //                   257 302
    //                   258 327
    //                   259 336
    //                   260 343
    //                   261 399
    //                   262 352
    //                   263 361;
           goto _L9 _L15 _L16 _L17 _L18 _L9 _L19 _L20
_L11:
        j;
        JVM INSTR tableswitch 513 515: default 492
    //                   513 370
    //                   514 377
    //                   515 384;
           goto _L9 _L21 _L22 _L23
    }
}
