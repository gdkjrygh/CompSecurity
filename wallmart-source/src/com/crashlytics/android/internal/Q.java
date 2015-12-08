// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;


// Referenced classes of package com.crashlytics.android.internal:
//            O, U, ab, V

final class Q
    implements Runnable
{

    private V a;
    private boolean b;
    private O c;

    Q(O o, V v, boolean flag)
    {
        c = o;
        a = v;
        b = flag;
        super();
    }

    public final void run()
    {
        try
        {
            c.a.a(a);
            if (b)
            {
                c.a.d();
            }
            return;
        }
        catch (Exception exception)
        {
            ab.d("Crashlytics failed to record session event.");
        }
    }
}
