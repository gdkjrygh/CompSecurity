// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import com.amazon.device.home.GroupedListHeroWidget;
import com.amazon.device.home.HeroWidgetActivityStarterIntent;
import com.amazon.device.home.HomeManager;
import com.whatsapp.notification.p;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import com.whatsapp.util.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            zo, u5, App, k, 
//            og, aoz, DialogToastActivity, fa, 
//            Conversation

class ag extends AsyncTask
{

    final zo a;

    ag(zo zo1)
    {
        a = zo1;
        super();
    }

    protected ArrayList a(Void avoid[])
    {
        boolean flag = zo.d;
        Object obj = u5.d();
        avoid = new ArrayList();
        obj = ((ArrayList) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (String)((Iterator) (obj)).next();
            if (isCancelled())
            {
                return null;
            }
            og og1 = App.az.e(((String) (obj1)));
            if (og1.c > 0)
            {
                obj1 = App.ah.a(((String) (obj1)), Math.min(og1.c, 100));
                if (obj1 != null)
                {
                    avoid.addAll(((java.util.Collection) (obj1)));
                }
            }
            if (!flag)
            {
                continue;
            }
            DialogToastActivity.g++;
            break;
        } while (true);
        Collections.sort(avoid, new fa(this));
        return avoid;
    }

    public void a(ArrayList arraylist)
    {
        boolean flag = zo.d;
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist1;
        int i;
        com.whatsapp.zo.a(a, new GroupedListHeroWidget());
        com.whatsapp.zo.c(a).updateNumericBadge(arraylist.size());
        arraylist1 = new ArrayList();
        i = 0;
_L7:
        if (i >= arraylist.size() || i >= 49) goto _L4; else goto _L3
_L3:
        Object obj = new com.amazon.device.home.GroupedListHeroWidget.ListEntry(com.whatsapp.zo.a(a));
        ((com.amazon.device.home.GroupedListHeroWidget.ListEntry) (obj)).setVisualStyle(com.amazon.device.home.GroupedListHeroWidget.VisualStyle.PEEKABLE);
        c4 c4_1 = (c4)arraylist.get(i);
        Object obj1 = App.az.e(c4_1.y.a);
        String s1 = ((og) (obj1)).a(com.whatsapp.zo.a(a));
        String s2 = c.b(p.a(com.whatsapp.zo.a(a), c4_1, ((og) (obj1)), false, false));
        String s = q.k(com.whatsapp.zo.a(a), com.whatsapp.App.q(c4_1));
        ((com.amazon.device.home.GroupedListHeroWidget.ListEntry) (obj)).setContentIntent(new HeroWidgetActivityStarterIntent(com/whatsapp/Conversation.getCanonicalName(), c4_1.y.a));
        ((com.amazon.device.home.GroupedListHeroWidget.ListEntry) (obj)).setPrimaryText(c.b(s1));
        String as[] = zo.b(s2, 29);
        try
        {
            ((com.amazon.device.home.GroupedListHeroWidget.ListEntry) (obj)).setSecondaryText(as[0]);
            if (as[1].length() > 256)
            {
                as[1] = as[1].substring(0, 256);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            throw arraylist;
        }
        ((com.amazon.device.home.GroupedListHeroWidget.ListEntry) (obj)).setTertiaryText(as[1]);
        ((com.amazon.device.home.GroupedListHeroWidget.ListEntry) (obj)).setQuaternaryText(s);
        obj1 = ((og) (obj1)).i();
        if (obj1 != null)
        {
            obj1 = Uri.fromFile(((java.io.File) (obj1)));
            if (obj1 != null)
            {
                try
                {
                    ((com.amazon.device.home.GroupedListHeroWidget.ListEntry) (obj)).setPrimaryIcon(((Uri) (obj1)));
                }
                // Misplaced declaration of an exception variable
                catch (ArrayList arraylist)
                {
                    throw arraylist;
                }
            }
        }
        try
        {
            arraylist1.add(obj);
        }
        catch (Exception exception)
        {
            Log.a(exception);
        }
        if (!flag) goto _L5; else goto _L4
_L4:
        obj = new com.amazon.device.home.GroupedListHeroWidget.Group();
        if (arraylist.size() == 0)
        {
            break MISSING_BLOCK_LABEL_344;
        }
        ((com.amazon.device.home.GroupedListHeroWidget.Group) (obj)).setGroupName(com.whatsapp.zo.a(a).getString(0x7f0e0038));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_351;
        }
        try
        {
            ((com.amazon.device.home.GroupedListHeroWidget.Group) (obj)).setGroupName("");
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            throw arraylist;
        }
        ((com.amazon.device.home.GroupedListHeroWidget.Group) (obj)).setListEntries(arraylist1);
        try
        {
            zo.b(a).addGroup(0, ((com.amazon.device.home.GroupedListHeroWidget.Group) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            Log.a(arraylist);
        }
        com.whatsapp.zo.c(a).updateWidget(zo.b(a));
_L2:
        return;
        arraylist;
        throw arraylist;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    public void onPostExecute(Object obj)
    {
        a((ArrayList)obj);
    }
}
