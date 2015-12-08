// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.util;

import android.os.Bundle;
import android.os.Looper;
import android.widget.Toast;

// Referenced classes of package com.jiubang.core.util:
//            ErrorReporter

class this._cls0 extends Thread
{

    final ErrorReporter this$0;

    public void run()
    {
        Looper.prepare();
        Toast.makeText(ErrorReporter.access$000(ErrorReporter.this), ErrorReporter.access$200(ErrorReporter.this).getInt("RES_TOAST_TEXT"), 1).show();
        Looper.loop();
    }

    ()
    {
        this$0 = ErrorReporter.this;
        super();
    }
}
