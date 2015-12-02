// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.view.View;
import android.widget.SeekBar;
import com.whatsapp.util.s;

// Referenced classes of package com.whatsapp:
//            App, RecordAudio

class aom
    implements android.view.View.OnClickListener
{

    final RecordAudio a;

    aom(RecordAudio recordaudio)
    {
        a = recordaudio;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            int i = App.am;
            if (RecordAudio.n(a).f())
            {
                RecordAudio.j(a).removeMessages(0);
                RecordAudio.n(a).h();
                RecordAudio.c(a, 5);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (RecordAudio.f(a) == 5 && RecordAudio.n(a).b() != RecordAudio.n(a).a())
            {
                RecordAudio.c(a, 3);
                RecordAudio.n(a).b(RecordAudio.h(a).getProgress());
                RecordAudio.n(a).i();
                RecordAudio.j(a).sendEmptyMessage(0);
                if (i == 0)
                {
                    break label0;
                }
            }
            RecordAudio.b(a, RecordAudio.h(a).getProgress());
        }
        RecordAudio.a(a, RecordAudio.f(a));
    }
}
