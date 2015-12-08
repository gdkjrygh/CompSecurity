// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zzam;
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
    public static class AppViewBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public AppViewBuilder()
        {
            set("&t", "screenview");
        }
    }

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

        public EventBuilder(String s, String s1)
        {
            this();
            setCategory(s);
            setAction(s1);
        }
    }

    public static class ExceptionBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public ExceptionBuilder setDescription(String s)
        {
            set("&exd", s);
            return this;
        }

        public ExceptionBuilder setFatal(boolean flag)
        {
            set("&exf", zzam.zzH(flag));
            return this;
        }

        public ExceptionBuilder()
        {
            set("&t", "exception");
        }
    }

    protected static class HitBuilder
    {

        private Map zzIB;
        ProductAction zzIC;
        Map zzID;
        List zzIE;
        List zzIF;

        public HitBuilder addImpression(Product product, String s)
        {
            if (product == null)
            {
                zzae.zzaC("product should be non-null");
                return this;
            }
            String s1 = s;
            if (s == null)
            {
                s1 = "";
            }
            if (!zzID.containsKey(s1))
            {
                zzID.put(s1, new ArrayList());
            }
            ((List)zzID.get(s1)).add(product);
            return this;
        }

        public HitBuilder addProduct(Product product)
        {
            if (product == null)
            {
                zzae.zzaC("product should be non-null");
                return this;
            } else
            {
                zzIF.add(product);
                return this;
            }
        }

        public HitBuilder addPromotion(Promotion promotion)
        {
            if (promotion == null)
            {
                zzae.zzaC("promotion should be non-null");
                return this;
            } else
            {
                zzIE.add(promotion);
                return this;
            }
        }

        public Map build()
        {
            HashMap hashmap = new HashMap(zzIB);
            if (zzIC != null)
            {
                hashmap.putAll(zzIC.build());
            }
            Iterator iterator = zzIE.iterator();
            for (int i = 1; iterator.hasNext(); i++)
            {
                hashmap.putAll(((Promotion)iterator.next()).zzaQ(zzc.zzT(i)));
            }

            iterator = zzIF.iterator();
            for (int j = 1; iterator.hasNext(); j++)
            {
                hashmap.putAll(((Product)iterator.next()).zzaQ(zzc.zzR(j)));
            }

            iterator = zzID.entrySet().iterator();
            for (int k = 1; iterator.hasNext(); k++)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                Object obj = (List)entry.getValue();
                String s = zzc.zzW(k);
                obj = ((List) (obj)).iterator();
                for (int l = 1; ((Iterator) (obj)).hasNext(); l++)
                {
                    hashmap.putAll(((Product)((Iterator) (obj)).next()).zzaQ((new StringBuilder()).append(s).append(zzc.zzV(l)).toString()));
                }

                if (!TextUtils.isEmpty((CharSequence)entry.getKey()))
                {
                    hashmap.put((new StringBuilder()).append(s).append("nm").toString(), entry.getKey());
                }
            }

            return hashmap;
        }

        protected String get(String s)
        {
            return (String)zzIB.get(s);
        }

        public final HitBuilder set(String s, String s1)
        {
            if (s != null)
            {
                zzIB.put(s, s1);
                return this;
            } else
            {
                zzae.zzaC(" HitBuilder.set() called with a null paramName.");
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
                zzIB.putAll(new HashMap(map));
                return this;
            }
        }

        public HitBuilder setCampaignParamsFromUrl(String s)
        {
            s = zzam.zzbk(s);
            if (TextUtils.isEmpty(s))
            {
                return this;
            } else
            {
                s = zzam.zzbi(s);
                set("&cc", (String)s.get("utm_content"));
                set("&cm", (String)s.get("utm_medium"));
                set("&cn", (String)s.get("utm_campaign"));
                set("&cs", (String)s.get("utm_source"));
                set("&ck", (String)s.get("utm_term"));
                set("&ci", (String)s.get("utm_id"));
                set("&anid", (String)s.get("anid"));
                set("&gclid", (String)s.get("gclid"));
                set("&dclid", (String)s.get("dclid"));
                set("&aclid", (String)s.get("aclid"));
                set("&gmob_t", (String)s.get("gmob_t"));
                return this;
            }
        }

        public HitBuilder setCustomDimension(int i, String s)
        {
            set(zzc.zzN(i), s);
            return this;
        }

        public HitBuilder setCustomMetric(int i, float f)
        {
            set(zzc.zzP(i), Float.toString(f));
            return this;
        }

        protected HitBuilder setHitType(String s)
        {
            set("&t", s);
            return this;
        }

        public HitBuilder setNewSession()
        {
            set("&sc", "start");
            return this;
        }

        public HitBuilder setNonInteraction(boolean flag)
        {
            set("&ni", zzam.zzH(flag));
            return this;
        }

        public HitBuilder setProductAction(ProductAction productaction)
        {
            zzIC = productaction;
            return this;
        }

        public HitBuilder setPromotionAction(String s)
        {
            zzIB.put("&promoa", s);
            return this;
        }

        protected HitBuilder()
        {
            zzIB = new HashMap();
            zzID = new HashMap();
            zzIE = new ArrayList();
            zzIF = new ArrayList();
        }
    }

    public static class ItemBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public ItemBuilder setCategory(String s)
        {
            set("&iv", s);
            return this;
        }

        public ItemBuilder setCurrencyCode(String s)
        {
            set("&cu", s);
            return this;
        }

        public ItemBuilder setName(String s)
        {
            set("&in", s);
            return this;
        }

        public ItemBuilder setPrice(double d)
        {
            set("&ip", Double.toString(d));
            return this;
        }

        public ItemBuilder setQuantity(long l)
        {
            set("&iq", Long.toString(l));
            return this;
        }

        public ItemBuilder setSku(String s)
        {
            set("&ic", s);
            return this;
        }

        public ItemBuilder setTransactionId(String s)
        {
            set("&ti", s);
            return this;
        }

        public ItemBuilder()
        {
            set("&t", "item");
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

    public static class SocialBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public SocialBuilder setAction(String s)
        {
            set("&sa", s);
            return this;
        }

        public SocialBuilder setNetwork(String s)
        {
            set("&sn", s);
            return this;
        }

        public SocialBuilder setTarget(String s)
        {
            set("&st", s);
            return this;
        }

        public SocialBuilder()
        {
            set("&t", "social");
        }
    }

    public static class TimingBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public TimingBuilder setCategory(String s)
        {
            set("&utc", s);
            return this;
        }

        public TimingBuilder setLabel(String s)
        {
            set("&utl", s);
            return this;
        }

        public TimingBuilder setValue(long l)
        {
            set("&utt", Long.toString(l));
            return this;
        }

        public TimingBuilder setVariable(String s)
        {
            set("&utv", s);
            return this;
        }

        public TimingBuilder()
        {
            set("&t", "timing");
        }

        public TimingBuilder(String s, String s1, long l)
        {
            this();
            setVariable(s1);
            setValue(l);
            setCategory(s);
        }
    }

    public static class TransactionBuilder extends HitBuilder
    {

        public volatile Map build()
        {
            return super.build();
        }

        public TransactionBuilder setAffiliation(String s)
        {
            set("&ta", s);
            return this;
        }

        public TransactionBuilder setCurrencyCode(String s)
        {
            set("&cu", s);
            return this;
        }

        public TransactionBuilder setRevenue(double d)
        {
            set("&tr", Double.toString(d));
            return this;
        }

        public TransactionBuilder setShipping(double d)
        {
            set("&ts", Double.toString(d));
            return this;
        }

        public TransactionBuilder setTax(double d)
        {
            set("&tt", Double.toString(d));
            return this;
        }

        public TransactionBuilder setTransactionId(String s)
        {
            set("&ti", s);
            return this;
        }

        public TransactionBuilder()
        {
            set("&t", "transaction");
        }
    }


    public HitBuilders()
    {
    }
}
