// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.os.Bundle;
import android.support.v4.app.Fragment;

// Referenced classes of package de.greenrobot.event.util:
//            a, k, e

public class c extends a
{

    public c(k k)
    {
        super(k);
    }

    protected Fragment a(e e, Bundle bundle)
    {
        e = new ErrorDialogFragments.Support();
        e.setArguments(bundle);
        return e;
    }

    protected Object a(e e, Bundle bundle)
    {
        return a(e, bundle);
    }
}
