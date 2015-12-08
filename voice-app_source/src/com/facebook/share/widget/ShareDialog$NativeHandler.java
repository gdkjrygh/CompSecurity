// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.os.Bundle;
import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.share.internal.LegacyNativeDialogParameters;
import com.facebook.share.internal.NativeDialogParameters;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.model.ShareContent;

// Referenced classes of package com.facebook.share.widget:
//            ShareDialog

private class <init> extends com.facebook.internal.dler
{

    final ShareDialog this$0;

    public boolean canShow(ShareContent sharecontent)
    {
        return sharecontent != null && ShareDialog.access$0(sharecontent.getClass());
    }

    public volatile boolean canShow(Object obj)
    {
        return canShow((ShareContent)obj);
    }

    public AppCall createAppCall(final ShareContent content)
    {
        ShareDialog.access$2(ShareDialog.this, ShareDialog.access$1(ShareDialog.this), content, this._fld0);
        ShareContentValidation.validateForNativeShare(content);
        final AppCall appCall = createBaseAppCall();
        DialogPresenter.setupAppCallForNativeDialog(appCall, new com.facebook.internal.DialogPresenter.ParameterProvider() {

            final ShareDialog.NativeHandler this$1;
            private final AppCall val$appCall;
            private final ShareContent val$content;
            private final boolean val$shouldFailOnDataError;

            public Bundle getLegacyParameters()
            {
                return LegacyNativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
            }

            public Bundle getParameters()
            {
                return NativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
            }

            
            {
                this$1 = ShareDialog.NativeHandler.this;
                appCall = appcall;
                content = sharecontent;
                shouldFailOnDataError = flag;
                super();
            }
        }, ShareDialog.access$3(content.getClass()));
        return appCall;
    }

    public volatile AppCall createAppCall(Object obj)
    {
        return createAppCall((ShareContent)obj);
    }

    public Object getMode()
    {
        return createAppCall;
    }

    private _cls1.val.shouldFailOnDataError()
    {
        this$0 = ShareDialog.this;
        super(ShareDialog.this);
    }

    ( )
    {
        this();
    }
}
