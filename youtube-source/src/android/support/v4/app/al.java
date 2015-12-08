// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            ah, an, as

public final class al
{

    Context a;
    CharSequence b;
    CharSequence c;
    PendingIntent d;
    PendingIntent e;
    RemoteViews f;
    Bitmap g;
    CharSequence h;
    int i;
    int j;
    boolean k;
    as l;
    CharSequence m;
    int n;
    int o;
    boolean p;
    ArrayList q;
    Notification r;

    public al(Context context)
    {
        q = new ArrayList();
        r = new Notification();
        a = context;
        r.when = System.currentTimeMillis();
        r.audioStreamType = -1;
        j = 0;
    }

    private void a(int i1, boolean flag)
    {
        if (flag)
        {
            Notification notification = r;
            notification.flags = notification.flags | i1;
            return;
        } else
        {
            Notification notification1 = r;
            notification1.flags = notification1.flags & ~i1;
            return;
        }
    }

    public final Notification a()
    {
        return ah.a().a(this);
    }

    public final al a(int i1)
    {
        r.icon = i1;
        return this;
    }

    public final al a(int i1, int j1, boolean flag)
    {
        n = i1;
        o = j1;
        p = false;
        return this;
    }

    public final al a(long l1)
    {
        r.when = l1;
        return this;
    }

    public final al a(PendingIntent pendingintent)
    {
        d = pendingintent;
        return this;
    }

    public final al a(Bitmap bitmap)
    {
        g = bitmap;
        return this;
    }

    public final al a(RemoteViews remoteviews)
    {
        r.contentView = remoteviews;
        return this;
    }

    public final al a(CharSequence charsequence)
    {
        b = charsequence;
        return this;
    }

    public final al a(boolean flag)
    {
        a(2, flag);
        return this;
    }

    public final al b(int i1)
    {
        r.defaults = 5;
        Notification notification = r;
        notification.flags = notification.flags | 1;
        return this;
    }

    public final al b(CharSequence charsequence)
    {
        c = charsequence;
        return this;
    }

    public final al b(boolean flag)
    {
        a(16, flag);
        return this;
    }

    public final al c(CharSequence charsequence)
    {
        h = charsequence;
        return this;
    }

    public final al d(CharSequence charsequence)
    {
        r.tickerText = charsequence;
        return this;
    }
}
