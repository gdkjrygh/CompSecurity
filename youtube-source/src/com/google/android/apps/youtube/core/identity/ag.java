// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.app.Activity;
import com.google.android.apps.youtube.common.e.d;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            aa, b, a, f

final class ag
    implements Runnable
{

    final aa a;
    private final Activity b;
    private final f c;
    private final d d = new d();

    public ag(aa aa1, Activity activity, f f)
    {
        a = aa1;
        super();
        b = activity;
        c = f;
    }

    public final void run()
    {
        Object obj;
        try
        {
            obj = (a)aa.b(a).a(c).get();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a(((Exception) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a(((Exception) (obj)));
            return;
        }
        if (!((a) (obj)).a() && ((a) (obj)).g())
        {
            if (d.a())
            {
                run();
                return;
            } else
            {
                a.a(((a) (obj)).f());
                return;
            }
        }
        if (!((a) (obj)).a() && ((a) (obj)).b())
        {
            obj = ((a) (obj)).e();
            aa.a(a, b, c, ((android.content.Intent) (obj)));
            return;
        }
        if (!((a) (obj)).a())
        {
            a.a(((a) (obj)).f());
            return;
        } else
        {
            a.a(b, c);
            return;
        }
    }
}
