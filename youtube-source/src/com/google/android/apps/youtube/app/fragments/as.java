// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.app.ui.ab;
import com.google.android.apps.youtube.app.ui.hd;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            MyUploadsFragment

final class as
    implements ab
{

    final MyUploadsFragment a;

    as(MyUploadsFragment myuploadsfragment)
    {
        a = myuploadsfragment;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Transfer)obj;
        MyUploadsFragment.b(a).f(((Transfer) (obj)));
    }
}
