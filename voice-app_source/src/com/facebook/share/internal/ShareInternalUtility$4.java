// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.share.model.SharePhoto;
import java.util.UUID;

// Referenced classes of package com.facebook.share.internal:
//            ShareInternalUtility

class val.appCallId
    implements com.facebook.internal.ity._cls4
{

    private final UUID val$appCallId;

    public com.facebook.internal.Store.Attachment apply(SharePhoto sharephoto)
    {
        return ShareInternalUtility.access$0(val$appCallId, sharephoto);
    }

    public volatile Object apply(Object obj)
    {
        return apply((SharePhoto)obj);
    }

    Attachment()
    {
        val$appCallId = uuid;
        super();
    }
}
