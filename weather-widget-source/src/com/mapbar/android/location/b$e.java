// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.os.Handler;
import android.os.SystemClock;
import java.util.Vector;

// Referenced classes of package com.mapbar.android.location:
//            b, t

public class a
{

    public final String a;
    public final b b;

    public void a(t t1, Object obj)
    {
        int i = t1.e();
        if (i >= com.mapbar.android.location.b.j(b)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        com.mapbar.android.location.b.b(b, i);
        com.mapbar.android.location.b.a(b, com.mapbar.android.location.b.e(b, (String)obj));
        if (com.mapbar.android.location.b.a(b) != null)
        {
            com.mapbar.android.location.b.k(b).sendEmptyMessage(2);
            com.mapbar.android.location.b.a(b, SystemClock.elapsedRealtime());
            com.mapbar.android.location.b.k(b).sendEmptyMessage(3);
        }
        try
        {
            i = com.mapbar.android.location.b.l(b).size();
        }
        // Misplaced declaration of an exception variable
        catch (t t1)
        {
            return;
        }
        if (i <= 0) goto _L1; else goto _L3
_L3:
        if (!a.equals(((a)com.mapbar.android.location.b.l(b).get(i - 1)).b)) goto _L1; else goto _L4
_L4:
        com.mapbar.android.location.b.l(b).remove(i - 1);
        return;
    }

    public (b b1, String s)
    {
        b = b1;
        a = s;
        super();
    }
}
