// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification

public class PopupNotificationLocked extends PopupNotification
{

    public PopupNotificationLocked()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0xff000000));
    }
}
