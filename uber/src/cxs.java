// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import com.ubercab.chat.model.Payload;
import java.io.IOException;
import java.util.UUID;

public final class cxs
{

    private final cxx a;
    private int b;
    private MediaPlayer c;
    private MediaRecorder d;
    private Payload e;

    public cxs(Context context)
    {
        this(new cxx(new cxy(context)));
    }

    private cxs(cxx cxx1)
    {
        b = cxt.a;
        a = cxx1;
    }

    private void d()
    {
        if (b != cxt.b || c == null)
        {
            return;
        } else
        {
            c.release();
            c = null;
            b = cxt.a;
            return;
        }
    }

    public final void a()
    {
        String s;
        if (b == cxt.b)
        {
            d();
        } else
        if (b == cxt.c)
        {
            c();
        }
        d = new MediaRecorder();
        d.setOnErrorListener(new _cls1());
        s = UUID.randomUUID().toString();
        e = Payload.create("aac", s, a.b(s));
        d.setAudioSource(1);
        d.setOutputFormat(2);
        d.setOutputFile(e.getLocalPath());
        d.setAudioEncoder(3);
        d.setAudioEncodingBitRate(16384);
        d.setAudioChannels(1);
        d.setAudioSamplingRate(16000);
        try
        {
            d.prepare();
        }
        catch (IOException ioexception)
        {
            return;
        }
        d.start();
        b = cxt.c;
    }

    public final void b()
    {
        Payload payload = c();
        if (payload != null)
        {
            a.a(payload.getId());
        }
    }

    public final Payload c()
    {
        if (b != cxt.c || d == null)
        {
            e = null;
            return null;
        } else
        {
            d.stop();
            d.release();
            d = null;
            b = cxt.a;
            Payload payload = e;
            e = null;
            return payload;
        }
    }

    /* member class not found */
    class _cls1 {}

}
