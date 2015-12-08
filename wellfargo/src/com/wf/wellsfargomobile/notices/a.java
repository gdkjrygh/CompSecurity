// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.notices;

import android.widget.ScrollView;

// Referenced classes of package com.wf.wellsfargomobile.notices:
//            NoticeActivity

class a
    implements Runnable
{

    final NoticeActivity a;

    a(NoticeActivity noticeactivity)
    {
        a = noticeactivity;
        super();
    }

    public void run()
    {
        NoticeActivity.c(a).scrollTo(NoticeActivity.a(a), NoticeActivity.b(a));
    }
}
