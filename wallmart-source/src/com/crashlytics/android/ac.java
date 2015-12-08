// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.aa;
import com.crashlytics.android.internal.q;
import com.crashlytics.android.internal.v;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.crashlytics.android:
//            Crashlytics, aa, v, Z

final class ac extends aa
{

    private final float a;
    private com.crashlytics.android.aa b;

    ac(com.crashlytics.android.aa aa1, float f)
    {
        b = aa1;
        super();
        a = f;
    }

    public final void a()
    {
        float f;
        v.a().b().a("Crashlytics", (new StringBuilder("Starting report processing in ")).append(a).append(" second(s)...").toString());
        f = a;
        if (f <= 0.0F)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        Thread.sleep((long)(a * 1000F));
        Object obj;
        Crashlytics crashlytics = Crashlytics.getInstance();
        com.crashlytics.android.v v1 = crashlytics.l();
        obj = b.a();
        if (!v1.a())
        {
            if (((List) (obj)).isEmpty() || crashlytics.p())
            {
                break MISSING_BLOCK_LABEL_409;
            }
            v.a().b().a("Crashlytics", (new StringBuilder("User declined to send. Removing ")).append(((List) (obj)).size()).append(" Report(s).").toString());
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Z)((Iterator) (obj)).next()).a()) { }
        }
_L1:
        aa.a(b, null);
        return;
        obj;
        try
        {
            Thread.currentThread().interrupt();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            v.a().b().a("Crashlytics", "An unexpected error occurred while attempting to upload crash reports.", ((Throwable) (obj)));
        }
          goto _L1
_L4:
        if (((List) (obj)).isEmpty() || Crashlytics.getInstance().l().a()) goto _L1; else goto _L2
_L2:
        v.a().b().a("Crashlytics", (new StringBuilder("Attempting to send ")).append(((List) (obj)).size()).append(" report(s)").toString());
        Z z;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); b.a(z))
        {
            z = (Z)((Iterator) (obj)).next();
        }

        List list = b.a();
        obj = list;
        if (list.isEmpty()) goto _L4; else goto _L3
_L3:
        int i;
        long l;
        l = aa.b()[Math.min(i, aa.b().length - 1)];
        v.a().b().a("Crashlytics", (new StringBuilder("Report submisson: scheduling delayed retry in ")).append(l).append(" seconds").toString());
        Thread.sleep(l * 1000L);
        i++;
        obj = list;
          goto _L4
        InterruptedException interruptedexception;
        interruptedexception;
        Thread.currentThread().interrupt();
          goto _L1
        i = 0;
          goto _L4
    }
}
