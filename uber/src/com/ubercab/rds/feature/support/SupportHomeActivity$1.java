// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.support;

import com.ubercab.rds.core.model.SupportTree;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

// Referenced classes of package com.ubercab.rds.feature.support:
//            SupportHomeActivity

final class a
    implements Callback
{

    final SupportHomeActivity a;

    private void a(SupportTree supporttree)
    {
        if (a.isFinishing())
        {
            return;
        }
        SupportHomeActivity.a(a, supporttree);
        SupportHomeActivity supporthomeactivity = a;
        if (SupportHomeActivity.a(a) != null)
        {
            supporttree = SupportHomeActivity.a(a).getSupportNumber();
        } else
        {
            supporttree = null;
        }
        SupportHomeActivity.a(supporthomeactivity, supporttree);
        a.invalidateOptionsMenu();
        SupportHomeActivity.b(a);
    }

    public final void failure(RetrofitError retrofiterror)
    {
        SupportHomeActivity.c(a);
    }

    public final void success(Object obj, Response response)
    {
        a((SupportTree)obj);
    }

    (SupportHomeActivity supporthomeactivity)
    {
        a = supporthomeactivity;
        super();
    }
}
