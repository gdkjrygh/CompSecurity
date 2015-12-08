// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzod

public final class zzon extends zzod
{

    private ProductAction zzKC;
    private final Map zzKD = new HashMap();
    private final List zzKE = new ArrayList();
    private final List zzKF = new ArrayList();

    public zzon()
    {
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        if (!zzKF.isEmpty())
        {
            hashmap.put("products", zzKF);
        }
        if (!zzKE.isEmpty())
        {
            hashmap.put("promotions", zzKE);
        }
        if (!zzKD.isEmpty())
        {
            hashmap.put("impressions", zzKD);
        }
        hashmap.put("productAction", zzKC);
        return zzA(hashmap);
    }

    public void zza(Product product, String s)
    {
        if (product == null)
        {
            return;
        }
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        if (!zzKD.containsKey(s1))
        {
            zzKD.put(s1, new ArrayList());
        }
        ((List)zzKD.get(s1)).add(product);
    }

    public volatile void zza(zzod zzod1)
    {
        zza((zzon)zzod1);
    }

    public void zza(zzon zzon1)
    {
        zzon1.zzKF.addAll(zzKF);
        zzon1.zzKE.addAll(zzKE);
        for (Iterator iterator = zzKD.entrySet().iterator(); iterator.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iterator.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                zzon1.zza((Product)((Iterator) (obj)).next(), s);
            }
        }

        if (zzKC != null)
        {
            zzon1.zzKC = zzKC;
        }
    }

    public ProductAction zzxM()
    {
        return zzKC;
    }

    public List zzxN()
    {
        return Collections.unmodifiableList(zzKF);
    }

    public Map zzxO()
    {
        return zzKD;
    }

    public List zzxP()
    {
        return Collections.unmodifiableList(zzKE);
    }
}
