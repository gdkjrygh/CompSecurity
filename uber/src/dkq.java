// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.EatsReminderCreateRequest;
import com.ubercab.client.core.model.EatsReminderResponse;
import com.ubercab.client.core.model.EatsReminderUpdateRequest;
import com.ubercab.client.core.model.FeedbackRating;
import com.ubercab.client.core.model.FeedbackRequest;
import com.ubercab.client.core.model.FeedbackReviewer;
import com.ubercab.client.core.model.ShoppingCartCharges;
import com.ubercab.client.core.model.ShoppingCartChargesRequest;
import com.ubercab.client.core.network.ShoppingApi;
import com.ubercab.client.feature.shoppingcart.model.Inventory;
import com.ubercab.client.feature.shoppingcart.model.ShoppingCartChargesRequestLegacy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dkq
{

    private final cev a;
    private final ShoppingApi b;

    public dkq(cev cev, ShoppingApi shoppingapi)
    {
        b = shoppingapi;
        a = cev;
    }

    static cev a(dkq dkq1)
    {
        return dkq1.a;
    }

    public final void a(double d, double d1, String s)
    {
        Callback callback = new Callback(s) {

            final String a;
            final dkq b;

            private void a(Inventory inventory)
            {
                dkq.a(b).c(new fja(a, inventory));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkq.a(b).c(new fja(a, retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((Inventory)obj);
            }

            
            {
                b = dkq.this;
                a = s;
                super();
            }
        };
        b.getInventory(d, d1, s, cwt.a(), callback);
    }

    public final void a(String s, FeedbackReviewer feedbackreviewer, List list)
    {
        ArrayList arraylist = new ArrayList();
        s = FeedbackRequest.create(s, feedbackreviewer, list);
        feedbackreviewer = new Callback(list, arraylist) {

            final List a;
            final List b;
            final dkq c;

            private void a()
            {
                FeedbackRating feedbackrating;
                for (Iterator iterator = a.iterator(); iterator.hasNext(); b.add(feedbackrating.getUuid()))
                {
                    feedbackrating = (FeedbackRating)iterator.next();
                }

                dkq.a(c).c(new fjh(b));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkq.a(c).c(new fjh(b, retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a();
            }

            
            {
                c = dkq.this;
                a = list;
                b = list1;
                super();
            }
        };
        b.submitFeedback(s, feedbackreviewer);
    }

    public final void a(String s, String s1, long l)
    {
        l /= 1000L;
        EatsReminderCreateRequest eatsremindercreaterequest = EatsReminderCreateRequest.create(s1, Long.valueOf(l));
        s = new Callback(s, s1, l) {

            final String a;
            final String b;
            final long c;
            final dkq d;

            private void a(EatsReminderResponse eatsreminderresponse)
            {
                dkq.a(d).c(new fjd(0, a, b, eatsreminderresponse.getUuid(), c));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkq.a(d).c(new fjd(0, a, b, null, c, retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((EatsReminderResponse)obj);
            }

            
            {
                d = dkq.this;
                a = s;
                b = s1;
                c = l;
                super();
            }
        };
        b.createReminder(eatsremindercreaterequest, s);
    }

    public final void a(String s, String s1, String s2)
    {
        s = new Callback(s, s1, s2) {

            final String a;
            final String b;
            final String c;
            final dkq d;

            private void a()
            {
                dkq.a(d).c(new fiz(a, b, c));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkq.a(d).c(new fiz(a, b, c, retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a();
            }

            
            {
                d = dkq.this;
                a = s;
                b = s1;
                c = s2;
                super();
            }
        };
        b.deleteReminder(s2, s);
    }

    public final void a(String s, String s1, String s2, long l)
    {
        l /= 1000L;
        EatsReminderUpdateRequest eatsreminderupdaterequest = EatsReminderUpdateRequest.create(Long.valueOf(l));
        s = new Callback(s, s1, s2, l) {

            final String a;
            final String b;
            final String c;
            final long d;
            final dkq e;

            private void a()
            {
                dkq.a(e).c(new fjd(1, a, b, c, d));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkq.a(e).c(new fjd(1, a, b, c, d, retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a();
            }

            
            {
                e = dkq.this;
                a = s;
                b = s1;
                c = s2;
                d = l;
                super();
            }
        };
        b.updateReminder(s2, eatsreminderupdaterequest, s);
    }

    public final void a(List list, String s, String s1, String s2)
    {
        s1 = new Callback(s, s1) {

            final String a;
            final String b;
            final dkq c;

            private void a(ShoppingCartCharges shoppingcartcharges, Response response)
            {
                dkq.a(c).c(new dni(a, b, shoppingcartcharges, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkq.a(c).c(new dni(a, b, retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((ShoppingCartCharges)obj, response);
            }

            
            {
                c = dkq.this;
                a = s;
                b = s1;
                super();
            }
        };
        list = ShoppingCartChargesRequestLegacy.create(list, s, s2);
        b.calculateChargesLegacy(list, s1);
    }

    public final void a(List list, String s, String s1, String s2, Double double1, Double double2)
    {
        s1 = new Callback(s, s1) {

            final String a;
            final String b;
            final dkq c;

            private void a(ShoppingCartCharges shoppingcartcharges, Response response)
            {
                dkq.a(c).c(new dni(a, b, shoppingcartcharges, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkq.a(c).c(new dni(a, b, retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((ShoppingCartCharges)obj, response);
            }

            
            {
                c = dkq.this;
                a = s;
                b = s1;
                super();
            }
        };
        list = ShoppingCartChargesRequest.create(list, s, s2, double1, double2, "android");
        b.calculateCharges(list, s1);
    }
}
