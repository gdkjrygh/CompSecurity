// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.c;

import android.content.ContentResolver;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import java.lang.ref.WeakReference;

// Referenced classes of package com.jiubang.core.c:
//            j, k

public class l extends Handler
{

    final j a;

    public l(j j1, Looper looper)
    {
        a = j1;
        super(looper);
    }

    public void handleMessage(Message message)
    {
        Object obj;
        k k1;
        int i;
        obj = (ContentResolver)a.b.get();
        if (obj == null)
        {
            return;
        }
        k1 = (k)message.obj;
        i = message.what;
        message.arg1;
        JVM INSTR tableswitch 1 5: default 72
    //                   1 102
    //                   2 162
    //                   3 194
    //                   4 244
    //                   5 289;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        obj = k1.b.obtainMessage(i);
        obj.obj = k1;
        obj.arg1 = message.arg1;
        ((Message) (obj)).sendToTarget();
        return;
_L2:
        Cursor cursor = ((ContentResolver) (obj)).query(k1.a, k1.c, k1.d, k1.e, k1.f);
        obj = cursor;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        cursor.getCount();
        obj = cursor;
_L7:
        k1.g = obj;
        continue; /* Loop/switch isn't completed */
        obj;
        obj = null;
        if (true) goto _L7; else goto _L3
_L3:
        try
        {
            k1.g = ((ContentResolver) (obj)).insert(k1.a, k1.i);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            k1.g = null;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        try
        {
            k1.g = Integer.valueOf(((ContentResolver) (obj)).update(k1.a, k1.i, k1.d, k1.e));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            k1.g = Integer.valueOf(-10000);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        try
        {
            k1.g = Integer.valueOf(((ContentResolver) (obj)).delete(k1.a, k1.d, k1.e));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            k1.g = Integer.valueOf(-10000);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        try
        {
            k1.g = ((ContentResolver) (obj)).applyBatch(k1.j, k1.k);
        }
        catch (RemoteException remoteexception)
        {
            remoteexception.printStackTrace();
        }
        catch (OperationApplicationException operationapplicationexception)
        {
            operationapplicationexception.printStackTrace();
        }
        if (true) goto _L1; else goto _L8
_L8:
    }
}
