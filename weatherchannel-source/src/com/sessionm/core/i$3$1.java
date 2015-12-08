// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.util.Log;
import com.sessionm.net.Request;
import com.sessionm.net.c;
import com.sessionm.net.http.d;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.sessionm.core:
//            i

class fx
    implements Runnable
{

    final Request fx;
    final  fy;

    public void run()
    {
        if (Log.isLoggable(i.TAG, 3))
        {
            Log.d(i.TAG, String.format(Locale.US, "finished video preload request: %s", new Object[] {
                fx.getURL()
            }));
        }
        i.b(fy.).remove(fx.getURL());
        if (fx.bd() != com.sessionm.net.t.State.gI || fx.aU().bC() == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        if (i.b(fy., fx.getURL()).createNewFile())
        {
            com.sessionm.core.i.c(fy.).add(com.sessionm.core.i.c(fy., fx.getURL()).getName());
        }
_L1:
        return;
        IOException ioexception;
        ioexception;
        if (Log.isLoggable(i.TAG, 5))
        {
            Log.w(i.TAG, "Error saving video ", ioexception);
            return;
        }
          goto _L1
    }

    ( , Request request)
    {
        fy = ;
        fx = request;
        super();
    }

    // Unreferenced inner class com/sessionm/core/i$3

/* anonymous class */
    class i._cls3 extends c
    {

        final i fv;

        public void onReplyReceived(Request request)
        {
            com.sessionm.core.i.d(fv).execute(new i._cls3._cls1(this, request));
        }

        public File outputFileForRequest(Request request)
        {
            return com.sessionm.core.i.c(fv, request.getURL());
        }

            
            {
                fv = j;
                super();
            }
    }

}
