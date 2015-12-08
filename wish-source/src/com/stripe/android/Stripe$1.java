// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.android;

import com.stripe.android.compat.AsyncTask;
import com.stripe.android.model.Card;
import com.stripe.model.Token;
import java.util.concurrent.Executor;

// Referenced classes of package com.stripe.android:
//            Stripe, TokenCallback

class this._cls0
    implements kenCreator
{

    final Stripe this$0;

    public void create(final Card card, final String publishableKey, Executor executor, final TokenCallback callback)
    {
        card = new AsyncTask() {

            final Stripe._cls1 this$1;
            final TokenCallback val$callback;
            final Card val$card;
            final String val$publishableKey;

            protected transient Stripe.ResponseWrapper doInBackground(Void avoid[])
            {
                try
                {
                    avoid = Token.create(Stripe.access$000(this$0, card), publishableKey);
                    Object obj = avoid.getCard();
                    obj = Stripe.access$100(this$0, ((com.stripe.model.Card) (obj)));
                    avoid = Stripe.access$200(this$0, ((Card) (obj)), avoid);
                    avoid = new Stripe.ResponseWrapper(this$0, avoid, null, null);
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    return new Stripe.ResponseWrapper(this$0, null, avoid, null);
                }
                return avoid;
            }

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Void[])aobj);
            }

            protected void onPostExecute(Stripe.ResponseWrapper responsewrapper)
            {
                Stripe.access$400(this$0, responsewrapper, callback);
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((Stripe.ResponseWrapper)obj);
            }

            
            {
                this$1 = Stripe._cls1.this;
                card = card1;
                publishableKey = s;
                callback = tokencallback;
                super();
            }
        };
        Stripe.access$500(Stripe.this, executor, card);
    }

    yncTask()
    {
        this$0 = Stripe.this;
        super();
    }
}
