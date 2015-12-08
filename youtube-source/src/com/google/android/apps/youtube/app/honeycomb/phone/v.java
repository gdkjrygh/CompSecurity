// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            u

final class v
    implements b
{

    final ScreenManagementActivity.ConfirmRemoveDialogFragment a;

    private v(ScreenManagementActivity.ConfirmRemoveDialogFragment confirmremovedialogfragment)
    {
        a = confirmremovedialogfragment;
        super();
    }

    v(ScreenManagementActivity.ConfirmRemoveDialogFragment confirmremovedialogfragment, byte byte0)
    {
        this(confirmremovedialogfragment);
    }

    public final volatile void a(Object obj, Exception exception)
    {
    }

    public final volatile void a(Object obj, Object obj1)
    {
        if (ScreenManagementActivity.ConfirmRemoveDialogFragment.a(a) != null)
        {
            ScreenManagementActivity.ConfirmRemoveDialogFragment.a(a).a();
        }
    }
}
