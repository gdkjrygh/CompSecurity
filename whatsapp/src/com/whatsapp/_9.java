// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.ci;

// Referenced classes of package com.whatsapp:
//            ChangeNumber

class _9
    implements ci
{

    final ChangeNumber a;

    _9(ChangeNumber changenumber)
    {
        a = changenumber;
        super();
    }

    public void a(int i)
    {
        ChangeNumber.d(a).sendEmptyMessage(3);
    }
}
