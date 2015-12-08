// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.weather.commons.video2.dsx.VideoProgrammingEndpoint;
import com.weather.dal2.cache.FileCache;
import com.weather.dal2.net.Receiver;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;

// Referenced classes of package com.weather.commons.video2:
//            VideoProgrammingConnection

private class <init>
    implements Receiver
{

    private final String localeGlob;
    final VideoProgrammingConnection this$0;
    private final Receiver videoProgrammingReceiver;

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((String)obj, obj1);
    }

    public void onCompletion(final String result, final Object userData)
    {
        (new Thread(new Runnable() {

            final VideoProgrammingConnection.FileNameReceiver this$1;
            final String val$result;
            final Object val$userData;

            public void run()
            {
                String s = Files.toString(new File(result), Charsets.UTF_8);
                videoProgrammingReceiver.onCompletion(VideoProgrammingEndpoint.fromJson(s), userData);
                return;
                Object obj;
                obj;
_L2:
                VideoProgrammingConnection.access$200(this$0).invalidate(localeGlob);
                videoProgrammingReceiver.onError(((Throwable) (obj)), userData);
                return;
                obj;
                if (true) goto _L2; else goto _L1
_L1:
            }

            
            {
                this$1 = VideoProgrammingConnection.FileNameReceiver.this;
                result = s;
                userData = obj;
                super();
            }
        })).start();
    }

    public void onError(Throwable throwable, Object obj)
    {
        videoProgrammingReceiver.onError(throwable, obj);
    }



    private _cls1.val.userData(String s, Receiver receiver)
    {
        this$0 = VideoProgrammingConnection.this;
        super();
        localeGlob = s;
        videoProgrammingReceiver = receiver;
    }

    videoProgrammingReceiver(String s, Receiver receiver, videoProgrammingReceiver videoprogrammingreceiver)
    {
        this(s, receiver);
    }
}
