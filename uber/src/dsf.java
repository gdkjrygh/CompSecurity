// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import com.ubercab.client.core.ui.ChipEditText;
import java.lang.ref.WeakReference;

public final class dsf extends Handler
{

    private WeakReference a;

    private dsf(ChipEditText chipedittext)
    {
        a = new WeakReference(chipedittext);
    }

    public dsf(ChipEditText chipedittext, byte byte0)
    {
        this(chipedittext);
    }

    public final void handleMessage(Message message)
    {
        message = (dry)message.obj;
        ChipEditText chipedittext = (ChipEditText)a.get();
        if (chipedittext != null)
        {
            ChipEditText.a(chipedittext, message.a());
            message = message.b();
            if (message != null)
            {
                message.a();
                return;
            }
        }
    }
}
