// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.ui.fragment.embeddedbrowser.EmbeddedBrowserFragment;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivity

class this._cls0
    implements android.view.ener
{

    final RootActivity this$0;

    public void onClick(View view)
    {
        if (RootActivity.access$500(RootActivity.this).getVisibility() == 8)
        {
            RootActivity.access$500(RootActivity.this).setVisibility(0);
            return;
        }
        view = Uri.parse(RootActivity.access$500(RootActivity.this).getText().toString());
        if (!view.getHost().equals("testing")) goto _L2; else goto _L1
_L1:
        Object obj;
        view = WishDeepLinkActivity.parseParams(view.getFragment());
        obj = view.getString("a");
        if (!((String) (obj)).equals("e") && !((String) (obj)).equals("getText")) goto _L4; else goto _L3
_L3:
        obj = getSupportFragmentManager().findFragmentByTag("ContentFragment");
        if (obj instanceof EmbeddedBrowserFragment)
        {
            ((EmbeddedBrowserFragment)obj).getWebElmentText(view.getString("v"));
        }
_L5:
        RootActivity.access$500(RootActivity.this).setText("");
        RootActivity.access$500(RootActivity.this).setVisibility(8);
        return;
_L4:
        if (((String) (obj)).equals("c") || ((String) (obj)).equals("clear"))
        {
            RootActivity.access$600(RootActivity.this).setText("");
            RootActivity.access$600(RootActivity.this).invalidate();
        } else
        if (((String) (obj)).equals("b") || ((String) (obj)).equals("click"))
        {
            obj = getSupportFragmentManager().findFragmentByTag("ContentFragment");
            if (obj instanceof EmbeddedBrowserFragment)
            {
                ((EmbeddedBrowserFragment)obj).clickWebElement(view.getString("v"));
            }
        } else
        if (((String) (obj)).equals("ch") || ((String) (obj)).equals("check"))
        {
            android.support.v4.app.Fragment fragment = getSupportFragmentManager().findFragmentByTag("ContentFragment");
            if (fragment instanceof EmbeddedBrowserFragment)
            {
                ((EmbeddedBrowserFragment)fragment).checkWebElment(view.getString("v"));
            }
        }
        if (true) goto _L5; else goto _L2
_L2:
        view = WishDeepLinkActivity.getDeepLinkTarget(view);
        processDeepLink(view, true);
        RootActivity.access$500(RootActivity.this).setText("");
        RootActivity.access$500(RootActivity.this).setVisibility(8);
        return;
    }

    dedBrowserFragment()
    {
        this$0 = RootActivity.this;
        super();
    }
}
