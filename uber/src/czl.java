// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.widget.TextView;
import com.ubercab.client.core.app.RiderActivity;

public final class czl extends czr
{

    private final RiderActivity a;

    public czl(RiderActivity rideractivity)
    {
        a = rideractivity;
    }

    public final void a()
    {
        Object obj = a.b();
        if (obj != null)
        {
            if (android.os.Build.VERSION.SDK_INT < 16 && NavUtils.getParentActivityName(a) != null)
            {
                ((ActionBar) (obj)).b(true);
            }
            float f = a.getResources().getDimension(0x7f080246);
            int i = a.getResources().getIdentifier("action_bar_title", "id", "android");
            obj = (TextView)a.findViewById(i);
            if (obj != null)
            {
                hoq.a(a, ((TextView) (obj)), 0x7f070695);
                ((TextView) (obj)).setTextSize(0, f);
            }
            f = a.getResources().getDimension(0x7f080245);
            i = a.getResources().getIdentifier("action_bar_subtitle", "id", "android");
            obj = (TextView)a.findViewById(i);
            if (obj != null)
            {
                hoq.a(a, ((TextView) (obj)), 0x7f07069b);
                ((TextView) (obj)).setTextSize(0, f);
                return;
            }
        }
    }
}
