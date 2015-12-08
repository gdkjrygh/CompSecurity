// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.support.v7.b.e;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.media:
//            bj, bs, d, l, 
//            br, j

final class bq extends bj
{

    private static final ArrayList a;
    private final AudioManager b;
    private final bs c = new bs(this);
    private int d;

    public bq(Context context)
    {
        super(context);
        d = -1;
        b = (AudioManager)context.getSystemService("audio");
        context.registerReceiver(c, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        f();
    }

    static AudioManager a(bq bq1)
    {
        return bq1.b;
    }

    static void b(bq bq1)
    {
        bq1.f();
    }

    static int c(bq bq1)
    {
        return bq1.d;
    }

    private void f()
    {
        Object obj = a().getResources();
        int i = b.getStreamMaxVolume(3);
        d = b.getStreamVolume(3);
        obj = (new d("DEFAULT_ROUTE", ((Resources) (obj)).getString(e.b))).a(a).b(3).a(0).e(1).d(i).c(d).a();
        a((new l()).a(((c) (obj))).a());
    }

    public final j a(String s)
    {
        if (s.equals("DEFAULT_ROUTE"))
        {
            return new br(this);
        } else
        {
            return null;
        }
    }

    static 
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        intentfilter.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arraylist = new ArrayList();
        a = arraylist;
        arraylist.add(intentfilter);
    }
}
