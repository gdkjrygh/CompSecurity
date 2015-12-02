// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ubercab.client.core.ui.ChipEditText;
import java.lang.ref.WeakReference;

public final class drz extends Handler
{

    private WeakReference a;

    private drz(Looper looper, ChipEditText chipedittext)
    {
        super(looper);
        a = new WeakReference(chipedittext);
    }

    public drz(Looper looper, ChipEditText chipedittext, byte byte0)
    {
        this(looper, chipedittext);
    }

    public final void handleMessage(Message message)
    {
        message = (drx)message.obj;
        Object obj = (ChipEditText)a.get();
        if (obj == null)
        {
            return;
        } else
        {
            com.ubercab.client.core.ui.ChipEditText.Chip chip = ChipEditText.c(((ChipEditText) (obj))).a(message.a());
            obj = ChipEditText.d(((ChipEditText) (obj))).obtainMessage();
            obj.obj = new dry(chip, message.b());
            ((Message) (obj)).sendToTarget();
            return;
        }
    }
}
