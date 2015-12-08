// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.content.Context;
import android.speech.tts.TextToSpeech;

// Referenced classes of package com.miteksystems.misnap:
//            s, MiSnapAPI

public final class r
{

    Context a;
    MiSnapAPI b;
    boolean c;
    private TextToSpeech d;

    public r(Context context, MiSnapAPI misnapapi, boolean flag)
    {
        a = null;
        b = null;
        c = false;
        a = context;
        b = misnapapi;
        c = flag;
        if (c)
        {
            d = new TextToSpeech(a, new s(this));
            b.x();
        }
    }

    static TextToSpeech a(r r1)
    {
        return r1.d;
    }

    public final void a()
    {
        while (!c || d == null) 
        {
            return;
        }
        d.stop();
    }

    public final void a(String s1)
    {
        if (!c || d == null || s1 == null)
        {
            return;
        } else
        {
            d.stop();
            d.speak(s1, 0, null);
            return;
        }
    }

    public final void b()
    {
        while (!c || d == null) 
        {
            return;
        }
        d.shutdown();
    }
}
