// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.os.Bundle;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            e, l, ActionBarActivity, ActionBar

final class g extends e
{

    g(ActionBarActivity actionbaractivity)
    {
        super(actionbaractivity);
    }

    public final ActionBar a()
    {
        k();
        return new l(a, a);
    }

    final void a(Bundle bundle)
    {
        a.getWindow().requestFeature(10);
        super.a(bundle);
    }
}
