// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.android;

import com.stripe.android.compat.AsyncTask;
import com.stripe.model.Token;
import java.util.concurrent.Executor;

// Referenced classes of package com.stripe.android:
//            Stripe, TokenCallback

class cTask extends AsyncTask
{

    final onseWrapper this$1;
    final TokenCallback val$callback;
    final String val$publishableKey;
    final String val$tokenId;

    protected transient onseWrapper doInBackground(Void avoid[])
    {
        try
        {
            avoid = Token.retrieve(val$tokenId, val$publishableKey);
            Object obj = avoid.getCard();
            obj = Stripe.access$100(_fld0, ((com.stripe.model.Card) (obj)));
            avoid = Stripe.access$200(_fld0, ((com.stripe.android.model.Card) (obj)), avoid);
            avoid = new onseWrapper(_fld0, avoid, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            return new onseWrapper(_fld0, null, avoid, null);
        }
        return avoid;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(onseWrapper onsewrapper)
    {
        Stripe.access$400(_fld0, onsewrapper, val$callback);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((onseWrapper)obj);
    }

    ck()
    {
        this$1 = final_ck;
        val$tokenId = s;
        val$publishableKey = s1;
        val$callback = TokenCallback.this;
        super();
    }

    // Unreferenced inner class com/stripe/android/Stripe$2

/* anonymous class */
    class Stripe._cls2
        implements Stripe.TokenRequester
    {

        final Stripe this$0;

        public void request(final String tokenId, final String publishableKey, Executor executor, TokenCallback tokencallback)
        {
            tokenId = tokencallback. new Stripe._cls2._cls1();
            Stripe.access$500(Stripe.this, executor, tokenId);
        }

            
            {
                this$0 = Stripe.this;
                super();
            }
    }

}
