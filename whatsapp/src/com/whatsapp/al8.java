// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.view.View;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.internal.ActionBarSherlockCompat;
import com.actionbarsherlock.widget.SearchView;

// Referenced classes of package com.whatsapp:
//            _d, ab3, App, aq

public class al8
{

    public static View a(Context context, ActionBarSherlock actionbarsherlock, aq aq)
    {
        if (actionbarsherlock instanceof ActionBarSherlockCompat)
        {
            context = new SearchView(actionbarsherlock.getActionBar().getThemedContext());
            context.setOnQueryTextListener(new _d(aq));
            return context;
        } else
        {
            context = new android.widget.SearchView(actionbarsherlock.getActionBar().getThemedContext());
            context.setOnQueryTextListener(new ab3(aq));
            return context;
        }
    }

    public static void a(View view, String s, boolean flag)
    {
label0:
        {
            if (view instanceof SearchView)
            {
                ((SearchView)view).setQuery(s, flag);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            ((android.widget.SearchView)view).setQuery(s, flag);
        }
    }
}
