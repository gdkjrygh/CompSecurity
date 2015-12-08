// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.embeddedbrowser;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.contextlogic.wish.ui.fragment.embeddedbrowser:
//            EmbeddedBrowserFragment

class this._cls0
    implements android.content.tener
{

    final EmbeddedBrowserFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(EmbeddedBrowserFragment.access$400(EmbeddedBrowserFragment.this))));
            break;
        }
    }

    Q()
    {
        this$0 = EmbeddedBrowserFragment.this;
        super();
    }
}
