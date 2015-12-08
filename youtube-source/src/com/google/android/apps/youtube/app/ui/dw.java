// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.legacy.model.Artist;
import com.google.android.apps.youtube.datalib.legacy.model.MusicVideo;
import com.google.android.youtube.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            fm, fq, dx, v, 
//            fp

public final class dw extends fm
{

    private final bc f;

    public dw(Context context, am am1, bj bj, v v, bc bc1, fp fp)
    {
        super(context, am1, bj, v, fp);
        f = (bc)c.a(bc1);
    }

    protected final void a(fq fq1, Object obj)
    {
        obj = (Artist)obj;
        fq1.b.setText(a.getResources().getString(p.B, new Object[] {
            ((Artist) (obj)).name
        }));
    }

    protected final volatile void a(Object obj)
    {
        obj = (Artist)obj;
        b.a(((Artist) (obj)).id, ((Artist) (obj)).name);
    }

    protected final void a(Object obj, b b)
    {
        Object obj1 = (Artist)obj;
        obj = new ArrayList();
        for (obj1 = ((Artist) (obj1)).artistTape.iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(((MusicVideo)((Iterator) (obj1)).next()).videoId)) { }
        f.x().a(obj, new dx(this, b));
    }
}
