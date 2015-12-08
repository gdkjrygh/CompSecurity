// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.wf.wellsfargomobile:
//            InteractionAdvisorOffersFragment

public class q
    implements android.view.View.OnClickListener
{

    JSONObject a;
    final InteractionAdvisorOffersFragment b;

    public q(InteractionAdvisorOffersFragment interactionadvisoroffersfragment, JSONObject jsonobject)
    {
        b = interactionadvisoroffersfragment;
        super();
        a = jsonobject;
    }

    public void onClick(View view)
    {
        try
        {
            view = a.getString("destinationURL");
            b.a(a, "CLICK");
            view = new Intent("android.intent.action.VIEW", Uri.parse(view));
            b.startActivity(view);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return;
        }
    }
}
