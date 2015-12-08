// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package com.walmartlabs.ui:
//            Popup

class this._cls1
    implements Runnable
{

    final te this$1;

    public void run()
    {
        Popup.access$400(_fld0).setVisibility(0);
        update();
    }

    l.anchor()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/ui/Popup$3

/* anonymous class */
    class Popup._cls3
        implements Runnable
    {

        final Popup this$0;
        final View val$anchor;

        public void run()
        {
            if (Popup.access$200(Popup.this).getWindowToken() == null || Popup.access$300(Popup.this))
            {
                break MISSING_BLOCK_LABEL_82;
            }
            Popup.access$400(Popup.this).setVisibility(4);
            Popup.access$700(Popup.this).showAtLocation(Popup.access$200(Popup.this), 0, Popup.access$500(Popup.this), Popup.access$600(Popup.this));
            anchor.post(new Popup._cls3._cls1());
            return;
            Exception exception;
            exception;
            Log.w(Popup.access$800(), "Exception when trying to show popup. This should not happen. ", exception);
            return;
        }

            
            {
                this$0 = final_popup;
                anchor = View.this;
                super();
            }
    }

}
