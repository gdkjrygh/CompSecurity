// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.os.Handler;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.braintreepayments.api:
//            Braintree

class val.throwable
    implements tenerCallback
{

    final Braintree this$0;
    final Throwable val$throwable;

    public void execute()
    {
        final orListener listener;
        for (Iterator iterator = Braintree.access$1500(Braintree.this).iterator(); iterator.hasNext(); Braintree.access$1200(Braintree.this).post(new Runnable() {

        final Braintree._cls17 this$1;
        final Braintree.ErrorListener val$listener;

        public void run()
        {
            listener.onUnrecoverableError(throwable);
        }

            
            {
                this$1 = Braintree._cls17.this;
                listener = errorlistener;
                super();
            }
    }))
        {
            listener = (orListener)iterator.next();
        }

    }

    public boolean hasListeners()
    {
        return !Braintree.access$1500(Braintree.this).isEmpty();
    }

    _cls1.val.listener()
    {
        this$0 = final_braintree;
        val$throwable = Throwable.this;
        super();
    }
}
