// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

// Referenced classes of package com.whatsapp.messaging:
//            MessageService, CaptivePortalActivity

public final class aj extends AsyncTask
{

    private final Context a;

    public aj(Context context)
    {
        a = context;
    }

    protected Boolean a(Void avoid[])
    {
        boolean flag;
        try
        {
            flag = MessageService.y();
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Thread.currentThread().interrupt();
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    protected void a(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            boolean1 = new Intent(a, com/whatsapp/messaging/CaptivePortalActivity);
            boolean1.setFlags(0x10000000);
            a.startActivity(boolean1);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }
}
