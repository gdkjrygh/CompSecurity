// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.AppGroupCreationContent;

// Referenced classes of package com.facebook.share.widget:
//            CreateAppGroupDialog

private class <init> extends com.facebook.internal.ler
{

    final CreateAppGroupDialog this$0;

    public boolean canShow(AppGroupCreationContent appgroupcreationcontent)
    {
        return true;
    }

    public volatile boolean canShow(Object obj)
    {
        return canShow((AppGroupCreationContent)obj);
    }

    public AppCall createAppCall(AppGroupCreationContent appgroupcreationcontent)
    {
        AppCall appcall = createBaseAppCall();
        DialogPresenter.setupAppCallForWebDialog(appcall, "game_group_create", WebDialogParameters.create(appgroupcreationcontent));
        return appcall;
    }

    public volatile AppCall createAppCall(Object obj)
    {
        return createAppCall((AppGroupCreationContent)obj);
    }

    private ()
    {
        this$0 = CreateAppGroupDialog.this;
        super(CreateAppGroupDialog.this);
    }

    >(> >)
    {
        this();
    }
}
