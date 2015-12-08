// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui;

import android.view.View;
import com.sessionm.api.SessionM;

// Referenced classes of package com.weather.commons.ui:
//            PortalButton

class this._cls0
    implements android.view.tener
{

    final PortalButton this$0;

    public void onClick(View view)
    {
        SessionM.getInstance().presentActivity(com.sessionm.api.tyType.PORTAL);
    }

    ()
    {
        this$0 = PortalButton.this;
        super();
    }
}
