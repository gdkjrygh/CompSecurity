// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.app.Activity;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            CommentFooterPresenter

public final class r
    implements j
{

    private final Activity a;
    private final android.view.View.OnClickListener b;

    public r(Activity activity, android.view.View.OnClickListener onclicklistener)
    {
        a = (Activity)c.a(activity);
        b = (android.view.View.OnClickListener)c.a(onclicklistener);
    }

    public final g a()
    {
        return new CommentFooterPresenter(a, b);
    }
}
