// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.ui.utils;

import android.app.Dialog;
import android.os.Bundle;

// Referenced classes of package com.wsi.android.framework.ui.utils:
//            DialogHelper

public static interface 
{

    public abstract Dialog createDialog(int i, Bundle bundle);

    public abstract void prepareDialog(int i, Dialog dialog, Bundle bundle);

    public abstract void showedDialog(int i, Dialog dialog, Bundle bundle);
}
