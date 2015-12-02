// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.network;

import com.ubercab.rds.core.model.SupportImageUploadRequest;
import com.ubercab.rds.core.model.SupportTicketRequest;
import ica;
import retrofit.Callback;

public interface SupportApi
{

    public abstract void imageUpload(SupportImageUploadRequest supportimageuploadrequest, Callback callback);

    public abstract void singleTrip(String s, String s1, String s2, Callback callback);

    public abstract void submitTicket(SupportTicketRequest supportticketrequest, Callback callback);

    public abstract ica supportHome(String s, String s1, String s2);

    public abstract ica supportHome(String s, String s1, String s2, double d, double d1);

    public abstract void supportHome(String s, String s1, String s2, double d, double d1, 
            Callback callback);

    public abstract void supportHome(String s, String s1, String s2, Callback callback);

    public abstract void supportNode(String s, String s1, Callback callback);

    public abstract void supportTerritory(String s, String s1, String s2, String s3, String s4, Callback callback);

    public abstract ica tripHistory(String s, String s1, String s2, int i, int j);

    public abstract void tripHistory(String s, String s1, String s2, int i, int j, Callback callback);

    public abstract void tripReceipt(String s, String s1, int i, int j, Callback callback);
}
