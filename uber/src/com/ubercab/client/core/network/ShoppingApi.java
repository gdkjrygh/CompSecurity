// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.network;

import com.ubercab.client.core.model.EatsReminderCreateRequest;
import com.ubercab.client.core.model.EatsReminderUpdateRequest;
import com.ubercab.client.core.model.FeedbackRequest;
import com.ubercab.client.core.model.ShoppingCartChargesRequest;
import com.ubercab.client.feature.shoppingcart.model.ShoppingCartChargesRequestLegacy;
import retrofit.Callback;

public interface ShoppingApi
{

    public abstract void calculateCharges(ShoppingCartChargesRequest shoppingcartchargesrequest, Callback callback);

    public abstract void calculateChargesLegacy(ShoppingCartChargesRequestLegacy shoppingcartchargesrequestlegacy, Callback callback);

    public abstract void createReminder(EatsReminderCreateRequest eatsremindercreaterequest, Callback callback);

    public abstract void deleteReminder(String s, Callback callback);

    public abstract void getInventory(double d, double d1, String s, String s1, Callback callback);

    public abstract void submitFeedback(FeedbackRequest feedbackrequest, Callback callback);

    public abstract void updateReminder(String s, EatsReminderUpdateRequest eatsreminderupdaterequest, Callback callback);
}
