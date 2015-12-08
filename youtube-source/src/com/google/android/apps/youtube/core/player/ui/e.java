// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.ui;

import android.support.v4.view.bx;

// Referenced classes of package com.google.android.apps.youtube.core.player.ui:
//            PageIndicator, InfoCardGalleryDialogFragment

final class e
    implements bx
{

    final InfoCardGalleryDialogFragment a;
    private PageIndicator b;

    public e(InfoCardGalleryDialogFragment infocardgallerydialogfragment, PageIndicator pageindicator)
    {
        a = infocardgallerydialogfragment;
        super();
        b = pageindicator;
    }

    public final void a(int i)
    {
        if (b != null)
        {
            b.setCurrentPage(i);
        }
    }

    public final void a(int i, float f)
    {
    }

    public final void b(int i)
    {
    }
}
