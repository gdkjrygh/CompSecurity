// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.os.Handler;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.braintreepayments.api:
//            Braintree

class Listener
    implements Runnable
{

    final l.error this$1;
    final Listener val$listener;

    public void run()
    {
        val$listener.onRecoverableError(error);
    }

    Listener()
    {
        this$1 = final_listener1;
        val$listener = Listener.this;
        super();
    }

    // Unreferenced inner class com/braintreepayments/api/Braintree$18

/* anonymous class */
    class Braintree._cls18
        implements Braintree.ListenerCallback
    {

        final Braintree this$0;
        final ErrorWithResponse val$error;

        public void execute()
        {
            Braintree.ErrorListener errorlistener;
            for (Iterator iterator = Braintree.access$1500(Braintree.this).iterator(); iterator.hasNext(); Braintree.access$1200(Braintree.this).post(errorlistener. new Braintree._cls18._cls1()))
            {
                errorlistener = (Braintree.ErrorListener)iterator.next();
            }

        }

        public boolean hasListeners()
        {
            return !Braintree.access$1500(Braintree.this).isEmpty();
        }

            
            {
                this$0 = final_braintree;
                error = ErrorWithResponse.this;
                super();
            }
    }

}
