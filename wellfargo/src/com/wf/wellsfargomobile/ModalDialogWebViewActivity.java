// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;

// Referenced classes of package com.wf.wellsfargomobile:
//            BaseModalDialogWebViewActivity

public class ModalDialogWebViewActivity extends BaseModalDialogWebViewActivity
{

    public ModalDialogWebViewActivity()
    {
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        e = (int)getResources().getDimension(0x7f090016);
        b = (int)getResources().getDimension(0x7f090017);
        d = (int)getResources().getDimension(0x7f090018);
        c = (int)getResources().getDimension(0x7f090019);
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        j = 0x7f04005d;
        super.onCreate(bundle);
    }
}
