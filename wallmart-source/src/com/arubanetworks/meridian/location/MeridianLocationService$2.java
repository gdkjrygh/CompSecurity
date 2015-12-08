// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.location;

import android.os.Handler;
import com.arubanetworks.meridian.editor.EditorKey;

// Referenced classes of package com.arubanetworks.meridian.location:
//            MeridianLocationService

class b
    implements com.arubanetworks.meridian.requests.ner
{

    final EditorKey a;
    final b b;
    final MeridianLocationService c;

    public void onError(Throwable throwable)
    {
        MeridianLocationService.a(c, null);
    /* block-local class not found */
    class _cls1 {}

        (new Handler()).postDelayed(new _cls1(), b.b());
    }

    _cls1(MeridianLocationService meridianlocationservice, EditorKey editorkey, _cls1 _pcls1)
    {
        c = meridianlocationservice;
        a = editorkey;
        b = _pcls1;
        super();
    }
}
