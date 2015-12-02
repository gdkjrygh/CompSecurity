// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.res.Resources;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import java.util.HashSet;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImageGallery, at

class k
    implements com.actionbarsherlock.view.ActionMode.Callback
{

    final ImageGallery a;

    k(ImageGallery imagegallery)
    {
        a = imagegallery;
        super();
    }

    public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 0 0: default 24
    //                   0 26;
           goto _L1 _L2
_L1:
        return false;
_L2:
        ImageGallery.a(a, ImageGallery.l(a));
        if (true) goto _L1; else goto _L3
_L3:
    }

    public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        ImageGallery.a(a, menu.add(0, 0, 0, 0x7f0e02ba));
        ImageGallery.b(a).setShowAsAction(2);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionmode)
    {
        ImageGallery.l(a).clear();
        ImageGallery.a(a, null);
        ImageGallery.c(a).notifyDataSetChanged();
    }

    public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        actionmode.setTitle(String.format(a.getResources().getQuantityString(0x7f0d001f, ImageGallery.l(a).size()), new Object[] {
            Integer.valueOf(ImageGallery.l(a).size())
        }));
        return true;
    }
}
