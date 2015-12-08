// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.util.Log;
import com.sessionm.b.a;
import com.sessionm.net.Request;
import com.sessionm.net.c;
import com.sessionm.net.http.d;
import java.io.File;
import java.net.URI;
import java.util.Locale;

// Referenced classes of package com.sessionm.ui:
//            ActivityController

class val.pictureStoragePath extends c
{

    final ActivityController this$0;
    final a val$message;
    final File val$pictureStoragePath;

    public void onReplyReceived(Request request)
    {
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", String.format(Locale.US, "finished store picture request: %s", new Object[] {
                request.getURL()
            }));
        }
        if (request.bd() == com.sessionm.net.entError)
        {
            File file = request.aU().bC();
            if (file == null)
            {
                notifyContentAboutError(tentError.IMAGE_SAVE_ERROR, request.getURL());
            } else
            {
                ActivityController.access$1300(ActivityController.this, file.getAbsolutePath());
            }
        } else
        {
            notifyContentAboutError(tentError.IMAGE_SAVE_ERROR, request.getURL());
        }
        finishMessageHandling(val$message, null);
    }

    public File outputFileForRequest(Request request)
    {
        request = ActivityController.access$1400(ActivityController.this, URI.create(request.getURL()), request.a(com.sessionm.net.his._fld0));
        return new File(val$pictureStoragePath, request);
    }

    tentError()
    {
        this$0 = final_activitycontroller;
        val$message = a;
        val$pictureStoragePath = File.this;
        super();
    }
}
