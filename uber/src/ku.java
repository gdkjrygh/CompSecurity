// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Set;

public final class ku
{

    public static final ku a = new ku();

    protected ku()
    {
    }

    public static AdRequestParcel a(Context context, lw lw1)
    {
        Object obj = lw1.a();
        String s;
        android.location.Location location;
        android.os.Bundle bundle;
        String s1;
        int i;
        int j;
        long l;
        boolean flag;
        boolean flag1;
        if (obj != null)
        {
            l = ((Date) (obj)).getTime();
        } else
        {
            l = -1L;
        }
        s = lw1.b();
        i = lw1.c();
        obj = lw1.d();
        if (!((Set) (obj)).isEmpty())
        {
            obj = Collections.unmodifiableList(new ArrayList(((java.util.Collection) (obj))));
        } else
        {
            obj = null;
        }
        flag = lw1.a(context);
        j = lw1.l();
        location = lw1.e();
        bundle = lw1.a(kb);
        flag1 = lw1.f();
        s1 = lw1.g();
        context = lw1.i();
        if (context != null)
        {
            context = new SearchAdRequestParcel(context);
        } else
        {
            context = null;
        }
        return new AdRequestParcel(5, l, bundle, i, ((java.util.List) (obj)), flag, j, flag1, s1, context, location, s, lw1.k(), lw1.m(), Collections.unmodifiableList(new ArrayList(lw1.n())), lw1.h());
    }

    public static ku a()
    {
        return a;
    }

}
