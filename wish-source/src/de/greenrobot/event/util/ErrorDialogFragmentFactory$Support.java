// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.os.Bundle;
import android.support.v4.app.Fragment;

// Referenced classes of package de.greenrobot.event.util:
//            ErrorDialogFragmentFactory, ErrorDialogConfig, ThrowableFailureEvent

public static class A extends ErrorDialogFragmentFactory
{

    protected Fragment createErrorFragment(ThrowableFailureEvent throwablefailureevent, Bundle bundle)
    {
        throwablefailureevent = new ();
        throwablefailureevent.uments(bundle);
        return throwablefailureevent;
    }

    protected volatile Object createErrorFragment(ThrowableFailureEvent throwablefailureevent, Bundle bundle)
    {
        return createErrorFragment(throwablefailureevent, bundle);
    }

    public A(ErrorDialogConfig errordialogconfig)
    {
        super(errordialogconfig);
    }
}
