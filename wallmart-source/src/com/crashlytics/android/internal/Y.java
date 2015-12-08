// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;


// Referenced classes of package com.crashlytics.android.internal:
//            ab, K, U

final class Y
    implements Runnable
{

    private final K a;
    private final U b;

    public Y(K k, U u)
    {
        a = k;
        b = u;
    }

    public final void run()
    {
        try
        {
            ab.c("Performing time based analytics file roll over.");
            if (!a.a())
            {
                b.c();
            }
            return;
        }
        catch (Exception exception)
        {
            ab.d("Crashlytics failed to roll over session analytics file");
        }
    }
}
