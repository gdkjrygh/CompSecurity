// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.KeyEvent;
import com.whatsapp.util.c;

// Referenced classes of package com.whatsapp:
//            za, VideoPreviewActivity, ConversationTextEntry, cq

class ata
    implements za
{

    final VideoPreviewActivity a;

    ata(VideoPreviewActivity videopreviewactivity)
    {
        a = videopreviewactivity;
        super();
    }

    public void a()
    {
        VideoPreviewActivity.j(a).dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public void a(int i)
    {
        int j = VideoPreviewActivity.j(a).getSelectionStart();
        int k = VideoPreviewActivity.j(a).getSelectionEnd();
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
        stringbuilder = new StringBuilder(VideoPreviewActivity.j(a).getText().toString());
        stringbuilder.replace(l, k, c.a(i));
        if (stringbuilder.codePointCount(0, stringbuilder.length()) > 160)
        {
            return;
        } else
        {
            VideoPreviewActivity.j(a).setText(stringbuilder);
            VideoPreviewActivity.j(a).setSelection(l + c.h(i));
            VideoPreviewActivity.m(a).dismiss();
            return;
        }
    }
}
