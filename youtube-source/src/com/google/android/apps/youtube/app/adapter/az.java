// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.format.Formatter;
import android.util.FloatMath;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import com.google.android.apps.youtube.datalib.model.transfer.a;
import com.google.android.youtube.j;
import com.google.android.youtube.p;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ae, ay

final class az
    implements ae
{

    final ay a;
    private final View b;
    private final TextView c;
    private final ImageView d;
    private final TextView e;
    private final ProgressBar f;
    private final TextView g;
    private final TextView h;
    private final View i;

    private az(ay ay1, View view)
    {
        a = ay1;
        super();
        b = view;
        c = (TextView)view.findViewById(j.fF);
        d = (ImageView)view.findViewById(j.fy);
        e = (TextView)view.findViewById(j.y);
        f = (ProgressBar)view.findViewById(j.dU);
        g = (TextView)view.findViewById(j.eK);
        h = (TextView)view.findViewById(j.dT);
        i = view.findViewById(j.aE);
    }

    az(ay ay1, View view, ViewGroup viewgroup)
    {
        this(ay1, view);
    }

    public final View a(int k, Object obj)
    {
        obj = (Transfer)obj;
        com.google.android.apps.youtube.app.adapter.ay.a(a).put(obj, this);
        ay.b(a).a(i, obj);
        if (e != null && ((Transfer) (obj)).g.a("username"))
        {
            e.setText(((Transfer) (obj)).g.b("username"));
        }
        if (c != null)
        {
            c.setText(((Transfer) (obj)).g.b("upload_title"));
        }
        if (d != null)
        {
            byte abyte0[] = ((Transfer) (obj)).g.c("upload_file_thumbnail");
            if (abyte0 != null)
            {
                d.setImageBitmap(BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length));
            }
        }
        if (g != null)
        {
            if (((Transfer) (obj)).c == com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.RUNNING)
            {
                g.setText(Formatter.formatShortFileSize(ay.c(a), ((Transfer) (obj)).f));
            } else
            {
                g.setText(null);
            }
        }
        a(((Transfer) (obj)));
        return b;
    }

    final void a(Transfer transfer)
    {
        int k;
        boolean flag;
        flag = false;
        k = (int)FloatMath.ceil((100F * (float)transfer.e) / (float)transfer.f);
        if (f != null)
        {
            if (transfer.c == com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.FAILED)
            {
                f.setProgress(0);
            } else
            {
                f.setProgress(k);
            }
        }
        if (h == null) goto _L2; else goto _L1
_L1:
        if (transfer.c != com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.RUNNING) goto _L4; else goto _L3
_L3:
        if (transfer.f == transfer.e)
        {
            h.setText(p.gu);
        } else
        {
            h.setText(ay.c(a).getString(p.dK, new Object[] {
                Integer.valueOf(k)
            }));
            flag = true;
        }
_L6:
        i.setClickable(flag);
        i.setEnabled(flag);
        if (!flag)
        {
            ay.b(a).b();
        }
        return;
_L4:
        if (transfer.c == com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.FAILED)
        {
            h.setText(p.gr);
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        h.setText(p.gt);
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
