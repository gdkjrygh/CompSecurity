// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;

import android.util.Log;
import com.google.android.apps.ytremote.logic.exception.HttpConnectionException;
import com.google.android.apps.ytremote.logic.exception.NotFoundException;
import java.io.IOException;

// Referenced classes of package com.google.android.apps.ytremote.backend.browserchannel:
//            UnexpectedReponseCodeException, NetworkNotAvailableException, k, a

final class n extends Thread
{

    final k a;

    n(k k1, String s)
    {
        a = k1;
        super(s);
    }

    public final void run()
    {
        boolean flag;
        do
        {
            k.h(a).a(k.j(a));
            flag = k.b(a);
        } while (flag);
_L2:
        k.k(a);
        return;
        Object obj;
        obj;
        Log.e(k.c(), "Error on hanging get: server not found.", ((Throwable) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        Log.i(k.c(), "Hanging GET thread interrupted.");
        return;
        obj;
        Log.e(k.c(), "Error on hanging get", ((Throwable) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e(k.c(), "Error on hanging get", ((Throwable) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e(k.c(), (new StringBuilder("Unexpected response on hanging get ")).append(((UnexpectedReponseCodeException) (obj)).getCode()).toString());
        switch (((UnexpectedReponseCodeException) (obj)).getCode())
        {
        case 401: 
        case 403: 
            a.a(false);
            return;
        }
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e(k.c(), "Error on hanging get. No network connection: ", ((Throwable) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e(k.c(), "Unexpected exception on hanging get", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
    }
}
