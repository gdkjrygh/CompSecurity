// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.facebook;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;

// Referenced classes of package com.contextlogic.wish.facebook:
//            FacebookManager

class alogCallback
    implements com.facebook.widget.teListener
{

    final FacebookManager this$0;
    final alogCallback val$callback;

    public void onComplete(Bundle bundle, FacebookException facebookexception)
    {
        if (facebookexception == null) goto _L2; else goto _L1
_L1:
        if (!(facebookexception instanceof FacebookOperationCanceledException)) goto _L4; else goto _L3
_L3:
        if (val$callback != null)
        {
            val$callback.onCancel();
        }
_L6:
        return;
_L4:
        if (val$callback != null)
        {
            val$callback.onFailure();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (val$callback != null)
        {
            val$callback.onComplete(bundle);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    alogCallback()
    {
        this$0 = final_facebookmanager;
        val$callback = alogCallback.this;
        super();
    }
}
