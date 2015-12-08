// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.ui;

import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.core.player.ui:
//            InfoCardGalleryDialogFragment

final class b
    implements android.view.View.OnClickListener
{

    final InfoCardGalleryDialogFragment a;

    b(InfoCardGalleryDialogFragment infocardgallerydialogfragment)
    {
        a = infocardgallerydialogfragment;
        super();
    }

    public final void onClick(View view)
    {
        InfoCardGalleryDialogFragment.a(a);
        InfoCardGalleryDialogFragment.b(a).b();
        a.a();
    }
}
