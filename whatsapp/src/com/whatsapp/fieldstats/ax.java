// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;

import android.content.Context;
import com.whatsapp.DialogToastActivity;

// Referenced classes of package com.whatsapp.fieldstats:
//            aq, bl, ag, bu, 
//            z, j

public final class ax extends aq
{

    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;
    public Double h;
    public Double i;
    public String j;
    public Double k;
    public Double l;
    public Double m;
    public Double n;
    public Double o;

    public ax()
    {
    }

    void updateFields(Context context)
    {
        int i1 = bl.a;
        z.a(context, ag.EVENT, Integer.valueOf(bu.CONTACT_US_SESSION.getCode()));
        z.a(context, ag.CONTACT_US_AUTOMATIC_EMAIL, a);
        z.a(context, ag.CONTACT_US_EXIT_STATE, n);
        z.a(context, ag.CONTACT_US_FAQ, m);
        z.a(context, ag.CONTACT_US_LOGS, o);
        z.a(context, ag.CONTACT_US_OUTAGE, d);
        z.a(context, ag.CONTACT_US_OUTAGE_EMAIL, k);
        z.a(context, ag.CONTACT_US_PROBLEM_DESCRIPTION, j);
        z.a(context, ag.SEARCH_FAQ_RESULTS_BEST_ID, i);
        if (f != null)
        {
            z.a(context, j.CONTACT_US_MENU_FAQ_T, f);
        }
        if (g != null)
        {
            z.a(context, j.CONTACT_US_SCREENSHOT_C, g);
        }
        if (b != null)
        {
            z.a(context, j.CONTACT_US_T, b);
        }
        if (c != null)
        {
            z.a(context, j.SEARCH_FAQ_RESULTS_BEST_READ_T, c);
        }
        if (h != null)
        {
            z.a(context, j.SEARCH_FAQ_RESULTS_GENERATED_C, h);
        }
        if (e != null)
        {
            z.a(context, j.SEARCH_FAQ_RESULTS_READ_C, e);
        }
        if (l != null)
        {
            z.a(context, j.SEARCH_FAQ_RESULTS_READ_T, l);
        }
        z.a(context, ag.EVENT);
        if (DialogToastActivity.g != 0)
        {
            bl.a = i1 + 1;
        }
    }
}
