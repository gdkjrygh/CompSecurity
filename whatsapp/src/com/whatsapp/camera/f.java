// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.view.KeyEvent;
import com.whatsapp.ConversationTextEntry;
import com.whatsapp.cq;
import com.whatsapp.util.c;
import com.whatsapp.za;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity

class f
    implements za
{

    final CameraActivity a;

    f(CameraActivity cameraactivity)
    {
        a = cameraactivity;
        super();
    }

    public void a()
    {
        CameraActivity.q(a).dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public void a(int i)
    {
        int j = CameraActivity.q(a).getSelectionStart();
        int k = CameraActivity.q(a).getSelectionEnd();
        StringBuilder stringbuilder;
        int l;
        if (j > k)
        {
            l = k;
            k = j;
        } else
        {
            l = j;
        }
        stringbuilder = new StringBuilder(CameraActivity.q(a).getText().toString());
        stringbuilder.replace(l, k, c.a(i));
        if (stringbuilder.codePointCount(0, stringbuilder.length()) > 160)
        {
            return;
        } else
        {
            CameraActivity.q(a).setText(stringbuilder);
            CameraActivity.q(a).setSelection(l + c.h(i));
            CameraActivity.d(a).dismiss();
            return;
        }
    }
}
