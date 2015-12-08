// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.speech.tts.TextToSpeech;
import java.util.Locale;

// Referenced classes of package com.miteksystems.misnap:
//            r, MiSnapAPI

final class s
    implements android.speech.tts.TextToSpeech.OnInitListener
{

    final r a;

    s(r r1)
    {
        a = r1;
        super();
    }

    public final void onInit(int i)
    {
        if (a.b.x() != null)
        {
            r.a(a).setLanguage(new Locale(a.b.x()));
        }
    }
}
