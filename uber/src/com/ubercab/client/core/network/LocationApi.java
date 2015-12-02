// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.network;

import java.util.Map;
import retrofit.Callback;

public interface LocationApi
{

    public abstract void addOrModifyTag(String s, String s1, String s2, String s3, String s4, String s5, Map map, 
            Callback callback);

    public abstract void autocomplete(double d, double d1, String s, String s1, Callback callback);

    public abstract void autocompleteV2(double d, double d1, String s, String s1, Callback callback);

    public abstract void deleteTag(String s, Callback callback);

    public abstract void details(String s, String s1, String s2, Callback callback);

    public abstract void detailsV2(String s, String s1, String s2, Callback callback);

    public abstract void frequentLocations(Callback callback);

    public abstract void history(double d, double d1, String s, Callback callback);

    public abstract void search(double d, double d1, String s, String s1, Integer integer, 
            Callback callback);

    public abstract void searchV2(double d, double d1, String s, String s1, Integer integer, 
            Callback callback);

    public abstract void taggedLocations(Callback callback);

    public abstract void upfrontFares(double d, double d1, String s, String s1, Callback callback);
}
