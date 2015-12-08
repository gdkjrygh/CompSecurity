// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.zxing.client.android.a.c;
import com.google.zxing.f;

// Referenced classes of package com.google.zxing.client.android:
//            b, m, CaptureActivity, j

public final class CaptureActivityHandler extends Handler
{

    private static final String a = com/google/zxing/client/android/CaptureActivityHandler.getSimpleName();
    private final CaptureActivity b;
    private final b c;
    private State d;
    private final c e;

    CaptureActivityHandler(CaptureActivity captureactivity, String s, c c1)
    {
        b = captureactivity;
        c = new b(captureactivity, s, new m(captureactivity.a()));
        c.start();
        d = State.SUCCESS;
        e = c1;
        c1.b();
        b();
    }

    private void b()
    {
        if (d == State.SUCCESS)
        {
            d = State.PREVIEW;
            e.a(c.a(), j.b);
            e.b(this, j.a);
            b.d();
        }
    }

    public final void a()
    {
        d = State.DONE;
        e.c();
        Message.obtain(c.a(), j.g).sendToTarget();
        try
        {
            c.join(500L);
        }
        catch (InterruptedException interruptedexception) { }
        removeMessages(j.d);
        removeMessages(com.google.zxing.client.android.j.c);
    }

    public final void handleMessage(Message message)
    {
        if (message.what == j.a)
        {
            if (d == State.PREVIEW)
            {
                e.b(this, j.a);
            }
        } else
        {
            if (message.what == j.h)
            {
                Log.d(a, "Got restart preview message");
                b();
                return;
            }
            if (message.what == j.d)
            {
                Log.d(a, "Got decode succeeded message");
                d = State.SUCCESS;
                Object obj = message.getData();
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = (Bitmap)((Bundle) (obj)).getParcelable("barcode_bitmap");
                }
                b.a((f)message.obj, ((Bitmap) (obj)));
                return;
            }
            if (message.what == com.google.zxing.client.android.j.c)
            {
                d = State.PREVIEW;
                e.a(c.a(), j.b);
                return;
            }
            if (message.what == j.i)
            {
                Log.d(a, "Got return scan result message");
                b.setResult(-1, (Intent)message.obj);
                b.finish();
                return;
            }
            if (message.what == j.e)
            {
                Log.d(a, "Got product query message");
                message = new Intent("android.intent.action.VIEW", Uri.parse((String)message.obj));
                message.addFlags(0x80000);
                b.startActivity(message);
                return;
            }
        }
    }


    private class State extends Enum
    {

        private static final State $VALUES[];
        public static final State DONE;
        public static final State PREVIEW;
        public static final State SUCCESS;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/google/zxing/client/android/CaptureActivityHandler$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            PREVIEW = new State("PREVIEW", 0);
            SUCCESS = new State("SUCCESS", 1);
            DONE = new State("DONE", 2);
            $VALUES = (new State[] {
                PREVIEW, SUCCESS, DONE
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }

}
