// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;

import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;

// Referenced classes of package com.walmart.android.app.qr:
//            QRMediaPlayer

class val.controller
    implements android.view.ener
{

    final QRMediaPlayer this$0;
    final MediaController val$controller;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        val$controller.show(4000);
        return false;
    }

    ()
    {
        this$0 = final_qrmediaplayer;
        val$controller = MediaController.this;
        super();
    }
}
