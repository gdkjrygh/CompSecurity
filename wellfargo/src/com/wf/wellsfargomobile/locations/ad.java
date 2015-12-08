// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import android.content.DialogInterface;
import android.support.v7.widget.SearchView;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.wf.wellsfargomobile.locations:
//            ac, u, LocationListActivity

class ad
    implements android.content.DialogInterface.OnClickListener
{

    final ac a;

    ad(ac ac1)
    {
        a = ac1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Object obj1 = u.b(a.a)[i].toString();
        Object obj;
        try
        {
            dialoginterface = u.a(a.a, ((String) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            dialoginterface = null;
        }
        try
        {
            obj = u.b(a.a, ((String) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        u.c(a.a, ((String) (obj1)));
        ((LocationListActivity)a.a.getActivity()).g().a(((CharSequence) (obj1)), false);
        obj1 = new ac(a.a, null);
        if (dialoginterface != null)
        {
            dialoginterface = dialoginterface.toString();
        } else
        {
            dialoginterface = "";
        }
        if (obj != null)
        {
            obj = ((StringBuffer) (obj)).toString();
        } else
        {
            obj = "";
        }
        ((ac) (obj1)).b(new String[] {
            dialoginterface, obj, "false"
        });
    }
}
