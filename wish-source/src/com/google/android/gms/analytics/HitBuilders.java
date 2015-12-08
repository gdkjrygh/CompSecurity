// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.analytics.internal.zzad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            zzc

public class HitBuilders
{
    public static class EventBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public EventBuilder setAction(String s)
        {
            set("&ea", s);
            return this;
        }

        public EventBuilder setCategory(String s)
        {
            set("&ec", s);
            return this;
        }

        public EventBuilder setLabel(String s)
        {
            set("&el", s);
            return this;
        }

        public EventBuilder setValue(long l)
        {
            set("&ev", Long.toString(l));
            return this;
        }

        public EventBuilder()
        {
            set("&t", "event");
        }
    }

    protected static class HitBuilder
    {

        private Map zzEE;
        ProductAction zzEF;
        Map zzEG;
        List zzEH;
        List zzEI;

        public HitBuilder addImpression(Product product, String s)
        {
            if (product == null)
            {
                zzad.zzan("product should be non-null");
                return this;
            }
            String s1 = s;
            if (s == null)
            {
                s1 = "";
            }
            if (!zzEG.containsKey(s1))
            {
                zzEG.put(s1, new ArrayList());
            }
            ((List)zzEG.get(s1)).add(product);
            return this;
        }

        public HitBuilder addProduct(Product product)
        {
            if (product == null)
            {
                zzad.zzan("product should be non-null");
                return this;
            } else
            {
                zzEI.add(product);
                return this;
            }
        }

        public HitBuilder addPromotion(Promotion promotion)
        {
            if (promotion == null)
            {
                zzad.zzan("promotion should be non-null");
                return this;
            } else
            {
                zzEH.add(promotion);
                return this;
            }
        }

        public Map build()
        {
            HashMap hashmap = new HashMap(zzEE);
            if (zzEF != null)
            {
                hashmap.putAll(zzEF.build());
            }
            Iterator iterator = zzEH.iterator();
            for (int i = 1; iterator.hasNext(); i++)
            {
                hashmap.putAll(((Promotion)iterator.next()).zzaC(zzc.zzK(i)));
            }

            iterator = zzEI.iterator();
            for (int j = 1; iterator.hasNext(); j++)
            {
                hashmap.putAll(((Product)iterator.next()).zzaC(zzc.zzI(j)));
            }

            iterator = zzEG.entrySet().iterator();
            for (int k = 1; iterator.hasNext(); k++)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                Object obj = (List)entry.getValue();
                String s = zzc.zzN(k);
                obj = ((List) (obj)).iterator();
                for (int l = 1; ((Iterator) (obj)).hasNext(); l++)
                {
                    hashmap.putAll(((Product)((Iterator) (obj)).next()).zzaC((new StringBuilder()).append(s).append(zzc.zzM(l)).toString()));
                }

                if (!TextUtils.isEmpty((CharSequence)entry.getKey()))
                {
                    hashmap.put((new StringBuilder()).append(s).append("nm").toString(), entry.getKey());
                }
            }

            return hashmap;
        }

        public final HitBuilder set(String s, String s1)
        {
            if (s != null)
            {
                zzEE.put(s, s1);
                return this;
            } else
            {
                zzad.zzan(" HitBuilder.set() called with a null paramName.");
                return this;
            }
        }

        public final HitBuilder setAll(Map map)
        {
            if (map == null)
            {
                return this;
            } else
            {
                zzEE.putAll(new HashMap(map));
                return this;
            }
        }

        public HitBuilder setNewSession()
        {
            set("&sc", "start");
            return this;
        }

        public HitBuilder setProductAction(ProductAction productaction)
        {
            zzEF = productaction;
            return this;
        }

        protected HitBuilder()
        {
            zzEE = new HashMap();
            zzEG = new HashMap();
            zzEH = new ArrayList();
            zzEI = new ArrayList();
        }
    }

    public static class ScreenViewBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public ScreenViewBuilder()
        {
            set("&t", "screenview");
        }
    }

}
