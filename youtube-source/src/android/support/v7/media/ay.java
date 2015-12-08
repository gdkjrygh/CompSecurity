// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.media:
//            at, as

final class ay extends Handler
{

    private final WeakReference a;

    public ay(at at1)
    {
        a = new WeakReference(at1);
    }

    public final void a()
    {
        a.clear();
    }

    public final void handleMessage(Message message)
    {
        at at1 = (at)a.get();
        if (at1 == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        int i;
        int j;
        int k;
        i = message.what;
        j = message.arg1;
        k = message.arg2;
        obj1 = message.obj;
        obj = message.peekData();
        i;
        JVM INSTR tableswitch 0 5: default 84
    //                   0 121
    //                   1 134
    //                   2 140
    //                   3 198
    //                   4 227
    //                   5 171;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        boolean flag = false;
_L10:
        if (!flag && as.i())
        {
            Log.d("MediaRouteProviderProxy", (new StringBuilder("Unhandled message from server: ")).append(message).toString());
        }
_L2:
        return;
_L4:
        at1.a(j);
        flag = true;
          goto _L10
_L5:
        flag = true;
          goto _L10
_L6:
        if (obj1 != null && !(obj1 instanceof Bundle)) goto _L3; else goto _L11
_L11:
        flag = at1.a(j, k, (Bundle)obj1);
          goto _L10
_L9:
        if (obj1 != null && !(obj1 instanceof Bundle)) goto _L3; else goto _L12
_L12:
        flag = at1.a((Bundle)obj1);
          goto _L10
_L7:
        if (obj1 != null && !(obj1 instanceof Bundle)) goto _L3; else goto _L13
_L13:
        flag = at1.a(j, (Bundle)obj1);
          goto _L10
_L8:
        if (obj1 != null && !(obj1 instanceof Bundle)) goto _L3; else goto _L14
_L14:
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((Bundle) (obj)).getString("error");
        }
        flag = at1.a(j, ((String) (obj)), (Bundle)obj1);
          goto _L10
    }
}
